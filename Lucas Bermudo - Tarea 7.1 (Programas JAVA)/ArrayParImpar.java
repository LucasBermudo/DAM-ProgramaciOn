import java.util.Scanner;

/**
 * Realizar un programa que pida 8 números enteros y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ArrayParImpar{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		int i = 0;
		
		System.out.println("A continuación, introduce 8 números enteros, por favor.\n");
		
		for(int n : num){					// Rellenamos el array de los números.
			System.out.print((i+1) + "º número: ");
			num[i] = sc.nextInt();
			
			i++;
		}
		
		i = 0;
		
		System.out.println("\nA continuación se mostrarán los números y se indicarán si son pares o impares:\n");
		
		for(int n : num){					// Mostramos todos los elementos del array.
			System.out.print(num[i] + ":\t");
			
			if(num[i]%2!=0){					// Indicamos cuáles de los elementos del array son impares y cuáles son pares.
				System.out.println("impar");
			} else{
				System.out.println("par");
			}
			
			i++;
		}
	}
}
