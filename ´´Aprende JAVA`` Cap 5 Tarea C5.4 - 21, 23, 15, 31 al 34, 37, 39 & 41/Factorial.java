import java.util.Scanner;

/**
 * Escribir un programa que pida un número entero positivo por teclado y que muestre a continuación
 * los números desde el 1 al número introducido junto con su factorial.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Factorial{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num, fact = 1, i, j, k;
		
		System.out.print("Por favor, introduzca un número entero positivo: ");
		num = sc.nextInt();
		
		while(num<=0){
			System.out.println("\nLo sentimos, pero el número tiene que ser un número entero positivo.");
			System.out.print("Por favor, introduzca un número entero positivo: ");
			num = sc.nextInt();
		}
		
		System.out.println();
		
		for(i=1; i<=num; i++){					// Calculamos el factorial de todos los números desde el 1 hasta el número elegido
			for(j=1; j<=i; j++){							// Calculamos el factorial de cada número en particular
				fact*=j;
			}
			
			System.out.println(i + "! = " + fact);
			
			fact = 1;
		}
	}
}
