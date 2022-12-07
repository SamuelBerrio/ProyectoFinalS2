package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.HomeService;

public class HomeServiceImpl implements HomeService {

    private final AutoGym autoGym;

    public HomeServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }
}
