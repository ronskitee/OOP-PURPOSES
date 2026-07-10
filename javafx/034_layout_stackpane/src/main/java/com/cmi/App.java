package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        StackPane sp = new StackPane();

        Label label1 = new Label("L b l");
        Label label2 = new Label(" a e ");

        sp.getChildren().addAll(label1, label2);

        return sp;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 500, 500);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: StackPane Layout");
        stage.show();
    }
}
