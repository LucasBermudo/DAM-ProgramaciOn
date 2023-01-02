import java.util.Scanner;

/**
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla todas las potencias con base
 * el numero dado y exponentes entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PotenciasHastaExponente{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int A, B, i, j, resultado = 1;
		
		System.out.print("Por favor, introduce el valor de la base: ");
		A = sc.nextInt();
		System.out.print("Por favor, introduce el valor del exponente: ");
		B = sc.nextInt();
		
		while(B<0){					// No dejamos avanzar hasta que se introduzca una base positiva.
			System.out.println("\nLo sentimos, pero el exponente introducido (" + B + ") tiene que ser mayor que 0.");
			System.out.print("Por favor, vuelva a introducir el exponente, muchas gracias: ");
			B = sc.nextInt();			
		}
		
		System.out.println();
		
		for(i=1; i<=B; i++){					// Establecemos la potencia máxima que vamos a realizar.
			for(j=1; j<=i; j++){					// Realizamos cada potencia hasta llegar a la potencia máxima.
				resultado*=A;
			}
			
			System.out.println(A + "^" + i + " = " + resultado);
			
			resultado = 1;
		}
	}
}
