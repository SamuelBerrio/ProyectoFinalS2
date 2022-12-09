package com.example.proyectofinal.service;

import com.example.proyectofinal.dto.UserDTO;
import javafx.collections.ObservableList;

import java.util.List;

public interface InformationService {
    ObservableList<UserDTO> getObservableListUserDTO();

    void cloneArrayListUserDTO(List<UserDTO> usersDTO);

    void eliminarUser(String username);
}
