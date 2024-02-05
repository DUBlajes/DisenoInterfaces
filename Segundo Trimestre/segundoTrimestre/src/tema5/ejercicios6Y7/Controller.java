package tema5.ejercicios6Y7;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	@FXML
	private void handleMenuAction(ActionEvent event) {
        // Este método se llamará cuando se seleccione una opción del menú
        MenuItem sourceMenuItem = (MenuItem) event.getSource(); 
        System.out.println("Ha pulsado la opción: " + sourceMenuItem.getText());
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
