package com.cmi;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeMenu() {
        MenuBar menubar = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem fileNew = new MenuItem("New");
        MenuItem fileOpen = new MenuItem("Open");
        MenuItem fileSave = new MenuItem("Save");
        MenuItem fileExit = new MenuItem("Exit");

        Menu aboutMenu = new Menu("About");

        fileExit.setOnAction(eh -> {
            Stage stage = (Stage) menubar.getScene().getWindow(); // <-- closing a window
            stage.close();
        });

        fileMenu.getItems().addAll(fileNew, fileOpen, fileSave, fileExit);

        menubar.getMenus().addAll(fileMenu, aboutMenu);

        VBox vb = new VBox(menubar);

        return vb;
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

        bp.setTop(initializeMenu());
        bp.setCenter(initializeContent());

        return bp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: MenuBar");
        stage.show();
    }
}
