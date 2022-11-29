package com.example.proyectofinal.controller;

import com.example.proyectofinal.SceneController;
import com.example.proyectofinal.dto.UserDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

public class InformationController implements Initializable {

    ModelFactoryController mfc = ModelFactoryController.getInstance();

    private final SceneController sceneController;

    public InformationController() {
        this.sceneController = new SceneController();
    }
    @FXML
    private TableColumn<UserDTO, Integer> ageTbl;

    @FXML
    private TableColumn<UserDTO, String> idTbl;

    @FXML
    private TableColumn<UserDTO, String> serviceTbl;

    @FXML
    private TableColumn<UserDTO, String> usernameTbl;

    @FXML
    private TableView<UserDTO> tblId;

    @FXML
    private Label userSelectedLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Hilo creado para clonar arraylist
       CompletableFuture.runAsync(()->mfc.getAutoGym().getInformationService().cloneArrayListUserDTO(mfc.getAutoGym().getUserService().getArrayListUsersDTO()));
        usernameTbl.setCellValueFactory(new PropertyValueFactory<>("username"));
        ageTbl.setCellValueFactory(new PropertyValueFactory<>("age"));
        idTbl.setCellValueFactory(new PropertyValueFactory<>("id"));
        serviceTbl.setCellValueFactory(new PropertyValueFactory<>("service"));
        tblId.setItems(mfc.getAutoGym().getInformationService().getObservableListUserDTO());
    }

    @FXML
    void eliminarButton(ActionEvent event) {
    }

    public void selectedUserDTO(MouseEvent mouseEvent){
        UserDTO userDTO = tblId.getSelectionModel().getSelectedItem();
        userSelectedLabel.setText(userDTO.getUsername());
    }

}
