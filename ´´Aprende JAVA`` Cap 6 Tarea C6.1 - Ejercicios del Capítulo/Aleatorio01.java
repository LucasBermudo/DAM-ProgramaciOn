/**
 * Mostrar diez números aleatorios entre el 0 y el 1 (sin llegar al 1).
 * 
 * @autor Lucas Bermudo Junco
 */

public class Aleatorio01{
	public static void main(String args[]){
	
		System.out.println("Diez números aleatorios entre el 0 y el 1 (sin llegar al 1):\n");
		
		for(int i=1; i<=10; i++){
			System.out.println(Math.random());					// No modificamos la generación de números al azar.
		}
	}
}
