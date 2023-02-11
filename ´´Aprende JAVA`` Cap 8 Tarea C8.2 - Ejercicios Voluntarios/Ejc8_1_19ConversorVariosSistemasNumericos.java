import java.util.Scanner;
import misFunciones.*;

/**
 * Unir y ampliar los dos programas anteriores de tal forma que se permita convertir un número
 * entre cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_19ConversorVariosSistemasNumericos{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		long numNoHexadecimalOrigen = 0, numIntermedio, numNoHexadecimalFinal;
		String numHexadecimalOrigen = "", numHexadecimalFinal = "", repetir;
	
		System.out.println("Programa para convertir números entre los sistemas binario, octal, decimal y hexadecimal");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Menú:\t1 - Binario\t2 - Octal\t3 - Decimal\t4 - Hexadecimal");
		
		do{					// Realizamos este bucle mientras el usuario no introduzca ´´no`` en la variable ´´repetir``.
			System.out.print("\nIntroduzca el sistema numérico que desee cambiar: ");
			int sistOrigen = sc.nextInt();
			
			while(sistOrigen<1 || sistOrigen>4){					// Impedimos al usuario introducir una opción no disponible.
				System.out.println("\nLo sentimos, pero el sistema elegido no se encuentra dentro de los sistemas disponibles. Por favor, vuelva a introducirlo.");
				System.out.print("\nIntroduzca el sistema numérico que desee cambiar: ");
				sistOrigen = sc.nextInt();			
			}
			
			System.out.println();
			
			// Según el sistema numérico elegido, ejecutamos el método de introducción correspondiente del número.
			
			if(sistOrigen==1){
				numNoHexadecimalOrigen = Varias.introducirYComprobarNumeroBinario();
			} else if(sistOrigen==2){
				numNoHexadecimalOrigen = Varias.introducirYComprobarNumeroOctal();
			} else if(sistOrigen==3){
				System.out.print("Introduzca el número en decimal que desee usted convertir: ");
				numNoHexadecimalOrigen = sc.nextLong();
			} else{
				numHexadecimalOrigen = Varias.introducirYComprobarNumeroHexadecimal();
			}
			
			if(sistOrigen>=1 && sistOrigen <=3){
				System.out.print("\nIntroduzca el sistema numérico al que desee convertir el número " + numNoHexadecimalOrigen + ": ");
			} else{
				System.out.print("\nIntroduzca el sistema numérico al que desee convertir el número " + numHexadecimalOrigen + ": ");
			}
			
			int sistDestino = sc.nextInt();
			
			while(sistDestino<1 || sistDestino>4 || sistOrigen==sistDestino){					// Impedimos al usuario introducir el mismo sistema numérico de origen u otra opción no disponible.
				if(sistDestino<1 || sistDestino>4){
					System.out.println("\nLo sentimos, pero el sistema elegido no se encuentra dentro de los sistemas disponibles. Por favor, vuelva a introducirlo.");	
				} else{
					System.out.println("\nLo sentimos, pero los 2 sistemas numéricos tienen que ser distintos para que haya una conversión entre distintos sistemas numéricos." +
																			"Por favor, vuelva a introducir el sistema numérico de destino.");
				}
				
				System.out.print("\nIntroduzca el sistema numérico al que desee convertir el número: ");
				sistDestino = sc.nextInt();
			}
			
			System.out.println();
			
			// Procedemos a realizar la correspondiente conversión entre sistemas numéricos. La conversión puede ser en 1 paso ó en 2 pasos, según lo que corresponda.
			
			if(sistOrigen==1 && sistDestino ==2){
				numIntermedio = Varias.conversorBinarioADecimal(numNoHexadecimalOrigen);
				numNoHexadecimalFinal = Varias.conversorDecimalAOctal(numIntermedio);
				System.out.println("El número binario " + numNoHexadecimalOrigen + " convertido a octal es: " + numNoHexadecimalFinal);
			} else if(sistOrigen==1 && sistDestino ==3){
				numNoHexadecimalFinal = Varias.conversorBinarioADecimal(numNoHexadecimalOrigen);
				System.out.println("El número binario " + numNoHexadecimalOrigen + " convertido a decimal es: " + numNoHexadecimalFinal);
			}else if(sistOrigen==1 && sistDestino ==4){
				numIntermedio = Varias.conversorBinarioADecimal(numNoHexadecimalOrigen);
				numHexadecimalFinal = Varias.conversorDecimalAHexadecimal(numIntermedio);
				System.out.println("El número binario " + numNoHexadecimalOrigen + " convertido a hexadecimal es: " + numHexadecimalFinal);
			}else if(sistOrigen==2 && sistDestino ==1){
				numIntermedio = Varias.conversorOctalADecimal(numNoHexadecimalOrigen);
				numNoHexadecimalFinal = Varias.conversorDecimalABinario(numNoHexadecimalOrigen);
				System.out.println("El número  octal " + numNoHexadecimalOrigen + " convertido a binario es: " + numNoHexadecimalFinal);
			}else if(sistOrigen==2 && sistDestino ==3){
				numNoHexadecimalFinal = Varias.conversorOctalADecimal(numNoHexadecimalOrigen);
				System.out.println("El número octal " + numNoHexadecimalOrigen + " convertido a decimal es: " + numNoHexadecimalFinal);
			}else if(sistOrigen==2 && sistDestino ==4){
				numIntermedio = Varias.conversorOctalADecimal(numNoHexadecimalOrigen);
				numHexadecimalFinal = Varias.conversorDecimalAHexadecimal(numIntermedio);
				System.out.println("El número octal " + numNoHexadecimalOrigen + " convertido a hexadecimal es: " + numHexadecimalFinal);
			}else if(sistOrigen==3 && sistDestino ==1){
				numNoHexadecimalFinal = Varias.conversorDecimalABinario(numNoHexadecimalOrigen);
				System.out.println("El número decimal " + numNoHexadecimalOrigen + " convertido a binario es: " + numNoHexadecimalFinal);
			}else if(sistOrigen==3 && sistDestino ==2){
				numNoHexadecimalFinal = Varias.conversorDecimalAOctal(numNoHexadecimalOrigen);
				System.out.println("El número decimal " + numNoHexadecimalOrigen + " convertido a octal es: " + numNoHexadecimalFinal);
			}else if(sistOrigen==3 && sistDestino ==4){
				numHexadecimalFinal = Varias.conversorDecimalAHexadecimal(numNoHexadecimalOrigen);
				System.out.println("El número decimal " + numNoHexadecimalOrigen + " convertido a hexadecimal es: " + numHexadecimalFinal);
			}else if(sistOrigen==4 && sistDestino ==1){
				numIntermedio = Varias.conversorHexadecimalADecimal(numHexadecimalOrigen);
				numNoHexadecimalFinal = Varias.conversorDecimalABinario(numIntermedio);
				System.out.println("El número hexadecimal " + numHexadecimalOrigen + " convertido a binario es: " + numNoHexadecimalFinal);
			}else if(sistOrigen==4 && sistDestino ==2){
				numIntermedio = Varias.conversorHexadecimalADecimal(numHexadecimalOrigen);
				numNoHexadecimalFinal = Varias.conversorDecimalAOctal(numIntermedio);
				System.out.println("El número hexadecimal " + numHexadecimalOrigen + " convertido a octal es: " + numNoHexadecimalFinal);
			}else if(sistOrigen==4 && sistDestino ==3){
				numNoHexadecimalFinal = Varias.conversorHexadecimalADecimal(numHexadecimalOrigen);
				System.out.println("El número hexadecimal " + numHexadecimalOrigen + " convertido a decimal es: " + numNoHexadecimalFinal);
			}
			
			System.out.print("\n¿Quiere volver a realizar alguna conversion de números a otro sistema numérico? Responda sí o no, por favor: ");
			repetir = sc.next();
			repetir = repetir.toLowerCase();
			
			while(!repetir.equals("sí") && !repetir.equals("si") && !repetir.equals("no")){					// Impedimos al usuario introducir una opción no disponible.
				System.out.println("\nLo sentimos, pero la respuesta está mal escrita o no se encuentra dentro de las respuestas posibles. Por favor, vuelva a introducir la respuesta.");
				System.out.print("\n¿Quiere volver a realizar alguna conversion de números a otro sistema numérico? Responda sí o no, por favor: ");
				repetir = sc.next();
				repetir = repetir.toLowerCase();
			}
			
			if(repetir.equals("sí") || repetir.equals("si")){
				System.out.println("\nUsted ha elegido realizar otra conversión entre sistemas numéricos.");
			} else{
				System.out.println("\nUsted ha elegido no realizar ninguna conversión más entre sistemas numéricos, por lo que el programa ha terminado.");
			}
		}while(!repetir.equals("no"));
	}
}
