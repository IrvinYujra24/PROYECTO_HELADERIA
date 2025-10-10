package DATOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Scanner;

import LOGICA.Producto;

public class productoDt {
	
	public static void crear() {
		try {
		      File myObj = new File("productos.txt"); 
		      if (myObj.createNewFile()) {
		        System.out.println("Archivo creado: " + myObj.getName());
		      } else {
		        System.out.println("El archivo ya existe.");
		      }
		    } catch (IOException e) {
		      System.out.println("Ocurrió un error.");
		      e.printStackTrace(); 
		    }
	}
  public static void escribir(String producto) {
	  try {
	      FileWriter myWriter = new FileWriter("productos.txt");
	      myWriter.write(producto);
	      myWriter.close();  
	      System.out.println("Datos guardados");
	    } catch (IOException e) {
	      System.out.println("Error de escritura");
	      e.printStackTrace();
	    }
  }
  
  public static void agregar(Producto p) {
	  try (FileWriter fw = new FileWriter("productos.txt", true)) {
	      fw.write("\n"+p.getNombre()+ "  " +p.getCantidad()+" "+p.getCategoria());
	      System.out.println("Producto agregado");
	    } catch (IOException e) {
	      System.out.println("Error de escritura.");
	      e.printStackTrace();
	    }
  }
  
  public static void leer() {
	  File archivo = new File("productos.txt");	    
	  try (Scanner lector = new Scanner(archivo)) {
	    while (lector.hasNextLine()) {
	        String datos = lector.nextLine();
	        System.out.println(datos);
	      }
	    } catch (FileNotFoundException e) {
	      System.out.println("Error de lectura");
	      e.printStackTrace();
	    }  
  }
  @SuppressWarnings("finally")
  public static String leer2() {
	  File archivo = new File("productos.txt");
	  String datos="";
	  try (Scanner lector = new Scanner(archivo)) {		  
		  while (lector.hasNextLine()) {
	         datos= datos+"\n"+lector.nextLine();	        
	      }
	    } catch (FileNotFoundException e) {
	      System.out.println("Error de lectura");
	      e.printStackTrace();
	    }  finally {
	    	return datos;
	    }
  }
}
