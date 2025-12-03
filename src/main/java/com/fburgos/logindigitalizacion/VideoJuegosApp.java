package com.fburgos.logindigitalizacion;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.security.PrivateKey;


public class VideoJuegosApp extends Application {
    private static Scene scene;
    private int adivina = 0; // Creo una variable para verificar si es igual al aleatorio
    private int numeroAleatorio = (int)(Math.random()*10) +1; // creo una variable para almacenar un numero aleatorio
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        GridPane root = new GridPane();

        TextField label = new TextField();
        root.add(label, 0, 3, 4, 2); // Ocupa 4 columnas y 2 filas
        label.setMaxWidth(Double.MAX_VALUE);
        label.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(label, new Insets(10, 10, 10, 10));


        Label obtener = new Label(" Ingresa un número del 1 al 10 tienes 5 oportunidades " );
        root.add(obtener, 0, 0, 4, 2);

        //Botón enviar
        Button enviar = new Button("Sell");
        root.add(enviar, 0, 5, 4, 2);
        enviar.setOnAction(e -> {
            int num = Integer.parseInt(label.getText());
            if (adivina < 5){
                adivina ++;
                if (num == numeroAleatorio){
                    obtener.setText("En hora buena has adicinado");
                }
            }
        });
        //Botón reiniciar
        Button reiniciar = new Button("Reboot");
        root.add(reiniciar, 0, 7, 4, 2);
        reiniciar.setOnAction(e->{
            label.clear();
            obtener.setText("");
        });

        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);
        scene = new Scene(root,600,450);
        stage.setScene(scene);
        stage.show();
    }
}

