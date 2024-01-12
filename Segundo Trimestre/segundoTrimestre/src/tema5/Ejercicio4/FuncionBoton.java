package tema5.Ejercicio4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FuncionBoton {
	
	@FXML
	private Button Button1, Button2, Button3, Button4;
	@FXML
	private void pulsarBoton(ActionEvent event) {
		String idBoton=(((Button) event.getSource()).getId());
		System.out.println("You've pressed the "+idBoton);
	}
	
}
