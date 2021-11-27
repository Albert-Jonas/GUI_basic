package com.example.gui_basic;

//új sor, ami comment

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GUI_basic extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    GridPane rootNode = new GridPane();
    TextField szuletesNap = new TextField();
    TextField utazasNap = new TextField();
    TextField visszateresNap = new TextField();
    TextField alapErtek = new TextField();
    TextField kedvezmenyMertek = new TextField();
    TextField kedvezmenyesAr = new TextField();
    CheckBox usaUtazas = new CheckBox("USA-ba utazik");
    Button kedvezmenyGomb = new Button("Várható kedvezmény");
    Button okGomb = new Button("Ok");
    Button kilepesGomb = new Button("Kilépés");
    Button resetGomb = new Button("Reset");
    Scene scene = new Scene(rootNode, 500, 350);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Utazási iroda");
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);
        GridPane.setHalignment(kedvezmenyGomb, HPos.LEFT);

        alapErtek.setEditable(false);
        kedvezmenyMertek.setEditable(false);
        kedvezmenyesAr.setEditable(false);

        alapErtek.setText("1000");

        primaryStage.setScene(scene);

        rootNode.add(new Label("Kérem a születési dátumot"), 0, 0);
        rootNode.add(szuletesNap, 0, 1);
        rootNode.add(new Label("Utazás napja"), 1, 0);
        rootNode.add(utazasNap, 1, 1);
        rootNode.add(new Label("Vissza út"), 2, 0);
        rootNode.add(visszateresNap, 2, 1);

        rootNode.add(new Label(" "),0,2);

        rootNode.add(usaUtazas, 0,3);
        rootNode.add(kedvezmenyGomb, 2,3);

        rootNode.add(new Label(" "),0,4);

        rootNode.add(new Label("Alap érték"), 0,5);
        rootNode.add(alapErtek, 0,6);
        rootNode.add(new Label("Kedvezmény mértéke"), 1,5);
        rootNode.add(kedvezmenyMertek, 1,6);
        rootNode.add(new Label("Kedvedzényes ár"),2,5);
        rootNode.add(kedvezmenyesAr,2,6);

        rootNode.add(new Label(" "),0,7);
        rootNode.add(new Label(" "),0,8);

        rootNode.add(okGomb,0,9);
        rootNode.add(kilepesGomb,1,9);
        rootNode.add(resetGomb,2,9);

        primaryStage.close();
        primaryStage.show();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                Integer value1 = Integer.valueOf(Value1.getText());
//                Integer value2 = Integer.valueOf(Value2.getText());
//                Integer r = value1 + value2;
//                result.setText(r.toString());
            }
        };

        kedvezmenyGomb.setOnAction(event);
    }
}