package LOGICA;

import java.util.Scanner;

import DATOS.productoDt;

public class Producto {
	private String nombre;
	private int cantidad;
	private String categoria;
	public Producto(String nombre, int cantidad, String categoria) {		
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.categoria = categoria;
	}
	
	public Producto() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + "]";
	}

	public void registrarProducto() {
		Scanner leer=new Scanner(System.in);
		this.nombre=leer.nextLine();
		this.cantidad=leer.nextInt();
		this.categoria=leer.nextLine();
		System.out.println(this.toString());
		productoDt.crear();
		//productoDt.escribir(this.nombre);
		//productoDt.agregar(this.nombre); //Mandamos el nombre del producto como cadena
		productoDt.agregar(this);//Mandamos el objeto completo
		leer.close();
	}
	public void registrarProducto2() {		
		productoDt.crear(); //Creamos el archivo, si no existe		
		productoDt.agregar(this);//Mandamos el objeto completo
	}
	
	public String leerProductos() {
		String datos=productoDt.leer2();//Llamamos al método de la capa Datos
		return datos;
	}
}