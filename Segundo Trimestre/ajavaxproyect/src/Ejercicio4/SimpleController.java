package Ejercicio4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SimpleController {

    @FXML
    private void handleButtonClick(ActionEvent event) {
        System.out.println("¡Ha pulsado el botón!");
    }
    
    @FXML
    private void pulsame(ActionEvent event) {
        System.out.println("¡Ha pulsado el botón!");
    }
    
}
