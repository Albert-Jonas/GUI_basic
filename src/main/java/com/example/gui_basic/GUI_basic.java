package com.example.gui_basic;

//új sor, ami comment

import javafx.application.Application;
import javafx.event.ActionEvent;
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

public class GUI_basic extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    GridPane rootNode = new GridPane();
    TextField Value1 = new TextField();
    TextField Value2 = new TextField();
    Button aButton = new Button("Label");
    TextField result = new TextField();
    Scene scene = new Scene(rootNode, 300, 250);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title");
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);
        GridPane.setHalignment(aButton, HPos.LEFT);
        result.setEditable(false);
        primaryStage.setScene(scene);

        rootNode.add(new Label("Value1"), 0, 0);
        rootNode.add(Value1, 1, 0);
        rootNode.add(new Label("Value2"), 0, 1);
        rootNode.add(Value2, 1, 1);
        rootNode.add(new Label("Action"), 0, 2);
        rootNode.add(aButton, 1, 2);
        rootNode.add(result, 1, 3);

        primaryStage.show();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Integer value1 = Integer.valueOf(Value1.getText());
                Integer value2 = Integer.valueOf(Value2.getText());
                Integer r = value1 + value2;
                result.setText(r.toString());
            }
        };

        aButton.setOnAction(event);
    }
}