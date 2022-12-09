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

import java.io.IOException;
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
        mfc.getAutoGym().getInformationService().cloneArrayListUserDTO(mfc.getAutoGym().getUserService().getArrayListUsersDTO());
        tblId.setItems(mfc.getAutoGym().getInformationService().getObservableListUserDTO());
        usernameTbl.setCellValueFactory(new PropertyValueFactory<>("username"));
        ageTbl.setCellValueFactory(new PropertyValueFactory<>("age"));
        idTbl.setCellValueFactory(new PropertyValueFactory<>("id"));
        serviceTbl.setCellValueFactory(new PropertyValueFactory<>("service"));
        tblId.refresh();
    }

    @FXML
    void eliminarButton(ActionEvent event) throws IOException {
        mfc.getAutoGym().getInformationService().eliminarUser(userSelectedLabel.getText());
        mfc.getAutoGym().getUserService().saveUsers();
        sceneController.switchToInformationView(event);
    }

    public void selectedUserDTO(MouseEvent mouseEvent){
        UserDTO userDTO = tblId.getSelectionModel().getSelectedItem();
        userSelectedLabel.setText(userDTO.getUsername());
    }


    @FXML
    void bmiView(ActionEvent event) throws IOException {
        sceneController.switchToBMIView(event);
    }

    @FXML
    void ecView(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorHA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToECView(event);
        }else {
            System.out.println("Tu servicio no incluye esta automatizacion");
        }
    }

    @FXML
    void exitView(ActionEvent event) throws IOException {
        sceneController.switchToLoginView(event);
    }

    @FXML
    void homeView(ActionEvent event) throws IOException {
        sceneController.switchToHomeView(event);
    }

    @FXML
    void rdcView(ActionEvent event) throws IOException {
        if (mfc.getAutoGym().getSceneValidatorService().validatorHMA(mfc.getAutoGym().getUserService().getUserOn())){
            sceneController.switchToRDCView(event);
        }else {
            System.out.println("Tu servicio no incluye esta automatizacion");
        }
    }

}
