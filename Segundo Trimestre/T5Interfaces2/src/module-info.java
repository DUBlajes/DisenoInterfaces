module T5Interfaces2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens ejercicio1Calculadora to javafx.graphics, javafx.fxml;
	opens ejercicioCalculadoraIVA to javafx.graphics, javafx.fxml;
	opens ejercicio3FormularioClientes to javafx.graphics, javafx.fxml;
	opens ejercicios4Y5 to javafx.graphics, javafx.fxml;
	opens ejercicios6Y7 to javafx.graphics, javafx.fxml;
	
}
