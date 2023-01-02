import java.util.Scanner;

/**
 * Escribir un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class CuadradoYCubo{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int i, j;
		double numAct = 0, cuadrado = 0, cubo = 0 ;
		
		for(i=1; i<=5; i++){					// Establecemos la cantidad de veces que se repetirá el cálculo.
			System.out.print("Introduce el " + i + "º número: ");
			numAct = sc.nextDouble();
			System.out.println();
			
			cuadrado = Math.pow(numAct,2);
			cubo = Math.pow(numAct,3);
			
			System.out.printf("%-10s %-10s %-10s\n\n", "Número", "Cuadrado", "Cubo");
			System.out.printf("%-10s %-10s %-10s\n\n", numAct, cuadrado, cubo);
		}
	}
}
