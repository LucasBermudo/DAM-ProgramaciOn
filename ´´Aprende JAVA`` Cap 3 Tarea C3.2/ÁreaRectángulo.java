/**
 * Calcular el área de un rectángulo.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ÁreaRectángulo{
  public static void main(String args[]){

		String línea;
		
		System.out.print("Por favor, introduce la base del rectángulo: ");
		línea = System.console().readLine();
		double base;
		base = Double.parseDouble(línea);
		
		System.out.print("Por favor, introduce la altura del rectángulo: ");
		línea = System.console().readLine();
		double altura;
		altura = Double.parseDouble(línea);
		
		System.out.println("El área de un rectángulo de base " + base + " y de altura " + altura + " unidades es " + (base*altura) + " unidades^2");
  }
}
