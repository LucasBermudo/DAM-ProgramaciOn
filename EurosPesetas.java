/*Programa diseñado por Lucas Bermudo que tiene como objetivo convertir euros a pesetas.*/

public class EurosPesetas{
  public static void main(String args[]){

		String línea;
		
		System.out.print("Por favor, introduce la cantidad en euros que desees convertir a pesetas: ");
		línea = System.console().readLine();
		double cantEuros;
		cantEuros = Double.parseDouble(línea);
				
		double cambioEurosPesetas=166.386;
		double cantPesetas=cantEuros*cambioEurosPesetas;
		cantPesetas = (int) cantPesetas;
		
		System.out.printf("El cambio de %.2f", cantEuros);
		System.out.printf(" euros a pesetas es: %.2f", cantPesetas);
		System.out.println(" pesetas.");
	}
}
