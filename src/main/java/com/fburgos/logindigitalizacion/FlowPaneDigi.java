package com.fburgos.logindigitalizacion;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDigi extends Application {
    private static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Creamos el root flow
        FlowPane root = new FlowPane();
        //Creación de 6 botones
        Button btn1 = new Button("Buttom 1");
        Button btn2 = new Button("Buttom 2");
        Button btn3 = new Button("Buttom 3");
        Button btn4 = new Button("Buttom 4");
        Button btn5 = new Button("Buttom 5");
        Button btn6 = new Button("Buttom 6");
//------------------------------------------------------------------------------------------------------------
        //Array de botones
        Button[] botnes = new Button[10];
        String content = "1";
        for (int i = 0; i < botnes.length; i++) {
            Button btn = new Button(content);
            int cont = Integer.parseInt(content);
            root.getChildren().add(btn);
           cont ++;
           content = String.valueOf(cont);
        }
//------------------------------------------------------------------------------------------------------------
        //root getChildren addAll()
        root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
        root.setHgap(125);
        root.setVgap(125);

        root.setOrientation(Orientation.HORIZONTAL);
        scene = new Scene(root, 600, 450);
        stage.setScene(scene);
        stage.show();
    }

}
