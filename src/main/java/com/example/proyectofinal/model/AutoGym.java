package com.example.proyectofinal.model;

import com.example.proyectofinal.SceneController;
import com.example.proyectofinal.service.SceneService;

public class AutoGym {

    private final SceneService sceneService;


    public AutoGym(){
        sceneService = new SceneController();
    }

    public SceneService getSceneService() {return sceneService;}
}
