package com.cmi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private Parent initializeContent() {
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);

        TitledPane faq = new TitledPane();
        faq.setText("Frequently Ask Questions");
        faq.setContent(new Label(
                "What is JavaFX?\nAn open-source platform containing graphics and media tools for developing and deploying rich client application."));

        TitledPane about = new TitledPane();
        about.setText("About");
        about.setContent(new Label("This is an example for JavaFX Accordion"));

        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(faq, about);

        vb.getChildren().add(accordion);

        return vb;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 300, 300);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: Accordion");
        stage.show();
    }
}
