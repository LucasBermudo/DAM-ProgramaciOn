import java.util.Scanner;

/**
 * Realizar un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * @autor Lucas Bermudo Junco
 */

public class CantidadCifras{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		boolean pos = true;
		
		System.out.print("Por favor, introduzca el número entero, de 5 cifras o menos, del cual usted desee que se muestre el número de dígitos que tiene: ");
		int num = sc.nextInt();
		
		if(num<0){
			num = Math.abs(num);
			pos = false;					// Identificamos los números negativos para el final del programa.
		}
		
		int cantDigit = (int)(Math.log10(num))+1;					// Calculamos la cantidad de cifras del número.
				
		if(cantDigit<=5){
											
			if(pos==false){
				num = -1*num;					// En caso de ser negativo el número, recuperamos el número original para mostrarlo al final.
			}
			
			System.out.println("\nEl número " + num + " contiene " + cantDigit + " dígitos.");	
		} else{
			System.out.println("\nLo sentimos, pero el número introducido (" + num + ") tiene más de 5 cifras, lo cual no está contemplado en este programa.");
			System.out.println("Si desea volver a intentarlo, por favor asegúrese de introducir un número de 5 o menos cifras, muchas gracias.");
		}
	}
}
