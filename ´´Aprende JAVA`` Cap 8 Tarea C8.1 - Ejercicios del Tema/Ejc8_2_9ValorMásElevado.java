import java.util.Scanner;
import misFunciones.*;

/**
 * Realizar un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más elevado.
 * Implementarlo creando únicamente una función a la que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_9ValorMásElevado{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca, separados por espacios, los 3 números distintos de los cuales quiera usted saber cuál es el mayor de ellos: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		while(num1==num2 || num1==num2 || num2==num3){					// Impedimos introducir 2 ó más números iguales.
			System.out.println("\nLo sentimos, pero de entre los números introducidos hay al menos 2 números iguales. Por favor vuelva a introducirlos.");
			System.out.println("Introduzca, separados por espacios, los 3 números distintos de los cuales quiera usted saber cuál es el mayor de ellos: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
		}
		
		if(Varias.numMayorPrimerOSeg(num1, num2)>num3){					// Comparamos el resultado de la función con el num3, 
																																												// y en función del resultado, procedemos con la acción correspondiente.
			System.out.println("\nEl número mayor de entre el " + num1 + ", el " + num2 + " y el " + num3 + " es el " + Varias.numMayorPrimerOSeg(num1, num2) + ".");
		} else{
			System.out.println("\nEl número mayor de entre el " + num1 + ", el " + num2 + " y el " + num3 + " es el " + num3 + ".");
		}
	}
}
