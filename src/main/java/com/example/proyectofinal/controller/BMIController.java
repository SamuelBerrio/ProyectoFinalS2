package com.example.proyectofinal.controller;

import com.example.proyectofinal.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BMIController {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    private final SceneController sceneController;

    public BMIController() {
        this.sceneController = new SceneController();
    }

    @FXML
    private TextField alturaInput;

    @FXML
    private TextField pesoInput;

    @FXML
    private Label resultLabel;

    @FXML
    void calcularButton(ActionEvent event) {
        resultLabel.setText(String.valueOf(mfc.getAutoGym().getBmiService().calcularBMI(Double.parseDouble(alturaInput.getText()),Double.parseDouble(pesoInput.getText()))));
    }

    @FXML
    void ecView(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorHA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToECView(event);
        }else {
            System.out.println("Tu servicio no incluye esta automatizacion");
        }
    }

    @FXML
    void homeView(ActionEvent event) throws IOException {
        sceneController.switchToHomeView(event);
    }

    @FXML
    void infoView(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToInformationView(event);
        }else {
            System.out.println("No eres administrador de el sistema");
        }
    }

    @FXML
    void exitView(ActionEvent event) throws IOException {
        sceneController.switchToLoginView(event);
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
