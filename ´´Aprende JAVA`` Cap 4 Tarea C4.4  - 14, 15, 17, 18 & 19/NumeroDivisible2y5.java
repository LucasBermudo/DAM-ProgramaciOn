import java.util.Scanner;

/**
 * Realizar un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NumeroDivisible2y5{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa indica si un número entero es par y/o divisible entre 5.\n");
		System.out.print("Por favor, introduce el número entero del cual desees averiguarlo: ");
		int num = sc.nextInt();
		
		System.out.print("\nEl número " + num + " es ");
		
		if(num==0){					// Identificamos al 0 como distinto a todos los demás
			System.out.println("0, por lo que no es ni par ni impar ni múlttiplo de 5 o no múltiplo de 5.");
		} else{					
			if(num%2==0){					// Clasificamos el número según si es par (divisible entre 2) o impar (no divisible entre 2).
				System.out.print("par ");
			} else{
				System.out.print("impar ");
			}
			
			 System.out.print("y ");
			 
			if(num%5!=0){					// Clasificamos el número según si es múltiplo de 5 (divisible entre ) o no múltplo de 5 (no divisible entre 5).
				System.out.print("no ");
			}
			
			System.out.println("es divisible entre 5.");
		}
	}
}
