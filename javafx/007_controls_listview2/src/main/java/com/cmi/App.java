package com.cmi;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    ObservableList<String> todoItems = FXCollections.observableArrayList();
    ArrayList<String> completedItems = new ArrayList<>();

    private Parent center(Node n) {
        HBox hbox = new HBox(n);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(hbox);
        vbox.setAlignment(Pos.CENTER);

        return vbox;
    }

    private void addTodoItem(TextField textField) {
        String item = textField.getText();

        if (item.length() > 0 && !todoItems.contains(item)) {
            todoItems.add(item);
        }

        textField.clear();
    }

    private Parent createForm() {
        VBox vbox = new VBox();

        TextField newTodo = new TextField();
        Button addTodo = new Button();
        addTodo.setText("Add");

        ListView<String> todoListView = new ListView(todoItems);

        todoListView.setCellFactory(lv -> new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    Text itemText = new Text(item);

                    if (completedItems.contains(item)) {
                        itemText.setStrikethrough(true);
                    }

                    HBox itemContainer = new HBox(itemText);
                    itemContainer.setMinWidth(150);
                    itemContainer.setMaxWidth(150);

                    Button removeTodo = new Button("Remove");
                    removeTodo.setOnAction(e -> todoItems.remove(item));

                    Button doneTodo = new Button("Done");
                    doneTodo.setOnAction(e -> {
                        completedItems.add(item);
                        itemText.setStrikethrough(true);
                    });

                    HBox container = new HBox();
                    container.getChildren().addAll(itemContainer, doneTodo, removeTodo);
                    container.setMaxHeight(Double.MAX_VALUE);

                    setGraphic(container);
                }
            }
        });

        ObservableList<Node> container = vbox.getChildren();

        container.add(newTodo);
        container.add(addTodo);
        container.add(todoListView);

        addTodo.setOnAction(e -> addTodoItem(newTodo));

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
