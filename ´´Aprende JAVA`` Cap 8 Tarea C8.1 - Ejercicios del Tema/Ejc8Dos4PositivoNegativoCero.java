import java.util.Scanner;
import misFunciones.Varias;

/**
 * Escribir un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero.
 * Implementar y utiliza la función:
 * int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8Dos4PositivoNegativoCero{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Introduzca el número entero del cual desee saber si es negativo, 0 ó positivo: ");
		int num = sc.nextInt();
		
		if(Varias.dimeSigno(num)==-1){					// En caso de que la función devuelva -1, 0 ó 1 mostramos el mensaje correspondiente.
			System.out.println("\nEl número " + num + " es negativo.");
		} else if(Varias.dimeSigno(num)==0){
			System.out.println("\nEl número " + num + " no es ni positivo ni negativo.");
		} else{
			System.out.println("\nEl número " + num + " es positivo.");
		}
	}
}
