package com.worker.workhandler.service;

import javafx.scene.control.Label;

import java.util.List;

public class LabelService {

    public void setOnLabelActions(List<Label> labels) {
        labels.forEach(label -> {
            label.setOnMouseClicked(mouseEvent -> {
                // Aqui necesito acceder a la info interna de los elementos (las tareas)
                // para modificarlas usando otros script de python. (supongo que le mando el mismo json que recibí
                // y me lo devuelve con los cambios hexos) SEX
                System.out.println("pixulita");
            });
        });
    }

    public void formatStringForWidthOfLabels(List<Label> labels) {
        labels.forEach(this::formatStringForWidthOfLabels);
    }

    public void formatStringForWidthOfLabels(Label label) {
        String text = label.getText();
        if (text.length() > 28)
            label.setText(text.substring(0,text.lastIndexOf(" ")) + "\n" + (text.substring(text.lastIndexOf(" ") , text.length() )));
    }
}
