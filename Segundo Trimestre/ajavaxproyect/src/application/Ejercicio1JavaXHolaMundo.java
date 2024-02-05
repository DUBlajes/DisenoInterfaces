package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejercicio1JavaXHolaMundo extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hola Mundo JavaFX");

        Label etiqueta = new Label("¡Hola Mundo!");
        StackPane root = new StackPane();
        root.getChildren().add(etiqueta);

        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
