package com.cmi;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        GridPane gp = new GridPane();

        Label programLabel = new Label("Program");
        ChoiceBox<String> cb = new ChoiceBox<>();
        ObservableList<String> opts = cb.getItems();

        opts.addAll("ACT", "BSCS");

        gp.add(programLabel, 0, 0);
        gp.add(cb, 1, 0);
        cb.setValue("BSCS"); // pre-select

        cb.setOnAction(eh -> {
            System.out.println(cb.getValue());
        });

        return gp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: ChoiceBox");
        stage.show();
    }
}
