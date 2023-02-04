import java.util.Scanner;
import misFunciones.*;

/**
 * Escribir un programa que pida un valor N entero y luego muestre:
 * el sumatorio desde 1 a N, el factorial de 1 a N y el valor intermedio entre 1 y N.
 * Implementar y utilizar las funciones:
 * int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
 * int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
 * double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_8SumatorioFactorialIntermedio{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Intoduzca el número positivo de cual desee saber su sumatorio desde 1 a él mismo, su factorial y su valor intermedio desde 1 a él mismo: ");
		int num = sc.nextInt();
		
		while(num<1){					// Impedimos al usuario introducir un número menor o igual a 0.
			System.out.println("\nLo sentimos, pero el número tiene que ser positivo. Por favor, vuelva a introducirlo.");
			System.out.print("Intoduzca el número positivo de cual desee saber su sumatorio desde 1 a él mismo, su factorial y su valor intermedio desde 1 a él mismo: ");
			num = sc.nextInt();
		}
		
		System.out.println("\nEl sumatorio desde 1 hasta " + num + " es " + Varias.suma1aN(num) + ".");
		
		System.out.println("\nEl factorial de " + num + " es " + Varias.producto1aN(num) + ".");
		
		System.out.println("\nEl valor intermedio de la suma desde 1 a " + num + " es " + Varias.intermedio1aN(num) + ".");
	}
}
