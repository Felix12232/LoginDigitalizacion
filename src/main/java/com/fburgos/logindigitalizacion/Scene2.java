package com.fburgos.logindigitalizacion;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static com.fburgos.logindigitalizacion.EventosBetweenScene.scene1;

public class Scene2 {
    // Método para crear la segunda escena
    public Scene createScene2(Stage stage) {
        VBox root2 = new VBox();
        Button backToScene1 = new Button("Volver a la primera pantalla");
        backToScene1.setPrefWidth(155);
        backToScene1.setPrefHeight(75);
        backToScene1.setOnMousePressed(e ->
        {
            stage.setScene(scene1);
        });
        root2.setAlignment(Pos.CENTER);
        root2.getChildren().add(backToScene1);
        return new Scene(root2, 600, 460); // Devolver la escena creada
    }
}
