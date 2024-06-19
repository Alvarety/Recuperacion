package examen;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Clase en la que tendremos ciertos metodos que tambien sirven en la clase principal, siempre y cuando
 * sean del mismo paquete
 */

public class clase {
	
    /**
     * Este metodo te devuelve un valor booleano dependiendo de si un numero es par o no
     * @param numero El numero al que se va a comprobar si es par
     * @return Devuelve si el numero es par o no, si es par pondra true, si no te devolvera false
     */
	
    public boolean esPar(int numero) { 
        return numero % 2 == 0; 
    } 
    
    /**
     * Ejecutara un saludo a una persona en concreto
     * @param saludo Almacena el tipo de saludo
     * @param nombre El nombre de la persona a la que vamos a saludar
     * @return Devuelve el saludo dirigido a una persona
     */
    
    public String ejecutarSaludo(String saludo, String nombre) { 
        return saludo + ' ' + nombre; 
    } 
    
    /**
     * Redondea numeros que esten en formato decimal, porque algunos decimales pueden tener numeros infinitos
     * @param promedio El numero decimal al que vamos a redondear
     * @return Devuelve el numero redondeado
     */
    
    public String redondear(double promedio) {  
    	DecimalFormat df = new DecimalFormat("0.00");  df.setRoundingMode(RoundingMode.HALF_UP);  
    	return df.format(promedio);
    }
    
    /**
     * Cuenta las letras que contiene una palabra o una frase
     * @param palabra Almacena la palabra o frase a la que vamos a contar las letras
     * @return Devuelve el numero de letras que tiene la palabra o frase
     */
    
    public int contarLetras(String palabra) {

      return palabra.length();
    }
    
    /**
     * Metodo que cuenta los caracteres que tiene una cadena
     * @param cadena Frase o palabra almacenada en este parametro
     * @param caracter Caracter al que vamos a contar el numero de veces que aparece
     * @return Devuelve el numero de veces que aparece un caracter en una cadena
     */
    
    public int contarCaracteresEnCadena(String cadena, String caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada                                 
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
    
}