import java.util.Scanner;

/**
 * Convertir euros a pesetas usando la clase Scanner.
 * 
 * @autor Lucas Bermudo Junco
 */

public class EurosPesetas{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		double cambioEurosPesetas=166.386;
		
		System.out.print("Por favor, introduce la cantidad en euros que desees convertir a pesetas: ");
		double cantEuros = s.nextDouble();
		
		double cantPesetas=cantEuros*cambioEurosPesetas;
		cantPesetas = (int) cantPesetas;
		
		System.out.printf("El cambio de %.2f", cantEuros);
		System.out.printf(" euros a pesetas es: %.2f", cantPesetas);
		System.out.println(" pesetas.");
	}
}
