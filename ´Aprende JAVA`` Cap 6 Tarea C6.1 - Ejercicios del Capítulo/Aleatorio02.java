/**
 * Mostrar 20 números aleatorios entre 0 y 10 sin llegar a 10 (con decimales).
 * 
 * @autor Lucas Bermudo Junco
 */

public class Aleatorio02{
	public static void main(String args[]){
	
		System.out.println("20 números aleatorios entre 0 y 10 sin llegar a 10 (con decimales): \n");
		
		for(int i=1; i<=20; i++){
			System.out.println( Math.random()*10);					// Multiplicamos la generación de números al azar para obtener el rango deseado.
		}
	}
}
