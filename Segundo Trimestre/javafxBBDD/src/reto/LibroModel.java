package reto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroModel {
	private Connection conn;

	public LibroModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Libro> getAllLibros() throws SQLException {
		List<Libro> libros = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM libro");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String titulo = rs.getString("titulo");
			String editorial = rs.getString("editorial");
			String autor = rs.getString("autor");
			int paginas = rs.getInt("paginas");
			libros.add(new Libro(id, titulo, editorial, autor, paginas));
		}
		stmt.close();
		rs.close();
		return libros;
	}

	public void borrarRegistro(String nombreLibro) throws SQLException {
		String sql = "DELETE FROM libro WHERE titulo=?";
		try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
			preparedStatement.setString(1, nombreLibro);

			int filasAfectadas = preparedStatement.executeUpdate();
			if (filasAfectadas > 0) {
				System.out.println("Registro eliminado correctamente");
			} else {
				System.out.println("No se encontró el registro con el título especificado");
			}
		}
	}

	public void agregarLibro(Libro nuevoLibro) throws SQLException {
		String query = "INSERT INTO libro (titulo, editorial, autor, paginas) VALUES (?,?,?,?)";

		try (PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, nuevoLibro.getTitulo());
			stmt.setString(2, nuevoLibro.getEditorial());
			stmt.setString(3, nuevoLibro.getAutor());
			stmt.setInt(4, nuevoLibro.getPaginas());

			stmt.executeUpdate();
		}
	}

	public void close() throws SQLException {
		conn.close();
	}

}
