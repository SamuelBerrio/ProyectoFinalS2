package com.example.proyectofinal.controller;

import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.model.User;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModelFactoryController {

    AutoGym autoGym;

    public AutoGym getAutoGym() {
        return autoGym;
    }

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
}
