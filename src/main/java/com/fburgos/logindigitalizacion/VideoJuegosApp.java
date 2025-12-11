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
    private int adivina = 1; // Creo una variable para verificar si es igual al aleatorio
    private int numeroAleatorio = (int) (Math.random() * 10) + 1; // creo una variable para almacenar un numero aleatorio

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


        Label obtener = new Label(" Ingresa un número del 1 al 10 ");
        obtener.setMaxWidth(Double.MAX_VALUE);
        root.add(obtener, 0, 0, 4, 2);

        //Botón enviar
        Button enviar = new Button("Sell");
        enviar.setMaxWidth(Double.MAX_VALUE);
        enviar.setMaxHeight(Double.MAX_VALUE);
        root.add(enviar, 0, 5, 4, 2);
        enviar.setOnAction(e -> {
            int num = Integer.parseInt(label.getText());
            if (adivina < 5) {
                adivina++;
                if (num == numeroAleatorio) {
                    obtener.setText("En hora buena has adivinado");
                    enviar.setDisable(true); //Desabilito el boton de envíar para que no puedas ingresar mas contenido
                }
                if (num < numeroAleatorio) {
                    obtener.setText(" Ingresa un número mayor");
                    label.clear();
                }
                if (num > numeroAleatorio) {
                    obtener.setText("Ingresa un número menor");
                    label.clear();
                }
            } else {
                obtener.setText("La próxima será mejor, el número es: " + numeroAleatorio);
            }
        });

        //Botón reiniciar
        Button reiniciar = new Button("Reboot");
        reiniciar.setMaxWidth(Double.MAX_VALUE);
        reiniciar.setMaxHeight(Double.MAX_VALUE);
        root.add(reiniciar, 0, 7, 4, 2);
        reiniciar.setOnAction(e -> {
            label.clear(); //Limpio el label
            obtener.setText("Ingresa un ńumero del 1 al 10"); //Vuelvo a colocar el text
            enviar.setDisable(false); //habilito el botón enviar
            adivina = 0; //Inicializo el adivina en 0
            numeroAleatorio = (int) (Math.random() * 10) + 1; //Creo otro número aleatorio
        });

        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);
        scene = new Scene(root, 600, 450);

        stage.setScene(scene);
        stage.show();
    }
}

