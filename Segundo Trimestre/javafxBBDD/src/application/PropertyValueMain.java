package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PropertyValueMain {

	public static void main(String[] args) {
		StringProperty propiedadTexto = new SimpleStringProperty("Hola");
		System.out.println("valor inicial: " + propiedadTexto);
		propiedadTexto.addListener((observable, oldValue, newValue) -> System.out.println("Nuevo valor: " + newValue));

// Cambiar el valor de la propiedad
		propiedadTexto.set("Hola, Mundo!");
		propiedadTexto.set("OTro valor distinto");
		propiedadTexto.set("alegria de nuevos valores");
	}
}