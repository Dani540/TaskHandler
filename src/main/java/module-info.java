module com.worker.workhandler {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.worker.workhandler to javafx.fxml;
    exports com.worker.workhandler;
    exports com.worker.workhandler.controller;
    opens com.worker.workhandler.controller to javafx.fxml;
}