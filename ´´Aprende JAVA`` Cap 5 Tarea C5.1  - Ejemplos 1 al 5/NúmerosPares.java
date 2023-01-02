/**
 * Diseñar un programa que muestra por pantalla los números pares entre 0 y 20.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmerosPares{
	public static void main(String args[]){
	
		System.out.print("Los números pares entre 0 y 20 son: ");
		
		for(int i = 2; i <= 20; i+=2){
			System.out.print(i + " ");
		}
	}
}
