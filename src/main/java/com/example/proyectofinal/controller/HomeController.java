package com.example.proyectofinal.controller;

import com.example.proyectofinal.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    private final SceneController sceneController;

    public HomeController() {
        this.sceneController = new SceneController();
    }

    @FXML
    private Label serviceOnLabel;

    @FXML
    private Label userOnLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("El usuario que esta en uso es "+ mfc.getAutoGym().getUserService().getUserOn().getUsername());
        userOnLabel.setText(mfc.getAutoGym().getUserService().getUserOn().getUsername());
        serviceOnLabel.setText(mfc.getAutoGym().getUserService().getUserOn().getService());
    }


    @FXML
    void bmiButton(ActionEvent event) throws IOException {
        sceneController.switchToBMIView(event);
    }

    @FXML
    void ecButton(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorHA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToECView(event);
        }else {
            System.out.println("Tu servicio no incluye esta automatizacion");
        }
    }

    @FXML
    void exitButton(ActionEvent event) throws IOException {
        sceneController.switchToLoginView(event);
    }

    @FXML
    void informationButton(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToInformationView(event);
        }else {
            System.out.println("No eres administrador de el sistema");
        }
    }

    @FXML
    void rdcButton(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorHMA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToRDCView(event);
        }else {
            System.out.println("Tu servicio no incluye esta automatizacion");
        }
    }
}
