package LOGICA;

import DATOS.clienteDt;

public class Cliente extends Persona{
	private int nro_cliente;

	public Cliente(String nombre, String apellidos, String ci, int edad, int nro_cliente) {
		super(nombre, apellidos, ci, edad);
		this.nro_cliente = nro_cliente;
	}

	public Cliente(String nombre, String apellidos, String ci, int edad) {
		super(nombre, apellidos, ci, edad);
		// TODO Auto-generated constructor stub
	}
	
	public Cliente() {
		
	}

	public int getNro_cliente() {
		return nro_cliente;
	}

	public void setNro_cliente(int nro_cliente) {
		this.nro_cliente = nro_cliente;
	}

	@Override
	public String toString() {
		return "Cliente [nro_cliente=" + nro_cliente + ", toString()=" + super.toString() + "]";
	}
	
	
	public void registrarCliente() {		
		clienteDt.crear();
		clienteDt.agregar(this);
	}

	public String leerClientes(){
		String datos=clienteDt.leer();
		return datos;
	}
	 
}
