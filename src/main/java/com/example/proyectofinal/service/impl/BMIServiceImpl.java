package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.BMIService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIServiceImpl implements BMIService {

    private final AutoGym autoGym;

    public BMIServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }

    @Override
    public Double calcularBMI(Double altura, Double peso) {
        altura = altura/100*altura/100;
        System.out.println(altura);
        System.out.println(peso/altura);
        return peso/altura;
    }
}
