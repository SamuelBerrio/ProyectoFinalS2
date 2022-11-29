package com.example.proyectofinal.controller;

import com.example.proyectofinal.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

    }

    @FXML
    void bmiView(ActionEvent event) {

    }


    @FXML
    void ceView(ActionEvent event) {

    }

    @FXML
    void homeView(ActionEvent event) {

    }

    @FXML
    void infoView(ActionEvent event) {

    }

    @FXML
    void loginView(ActionEvent event) {

    }

    @FXML
    void rdcView(ActionEvent event) {

    }

}
