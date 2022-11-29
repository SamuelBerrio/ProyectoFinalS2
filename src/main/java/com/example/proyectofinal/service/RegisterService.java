package com.example.proyectofinal.service;

import com.example.proyectofinal.model.User;

public interface RegisterService {
    Boolean addUser(String username, String password, Integer age, String id, String service);
}
