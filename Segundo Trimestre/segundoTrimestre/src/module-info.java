module tema5.DiseñoDeComponentes {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio2 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio3 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio4 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio6 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio7 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio9 to javafx.graphics, javafx.fxml;
	opens tema5.Ejercicio10 to javafx.graphics, javafx.fxml;
}
