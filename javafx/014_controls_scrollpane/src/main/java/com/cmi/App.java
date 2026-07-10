package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        VBox vb = new VBox();

        ScrollPane sp = new ScrollPane(vb);
        sp.setPrefHeight(50);

        for (int i = 0; i < 50; i++) {
            // create multiple labels to simulate overflow
            Label num = new Label(String.valueOf(i));
            vb.getChildren().add(num);
        }

        return sp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: ScrollPane");
        stage.show();
    }
}
