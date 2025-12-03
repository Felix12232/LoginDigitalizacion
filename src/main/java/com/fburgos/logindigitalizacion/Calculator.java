package com.fburgos.logindigitalizacion;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
private static Scene scene;

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        root.setMaxWidth(Double.MAX_VALUE);
        root.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(root, new Insets(10,10,10,10));
        //-----------------------------------------------------------------------------------------------------
        //CREACIÓN DEL LABEL
        TextField label = new TextField();
         label.setMaxWidth(Double.MAX_VALUE);
         label.setMaxHeight(Double.MAX_VALUE);
         root.add(label, 0,1,3,2);
        //-----------------------------------------------------------------------------------------------------
        //Creación de los botones
        Button btn7 = new Button("7");
        btn7.setMaxWidth(Double.MAX_VALUE);
        btn7.setMaxHeight(Double.MAX_VALUE);

        Button btn8 = new Button("8");
        btn8.setMaxWidth(Double.MAX_VALUE);
        btn8.setMaxHeight(Double.MAX_VALUE);
        Button btn9= new Button("9");
        btn9.setMaxWidth(Double.MAX_VALUE);
        btn9.setMaxHeight(Double.MAX_VALUE);
        Button btnM = new Button("+");
        btnM.setMaxWidth(Double.MAX_VALUE);
        btnM.setMaxHeight(Double.MAX_VALUE);
        root.add(btn7, 0,4);
        root.add(btn8, 1,4);
        root.add(btn9, 2,4);
        root.add(btnM, 3,4);

        Button btn4 = new Button("4");
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxHeight(Double.MAX_VALUE);
        Button btn5 = new Button("5");
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxHeight(Double.MAX_VALUE);
        Button btn6 = new Button("6");
        btn6.setMaxWidth(Double.MAX_VALUE);
        btn6.setMaxHeight(Double.MAX_VALUE);
        Button btnMe = new Button("-");
        btnMe.setMaxWidth(Double.MAX_VALUE);
        btnMe.setMaxHeight(Double.MAX_VALUE);
        root.add(btn4, 0,6);
        root.add(btn5, 1,6);
        root.add(btn6, 2,6);
        root.add(btnMe, 3,6);

        Button btn1 = new Button("1");
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn1.setMaxHeight(Double.MAX_VALUE);
        Button btn2 = new Button("2");
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxHeight(Double.MAX_VALUE);
        Button btn3 = new Button("3");
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxHeight(Double.MAX_VALUE);
        Button btnP = new Button("*");
        btnP.setMaxWidth(Double.MAX_VALUE);
        btnP.setMaxHeight(Double.MAX_VALUE);
        root.add(btn1, 0,8);
        root.add(btn2, 1,8);
        root.add(btn3, 2,8);
        root.add(btnP, 3,8);

        Button btnC = new Button("C");
        btnC.setMaxWidth(Double.MAX_VALUE);
        btnC.setMaxHeight(Double.MAX_VALUE);
        Button btn0 = new Button("0");
        btn0.setMaxWidth(Double.MAX_VALUE);
        btn0.setMaxHeight(Double.MAX_VALUE);
        Button btnI = new Button("=");
        btnI.setMaxWidth(Double.MAX_VALUE);
        btnI.setMaxHeight(Double.MAX_VALUE);
        Button btnD = new Button("/");
        btnD.setMaxWidth(Double.MAX_VALUE);
        btnD.setMaxHeight(Double.MAX_VALUE);
        root.add(btnC, 0,10);
        root.add(btn0, 1,10);
        root.add(btnI, 2,10);
        root.add(btnD, 3,10);

        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        scene = new Scene(root, 600, 450);
        stage.setScene(scene);
        stage.show();
    }
}
