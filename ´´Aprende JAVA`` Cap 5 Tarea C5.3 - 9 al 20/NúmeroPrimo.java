import java.util.Scanner;

/**
 * 
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmeroPrimo{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número que desee saber si es primo o no: ");
		int num = sc.nextInt();
		
		double mitadNum = num/2, cantNumDiv = 1;
		
		if(num==0 || Math.abs(num)==1){					// Señalamos el 0 y el 1 como casos especiales.
			System.out.println("\nEl número " + num + " no es primo.");
		} else{
			for(int i=1; i<=mitadNum; i++){					// Repetimos la comprobación hasta llegar a la mitad del número.
				if(num%i==0){
					cantNumDiv++;
				}
			}
			
			if(cantNumDiv>=3){
				System.out.println("\nEl número " + num + " no es primo.");
			} else{
				System.out.println("\nEl número " + num + " es primo.");
			}
		}
	}
}
