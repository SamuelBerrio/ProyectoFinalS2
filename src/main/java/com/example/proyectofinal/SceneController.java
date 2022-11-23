package com.example.proyectofinal;

import com.example.proyectofinal.service.SceneService;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneController implements SceneService {

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchScene(ActionEvent e, String resource) throws IOException {
        System.out.println("Getclass**"+getClass());
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("exam/"+resource)));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void switchToLoginView(ActionEvent e) throws IOException {
        switchScene(e,"login-view.fxml");
    }

    @Override
    public void switchToRegisterView(ActionEvent e) throws IOException {
        switchScene(e,"register-view.fxml");
    }

}
