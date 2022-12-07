package com.example.proyectofinal.controller;

import com.example.proyectofinal.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    ModelFactoryController mfc = ModelFactoryController.getInstance();
    private final SceneController sceneController;

    public LoginController() {
        this.sceneController = new SceneController();
    }

    @FXML
    private PasswordField passwordInput;

    @FXML
    private TextField userNameInput;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getAutoGym().getUserService().printUsers();
    }


    @FXML
    void loginButton(ActionEvent event) {
        try {
            if(mfc.getAutoGym().getLoginService().loginAuthorization(userNameInput.getText(),passwordInput.getText())){
                sceneController.switchToHomeView(event);
            }else {
                userNameInput.setText("");
                passwordInput.setText("");
                System.out.println("Usuario no encontrado");
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void registerView(ActionEvent event) throws IOException {
        sceneController.switchToRegisterView(event);
    }
}
