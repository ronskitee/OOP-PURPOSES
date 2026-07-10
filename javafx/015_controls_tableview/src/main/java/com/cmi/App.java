package com.cmi;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        VBox vb = new VBox();

        TableView tv = new TableView();

        // columns
        TableColumn<Student, String> colId = new TableColumn<>("ID");
        colId.setCellValueFactory(cell -> cell.getValue().getId());

        TableColumn<Student, String> nameId = new TableColumn<>("NAME");
        nameId.setCellValueFactory(cell -> cell.getValue().getName());

        // example data
        ObservableList<Student> students = FXCollections.observableArrayList(
                new Student("25-0001", "Juan Tamad"),
                new Student("25-0002", "Pedro Penduko"));

        // add our columns
        tv.getColumns().addAll(colId, nameId);
        // show data to table
        tv.setItems(students);

        vb.getChildren().add(tv);

        return vb;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: TableView");
        stage.show();
    }
}

class Student {
    private final StringProperty id;
    private final StringProperty name;

    public Student(String id, String name) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
    }

    public StringProperty getId() {
        return id;
    }

    public StringProperty getName() {
        return name;
    }
}
