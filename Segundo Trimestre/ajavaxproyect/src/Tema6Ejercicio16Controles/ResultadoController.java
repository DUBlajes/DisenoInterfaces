package Tema6Ejercicio16Controles;

//ResultadoController.java

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultadoController {

 @FXML
 private Label labelResultado;

 public void mostrarResultado(String resultado) {
     labelResultado.setText(resultado);
 }
}
