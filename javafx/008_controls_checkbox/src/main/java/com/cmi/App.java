package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        GridPane gp = new GridPane();

        CheckBox cb = new CheckBox("I agree");
        Button submit = new Button("Submit");
        submit.setDisable(true);

        gp.add(cb, 0, 0);
        gp.add(submit, 0, 1);

        cb.setOnAction(e -> submit.setDisable(!cb.isSelected()));

        return gp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: CheckBox");
        stage.show();
    }
}
