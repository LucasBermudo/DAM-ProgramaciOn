/**
 * Introducir números decimales por consola y mostrar un mensaje con una operación con dichos números.
 * 
 * @autor Lucas Bermudo Junco
 */

public class LecturaDeNúmerosDecimales{
  public static void main(String args[]){

		String línea;
		
		System.out.print("Por favor, introduce un número: ");
		línea = System.console().readLine();		//El número introducido se almacena como String
		double primerNúmero;
		primerNúmero = Double.parseDouble(línea);		//Mediante este casting, convertimos el valor String a Número Decimal
		
		System.out.print("Introduce otro número, por favor: ");
		línea = System.console().readLine();		//El número introducido se almacena como String
		double segundoNúmero;
		segundoNúmero = Double.parseDouble(línea);		//Mediante este casting, convertimos el valor String a Número Decimal
		
		double total;
		total = (2 * primerNúmero) + segundoNúmero;
		
		System.out.print("El 1º número introducido es " + primerNúmero);
		System.out.println(" y el 2º número es " + segundoNúmero);
		System.out.print("El doble del 1º número más el 2º es ");
		System.out.print(total);
 }
}
