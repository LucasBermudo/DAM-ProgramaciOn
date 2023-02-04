import java.util.Scanner;
import misFunciones.*;

/**
 * El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera:
 * Se divide el número de DNI entre 23 y el resto es codificado por una letra según la equivalencia establecida.
 * Escribe un programa que pida el DNI y muestre por pantalla la letra asociada.
 * Para ello se deberá crear una función a la que se le pase el número y devuelva la letra.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_18NIF{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número entero del NIF (sin la letra) para saber la letra que le corresponde: ");
		int num = sc.nextInt();
		
		while((int)(Math.log10(num)+1)!=8){				// Impedimos al usuario introducir un NIF que no tenga 8 dígitos.
			System.out.println("Lo sentimos, pero el NIF tiene que tener 8 dígitos, y el que usted ha introducido (" + num + ") " + 
																"tiene " + (int)(Math.log10(num)+1) + " dígitos. Por favor, vuelva a introducirlo.");
			System.out.print("Introduzca el número entero del NIF (sin la letra) para saber la letra que le corresponde:");
			num = sc.nextInt();
		}
		
		System.out.println("\nPara el DNI con número " + num + ", la letra que le corresponde es la " + Varias.letraNIF(num) + ".");
		
		String NIFCompleto = Integer.toString(num) + Varias.letraNIF(num);					// Creamos una variable concatenando el número con su letra correspondiente.
		
		System.out.println("\nPor lo tanto, el NIF completo es " + NIFCompleto + ".");
	}
}
