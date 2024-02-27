package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TVideoJuegoModel {
	private Connection conn;

	public TVideoJuegoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<TVideoJuego> getAllVideoJuegos() throws SQLException {
		List<TVideoJuego> videojuegos = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tvideojuegos");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int idjuego = rs.getInt("idjuego");
			String nombre = rs.getString("nombre");
			int anio = rs.getInt("anio");
			String compania = rs.getString("compania");
			double precio = rs.getDouble("precio");
			String sinopsis = rs.getString("sinopsis");
			String plataforma = rs.getString("plataforma");
			videojuegos.add(new TVideoJuego(idjuego, nombre, anio, compania, precio, sinopsis, plataforma));
		}
		stmt.close();
		rs.close();
		return videojuegos;
	}

	public void close() throws SQLException {
		conn.close();
	}

}
