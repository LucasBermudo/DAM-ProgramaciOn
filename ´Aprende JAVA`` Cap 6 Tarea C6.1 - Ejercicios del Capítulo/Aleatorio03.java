/**
 * Mostrar 20 números aleatorios entre 0 y 9 (sin decimales).
 * 
 * @autor Lucas Bermudo Junco
 */

public class Aleatorio03{
	public static void main(String args[]){
	
		System.out.println("20 números aleatorios entre 0 y 9 (sin decimales):");
		
		for(int i=1; i<=20; i++){
			System.out.print((int)(Math.random()*10) + " ");					// convertimos la generación de números decimales a enteros.
		}
	}
}
