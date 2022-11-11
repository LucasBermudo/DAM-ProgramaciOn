/**
 * Calcular el área de un triángulo.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ÁreaTriángulo{
	public static void main(String args[]){
	
		String línea;
		
		System.out.print("Por favor, introduce la base del triángulo: ");
		línea = System.console().readLine();
		double base;
		base = Double.parseDouble(línea);
		
		System.out.print("Por favor, introduce la altura del triángulo: ");
		línea = System.console().readLine();
		double altura;
		altura = Double.parseDouble(línea);
		
		System.out.println("El área de un rectángulo de base " + base + " y de altura " + altura + " unidades es " + ((base*altura)/2) + " unidades^2");
	}
}
