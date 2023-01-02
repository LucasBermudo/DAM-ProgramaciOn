import java.util.Scanner;

/**
 * Escribir un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PrimeraCifra{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		boolean pos = true;
		
		System.out.print("Por favor, introduzca el número entero, de 5 cifras o menos, del cual usted desee que se muestre su primera cifra: ");
		int num = sc.nextInt();
		
		if(num<0){
			num = Math.abs(num);
			pos = false;					// Identificamos los números negativos para el final del programa.
		}
		
		int cantCifras = (int)(Math.log10(num))+1;					// Calculamos la cantidad de cifras del número.
		
		if(cantCifras<=5){
								
			int primCifra = (int)(num/Math.pow(10,Math.floor(Math.log10(num))));					// Averiguamos la primera cifra dividiendo el número entre 10 elevado al número de cifras del número.
			
			if(pos==false){
				num = -1*num;					// En caso de ser negativo el número, recuperamos el número original para mostrarlo al final.
			}
			
			System.out.println("\nLa primera cifra del número " + num + " es: " + primCifra);	
		} else{
			System.out.println("\nLo sentimos, pero el número introducido (" + num + ") tiene más de 5 cifras, lo cual no está contemplado en este programa.");
			System.out.println("Si desea volver a intentarlo, por favor asegúrese de introducir un número de 5 o menos cifras, muchas gracias.");
		}
	}
}
