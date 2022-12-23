/**
 * Mostrar 20 números enteros al azar entre 50 y 60 (ambos incluidos).
 * 
 * @autor Lucas Bermudo Junco
 */

public class Aleatorio05{
	public static void main(String args[]){
	
		for (int i = 1; i <= 20; i++) {
			System.out.print(((int)(Math.random()*11) + 50 ) + " ");					// Situamos el comienzo de los números al azar en 50 y que tenga un rango de 11 (hasta el número 60 incluido).
		}
	}
}
