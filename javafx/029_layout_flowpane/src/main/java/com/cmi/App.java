package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        FlowPane fp = new FlowPane();

        for (int i = 0; i < 50; i++) {
            fp.getChildren().add(new Label("Label #" + i));
        }

        return fp;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 500, 500);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: FlowPane Layout");
        stage.show();
    }
}
