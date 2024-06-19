package examen;

import java.util.Scanner;

/**
 * Clase principal en la que se ejecutaran los metodos establecidos en la otra clase
 */

public class principal {
	
	/**
	 * Metodo static void donde dentro de este se podran ejecutar los programas, tanto POO, como 
	 * de Programacion no Orientada a objetos
	 * @param args Puede almacenar un grupo de cadenas
	 */
	
     public static void main (String args[]) {
    	 clase objeto = new clase(); 
	
	     System.out.println(objeto.ejecutarSaludo("Hola", "Agustín"));
	     System.out.println(objeto.redondear(3.79345));
		 System.out.println("El número 3 es par " +  objeto.esPar(3));
		 String texto = "Esto es un texto de prueba";
	     System.out.println("La cadena  " + texto + " tiene " + objeto.contarLetras(texto) + " letras.");
     }
}
