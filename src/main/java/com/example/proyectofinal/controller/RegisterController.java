package com.example.proyectofinal.controller;

import com.example.proyectofinal.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class RegisterController implements Initializable{

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    private final SceneController sceneController;

    public RegisterController() {
        this.sceneController = new SceneController();
    }

    @FXML
    private TextField ageInput;

    @FXML
    private TextField idInput;

    @FXML
    private TextField passwordInput;

    @FXML
    private ComboBox<String> serviceInput;

    @FXML
    private TextField userNameInput;

    //Al inicial la ecena
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Low", "Medium", "High");
        serviceInput.getItems().addAll(list);
    }

    @FXML
    void loginView(ActionEvent event) throws IOException {
        sceneController.switchToLoginView(event);
    }

    @FXML
    public void registerButton(ActionEvent event) {
        try {
            if(mfc.getAutoGym().getRegisterService().addUser(userNameInput.getText(), passwordInput.getText(), Integer.parseInt(ageInput.getText()), idInput.getText(), serviceInput.getSelectionModel().getSelectedItem())){
                mfc.getAutoGym().getUserService().printUsers();
                sceneController.switchToLoginView(event);
                userNameInput.setText("");
                passwordInput.setText("");
                ageInput.setText("");
                idInput.setText("");
                serviceInput.setValue("");
            }else {
                System.out.println("Complete los campos solicitados");
            }
        }catch (NumberFormatException e){
            System.out.println("Ingrese una edad valida "+e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
