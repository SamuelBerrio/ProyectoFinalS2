package com.example.proyectofinal.controller;

import com.example.proyectofinal.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class RDCController implements Initializable {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    private final SceneController sceneController;

    public RDCController() {
        this.sceneController = new SceneController();
    }

    @FXML
    private TextField alturaInput;

    @FXML
    private ComboBox<String> generoInput;

    @FXML
    private TextField pesoInput;

    @FXML
    private TextField edadInput;

    @FXML
    private Label resultadoLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Femenino", "Masculino");
        generoInput.getItems().addAll(list);
    }

    @FXML
    void calcularButton(ActionEvent event) {
        try {
            resultadoLabel.setText(String.valueOf(mfc.getAutoGym().getRdcService().calcularRDC(generoInput.getSelectionModel().getSelectedItem(), Double.parseDouble(pesoInput.getText()), Double.parseDouble(alturaInput.getText()), Double.parseDouble(edadInput.getText()))));
        }catch (NumberFormatException e){
            System.out.println("Ingrese numeros validos en los campos");
        }
    }

    @FXML
    void bmiView(ActionEvent event) throws IOException {
        sceneController.switchToBMIView(event);
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
}
