package org.example.sistemadeventas;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.sistemadeventas.models.RealState;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private static RealState hotel = new RealState();

    public static RealState getHotel() {
        return hotel;
    }

    private static Stage stageRoot;
    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("MenuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static void newStage(String fxml, String tittle){
        Stage stageView = new Stage();
        Scene scene;
        try {
            scene = new Scene(loadFXML(fxml));
            stageView.setTitle(tittle);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader loader = new FXMLLoader(Application.class.getResource(fxml + ".fxml"));
        return loader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}