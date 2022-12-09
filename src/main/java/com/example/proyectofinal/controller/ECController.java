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

public class ECController implements Initializable{

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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Running", "Caminar","Nadar","Gym","Ciclismo","Baile","Yoga","Senderismo","Boxeo","Aerobicos");
        actividadInput.getItems().addAll(list);
    }

    @FXML
    void calcularButton(ActionEvent event) {
        try {
            resultadoLabel.setText(String.valueOf(mfc.getAutoGym().getEcService().calcularEC(actividadInput.getSelectionModel().getSelectedItem(), Integer.parseInt(pesoInput.getText()), Double.parseDouble(tiempoInput.getText()))));
        }catch (NullPointerException e){
            System.out.println(e);
        }
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
