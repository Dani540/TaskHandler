package com.worker.workhandler.controller;

import com.worker.workhandler.service.LabelService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.stream.Stream;

public class MainController {
    @FXML
    private VBox centerVBox;
    @FXML
    private VBox rightVBox;
    @FXML
    private VBox leftVBox;
    private Label leftLabel;
    private List<Label> centerLabels;
    private List<Label> rightLabels;
    private LabelService labelService;

    public void initialize(){
        leftLabel = new Label("Gain IDEA from json model serilized with python"); // <-- aqui necesito insertar los datos del script desde un modelo de tarea
        centerLabels = List.of(
                new Label("Gain PLANTEAMIENTO desde el modelo tambien"),
                new Label("Gain ANALISIS desde el modelo"),
                new Label("Gain DESARROLLO desde el modelo")
        );
        rightLabels = List.of(
                new Label("Gain SOLUCION desde el modelo"),
                new Label("Gain REQUERIMIENTOS desde el modelo"),
                new Label("Gain COMENTARIOS desde el modelo")
        );

        labelService = new LabelService();

        labelService.setOnLabelActions(Stream.concat(centerLabels.stream(), rightLabels.stream()).toList());
        labelService.formatStringForWidthOfLabels(Stream.concat(centerLabels.stream(), rightLabels.stream()).toList());
        labelService.formatStringForWidthOfLabels(leftLabel);

        leftVBox.getChildren().add(leftLabel);
        centerVBox.getChildren().addAll(centerLabels);
        rightVBox.getChildren().addAll(rightLabels);
    }

}
