package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        GridPane gp = new GridPane();

        Label valLabel = new Label("0.0");

        Slider slider1 = new Slider(0.0, 10.0, 0.0);
        gp.add(slider1, 0, 0);
        gp.add(valLabel, 1, 0);

        slider1.valueProperty().addListener((observable, oldVal, newVal) -> {
            valLabel.setText(String.valueOf(newVal.intValue()));
        });

        return gp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: Slider");
        stage.show();
    }
}
