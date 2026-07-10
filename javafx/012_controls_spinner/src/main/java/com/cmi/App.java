package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        GridPane gp = new GridPane();

        Label gradeLabel = new Label("Grade");
        Spinner<Integer> grade = new Spinner<Integer>(1, 5, 5);

        gp.add(gradeLabel, 0, 0);
        gp.add(grade, 1, 0);

        grade.valueProperty().addListener((obs, oldVal, newVal) -> {
            System.out.println(oldVal + " -> " + newVal); // <-- listening on value changes
        });

        System.out.println(grade.getValue()); // <-- getting the value

        return gp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: Spinner");
        stage.show();
    }
}
