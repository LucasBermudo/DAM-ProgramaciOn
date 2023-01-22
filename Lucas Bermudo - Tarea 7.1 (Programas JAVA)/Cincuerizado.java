/**
 * Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre 0 y 500 (ambos incluidos).
 * A continuación, se mostrará el array “cincuerizado”, según el siguiente criterio:
 * si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el siguiente múltiplo de 5 que exista a partir de él.
 * 
 * @author Lucas Bermudo Junco
 */

public class Cincuerizado{
	public static void main(String args[]){
	
		int tam = 15;
		int [] num = new int[tam];
		
		System.out.println("El array original es:");
		
		for(int i=0; i<tam; i++){
			num[i] = (int)(Math.random()*501);
			System.out.print(num[i] + " ");
		}
		
		for(int i=0; i<tam; i++){
			if(num[i]%5!=0){					// En caso de que el número no sea múltiplo de 5, le añadimos el número necesario para convertirlo en el siguiente múltiplo de 5 más cercano.
				num[i] = num[i]+(5-num[i]%5);
			}
		}
		
		System.out.println("\n\nEl array cincuerizado es el siguiente:");
		
		for(int i=0; i<tam; i++){
			System.out.print(num[i] + " ");
		}
	}
}
