package com.cmi;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    ObservableList<String> todoItems = FXCollections.observableArrayList();

    private Parent center(Node n) {
        HBox hbox = new HBox(n);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(hbox);
        vbox.setAlignment(Pos.CENTER);

        return vbox;
    }

    private void addTodoItem(TextField textField) {
        String item = textField.getText();

        if (item.length() > 0) {
            todoItems.add(item);
        }

        textField.clear();
    }

    private void removeTodoItem(ListView listView) {
        int selected = listView.getSelectionModel().getSelectedIndex();

        if (selected > -1) {
            todoItems.remove(selected);
        }
    }

    private Parent createForm() {
        VBox vbox = new VBox();

        TextField newTodo = new TextField();
        Button addTodo = new Button();
        Button removeTodo = new Button();

        ListView<String> todoListView = new ListView(todoItems);

        addTodo.setText("Add");
        removeTodo.setText("Remove Selected");

        ObservableList<Node> container = vbox.getChildren();

        container.add(newTodo);
        container.add(addTodo);
        container.add(removeTodo);
        container.add(todoListView);

        addTodo.setOnAction(e -> addTodoItem(newTodo));
        removeTodo.setOnAction(e -> removeTodoItem(todoListView));

        return center(vbox);
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene todo = new Scene(createForm(), 300, 300);
        stage.setScene(todo);
        stage.setTitle("Introduction to JavaFX: ListView");
        stage.show();
    }
}
