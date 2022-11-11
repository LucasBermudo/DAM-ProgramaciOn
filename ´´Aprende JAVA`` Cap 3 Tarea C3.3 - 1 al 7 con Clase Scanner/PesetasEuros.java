import java.util.Scanner;

/**
 * Convertir pesetas a euros usando la clase Scanner.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PesetasEuros{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		double cambioPesetasEuros=1/166.386;
		
		System.out.print("Por favor, introduce la cantidad en pesetas que desees convertir a euros: ");
		int cantPesetas = s.nextInt();
		
		double cantEuros=cantPesetas*cambioPesetasEuros;
		
		System.out.print("El cambio de " + cantPesetas);
		System.out.printf(" pesetas a euros es: %.2f", cantEuros);
		System.out.println(" euros.");
	}
}
