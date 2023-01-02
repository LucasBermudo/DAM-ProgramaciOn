import java.util.Scanner;

/**
 * Realizar un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class CantidadDígitos{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num, i, cantCifras = 0;
		
		System.out.print("Por favor, introduce el número entero del cual desees saber cuántas cifras tiene: ");
		num = sc.nextInt();
		
		i = Math.abs(num);
		
		while(i>=1){					// Contamos las cifras hasta que lleguemos a la última.
			i = i/10;
			
			cantCifras++;
		}
		
		System.out.println("\nEl número " + num + " tiene " + cantCifras + " dígitos.");
	}
}
