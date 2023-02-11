import java.util.Scanner;
import misFunciones.*;

/**
 * Escribir un programa que pase de binario a decimal.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_18ConversorDecimalABinario{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Introduzca el número en decimal que quiera usted convertir a binario: ");
		long num = sc.nextLong();
		
		// Ejecutamos la función del conversor de números y la mostramos directamente por pantalla.
		
		System.out.println("\nEl número decimal " + num + ", expresado en binario, es: " + Varias.conversorDecimalABinario(num) + ".");
	}
}
