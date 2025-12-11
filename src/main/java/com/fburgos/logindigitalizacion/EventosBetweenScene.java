package com.fburgos.logindigitalizacion;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventosBetweenScene extends Application {
    static Scene scene1;
    private static Scene scene2; // Aquí declaramos ambas escenas
    private boolean isExpanded = false;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // Escena 1
        VBox root1 = new VBox();
        Button change = new Button("Cambiar a la segunda pantalla");
        change.setPrefWidth(155);
        change.setPrefHeight(75);

        // Acción para cambiar a la escena 2
        change.setOnMousePressed(e -> {
            stage.setScene(scene2); // Cambiar a la escena 2
        });
        // Crear la segunda escena
        Scene2 scene2App = new Scene2(); // Crear instancia de Scene2
        scene2 = scene2App.createScene2(stage); // Crear la segunda escena a través de la clase Scene2

        Button expandir = new Button(" Agrandar la pantalla ");
        expandir.setPrefWidth(155);
        expandir.setPrefHeight(75);

        // Acción para agrandar la pantalla
        expandir.setOnAction(e -> {
            if (isExpanded) {
                stage.setWidth(600);  // Cambiar el ancho de la ventana
                stage.setHeight(460);  // Cambiar la altura de la ventana
            }
            else{
                stage.setWidth(2000);  // Cambiar el ancho de la ventana
                stage.setHeight(1000);  // Cambiar la altura de la ventana
            }
            isExpanded = !isExpanded;
        });

        root1.getChildren().addAll(change, expandir);
        root1.setAlignment(Pos.CENTER);

        scene1 = new Scene(root1, 600, 460); // Asignar la primera escena
        // Inicializar la ventana con la primera escena
        stage.setScene(scene1);
        stage.show();
    }
}
