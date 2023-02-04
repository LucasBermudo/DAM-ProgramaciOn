import java.util.Scanner;
import misFunciones.*;

/**
 * Escribir un programa que pida dos números reales por teclado y muestre por pantalla el resultado de multiplicarlos.
 * Implementar y utilizar la función:
 * double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_1Multiplicación{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Introduzca, separados por un espacio, los 2 números que usted quiera que se multipliquen: ");
		double primNum = sc.nextDouble();
		double segNum = sc.nextDouble();
		
		System.out.println("\nEl resultado de multiplicar " + primNum + " por " + segNum + " es " + Varias.multiplica(primNum, segNum));
	}
}
