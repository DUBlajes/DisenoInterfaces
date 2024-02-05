package Tema6Ejercicio12;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleController {

    @FXML
    private TextField operador1TextField;
 
    @FXML
    private Label resultadoLabel;

    @FXML
    private void iva4() {
        // Lógica para sumar los operandos
        double operando1 = Double.parseDouble(operador1TextField.getText());
      
        double resultado = operando1 *0.04;
        resultadoLabel.setText("Resultado: " + resultado);
    }

    @FXML
    private void iva10() {
        // Lógica para restar los operandos
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double resultado = operando1 *0.10;
        resultadoLabel.setText("Resultado: " + resultado);
    }

    @FXML
    private void iva21() {
        // Lógica para multiplicar los operandos
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double resultado = operando1 * 0.21;
        resultadoLabel.setText("Resultado: " + resultado);
    }

    @FXML
    private void limpiar() {
        // Lógica para limpiar los campos
        operador1TextField.clear();
        resultadoLabel.setText("Resultado: ");
    }

    @FXML
    private void salir() {
        // Lógica para cerrar la aplicación
        System.exit(0);
    }
}
