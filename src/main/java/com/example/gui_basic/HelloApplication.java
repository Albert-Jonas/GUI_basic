package com.example.gui_basic;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloApplication extends Application implements EventHandler {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title");

        GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        rootNode.add(new Label("Value1"), 0, 0);
        TextField Value1 = new TextField();
        rootNode.add(Value1, 1, 0);
        rootNode.add(new Label("Value2"), 0, 1);
        TextField Value2 = new TextField();
        rootNode.add(Value2, 1, 1);
        rootNode.add(new Label("Action"), 0, 2);
        Button aButton = new Button("Label");
        rootNode.add(aButton, 1, 2);
        GridPane.setHalignment(aButton, HPos.LEFT);
        TextField result = new TextField();
        result.setEditable(false);
        rootNode.add(result, 1, 3);

        Scene scene = new Scene(rootNode, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        aButton.setOnAction(e -> {
            Integer value1 = Integer.valueOf(Value1.getText());
            Integer value2 = Integer.valueOf(Value2.getText());
            Integer r = value1 + value2;
            result.setText(r.toString());
        });
    }

    @Override
    public void handle(Event event) {
        if(event.getSource() == button){
        }
    }
}