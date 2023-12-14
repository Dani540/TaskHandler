package com.worker.workhandler.screen;

import javafx.stage.Stage;

public class ScreenController {
    /**
     * Esta clase es util para el manejo de escenas del programa. (Les llamo pantallas pero tecnicamente solo son escenas).
     * Funciona como una clase singleton.
     */

        private static final ScreenController screenController = new ScreenController();
        private Stage stage;

        private ScreenController() {
        }

        /**
         * Cambia la escena en la stage (ventana) actual.
         * @param screen Es la escena a la cual se desea cambiar.
         */
        public void switchScreen(ScreenEnum screen){
            stage.setScene(screen.getScreenDTO().scene());
        }

        /**
         * Cambia el stage para el cual se están manejando las escenas.
         * @param stage Stage para cambiar.
         */
        public void setStage(Stage stage) {
            this.stage = stage;
        }

        public static ScreenController getInstance() {
            return screenController;
        }



}
