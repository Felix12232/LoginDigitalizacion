package com.fburgos.eventos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class VideoJuego extends Application {
    private static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        GridPane root = new GridPane();

        TextField label = new TextField();
        root.add(label, 0, 0, 4, 2); // Ocupa 4 columnas y 2 filas
        label.setMaxWidth(Double.MAX_VALUE);
        label.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(label, new Insets(10, 10, 10, 10));


        Label obtener = new Label("Obteniendo.... " );

        String text = label.getText();
        Button enviar = new Button("Sell");
        enviar.setOnAction(e ->{
             obtener.setText(text);
             label.clear();
        });
        Button reiniciar = new Button("Reboot");
        reiniciar.setOnAction(e->{
            label.clear();
            obtener.setText("");
        });
        root.getChildren().addAll(label,enviar,reiniciar);
        scene = new Scene(root,600,450);
        stage.setScene(scene);
        stage.show();
    }
}
