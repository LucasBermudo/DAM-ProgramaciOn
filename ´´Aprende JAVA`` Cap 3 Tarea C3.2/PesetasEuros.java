/**
 * Convertir pesetas a euros.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PesetasEuros{
	public static void main(String args[]){
	
		String línea;
		
		System.out.print("Por favor, introduce la cantidad en pesetas que desees convertir a euros: ");
		línea = System.console().readLine();
		double cantPesetas;
		cantPesetas = Double.parseDouble(línea);
		
		double cambioPesetasEuros=1/166.386;
		double cantEuros=cantPesetas*cambioPesetasEuros;
		
		System.out.printf("El cambio de %.2f", cantPesetas);
		System.out.printf(" pesetas a euros es: %.2f", cantEuros);
		System.out.println(" euros.");
	}
}
