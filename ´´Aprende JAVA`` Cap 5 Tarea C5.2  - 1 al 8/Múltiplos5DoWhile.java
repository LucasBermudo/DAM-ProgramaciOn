/**
 * Mostrar los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *
 * @autor Lucas Bermudo Junco.
 */

public class Múltiplos5DoWhile{
	public static void main(String args[]){
		
		int i = 1;
		
		System.out.print("Los múltiplos de 5 de 0 a 100 son: ");
		
		do{
			if(i%5==0){					// Separamos los múltpilos de 5 de los demás.
				System.out.print(i + " ");
			}
			i++;
		} while(i<=100);		
	}
}
