package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.RDCService;

public class RDCServiceImpl implements RDCService {

    private final AutoGym autoGym;

    public RDCServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }
}
