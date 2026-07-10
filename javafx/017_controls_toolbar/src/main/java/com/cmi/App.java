package com.cmi;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeToolbar() {
        ToolBar tb = new ToolBar();

        TextField searchQuery = new TextField();
        Button searchBtn = new Button("Search");
        Button exportBtn = new Button("Export");

        tb.getItems().addAll(searchQuery, searchBtn, new Separator(), exportBtn);

        return tb;
    }

    private Parent initializeContent() {
        VBox vb = new VBox();

        ObservableList<String> listItems = FXCollections.observableArrayList(
                "Item 1",
                "Item 2",
                "Item 3");
        ListView<String> exampleListView = new ListView<>();
        exampleListView.setItems(listItems);

        VBox.setVgrow(exampleListView, Priority.ALWAYS);

        vb.getChildren().add(exampleListView);

        return vb;
    }

    private Parent initializeComponents() {
        BorderPane bp = new BorderPane();

        bp.setTop(initializeToolbar());
        bp.setCenter(initializeContent());

        return bp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: ToolBar");
        stage.show();
    }
}
