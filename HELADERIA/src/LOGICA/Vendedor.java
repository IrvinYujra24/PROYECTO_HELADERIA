package LOGICA;

public class Vendedor extends Persona{
	private String codigo_trabajador;

	public Vendedor() {
	
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nombre, String apellidos, String ci, int edad) {
		super(nombre, apellidos, ci, edad);
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nombre, String apellidos, String ci, int edad, String codigo_trabajador) {
		super(nombre, apellidos, ci, edad);
		this.codigo_trabajador = codigo_trabajador;
	}

	public String getCodigo_trabajador() {
		return codigo_trabajador;
	}

	public void setCodigo_trabajador(String codigo_trabajador) {
		this.codigo_trabajador = codigo_trabajador;
	}
	
}
