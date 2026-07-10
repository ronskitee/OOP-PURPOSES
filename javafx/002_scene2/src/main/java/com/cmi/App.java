package com.cmi;

/*
 * Layout in JavaFX begins with selecting the right container controls.
 * 
 * For this example, we'll be using FlowPane. Later we'll learn more about layouts.
 * 
 *    > FlowPane lays out its children in a flow that wraps at the flowpane's boundary.
 *    > A horizontal flowpane (the default) will layout nodes in rows, wrapping at the flowpane's width. 
 *    > A vertical flowpane lays out nodes in columns, wrapping at the flowpane's height. If the 
 *    > flowpane has a border and/or padding set, the content will be flowed within those insets.
 * 
 * https://fxdocs.github.io/docs/html5/#_overview
 */

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Parent createContent() {
        return new FlowPane(
                new Text("Hello"),
                new Text("World!"));
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(createContent(), 300, 300);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: Scene");
        stage.show();
    }
}
