import java.util.Scanner;

/**
 * Diseñar un programa que muestre por pantalla los números naturales hasta un valor introducido por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmerosNaturales{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduce el valor hasta el que desees que se muestren números naturales: ");
		int numMax = sc.nextInt();
		
		while(numMax<=0){					// Establecemos el rango de respuestas posibles.
			System.out.println("\nLo sentimos, pero el número introducido (" + numMax + ") tiene que ser mayor que 0.");
			System.out.print("Por favor, vuelva a introducir el número, muchas gracias: ");
			numMax = sc.nextInt();
		}
		
		System.out.print("\nLos números naturales hasta el " + numMax + " son: ");
		
		for(int i=1; i<=numMax; i++){
			System.out.print(i + " ");
		}
	}
}
