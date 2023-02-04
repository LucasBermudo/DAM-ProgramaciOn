import java.util.Scanner;
import misFunciones.*;

/**
 * Escribir un programa que pida dos números enteros por teclado y muestre por pantalla cual es el mínimo.
 * Implementar y utiliza la función:
 * int minimo(int a, int b) // Devuelve el menor entre a y b
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_3Mínimo{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Introduce, separados por un espacio, los 2 números de los que quiera usted que se muestre cuál de ellos es el menor: ");
		int primNum = sc.nextInt();
		int segNum = sc.nextInt();
		
		if(primNum!=segNum){					// En caso de que los números sean distintos, llamamos a la función, y en caso contrario, mostramos un mensaje de que son iguales.
			System.out.println("\nEl número más pequeño de entre los números " + primNum + " y " + segNum + " es el " + Varias.minimo(primNum, segNum) + ".");
		} else{
			System.out.println("\nLos 2 números introducidos son el mismo (ambos son el " + primNum + "), por lo que ninguno de ellos es menor que el otro.");
		}
	}
}
