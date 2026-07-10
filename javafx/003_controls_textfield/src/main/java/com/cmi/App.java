package com.cmi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private float inputWidth;
    private float inputHeight;

    private Parent center(Node n) {
        HBox hbox = new HBox(n);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(hbox);
        vbox.setAlignment(Pos.CENTER);

        return vbox;
    }

    private Parent createForm() {
        GridPane gp = new GridPane();

        Label widthLabel = new Label("Width (mm)");
        Label heightLabel = new Label("Height (mm)");

        TextField widthValue = new TextField();
        TextField heightValue = new TextField();

        gp.add(widthLabel, 0, 0);
        gp.add(widthValue, 1, 0);
        gp.add(heightLabel, 0, 1);
        gp.add(heightValue, 1, 1);

        gp.setAlignment(Pos.CENTER);

        widthValue.setOnKeyPressed(e -> {
            try {
                inputWidth = Float.parseFloat(widthValue.getText());
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Area: " + inputWidth * inputHeight);
        });

        heightValue.setOnKeyPressed(e -> {
            try {
                inputHeight = Float.parseFloat(heightValue.getText());
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Area: " + inputWidth * inputHeight);
        });

        return center(gp);
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(createForm(), 300, 300);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: TextField");
        stage.show();
    }
}
