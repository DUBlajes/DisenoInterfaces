package tema5.Ejercicio3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public void start(Stage primaryStage)throws Exception{
		FXMLLoader loader=new FXMLLoader(getClass().getResource("Boton.fxml"));
		Parent root=loader.load();
		primaryStage.setTitle("Pulsa el botón");
		primaryStage.setScene(new Scene(root, 400,400));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
