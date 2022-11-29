package com.example.proyectofinal.service;

import com.example.proyectofinal.dto.UserDTO;
import com.example.proyectofinal.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserListService {
    List<User> getArrayListUsers();

    List<UserDTO> getArrayListUsersDTO();
    void printUsers();
}
