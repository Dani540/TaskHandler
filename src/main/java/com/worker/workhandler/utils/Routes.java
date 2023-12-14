package com.worker.workhandler.utils;

public enum Routes {
    MAIN_FXML("main.fxml");

    private final String path;

    Routes(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
