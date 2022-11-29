package com.example.proyectofinal.service.impl;

import com.example.proyectofinal.dto.UserDTO;
import com.example.proyectofinal.service.AutoGym;
import com.example.proyectofinal.service.InformationService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

public class InformationServiceImpl implements InformationService{

    private final AutoGym autoGym;

    public InformationServiceImpl(AutoGym autoGym) {
        this.autoGym = autoGym;
    }

    ObservableList<UserDTO> elementObservableList= FXCollections.observableArrayList();

    @Override
    public ObservableList<UserDTO> getObservableListUserDTO() {
        return elementObservableList;
    }

    @Override
    public void cloneArrayListUserDTO(List<UserDTO> usersDTO) {
       elementObservableList = (ObservableList<UserDTO>) usersDTO;
       elementObservableList.forEach(System.out::println);
    }
}