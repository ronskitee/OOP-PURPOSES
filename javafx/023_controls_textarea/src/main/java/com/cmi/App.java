package com.cmi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);

        TextArea ta = new TextArea();
        ta.setWrapText(true);
        VBox.setVgrow(ta, Priority.ALWAYS);

        Button saveBtn = new Button("Save");

        vb.getChildren().addAll(ta, saveBtn);

        return vb;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 300, 300);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: TextArea");
        stage.show();
    }
}
