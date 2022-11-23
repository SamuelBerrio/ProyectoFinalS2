package com.example.proyectofinal.controller;

import com.example.proyectofinal.model.AutoGym;
import com.example.proyectofinal.service.ModelFactoryControllerService;
import javafx.event.ActionEvent;

import java.io.IOException;

public class ModelFactoryController implements ModelFactoryControllerService {

    AutoGym autoGym;

    private static class SingletonHolder{
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        autoGym = new AutoGym();
    }

    //Switch Scene

    @Override
    public void switchScene(ActionEvent e, String resource) throws IOException {
        autoGym.getSceneService().switchScene(e,resource);
    }

    @Override
    public void switchToLoginView(ActionEvent e) throws IOException {
        autoGym.getSceneService().switchToLoginView(e);
    }

    @Override
    public void switchToRegisterView(ActionEvent e) throws IOException {
        autoGym.getSceneService().switchToRegisterView(e);
    }

}
