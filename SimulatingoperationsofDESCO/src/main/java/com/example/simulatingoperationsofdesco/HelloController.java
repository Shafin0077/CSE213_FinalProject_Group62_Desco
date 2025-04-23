package com.example.simulatingoperationsofdesco;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @javafx.fxml.FXML
    private Label welcomeText;

    //

    //

    @Deprecated
    public void postonaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Jobposting.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Deprecated
    public void ReturnHomeonaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ManageEmployee.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Deprecated
    public void ActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onHelloButtonClick(ActionEvent actionEvent) {
    }


    //@javafx.fxml.FXML
    //public void onHelloButtonClick(ActionEvent actionEvent) {
    //}
}