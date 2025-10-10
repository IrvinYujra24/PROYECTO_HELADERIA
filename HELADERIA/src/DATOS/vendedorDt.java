package DATOS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class vendedorDt {
	public static void crear() {
		try {
		      File myObj = new File("vendedores.txt"); 
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
  public static void escribir() {
	  try {
	      FileWriter myWriter = new FileWriter("vendedores.txt");
	      myWriter.write("Datos de vendedor: Juan Gonzales");
	      myWriter.close();  
	      System.out.println("Datos guardados");
	    } catch (IOException e) {
	      System.out.println("Error de escritura");
	      e.printStackTrace();
	    }
  }
}
