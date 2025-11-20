package com.fburgos.logindigitalizacion;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vbox extends Application {
    public static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();

        Label title = new Label("-------------------- LOGIN DAM ------------------ ");
        root.getChildren().add(title);
        VBox.setMargin(title, new Insets(5,5,5,5));

        Label user = new Label(" User ");
         root.getChildren().add(user);

        TextField textField = new TextField();
        root.getChildren().add(textField);
        VBox.setMargin(textField, new Insets(10,10,10,10));
        //Insercion de password
        Label password = new Label(" Password ");
        root.getChildren().add(password);
        VBox.setMargin(password, new Insets(10,10,10,10));

        PasswordField passwordField = new PasswordField();
        root.getChildren().add(passwordField);
        VBox.setMargin(passwordField, new Insets(10,10,10,10));

        //INSERCIÓN BOTÓN
        Button btn = new Button("Enviar");
        root.getChildren().add(btn);
        VBox.setMargin(btn, new Insets(10,10,10,10));
        root.setAlignment(Pos.CENTER);
        VBox.setMargin(root, new Insets(10,10,10,10));

        scene = new Scene(root, 600, 450);
        stage.setScene(scene);
        stage.show();
    }
}
