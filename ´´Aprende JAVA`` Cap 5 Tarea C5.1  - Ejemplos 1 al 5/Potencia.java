import java.util.Scanner;

/**
 * Diseñar un programa que calcule y muestre por pantalla de valor de A elevado a B (sin usar el operador potencia ni método de Math).
 * Serán leidos por pantalla los números A y B.  
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
		
		while(B<0){					// Establecemos el rango de las posibles respuestas.
			System.out.println("\nLo sentimos, pero el exponente introducido (" + B + ") tiene que ser mayor que 0.");
			System.out.print("Por favor, vuelva a introducir el exponente, muchas gracias: ");
			B = sc.nextInt();			
		}
		
		int resPot = 1;
		
		for(int i=1; i<=B; i++){					// Calculamos la potencia.
			resPot = resPot*A;
		}
		
		System.out.println("\nEl resultado de " + A + " elevado a " + B + " es = " + resPot);
	}
}
