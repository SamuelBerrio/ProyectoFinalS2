package com.example.proyectofinal.service;

import com.example.proyectofinal.service.impl.InformationServiceImpl;
import com.example.proyectofinal.service.impl.RegisterServiceImpl;
import com.example.proyectofinal.service.impl.UserListServiceImpl;

public class AutoGym {

    private final RegisterService registerService;
    private final UserListService userService;

    private final InformationService informationService;


    public AutoGym(){
        registerService = new RegisterServiceImpl(this);
        userService = new UserListServiceImpl(this);
        informationService = new InformationServiceImpl(this);
    }

    public RegisterService getRegisterService(){return registerService;}
    public UserListService getUserService() {return userService;}

    public InformationService getInformationService(){return informationService;}
}
