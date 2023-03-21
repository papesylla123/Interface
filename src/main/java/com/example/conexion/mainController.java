package com.example.conexion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField identifianttxt;
    @FXML
    private PasswordField passwordtxt;
    public void getLogin(ActionEvent event){
        String id= identifianttxt.getText();
        String password=passwordtxt.getText();
        String params= id+ " " +password;
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setContentText(params);

        alert.showAndWait();
    }
}