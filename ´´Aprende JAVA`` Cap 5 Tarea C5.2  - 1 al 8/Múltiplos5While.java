/**
 * Mostrar los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 *
 * @autor Lucas Bermudo Junco.
 */

public class Múltiplos5While{
	public static void main(String args[]){
		
		int i = 1;
		
		System.out.print("Los múltiplos de 5 de 0 a 100 son: ");
		
		while(i<=100){
			if(i%5==0){					// Separamos los múltpilos de 5 de los demás.
				System.out.print(i + " ");
			}
			i++;
		}		
	}
}
