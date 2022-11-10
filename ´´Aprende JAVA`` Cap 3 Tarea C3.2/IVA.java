/**
 * Calcular el total de una factura a partir de la base imponible (precio sin IVA).
 * 
 * @autor Lucas Bermudo Junco
 */
 
public class IVA{
  public static void main(String args[]){

		String línea;
		
		System.out.print("Por favor, introduce la base imponible (precio sin IVA) en euros: ");
		línea = System.console().readLine();
		double baseImponible;
		baseImponible = Double.parseDouble(línea);
		
		double iva = 0.21;
	  double precioFinal = baseImponible * (1+iva);
		
		System.out.printf("El precio final del artículo es %.2f", precioFinal);
		System.out.println(" euros");
  }
}
