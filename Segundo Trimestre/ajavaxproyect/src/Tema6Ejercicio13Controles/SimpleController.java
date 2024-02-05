package Tema6Ejercicio13Controles;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SimpleController implements Initializable {

	@FXML
	private ComboBox<String> comboBox1;

    @FXML
    private RadioButton radioButtonParticular;

    @FXML
    private RadioButton radioButtonEmpresa;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (comboBox1 == null) {
            System.out.println("El ComboBox es nulo y vamos a inicializarlo.");
            comboBox1 = new ComboBox<>(); // Inicializar el ComboBox
        }

        // Configurar elementos del ComboBox
        ObservableList<String> items = FXCollections.observableArrayList("Opción 1", "Opción 2", "Opción 3");
        comboBox1.setItems(items);

        // Establecer el valor predeterminado (puedes cambiar "Opción 1" a la opción que desees)
        if (comboBox1.getValue() == null) {
            System.out.println("Estableciendo el valor predeterminado.");
            comboBox1.setValue("Opción 1");
        }

        System.out.println("El ComboBox se ha iniciado bien.");
        
        // Resto del código...
    }

    }

