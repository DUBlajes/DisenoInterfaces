package tema5.Ejercicio7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public void start(Stage primaryStage)throws Exception{
		FXMLLoader loader=new FXMLLoader(getClass().getResource("BorderPane.fxml"));
		Parent root=loader.load();
		primaryStage.setTitle("Demo de VBox");
		primaryStage.setScene(new Scene(root, 600,600));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
