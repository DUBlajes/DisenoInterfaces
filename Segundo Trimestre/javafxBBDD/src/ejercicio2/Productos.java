package ejercicio2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Productos {
	private IntegerProperty id = new SimpleIntegerProperty();
	private StringProperty nombre = new SimpleStringProperty();
	private DoubleProperty precio = new SimpleDoubleProperty();
	private IntegerProperty id_fabricante = new SimpleIntegerProperty();

	public Productos(int id, String nombre, Double precio, int id_fabricante) {
		this.id.set(id);
		this.nombre.set(nombre);
		this.precio.set(precio);
		this.id_fabricante.set(id_fabricante);
	}

	public int getId() {
		return id.get();
	}

	public IntegerProperty idProperty() {
		return id;
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public String getNombre() {
		return nombre.get();
	}

	public StringProperty nombreProperty() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}

	public Double getPrecio() {
		return precio.get();
	}

	public DoubleProperty precioProperty() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio.set(precio);
	}

	public int getId_fabricante() {
		return id_fabricante.get();
	}

	public IntegerProperty id_fabricanteProperty() {
		return id_fabricante;
	}

	public void setId_fabricante(int id_fabricante) {
		this.id_fabricante.set(id_fabricante);
	}

	// Métodos getter para propiedades observables

}
