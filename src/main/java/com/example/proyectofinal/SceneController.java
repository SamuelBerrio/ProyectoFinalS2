package com.example.proyectofinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneController {


    public void switchScene(ActionEvent e, String resource) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(resource)));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToLoginView(ActionEvent e) throws IOException {
        switchScene(e,"login-view.fxml");
    }

    public void switchToRegisterView(ActionEvent e) throws IOException {
        switchScene(e,"register-view.fxml");
    }

    public void switchToBMIView(ActionEvent e)throws IOException{
        switchScene(e,"body-mass-index-view.fxml");
    }

    public void switchToECView(ActionEvent e)throws IOException{
        switchScene(e,"expended-calories-view.fxml");
    }

    public void switchToHomeView(ActionEvent e)throws IOException{
        switchScene(e,"home-view.fxml");
    }

    public void switchToInformationView(ActionEvent e)throws IOException{
        switchScene(e,"information-view.fxml");
    }

    public void switchToRDCView(ActionEvent e)throws IOException{
        switchScene(e,"recommended-daily-calories-view.fxml");
    }
}
