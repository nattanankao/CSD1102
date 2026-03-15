package com.example.fxs680001;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Gui3Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Gui3Application.class.getResource("Gui3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 744, 205);
        stage.setTitle("User Data Form");
        stage.setScene(scene);
        stage.show();
    }
}