package com.fburgos.logindigitalizacion;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application {
    private static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        GridPane root = new GridPane();

        // ---- Campo de texto ----
        TextField label = new TextField();
        root.add(label, 0, 0, 4, 2); // Ocupa 4 columnas y 2 filas
        label.setMaxWidth(Double.MAX_VALUE);
        label.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(label, new Insets(10,10,10,10));

        // ---- Hacer que las columnas crezcan ----
        for (int i = 0; i < 4; i++) {
            ColumnConstraints col = new ColumnConstraints();
            col.setHgrow(Priority.ALWAYS);
            root.getColumnConstraints().add(col);
        }

        // ---- Fila 1 (7, 8, 9, +) ----
        Button bt7 = new Button("7");
        bt7.setMaxWidth(Double.MAX_VALUE);
        bt7.setMaxHeight(Double.MAX_VALUE);
        bt7.setOnAction(c -> label.appendText("7"));
        root.setMargin(bt7, new Insets(10,10,10,10));
        Button bt8 = new Button("8");
        bt8.setMaxWidth(Double.MAX_VALUE);
        bt8.setMaxHeight(Double.MAX_VALUE);
        bt8.setOnAction(c -> label.appendText("8"));
        root.setMargin(bt8, new Insets(10,10,10,10));
        Button bt9 = new Button("9");
        bt9.setMaxWidth(Double.MAX_VALUE);
        bt9.setMaxHeight(Double.MAX_VALUE);
        bt9.setOnAction(c -> label.appendText("9"));
        root.setMargin(bt9, new Insets(10,10,10,10));
        Button btM = new Button("+");
        btM.setMaxWidth(Double.MAX_VALUE);
        btM.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(btM, new Insets(10,10,10,10));

        root.add(bt7, 0, 3);
        root.add(bt8, 1, 3);
        root.add(bt9, 2, 3);
        root.add(btM, 3, 3);

        // ---- Fila 2 (4, 5, 6, -) ----
        Button bt4 = new Button("4");
        bt4.setMaxWidth(Double.MAX_VALUE);
        bt4.setMaxHeight(Double.MAX_VALUE);
        bt4.setOnAction(c -> label.appendText("4"));
        root.setMargin(bt4, new Insets(10,10,10,10));
        Button bt5 = new Button("5");
        bt5.setMaxWidth(Double.MAX_VALUE);
        bt5.setMaxHeight(Double.MAX_VALUE);
        bt5.setOnAction(c -> label.appendText("5"));
        root.setMargin(bt5, new Insets(10,10,10,10));
        Button bt6 = new Button("6");
        bt6.setMaxWidth(Double.MAX_VALUE);
        bt6.setMaxHeight(Double.MAX_VALUE);
        bt6.setOnAction(c -> label.appendText("6"));
        root.setMargin(bt6, new Insets(10,10,10,10));
        Button btMe = new Button("-");
        btMe.setMaxWidth(Double.MAX_VALUE);
        btMe.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(btMe, new Insets(10,10,10,10));

        root.add(bt4, 0, 4);
        root.add(bt5, 1, 4);
        root.add(bt6, 2, 4);
        root.add(btMe, 3, 4);

        // ---- Fila 3 (1, 2, 3, *) ----
        Button bt1 = new Button("1");
        bt1.setMaxWidth(Double.MAX_VALUE);
        bt1.setMaxHeight(Double.MAX_VALUE);
        bt1.setOnAction(c -> label.appendText("1"));
        root.setMargin(bt1, new Insets(10,10,10,10));
        Button bt2 = new Button("2");
        bt2.setMaxWidth(Double.MAX_VALUE);
        bt2.setMaxHeight(Double.MAX_VALUE);
        bt2.setOnAction(c -> label.appendText("2"));
        root.setMargin(bt2, new Insets(10,10,10,10));
        Button bt3 = new Button("3");
        bt3.setMaxWidth(Double.MAX_VALUE);
        bt3.setMaxHeight(Double.MAX_VALUE);
        bt3.setOnAction(c -> label.appendText("3"));
        root.setMargin(bt3, new Insets(10,10,10,10));
        Button btp = new Button("*");
        btp.setMaxWidth(Double.MAX_VALUE);
        btp.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(btp, new Insets(10,10,10,10));

        root.add(bt1, 0, 5);
        root.add(bt2, 1, 5);
        root.add(bt3, 2, 5);
        root.add(btp, 3, 5);

        // ---- Fila 4 (C, 0, =, /) ----
        Button btc = new Button("C");
        btc.setMaxWidth(Double.MAX_VALUE);
        btc.setMaxHeight(Double.MAX_VALUE);
        btc.setOnAction(ch -> label.clear());
        root.setMargin(btc, new Insets(10,10,10,10));
        Button bt0 = new Button("0");
        bt0.setMaxWidth(Double.MAX_VALUE);
        bt0.setMaxHeight(Double.MAX_VALUE);
        bt0.setOnAction(c -> label.appendText("0"));
        root.setMargin(bt0, new Insets(10,10,10,10));
        Button bti = new Button("=");
        bti.setMaxWidth(Double.MAX_VALUE);
        bti.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(bti, new Insets(10,10,10,10));
        Button btd = new Button("/");
        btd.setMaxWidth(Double.MAX_VALUE);
        btd.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(btd, new Insets(10,10,10,10));

        root.add(btc, 0, 6);
        root.add(bt0, 1, 6);
        root.add(bti, 2, 6);
        root.add(btd, 3, 6);

        // ---- Espaciado ----
        GridPane.setMargin(root, new Insets(50,50,49,4));
        root.setHgap(10);
        root.setVgap(10);
        
        root.setAlignment(Pos.CENTER);
        scene = new Scene(root, 600, 450);
        stage.setScene(scene);
        stage.show();
    }
}
