package DATOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	 // Parámetros de conexión
	 private static final String URL = "jdbc:mysql://localhost:3307/dbHeladeria";
	 private static final String USER = "root";
	 private static final String PASSWORD = "112358";

	 public static Connection conectar() throws SQLException {
	     try {
	         Class.forName("com.mysql.cj.jdbc.Driver");
	     } catch (ClassNotFoundException e) {
	         throw new SQLException("Driver MySQL no encontrado", e);
	     }

	     return DriverManager.getConnection(URL, USER, PASSWORD);
	 }

	 //Cierra la conexión
	 public static void desconectar(Connection connection) {
	     if (connection != null) {
	         try {
	             connection.close();
	         } catch (SQLException e) {
	             System.err.println("Error al cerrar conexión: " + e.getMessage());
	         }
	     }
	 }
	 
}
