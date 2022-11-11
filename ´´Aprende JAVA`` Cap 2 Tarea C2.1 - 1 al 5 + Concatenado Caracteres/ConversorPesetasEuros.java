/**
 * Convertir pesetas a euros.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ConversorPesetasEuros{
	public static void main(String args[]){
	
		double cantPesetas=1255881.52;
		double cambioPesetasEuros=1/166.386;
		double cantEuros=cantPesetas*cambioPesetasEuros;
		
		System.out.printf("El cambio de %.2f", cantPesetas);
		System.out.printf(" pesetas a euros es: %.2f", cantEuros);
		System.out.println(" euros");
	}
}
