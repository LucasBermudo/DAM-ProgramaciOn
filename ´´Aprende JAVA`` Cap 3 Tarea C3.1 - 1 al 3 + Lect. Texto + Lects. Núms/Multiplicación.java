/**
 * Pedir dos números para luego mostrar el resultado de su multiplicación.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Multiplicación{
  public static void main(String args[]){
		
		String línea;
		
		System.out.print("Por favor, introduce el primer número: ");
		línea = System.console().readLine();
		int primerNúmero;
		primerNúmero = Integer.parseInt(línea);
		
		System.out.print("Por favor, introduce el segundo número: ");
		línea = System.console().readLine();
		int segundoNúmero;
		segundoNúmero = Integer.parseInt(línea);
		
		int resultado = primerNúmero * segundoNúmero;
		
		System.out.println("El resultado de la multiplicación de " + primerNúmero + " y " + segundoNúmero + " es = " + resultado);
				
 }
}
