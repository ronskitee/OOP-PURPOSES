package com.cmi;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private Parent center(Node n) {
        HBox hbox = new HBox(n);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(hbox);
        vbox.setAlignment(Pos.CENTER);

        return vbox;
    }

    private Parent createForm() {
        GridPane gp = new GridPane();

        Label usernameLbl = new Label("Username");
        Label passwordLbl = new Label("Password");

        TextField usernameInput = new TextField();
        PasswordField passwordInput = new PasswordField();

        Hyperlink forgotLink = new Hyperlink("Forgot Password?");
        Button login = new Button("Login");

        forgotLink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getHostServices().showDocument("https://www.google.com/?q=reset%20password");
            }
        });

        gp.add(usernameLbl, 0, 0);
        gp.add(usernameInput, 1, 0);
        gp.add(passwordLbl, 0, 1);
        gp.add(passwordInput, 1, 1);
        gp.add(forgotLink, 0, 2);
        gp.add(login, 1, 2);

        gp.setAlignment(Pos.CENTER);

        return center(gp);
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Scene helloWorld = new Scene(createForm(), 300, 300);
        stage.setScene(helloWorld);
        stage.setTitle("Introduction to JavaFX: Hyperlink");
        stage.show();
    }
}
