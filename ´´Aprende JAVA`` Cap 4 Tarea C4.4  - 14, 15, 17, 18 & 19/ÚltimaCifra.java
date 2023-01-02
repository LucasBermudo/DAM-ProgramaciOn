import java.util.Scanner;

/**
 * Escribir un programa que diga cuál es la última cifra de un número entero introducido por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ÚltimaCifra{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número entero del cual usted desee que se muestre su última cifra: ");
		int num = sc.nextInt();
		
		int ultCifra = Math.abs(num%10);					// Establecemos la última cifra como el resto de la división del número entre 10.
		
		System.out.println("\nLa última cifra del número " + num + " es: " + ultCifra + ".");
	}
}
