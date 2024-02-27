package ejercicio2;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.SQLException;
import java.util.List;

public class Controller {

	@FXML
	private TableView<Productos> tableViewProductos;

	@FXML
	private TableColumn<Productos, Integer> idColumn;

	@FXML
	private TableColumn<Productos, String> nombreColumn;

	@FXML
	private TableColumn<Productos, Double> precioColumn;

	@FXML
	private TableColumn<Productos, Integer> id_fabricanteColumn;

	private ProductosModel model;

	public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
		// Inicializa el modelo de la base de datos
		model = new ProductosModel(dbURL, dbUser, dbPassword);

		// Configura las columnas de la TableView utiliza instrucciones tipo lambda,
		// cada columna de la tabla le //corresponde un campo de la base de datos
		idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
		nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
		precioColumn.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
		id_fabricanteColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());

		// Al inicializar el controlador, carga los juegos desde la base de datos
		try {
			cargarJuegos();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void cargarJuegos() throws SQLException {
		// Limpiar la TableView antes de cargar nuevos datos
		tableViewProductos.getItems().clear();

		List<Productos> productos = model.getAllProductos();

		// Agrega los datos a la TableView
		tableViewProductos.getItems().addAll(productos);
	}

	@FXML
	private void cerrarConexion() {
		// Cierra la conexión a la base de datos
		try {
			model.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
