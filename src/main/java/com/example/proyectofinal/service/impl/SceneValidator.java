package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.model.User;
import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.SceneValidatorService;

public class SceneValidator implements SceneValidatorService {

    private final AutoGym autoGym;

    public SceneValidator(AutoGym autoGym) {
        this.autoGym = autoGym;
    }

    @Override
    public Boolean validatorHA(User user) {
        return user.getService().equals("High") || user.getService().equals("Admin");
    }

    @Override
    public Boolean validatorHMA(User user) {
        return user.getService().equals("High") || user.getService().equals("Medium") || user.getService().equals("Admin");
    }

    @Override
    public Boolean validatorA(User user) {
        return user.getService().equals("Admin");
    }
}
