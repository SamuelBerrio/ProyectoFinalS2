package com.example.proyectofinal.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    @FXML
    private PasswordField passwordInput;

    @FXML
    private TextField userNameInput;

    @FXML
    void loginButton(ActionEvent event) {

    }

    @FXML
    void registerView(ActionEvent event) throws IOException {
        mfc.switchToRegisterView(event);
    }

}
