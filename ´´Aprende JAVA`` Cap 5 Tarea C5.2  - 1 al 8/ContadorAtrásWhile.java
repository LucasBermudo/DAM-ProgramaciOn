/**
 * Mostrar los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
 *
 * @autor Lucas Bermudo Junco.
 */

public class ContadorAtrásWhile{
	public static void main(String args[]){
		
		System.out.print("Los números del 320 al 160 contando de 20 en 20 son: ");
		
		int i=320;
		
		while(i>=160){
			System.out.print(i + " ");
			i-=20;
		}
	}
}
