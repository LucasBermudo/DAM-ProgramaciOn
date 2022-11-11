import java.util.Scanner;

/**
 * Realizar operaciones con 2 números introducidos por teclado usando la clase Scanner.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Operaciones{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduce los 2 números que desees operar separados por un espacio: ");
		double primerNúmero = s.nextDouble();
		double segundoNúmero = s.nextDouble();
		
		System.out.println("El resultado de la suma de " + primerNúmero + " + " + segundoNúmero + " es = " + (primerNúmero+segundoNúmero));
		System.out.println("El resultado de la resta de " + primerNúmero + " - " + segundoNúmero + " es = " + (primerNúmero-segundoNúmero));
		System.out.println("El resultado de la multiplicaión de " + primerNúmero + " * " + segundoNúmero + " es = " + primerNúmero * segundoNúmero);
		System.out.println("El resultado de la división de " + primerNúmero + " / " + segundoNúmero + " es = " + primerNúmero / segundoNúmero);
	}
}
