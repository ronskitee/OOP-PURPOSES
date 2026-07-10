package com.cmi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        TilePane tp = new TilePane();
        HBox hb = new HBox(tp);

        tp.setAlignment(Pos.CENTER);
        tp.setPrefColumns(4);
        tp.setPrefTileWidth(100);
        tp.setHgap(10);
        tp.setVgap(10);

        for (int i = 0; i < 100; i++) {
            tp.getChildren().add(new Button("Item #" + i));
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
        stage.setTitle("Introduction to JavaFX: TilePane Layout");
        stage.show();
    }
}
