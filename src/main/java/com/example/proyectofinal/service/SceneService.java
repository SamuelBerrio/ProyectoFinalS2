package com.example.proyectofinal.service;

import javafx.event.ActionEvent;

import java.io.IOException;

public interface SceneService {

    void switchScene(ActionEvent e, String resource) throws IOException;

    void switchToLoginView(ActionEvent e) throws IOException;

    void switchToRegisterView(ActionEvent e) throws IOException;
}
