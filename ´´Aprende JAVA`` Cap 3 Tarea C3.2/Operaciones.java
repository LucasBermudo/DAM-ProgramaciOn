/**
 * Realizar operaciones con 2 números introducidos por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Operaciones{
	public static void main(String args[]){
	
		String línea;
		
		System.out.print("Por favor, introduce el 1º número de la operación: ");
		línea = System.console().readLine();
		double primerNúmero;
		primerNúmero = Double.parseDouble(línea);
		
		System.out.print("Por favor, introduce el 2º número de la operación: ");
		línea = System.console().readLine();
		double segundoNúmero;
		segundoNúmero = Double.parseDouble(línea);
		
		System.out.println("El resultado de la suma de " + primerNúmero + " + " + segundoNúmero + " es = " + (primerNúmero+segundoNúmero));
		System.out.println("El resultado de la resta de " + primerNúmero + " - " + segundoNúmero + " es = " + (primerNúmero-segundoNúmero));
		System.out.println("El resultado de la multiplicaión de " + primerNúmero + " * " + segundoNúmero + " es = " + primerNúmero * segundoNúmero);
		System.out.println("El resultado de la división de " + primerNúmero + " / " + segundoNúmero + " es = " + primerNúmero / segundoNúmero);
	}
}
