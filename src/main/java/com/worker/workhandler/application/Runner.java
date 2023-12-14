package com.worker.workhandler.application;

import com.worker.workhandler.Main;
import com.worker.workhandler.screen.ScreenController;
import com.worker.workhandler.screen.ScreenDTO;
import com.worker.workhandler.screen.ScreenEnum;
import com.worker.workhandler.utils.Routes;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Objects;

public class Runner {
    public void run(Application application){
        ScreenEnum.MAIN.setScreenDTO( new ScreenDTO(loadSceneFromMain(Routes.MAIN_FXML)) );
        ScreenEnum.MAIN.getScreenDTO().scene().getStylesheets().add(String.valueOf(Objects.requireNonNull(Main.class.getResource("style.css"))));

        application.start();
    }

    /**
     * Este metodo sirve para cargar escenas desde archivos fxml, para simplificar y generalizar codigo.
     * @param path Es la ruta donde se aloja el archivo fxml, es una constante del enumerador de rutas.
     * @return Devuelve la instancia de la escena cargada.
     */
    private Scene loadScene(Routes path){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path.getPath()));
        Scene scene = null;
        try {
            scene = new Scene(loader.load(), 720, 480);
        } catch (IOException e) {
            System.out.println("No se pudo cargar la Scene desde: " + getClass().getSimpleName());
            throw new RuntimeException(e);
        }
        return scene;
    }

    private Scene loadSceneFromMain(Routes path){
        FXMLLoader loader = new FXMLLoader(Main.class.getResource(path.getPath()));
        Scene scene = null;
        try {
            scene = new Scene(loader.load(), 400, 320);
        } catch (IOException e) {
            System.out.println("No se pudo cargar la Scene desde: " + getClass().getSimpleName());
            throw new RuntimeException(e);
        }
        return scene;
    }
}
