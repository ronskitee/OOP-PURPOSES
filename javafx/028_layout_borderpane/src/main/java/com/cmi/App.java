package com.cmi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        BorderPane bp = new BorderPane();

        bp.setTop(new Label("Top"));
        bp.setLeft(new Label("Left"));
        bp.setRight(new Label("Right"));

        Label centerLabel = new Label("Center");
        BorderPane.setAlignment(centerLabel, Pos.CENTER);

        bp.setCenter(centerLabel);
        bp.setBottom(new Label("Bottom"));

        return bp;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 500, 500);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: BorderPane Layout");
        stage.show();
    }
}
