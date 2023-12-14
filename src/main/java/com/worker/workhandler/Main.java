package com.worker.workhandler;

import com.worker.workhandler.application.Runner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        new Runner().run(new com.worker.workhandler.application.Application(stage));
    }

    public static void main(String[] args) {
        launch();
    }
}