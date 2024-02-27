package ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TVideoJuegoModel {
	private Connection conn;

	public TVideoJuegoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public void addVideoJuego(TVideoJuego nuevoJuego) throws SQLException {
		String query = "INSERT INTO tvideojuegos (nombre, anio, compania, precio, sinopsis, plataforma) VALUES (?, ?, ?, ?, ?, ?)";

		try (PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, nuevoJuego.getNombre());
			stmt.setInt(2, nuevoJuego.getAnio());
			stmt.setString(3, nuevoJuego.getCompania());
			stmt.setDouble(4, nuevoJuego.getPrecio());
			stmt.setString(5, nuevoJuego.getSinopsis());
			stmt.setString(6, nuevoJuego.getPlataforma());

			stmt.executeUpdate();
		}
	}

	public void close() throws SQLException {
		conn.close();
	}
}
