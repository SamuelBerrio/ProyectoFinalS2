package com.example.proyectofinal.controller;

import com.example.proyectofinal.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ECController {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    private final SceneController sceneController;

    public ECController() {
        this.sceneController = new SceneController();
    }


    @FXML
    private ComboBox<String> actividadInput;

    @FXML
    private TextField pesoInput;

    @FXML
    private Label resultadoLabel;

    @FXML
    private TextField tiempoInput;

    @FXML
    void calcularButton(ActionEvent event) {

    }

    @FXML
    void bmiView(ActionEvent event) throws IOException {
        sceneController.switchToBMIView(event);
    }

    @FXML
    void exitView(ActionEvent event) throws IOException {
        sceneController.switchToLoginView(event);
    }

    @FXML
    void homeView(ActionEvent event) throws IOException {
        sceneController.switchToHomeView(event);
    }

    @FXML
    void informationView(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToInformationView(event);
        }else {
            System.out.println("No eres administrador de el sistema");
        }
    }

    @FXML
    void rdcView(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorHMA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToRDCView(event);
        }else {
            System.out.println("Tu servicio no incluye esta automatizacion");
        }
    }
}
