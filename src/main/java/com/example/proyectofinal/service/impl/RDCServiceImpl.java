package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.RDCService;

public class RDCServiceImpl implements RDCService {

    private final AutoGym autoGym;

    public RDCServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }

    @Override
    public Double calcularRDC(String genero, Double peso, Double altura, Double edad) {
        if (genero.equals("Masculino")){
            return (peso*10)+(6.25*altura)-(5*edad)+5;
        }else {
            return (peso*10)+(6.25*altura)-(5*edad)-161;
        }
    }
}
