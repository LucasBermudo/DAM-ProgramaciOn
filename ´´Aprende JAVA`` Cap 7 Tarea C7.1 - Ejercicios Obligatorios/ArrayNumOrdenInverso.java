import java.util.Scanner;

/**
 * Escribir un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir,
 * el primero que se introduce es el último en mostrarse y viceversa.
 * 
 * @author Lucas Bermudo Junco
 */

public class ArrayNumOrdenInverso{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int i = 0;
		
		System.out.println("\nA continuación, por favor introduce cada uno de los números enteros del array.\n");
		
		for(int n : num){					// Usamos un bucle para introducir cada uno de los elementos del array.
			System.out.print((i+1) + "º número: ");
			num[i] = sc.nextInt();
			i++;
		}
		
		System.out.println("\nLos números del array se mostrarán a continuación en orden inverso:\n");
		
		for(i=9; i>=0; i--){					// Usamos un bucle para mostrar todos los elementos del array en orden inverso.
			System.out.println((i+1) + "º número: " + num[i]);
		}
	}
}
