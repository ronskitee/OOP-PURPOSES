package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Tab createTab(String tabName, int start, int end) {
        Tab tab1 = new Tab(tabName);
        HBox container = new HBox();

        for (int i = start; i < end; i++) {
            Label num = new Label(String.valueOf(i));
            container.getChildren().add(num);
        }

        tab1.setContent(container);

        return tab1;
    }

    private Parent initializeComponents() {
        VBox vb = new VBox();

        TabPane tp = new TabPane();

        tp.getTabs().add(createTab("Tab 1", 0, 11));
        tp.getTabs().add(createTab("Tab 2", 11, 21));

        // disable closing of tabs
        tp.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        vb.getChildren().add(tp);

        return vb;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: TabPane");
        stage.show();
    }
}
