package com.cmi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        GridPane gp = new GridPane();
        HBox hb = new HBox(gp);

        hb.setAlignment(Pos.CENTER);

        gp.add(new Label("Username"), 0, 0);
        gp.add(new TextField(), 1, 0);
        gp.add(new Label("Password"), 0, 1);
        gp.add(new PasswordField(), 1, 1);
        gp.add(new Button("Login"), 1, 2);

        return hb;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 500, 500);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: GridPane Layout");
        stage.show();
    }
}
