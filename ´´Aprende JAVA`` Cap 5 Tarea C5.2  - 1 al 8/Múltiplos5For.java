/**
 * Mostrar los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 *
 * @autor Lucas Bermudo Junco.
 */

public class Múltiplos5For{
	public static void main(String args[]){
	
		System.out.print("Los múltiplos de 5 de 0 a 100 son: ");
		
		int i;
		
		for(i=1; i<=100; i++){
			if(i%5==0){					// Separamos los múltpilos de 5 de los demás.
				System.out.print(i + " ");
			}
		}		
	}
}
