package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        VBox vb = new VBox();

        HBox normalBox = new HBox();

        for (int i = 0; i < 50; i++) {
            normalBox.getChildren().add(new Label("Label on HBox #" + i));
        }

        TextFlow textFlow = new TextFlow();

        for (int i = 0; i < 50; i++) {
            textFlow.getChildren().add(new Label("Label on TextFlow #" + i));
        }

        vb.getChildren().add(normalBox);
        vb.getChildren().add(textFlow);

        return vb;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 500, 500);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: TextFlow Layout");
        stage.show();
    }
}
