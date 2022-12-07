package com.example.proyectofinal.service;

import com.example.proyectofinal.service.impl.*;

public class AutoGym {

    private final RegisterService registerService;
    private final UserListService userService;

    private final InformationService informationService;

    private final LoginService loginService;

    private final SceneValidatorService sceneValidatorService;

    private final BMIService bmiService;

    private final ECService ecService;

    private final HomeService homeService;

    private final RDCService rdcService;


    public AutoGym(){
        registerService = new RegisterServiceImpl(this);
        userService = new UserListServiceImpl(this);
        informationService = new InformationServiceImpl(this);
        loginService = new LoginServiceImpl(this);
        sceneValidatorService = new SceneValidator(this);
        bmiService = new BMIServiceImpl(this);
        ecService = new ECServiceImpl(this);
        homeService = new HomeServiceImpl(this);
        rdcService = new RDCServiceImpl(this);
    }

    public RegisterService getRegisterService(){return registerService;}
    public UserListService getUserService() {return userService;}

    public InformationService getInformationService(){return informationService;}

    public LoginService getLoginService(){return loginService;}

    public SceneValidatorService getSceneValidatorService(){return sceneValidatorService;}

    public BMIService getBmiService(){return bmiService;}

    public ECService getEcService(){return ecService;}

    public HomeService getHomeService(){return homeService;}

    public RDCService getRdcService(){return rdcService;}
}
