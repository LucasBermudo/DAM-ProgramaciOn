/**
 * Mostrar 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmerosAlAzar1{
	public static void main(String args[]){
	
		int numAlea;
		
		System.out.print("20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios son: ");
		
		for(int i=1; i<=20; i++){
			numAlea = (int)(Math.random()*11)+0;
			
			System.out.print(numAlea + " ");
		}
	}
}
