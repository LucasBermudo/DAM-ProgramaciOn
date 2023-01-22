import java.util.Scanner;

/**
 * Crear un Array que cumpla las siguientes 3 condiciones:
 * Mostrar todos los elementos y posiciones.
 * Preguntar cuál posición quiero mostrar y lo muestro.
 * Mostras las posiciones pares y su suma.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejemplo1Tema7{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int i, sumaPosicionesPares = 0;
		
		int[] num = new int[10];
		
		for(i=0; i<6; i++){					// Asignamos a los primeros 6 números el valor de 2 elevado a ese número.
			num[i] = (int)(Math.pow(2,i));
		}
		
		// Realizamos operaciones matemáticas concretas para asignar los valores a los últimos 4 números.
		
		num[6] = num[2]*10;
		num[7] = num[2]/10;
		num[8] = num[0]+num[1]+num[2];
		num[9] = num[8];
		
		for(i=0; i<10; i++){
			System.out.println("Posición " + i + ": Valor " + num[i]);
		}
		
		System.out.print("\n¿Qué posición quieres que se muestre (de la 0 a la 9)?: ");
		i = sc.nextInt();
		
		while(i<0 || i>9){					// Obligamos a introducir una posición que se encuentre dentro de las posiciones posibles.
			System.out.println("\nLo sentimos, pero el array solo tiene 10 posiciones (de la 0 a la 9). Por favor, vuelve a introducir la respuesta, muchas gracias.");
			System.out.print("¿Qué posición quieres que se muestre (de la 0 a la 9)?: ");
			i = sc.nextInt();
		}
		
		System.out.println("\nEl valor de la posición " + i + " es el " + num[i]);
		
		System.out.println("\nLos elementos de las posiciones pares del array son los siguientes:");
		
		for(i=0; i<10; i+=2){					// Vamos recorriendo el array de 2 en 2 para mostrar los valores que están en las posiciones pares y hacemos la suma de esos valores.
			System.out.println("Posición " + i + ": Valor " + num[i]);
			sumaPosicionesPares+=num[i];
		}
		
		System.out.println("\nLa suma de los elementos de las posiciones pares del array es = " + sumaPosicionesPares);
	}
}














