import java.util.Scanner;

/**
 * Escribir un programa que calcule el precio final de un producto según su base imponible, el tipo de IVA aplicado y el código promocional.
 *
 * @autor Lucas Bermudo Junco.
 */

public class Precios{
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca la base imponible en euros: ");
		double baseImp = sc.nextDouble();
		System.out.print("Introduzca el tipo de IVA aplicado (general, reducido o superrreducido): ");
		String tipoIva = sc.next();
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 ó 5porc): ");
		String codProm = sc.next();
		
		double precioConIva = 0, valorIva = 0;
		String porcIva = "";
		
		switch(tipoIva){					// Establecemos los valores para cada tipo de IVA.
			case "general":
				porcIva = "21%";
				valorIva = baseImp*0.21;
				precioConIva = baseImp*1.21;
				break;
			case "reducido":
				porcIva = "10%";
				valorIva = baseImp*0.10;
				precioConIva = baseImp*1.10;
				break;
			case "superreducido":
				porcIva = "4%";
				valorIva = baseImp*0.04;
				precioConIva = baseImp*1.04;
				break;
		}
		
		double precioFinal = 0, valorCodProm = 0;
		
		switch(codProm){					// Establecemos los valores para cada tipo de descuento.
			case "nopro":
				valorCodProm = 0;
				precioFinal = precioConIva;
				break;
			case "mitad":
				valorCodProm = -(precioConIva/2);
				precioFinal = precioConIva/2;
				break;
			case "meno5":
				valorCodProm = -5;
				precioFinal = precioConIva-5;
				break;
			case "5porc":
				valorCodProm = -(precioConIva*0.05);
				precioFinal = precioConIva*0.95;
				break;
		}
		
		System.out.println();
		System.out.printf("%-20s %.2f\n", "Base Imponible", baseImp);
		System.out.printf("%-20s %.2f\n", "IVA (" + porcIva + ")", valorIva);
		System.out.printf("%-20s %.2f\n", "Precio con IVA", precioConIva);
		System.out.printf("%-20s %.2f\n", "Cód. promo. (" + codProm + ")", valorCodProm);
		System.out.printf("%-20s %.2f\n", "TOTAL", precioFinal);
	}
}
