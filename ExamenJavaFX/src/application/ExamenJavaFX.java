package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExamenJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Formulario.fxml"));
		Parent root = loader.load();

		primaryStage.setTitle("Formulario Examen con JavaFX");
		primaryStage.setScene(new Scene(root, 640, 400));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
