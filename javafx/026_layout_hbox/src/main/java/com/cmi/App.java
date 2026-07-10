package com.cmi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);

        for (int i = 0; i < 10; i++) {
            hb.getChildren().add(new Label("Label #" + i));
        }

        return hb;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 500, 500);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: HBox Layout");
        stage.show();
    }
}
