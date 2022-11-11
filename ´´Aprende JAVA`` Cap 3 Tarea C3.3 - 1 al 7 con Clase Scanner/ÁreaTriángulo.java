import java.util.Scanner;

/**
 * Calcular el área de un triángulo usando la clase Scanner.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ÁreaTriángulo{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduce la base del rectángulo: ");
		double base = s.nextDouble();
		
		System.out.print("Por favor, introduce la altura del rectángulo: ");
		double altura = s.nextDouble();
		
		System.out.println("El área de un rectángulo de base " + base + " y de altura " + altura + " unidades es " + ((base*altura)/2) + " unidades^2");
	}
}
