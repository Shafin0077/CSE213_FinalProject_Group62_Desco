package com.example.simulatingoperationsofdesco;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Jobposting
{
    @javafx.fxml.FXML
    private TextField Descriptiontextfield;
    @javafx.fxml.FXML
    private TextField jobtitletextfield;
    @javafx.fxml.FXML
    private TextField Responsibilitiestextfield;
    @javafx.fxml.FXML
    private ComboBox SkillsRequiredcombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ReturnHomeonaction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SaveDraft.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {}
    }

    @javafx.fxml.FXML
    public void postonaction(ActionEvent actionEvent) {
    }
}