package tema5.Ejercicio2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start(Stage primaryStage)throws Exception{
		FXMLLoader loader=new FXMLLoader(getClass().getResource("Toolbar.fxml"));
		Parent root=loader.load();
		primaryStage.setTitle("Mi app JavaFX");
		primaryStage.setScene(new Scene(root, 750,500));
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}

}
