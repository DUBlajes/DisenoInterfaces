package tema5.ejercicio1Calculadora;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("Calculadora2.fxml"));
		primaryStage.setTitle("Toma calculadora rica");
		primaryStage.setScene(new Scene(root, 300, 400));
		primaryStage.show();
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}
