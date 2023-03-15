package com.example.conexion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField identifianttxt;
    @FXML
    private PasswordField passwordtxt;
    public void getLogin(ActionEvent event){
        String id= identifianttxt.getText();
        String password=passwordtxt.getText();
        String paprams= id+ " " +password;
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setContentText(paprams);

        alert.showAndWait();
    }
}