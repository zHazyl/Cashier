package com.example.cashier;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CashierController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void displayStage(ActionEvent event, String file_fxml) throws IOException {

        root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(file_fxml)));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    public void logout(ActionEvent event) throws IOException {

        displayStage(event, "login.fxml");

    }

}
