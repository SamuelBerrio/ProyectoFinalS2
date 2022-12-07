package com.example.proyectofinal.service;

import com.example.proyectofinal.dto.UserDTO;
import com.example.proyectofinal.model.User;

import java.util.List;

public interface UserListService{
    List<User> getArrayListUsers();

    List<UserDTO> getArrayListUsersDTO();

    User getUserOn();

    void setUserOn(User userOn);

    void printUsers();

    void initializeUsersList();

    void addUser(User user, UserDTO userDTO);
}
