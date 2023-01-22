import java.util.Scanner;

/**
 * Realizar un programa que sea capaz de insertar un número en una posición concreta de un array.
 * En primer lugar, el programa generará un array de 12 números enteros aleatorios entre 0 y 200 ambos incluidos.
 * A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11).
 * Seguidamente el programa preguntará por el número que se quiere insertar y por la posición donde será insertado.
 * Los números del array se desplazan a la derecha para dejar sitio al nuevo.
 * El último número (el que se encuentra en la posición 11) siempre se perderá.
 * 
 * @author Lucas Bermudo Junco
 */

public class InsertarPosiciónConcreta{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int tam = 12, numInsertado, posición;
		int num[] = new int[tam];
		
		System.out.println("El array original es el siguiente:\n");
		
		for(int i=0; i<tam; i++){
			num[i] = (int)(Math.random()*201);
			System.out.print(num[i] + "  ");
		}
		
		System.out.print("\n\nIntroduce el número que quieres insertar: ");
		numInsertado = sc.nextInt();
		
		System.out.print("Introduce la posición del array en la que quieras insertar ese número (del 0 al " + (tam-1) + "): ");
		posición = sc.nextInt();
		
		while(posición<0 || posición>(tam-1)){					// Obligamos a introducr una posición que se encuentre dentro de las posibles posiciones del array.
			System.out.println("\nLo sentimos, pero la posición tiene que estar entre las posiciones posibles del array, en este caso entre 0 y " + (tam-1) + ".");
			System.out.println("Por favor, a continuación vuelve a introducir una posición que esté entre 0 y " + (tam-1) + ", muchas gracias.");
			
			System.out.print("\nIntroduce la posición del array en la que quieras insertar ese número: ");
			posición = sc.nextInt();
		}
		
		for(int i=0; i<tam; i++){
			if(i==posición){					// Vamos recorriendo el array sin actuar sobre él, y solo actuamos sobre él cuando llegamos a la posición elegida, a partir de la cual vamos desplazando los números a una posición más del array .
				for(int j=(tam-1); j>posición; j--){
					num[j] = num[j-1];
				}
				
				num[posición] = numInsertado;					// Cuando ya hemos desplazado el resto de números, al fin podemos insertar el número elegido en la posición elegida.
			}
		}
		
		System.out.println("\nEl array con el número " + numInsertado + " insertado en la posición " + posición  + " es el siguiente:\n");
		
		for(int i=0; i<tam; i++){
			System.out.print(num[i] + "  ");
		}
	}
}
