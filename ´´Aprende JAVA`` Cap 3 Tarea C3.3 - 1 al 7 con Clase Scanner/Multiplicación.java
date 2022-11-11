import java.util.Scanner;

/**
 * Pedir dos números para luego mostrar el resultado de su multiplicación usando la clase Scanner.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Multiplicación{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduce los 2 números que desees multiplicar separados por un espacio: ");
		int primerNúmero = s.nextInt();
		int segundoNúmero = s.nextInt();
		
		int multiplicación = primerNúmero * segundoNúmero;
		
		System.out.print("El restultado de la multiplicación de " + primerNúmero + " * " + segundoNúmero + " es = " + multiplicación);
	}
}
