module com.example.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectofinal to javafx.fxml;
    exports com.example.proyectofinal;

    opens com.example.proyectofinal.controller to javafx.fxml;
    exports com.example.proyectofinal.controller;

    opens com.example.proyectofinal.dto to javafx.fxml;
    exports com.example.proyectofinal.dto;
}