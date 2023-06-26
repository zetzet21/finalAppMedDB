package com.example.appdb;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> age;

    @FXML
    private TableColumn<?, ?> dateOfBirth;

    @FXML
    private TableColumn<?, ?> diagnos;

    @FXML
    private TableColumn<?, ?> firstVisitDate;

    @FXML
    private TableColumn<?, ?> fullName;

    @FXML
    private TableColumn<?, ?> homeAdress;

    @FXML
    private TableColumn<?, ?> lastVisitDate;

    @FXML
    private TableColumn<?, ?> locality;

    @FXML
    private TableColumn<?, ?> male;

    @FXML
    private TableColumn<?, ?> socialStatus;

    @FXML
    private TableColumn<?, ?> treatment;

    @FXML
    private TableColumn<?, ?> patId;

    @FXML
    private Button buttonBack;

    @FXML
    void initialize() {

    }

}
