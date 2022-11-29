package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.dto.UserDTO;
import com.example.proyectofinal.model.User;
import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

    private final AutoGym autoGym;

    public RegisterServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }

    @Override
    public Boolean addUser(String username, String password, Integer age, String id, String service) {
        if (username.equals("")||password.equals("")||id.equals("")||service.equals("")){
            return false;
        }else {
            autoGym.getUserService().getArrayListUsers().add(new User(username,password,age,id,service));
            autoGym.getUserService().getArrayListUsersDTO().add(new UserDTO(username,age,service,id));
            return true;
        }
    }

}
