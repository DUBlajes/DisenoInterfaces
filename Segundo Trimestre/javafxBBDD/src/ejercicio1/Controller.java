package ejercicio1;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.SQLException;
import java.util.List;

public class Controller {

	@FXML
	private TableView<TVideoJuego> tableViewVideojuegos;

	@FXML
	private TableColumn<TVideoJuego, String> nombreColumn;

	@FXML
	private TableColumn<TVideoJuego, Integer> anioColumn;

	@FXML
	private TableColumn<TVideoJuego, String> companiaColumn;

	@FXML
	private TableColumn<TVideoJuego, Double> precioColumn;

	@FXML
	private TableColumn<TVideoJuego, String> sinopsisColumn;

	@FXML
	private TableColumn<TVideoJuego, String> plataformaColumn;

	private TVideoJuegoModel model;

	public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
		// Inicializa el modelo de la base de datos
		model = new TVideoJuegoModel(dbURL, dbUser, dbPassword);

		// Configura las columnas de la TableView utiliza instrucciones tipo lambda,
		// cada columna de la tabla le //corresponde un campo de la base de datos
		nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
		anioColumn.setCellValueFactory(cellData -> cellData.getValue().anioProperty().asObject());
		companiaColumn.setCellValueFactory(cellData -> cellData.getValue().companiaProperty());
		precioColumn.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
		sinopsisColumn.setCellValueFactory(cellData -> cellData.getValue().sinopsisProperty());
		plataformaColumn.setCellValueFactory(cellData -> cellData.getValue().plataformaProperty());

		// Al inicializar el controlador, carga los juegos desde la base de datos
		try {
			cargarJuegos();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void cargarJuegos() throws SQLException {
		// Limpiar la TableView antes de cargar nuevos datos
		tableViewVideojuegos.getItems().clear();

		List<TVideoJuego> videojuegos = model.getAllVideoJuegos();

		// Agrega los datos a la TableView
		tableViewVideojuegos.getItems().addAll(videojuegos);
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
