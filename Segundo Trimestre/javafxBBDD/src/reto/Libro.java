package reto;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Libro {
	private IntegerProperty id = new SimpleIntegerProperty();
	private StringProperty titulo = new SimpleStringProperty();
	private StringProperty editorial = new SimpleStringProperty();
	private StringProperty autor = new SimpleStringProperty();
	private IntegerProperty paginas = new SimpleIntegerProperty();

	public Libro(int id, String titulo, String editorial, String autor, int paginas) {
		this.id.set(id);
		this.titulo.set(titulo);
		this.editorial.set(editorial);
		this.autor.set(autor);
		this.paginas.set(paginas);
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

	public String getTitulo() {
		return titulo.get();
	}

	public StringProperty tituloProperty() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo.set(titulo);
	}

	public String getEditorial() {
		return editorial.get();
	}

	public StringProperty editorialProperty() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial.set(editorial);
	}

	public String getAutor() {
		return autor.get();
	}

	public StringProperty autorProperty() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor.set(autor);
	}

	public int getPaginas() {
		return paginas.get();
	}

	public IntegerProperty paginasProperty() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas.set(paginas);
	}

}
