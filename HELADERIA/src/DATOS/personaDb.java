package DATOS;

import java.sql.*;

import LOGICA.Persona;

public class personaDb {
	//Obtiene una lista de las personas de la base de datos
    public static String obtenerPersonas() {
        String consulta = "SELECT * from persona";
        String persona="";
        String salida="";
        try (Connection conn = conexion.conectar();
             Statement stmt = conn.createStatement();
             ResultSet resultado = stmt.executeQuery(consulta)) {

            while (resultado.next()) {                
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellidos");
                String ci = resultado.getString("ci");
                int edad=resultado.getInt("edad");

                persona="---***---\nNombre: "+nombre+" "+apellido+"\nCI: "+ci+"\nEdad: "+edad;
                salida=salida+persona+"\n";
            }
            conexion.desconectar(conn);

        } catch (SQLException e) {
            System.err.println("Error al obtener productos: " + e.getMessage());
        }

        return salida;
    } 
    
    //Insertar una ueva persona
    public static boolean insertarPersona(Persona pers) {
        String sql = "INSERT INTO persona (nombre, apellidos,ci,edad) VALUES (?,?,?,?)";

        try (Connection conn = conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, pers.getNombre());
            pstmt.setString(2, pers.getApellidos());
            pstmt.setString(3, pers.getCi());
            pstmt.setInt(4, pers.getEdad());

            int filasAfectadas = pstmt.executeUpdate();

            if(filasAfectadas>0) {
            	return true;
            }
            conexion.desconectar(conn);

        } catch (SQLException e) {
            System.err.println("Error al crear la persona: " + e.getMessage());
        }

        return false;
    }
    
    public static boolean editarPersona(Persona pers) {
        String sql = "UPDATE persona SET nombre = ?, apellidos = ?, ci=?, edad=? WHERE idpersona = ?";

        try (Connection conn = conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

        	pstmt.setString(1, pers.getNombre());
            pstmt.setString(2, pers.getApellidos());
            pstmt.setString(3, pers.getCi());
            pstmt.setInt(4, pers.getEdad());
            pstmt.setInt(5, pers.getId());

            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar persona: " + e.getMessage());
            return false;
        }
    }
    
}