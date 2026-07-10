package com.cmi;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        GridPane gp = new GridPane();

        ToggleGroup tg = new ToggleGroup();
        RadioButton opt1 = new RadioButton("ACT");
        RadioButton opt2 = new RadioButton("BSCS");
        opt1.setToggleGroup(tg);
        opt2.setToggleGroup(tg);

        HBox programs = new HBox();
        programs.getChildren().addAll(opt1, opt2);

        gp.add(programs, 0, 0);

        tg.selectToggle(opt2);
        System.out.println(
                ((RadioButton) tg.getSelectedToggle()).getText() // get value of selected radio
        );
        return gp;

    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: RadioButton");
        stage.show();
    }
}
