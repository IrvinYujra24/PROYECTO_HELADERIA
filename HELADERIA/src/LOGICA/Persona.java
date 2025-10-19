package LOGICA;

import DATOS.personaDb;

public class Persona {
	private String nombre;
	private String apellidos;
	private String ci;
	private int edad;
	private int id;
	
	public Persona(String nombre, String apellidos, String ci, int edad) {
	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ci = ci;
		this.edad = edad;
	}
	public Persona() {		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void registrar_persona() {
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", ci=" + ci + ", edad=" + edad + "]";
	}
	
	public String listar_personas() {
		String salida="";
		salida=personaDb.obtenerPersonas();
		return salida;
	}
	
	public String insertarPersona() {	
		if(personaDb.insertarPersona(this)) {
			return "Persona ingresada correctamente";
		}else {
			return "Error en el registro";
		}
	}
	
	
	public String editarPersona() {
		if(personaDb.editarPersona(this)) {
			return "Persona editada correctamente";
		}else {
			return "Error en la actualización";
		}
	}
}
