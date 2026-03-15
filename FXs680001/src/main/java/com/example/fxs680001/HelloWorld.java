package com.example.fxs680001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class HelloWorld extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Hello, World.");
        label.setFont(new Font(40));

        StackPane root = new StackPane(label);

        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}