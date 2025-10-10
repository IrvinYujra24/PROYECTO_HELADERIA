package LOGICA;

public class Persona {
	private String nombre;
	private String apellidos;
	private String ci;
	private int edad;
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
	
	public void registrar_persona() {
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", ci=" + ci + ", edad=" + edad + "]";
	}
	
}
