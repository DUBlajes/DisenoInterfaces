package Tema6Ejercicio17menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class SimpleController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Inicialización, si es necesaria
    }

    @FXML
    private void handleMenuAction(ActionEvent event) {
        // Este método se llamará cuando se seleccione una opción del menú
        MenuItem sourceMenuItem = (MenuItem) event.getSource();
        //al definir cada item usando MenuItem sourceMenuitem, getText
        //muestra el texto asignado a cada botón
        System.out.println("Ha pulsado la opción: " + sourceMenuItem.getText());
    }
}

