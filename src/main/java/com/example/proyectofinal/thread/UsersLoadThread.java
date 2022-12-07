package com.example.proyectofinal.thread;

import com.example.proyectofinal.controller.ModelFactoryController;
import com.example.proyectofinal.service.AutoGym;

public class UsersLoadThread extends Thread{

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    @Override
    public void run(){
        mfc.getAutoGym().getUserService().initializeUsersList();
        System.out.println("Hilo finalizado");
    }
}
