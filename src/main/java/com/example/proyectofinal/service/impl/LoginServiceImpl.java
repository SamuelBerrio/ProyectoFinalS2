package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.model.User;
import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.LoginService;

public class LoginServiceImpl implements LoginService {

    private final AutoGym autoGym;

    public LoginServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }

    @Override
    public Boolean loginAuthorization(String username, String password) {
        for (User user : autoGym.getUserService().getArrayListUsers()){
            if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
                autoGym.getUserService().setUserOn(user);
                return true;
            }
        }
        return false;
    }
}
