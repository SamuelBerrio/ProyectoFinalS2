package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.ECService;

public class ECServiceImpl implements ECService {

    private final AutoGym autoGym;

    public ECServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }

    @Override
    public Double calcularEC(String actividad, Integer peso, Double tiempoAct) {
            if(actividad.equals("Running")) {
            if (peso < 70) {
                return (375 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (465 * 2) * tiempoAct;
            } else {
                return (555 * 2) * tiempoAct;
            }
        }else if (actividad.equals("Caminar")) {
            if (peso < 70) {
                return (135 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (167 * 2) * tiempoAct;
            } else {
                return (200 * 2) * tiempoAct;
            }
        }else if (actividad.equals("Nadar")) {
            if (peso < 70) {
                return (180 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (223 * 2) * tiempoAct;
            } else {
                return (266 * 2) * tiempoAct;
            }
        } else if (actividad.equals("Gym")) {
            if (peso < 70) {
                return (90 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (112 * 2) * tiempoAct;
            } else {
                return (133 * 2) * tiempoAct;
            }
        } else if (actividad.equals("Ciclismo")) {
            if (peso < 70) {
                return (360 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (446 * 2) * tiempoAct;
            } else {
                return (533 * 2) * tiempoAct;
            }
        } else if (actividad.equals("Baile")) {
            if (peso < 70) {
                return (165 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (205 * 2) * tiempoAct;
            } else {
                return (244 * 2) * tiempoAct;
            }
        } else if (actividad.equals("Yoga")) {
            if (peso < 70) {
                return (120 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (149 * 2) * tiempoAct;
            } else {
                return (178 * 2) * tiempoAct;
            }
        } else if (actividad.equals("Senderismo")) {
            if (peso < 70) {
                return (180 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (223 * 2) * tiempoAct;
            } else {
                return (266 * 2) * tiempoAct;
            }
        } else if (actividad.equals("Boxeo")) {
            if (peso < 70) {
                return (270 * 2) * tiempoAct;
            } else if (peso > 70 && peso < 80) {
                return (335 * 2) * tiempoAct;
            } else {
                return (400 * 2) * tiempoAct;
            }
        } else if (actividad.equals("Aerobicos")) {
                if (peso < 70) {
                    return (210 * 2) * tiempoAct;
                } else if (peso > 70 && peso < 80) {
                    return (260 * 2) * tiempoAct;
                } else {
                    return (311 * 2) * tiempoAct;
                }
        }
            return null;
    }
}
