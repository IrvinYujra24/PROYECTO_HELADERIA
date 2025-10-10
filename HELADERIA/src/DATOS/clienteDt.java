package DATOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import LOGICA.Cliente;

public class clienteDt {
	public static void crear() {
		try {
		      File myObj = new File("clientes.txt"); 
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
	      FileWriter myWriter = new FileWriter("clientes.txt");
	      myWriter.write("Helado de Piña 🍦");
	      myWriter.close();  
	      System.out.println("Datos guardados");
	    } catch (IOException e) {
	      System.out.println("Error de escritura");
	      e.printStackTrace();
	    }
  }
  public static void agregar(Cliente c) {
	  try (FileWriter fw = new FileWriter("clientes.txt", true)) {
	      fw.write("\n"+c.getNombre()+ "  " +c.getApellidos()+" "+c.getCi()+" "+c.getNro_cliente());
	      System.out.println("Cliente registrado");
	    } catch (IOException e) {
	      System.out.println("Error de escritura.");
	      e.printStackTrace();
	    }
  }
  @SuppressWarnings("finally")
public static String leer() {
	  File archivo = new File("clientes.txt");
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
