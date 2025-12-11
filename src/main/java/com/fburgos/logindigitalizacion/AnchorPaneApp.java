package com.fburgos.logindigitalizacion;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnchorPaneApp extends Application {
    private static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = new AnchorPane();

        Button label = new Button();
        AnchorPane.setLeftAnchor(label, 0.0);
        AnchorPane.setRightAnchor(label, 0.0);
        AnchorPane.setTopAnchor(label, 0.0);

        Button labelpeque = new Button();
        AnchorPane.setLeftAnchor(labelpeque, 0.0);
        AnchorPane.setRightAnchor(labelpeque, 100.0);
        AnchorPane.setTopAnchor(labelpeque, 25.0);

        //
        TextField textField = new TextField();
        Button button = new Button();
        button.setPrefWidth(100);
        button.setPrefHeight(30);
        button.setOnKeyPressed(e -> System.out.println("Hola mundo"));
        HBox hBox = new HBox(button);
        hBox.setAlignment(Pos.CENTER);
        AnchorPane.setBottomAnchor(hBox, 0.0);
        AnchorPane.setRightAnchor(hBox, 0.0);
        AnchorPane.setLeftAnchor(hBox, 0.0);
        Button accion = new Button("Clickea");

        root.getChildren().addAll(label, labelpeque, hBox, textField, accion);
        scene = new Scene(root, 600, 450);
        scene.setOnKeyPressed(e ->
                {
                    if (e.getCode() == KeyCode.A) {
                         accion.setVisible(!accion.isVisible());
                    }
                }
        );

        stage.setScene(scene);
        stage.show();
    }
}
//Nodo.setOnMouseEntered  
//scene.setOnKeyPressed