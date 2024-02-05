module tema5.DiseñoDeComponentes {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ejercicio2 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio2 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio3 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio4 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio6 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio7 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio9 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio10 to javafx.graphics, javafx.fxml;
	opens tema5.ejercicio1Calculadora to javafx.graphics, javafx.fxml;
	opens tema5.ejercicioCalculadoraIVA to javafx.graphics, javafx.fxml;
	opens tema5.ejercicio3FormularioClientes to javafx.graphics, javafx.fxml;
	opens tema5.ejercicios4Y5 to javafx.graphics, javafx.fxml;
	opens tema5.ejercicios6Y7 to javafx.graphics, javafx.fxml;
	opens tema5.ejercicioVideojuegosBaseDatos to javafx.graphics, javafx.fxml;
}
