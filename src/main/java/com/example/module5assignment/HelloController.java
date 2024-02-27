package com.example.module5assignment;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.lang.System;

public class HelloController {
    @FXML
    private TextField textFieldFirstName;
    @FXML
    private TextField textFieldLastName;
    @FXML
    private TextField textFieldDepartment;
    @FXML
    private TextField textFieldMajor;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private TextField textFieldImageURL;
    @FXML
    private TableView tableViewStudentInfo;

    public void handleClearButton () {
        System.out.println ("handleClearButton called");
    }

    public void handleAddButton () {
        System.out.println ("handleAddButton called");
    }

    public void handleDeleteButton () {
        System.out.println ("handleDeleteButton called");
    }

    public void handleEditButton () {
        System.out.println ("handleEditButton called");
    }
}