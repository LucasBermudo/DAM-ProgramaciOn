/**
 * Calcular el total de una factura a partir de la base imponible (precio sin IVA).
 * 
 * @autor Lucas Bermudo Junco
 */

public class IVA{
	public static void main(String args[]){
		
		double baseImponible = 83.60;
		double iva = 0.21;
		double precioFinal = baseImponible * (1+iva);
		
		System.out.println("El precio final del artículo es " + (int) precioFinal + " euros.");
	}
}
