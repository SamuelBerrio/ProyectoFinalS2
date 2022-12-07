package com.example.proyectofinal;

import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.controller.ModelFactoryController;
import com.example.proyectofinal.thread.UsersLoadThread;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Thread hilo = new UsersLoadThread();
    @Override
    public void start(Stage stage) throws IOException {
        hilo.start();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("AutoGym");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}