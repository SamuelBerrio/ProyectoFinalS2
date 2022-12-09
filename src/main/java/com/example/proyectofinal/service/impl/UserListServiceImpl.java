package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.dto.UserDTO;
import com.example.proyectofinal.model.User;
import com.example.proyectofinal.persistence.Persistence;
import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.UserListService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserListServiceImpl implements UserListService {
    List <User> arrayListUsers = new ArrayList<>();
    List<UserDTO> arrayListUsersDTO = new ArrayList<>();

    User userOn;

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
    public User getUserOn() {
        return userOn;
    }

    @Override
    public void setUserOn(User userOn) {
        this.userOn = userOn;
    }

    @Override
    public void printUsers() {
        for(User user:arrayListUsers){
            System.out.println(user.toString());
        }
    }

    @Override
    public void initializeUsersList(){
        try{
            this.arrayListUsers = Persistence.loadUsers();
            for (User user:arrayListUsers){
                arrayListUsersDTO.add(new UserDTO(user.getUsername(),user.getAge(),user.getService(),user.getId()));
            }
        }catch (IOException err){
            System.out.println(err.getMessage());
        }
    }

    @Override
    public void addUser(User user, UserDTO userDTO) {
        arrayListUsersDTO.add(userDTO);
        arrayListUsers.add(user);
        try{
            Persistence.saveUsers(arrayListUsers);
        }catch (IOException err){
            System.out.println(err.getMessage());
        }
    }

    @Override
    public void saveUsers(){
        try{
            Persistence.saveUsers(arrayListUsers);
        }catch (IOException err){
            System.out.println(err.getMessage());
        }
    }

    }
