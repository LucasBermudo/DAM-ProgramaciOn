/**
 * 20 números aleatorios entre 1 y 10 (sin decimales).
 * 
 * @autor Lucas Bermudo Junco
 */

public class Aleatorio04{
	public static void main(String args[]){
	
		System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):");
		
		for(int i=1; i<=20; i++){
			System.out.print((int)(Math.random()*10 + 1) + " ");					// Situamos el comienzo de los números al azar en 1.
		}
	}
}
