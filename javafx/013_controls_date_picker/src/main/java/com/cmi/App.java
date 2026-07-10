package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        GridPane gp = new GridPane();

        Label startDateLabel = new Label("Start Date");
        DatePicker dp = new DatePicker();

        dp.valueProperty().addListener((obs, oldVal, newVal) -> {
            System.out.println(oldVal + " -> " + newVal);
        });

        gp.add(startDateLabel, 0, 0);
        gp.add(dp, 1, 0);

        return gp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: DatePicker");
        stage.show();
    }
}
