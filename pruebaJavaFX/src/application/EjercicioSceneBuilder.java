package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EjercicioSceneBuilder extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("EresTonto.fxml"));
		Parent root = loader.load();

		primaryStage.setTitle("¿Eres tonto?");
		primaryStage.setScene(new Scene(root, 640, 400));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
