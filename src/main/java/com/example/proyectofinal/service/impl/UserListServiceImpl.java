package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.dto.UserDTO;
import com.example.proyectofinal.model.User;
import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.UserListService;

import java.util.ArrayList;
import java.util.List;

public class UserListServiceImpl implements UserListService {
    List <User> arrayListUsers = new ArrayList<>();
    List<UserDTO> arrayListUsersDTO = new ArrayList<>();

    private final AutoGym autoGym;

    public UserListServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }

    @Override
    public List<User> getArrayListUsers() {
        return arrayListUsers;
    }

    @Override
    public List<UserDTO> getArrayListUsersDTO() {return arrayListUsersDTO;}

    @Override
    public void printUsers() {
            for(User user:arrayListUsers){
                System.out.println(user.toString());
            }
        }
    }
