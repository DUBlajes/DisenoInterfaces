package ejercicio1avanzado;

import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneBuilder1Avanzado.fxml"));
		Parent root = loader.load();

		primaryStage.setTitle("Mi Aplicación JavaFX");
		primaryStage.setScene(new Scene(root, 900, 300));
		primaryStage.show();

		// Mueve la lógica de la base de datos al controlador
		String dbURL = "jdbc:mysql://localhost/instituto";
		String dbUser = "root";
		String dbPassword = "";

		try {
			Controller controller = loader.getController();
			controller.inicializar(dbURL, dbUser, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
