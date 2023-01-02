import java.util.Scanner;

/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Potencia{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduce el valor de la base: ");
		int A = sc.nextInt();
		System.out.print("Por favor, introduce el valor del exponente: ");
		int B = sc.nextInt();
		
	while(B<0){					// No dejamos avanzar hasta que se introduzca una base positiva.
			System.out.println("\nLo sentimos, pero el exponente introducido (" + B + ") tiene que ser mayor que 0.");
			System.out.print("Por favor, vuelva a introducir el exponente, muchas gracias: ");
			B = sc.nextInt();			
		}
		
		double resPot = Math.pow(A,B);
		
		System.out.println("\nEl resultado de " + A + " elevado a " + B + " es = " + resPot);
	}
}
