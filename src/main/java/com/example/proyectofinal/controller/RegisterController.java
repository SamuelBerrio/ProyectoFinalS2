package com.example.proyectofinal.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class RegisterController {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    @FXML
    void loginView(ActionEvent event) throws IOException {
        mfc.switchToLoginView(event);
    }
}
