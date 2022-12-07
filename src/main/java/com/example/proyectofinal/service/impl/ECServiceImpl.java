package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.ECService;

public class ECServiceImpl implements ECService {

    private final AutoGym autoGym;

    public ECServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }
}
