/**
 * Convertir euros a pesetas.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ConversorEurosPesetas{
	public static void main(String args[]){
	
		double cantEuros=7548;
		double cambioEurosPesetas=166.386;
		double cantPesetas=cantEuros*cambioEurosPesetas;
		
		System.out.printf("El cambio de %.2f", cantEuros);
		System.out.printf(" euros a pesetas es: %.2f", cantPesetas);
		System.out.println(" pesetas.");
	}
}
