package com.worker.workhandler.application;

import com.worker.workhandler.screen.ScreenController;
import com.worker.workhandler.screen.ScreenEnum;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Application {
    private final Stage stage;
    private Scene scene;
    private Pane pane;


    public Application(Stage stage) {
        this.stage = stage;
        ScreenController.getInstance().setStage(stage);
    }

    public void start() {
        stage.setScene(scene);
        stage.setMinWidth(720);
        stage.setMinHeight(480);
        stage.show();
        ScreenController.getInstance().switchScreen(ScreenEnum.MAIN);
    }
}
