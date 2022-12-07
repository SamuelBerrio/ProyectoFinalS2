package com.example.proyectofinal.service;

import com.example.proyectofinal.model.User;

public interface SceneValidatorService {
    Boolean validatorHA(User user);
    Boolean validatorHMA(User user);
    Boolean validatorA(User user);
}
