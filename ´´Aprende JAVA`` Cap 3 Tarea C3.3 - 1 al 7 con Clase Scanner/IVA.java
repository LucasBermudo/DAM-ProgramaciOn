import java.util.Scanner;

/**
 * Calcular el total de una factura a partir de la base imponible (precio sin IVA) usando la clase Scanner.
 * 
 * @autor Lucas Bermudo Junco
 */
 
public class IVA{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		double iva = 0.21;
		
		System.out.print("Por favor, introduce la base imponible (precio sin IVA) en euros: ");
		double baseImponible = s.nextDouble();
		
		double precioFinal = baseImponible * (1+iva);
		
		System.out.printf("El precio final del artículo es %.2f", precioFinal);
		System.out.println(" euros");
	}
}
