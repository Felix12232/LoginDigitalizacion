package com.fburgos.logindigitalizacion;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class TilePaneApplication extends Application {
    private static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Creamos el root flow
        TilePane root = new TilePane();
        //Creación de 6 botones
        Button btn1 = new Button("Buttom 1");
        Button btn2 = new Button("Buttom 2");
        Button btn3 = new Button("Buttom 3");
        Button btn4 = new Button("Buttom 4");
        Button btn5 = new Button("Buttom 5");
        Button btn6 = new Button("Buttom 6");
//------------------------------------------------------------------------------------------------------------
        btn1.setPrefWidth(150);
        btn2.setPrefWidth(150);
        btn3.setPrefWidth(150);
        btn4.setPrefWidth(150);
        btn5.setPrefWidth(150);
        btn6.setPrefWidth(150);
        //root getChildren addAll()
        root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
        root.setHgap(125);
        root.setVgap(125);
        root.setPrefColumns(3);
        root.setPrefTileWidth(150);  // Ancho del tile
        root.setPrefTileHeight(80);
        root.setOrientation(Orientation.HORIZONTAL);
        scene = new Scene(root, 600, 450);
        stage.setScene(scene);
        stage.show();
    }
}
