import java.util.Scanner;

/**
 * Escribir un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000.
 * Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los números introducidos y la media.
 * 
 * @autor Lucas Bermudo Junco
 */

public class SumaNúmeros{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		double num = 0, suma = 0, media;
		int cantiNum = 0;
		
		System.out.print("Por favor, introduce números hasta que su suma supere 10000, momento en el que este programa dejará de pedir números. ");
		System.out.println("El último número introducido no contará en el recuento, ya que es el número que habrá provocado que la suma supere 10000.\n");
		
		for(int i=1; suma<=10000; i++){
			System.out.print(i + "º número: ");
			num = sc.nextDouble();
			
			suma+=num;
			cantiNum++;
		}
		
		suma-=num;					// Extraemos de la suma el número que ha provocado que la suma supere 10000
		cantiNum--;					// Extraemos del contador el número que ha provocado que la suma supere 10000
		media = suma/(int)cantiNum;
		
		System.out.printf("\nEl total acumulado es %.2f", suma);
		System.out.println("\nLa cantidad de números introducidos es " + cantiNum);
		System.out.printf("La media de los números introducidos es %.2f", media);
	}
}
