package com.cmi;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class App extends Application {
    private Parent initializeContent() {
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);

        TextArea ta = new TextArea();
        ta.setWrapText(true);
        VBox.setVgrow(ta, Priority.ALWAYS);

        // Save Dialog
        FileChooser fileChooserSave = new FileChooser();
        fileChooserSave.setTitle("Save File");
        fileChooserSave.getExtensionFilters().add(new ExtensionFilter("Plain text", "*.txt"));

        // Save Button
        Button saveBtn = new Button("Save");

        saveBtn.setOnAction(e -> {
            File path = fileChooserSave.showSaveDialog(ta.getScene().getWindow());

            System.out.println("Saving to " + path);
        });

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
        stage.setTitle("Introduction to JavaFX: FileChooser");
        stage.show();
    }
}
