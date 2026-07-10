package com.cmi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class App extends Application {
    private Parent createPage(Integer index) {
        VBox page = new VBox();
        page.setAlignment(Pos.CENTER);

        Label content = new Label("Page #: " + index.toString());
        page.getChildren().add(content);

        return page;
    }

    private Parent initializeContent() {
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);

        Pagination pagination = new Pagination(10);

        pagination.setPageFactory(new Callback<Integer, Node>() {
            @Override
            public Node call(Integer index) {
                return createPage(index);
            }
        });

        vb.getChildren().add(pagination);

        return vb;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(initializeContent(), 300, 300);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: Pagination");
        stage.show();
    }
}
