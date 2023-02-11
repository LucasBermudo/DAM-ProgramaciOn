import java.util.Scanner;
import misFunciones.*;

/**
 * Crear un programa con la siguiente función:
 * public int[] filtraCon7(int x[]) // Devuelve un array con todos los números que contienen el 7 (por ej. 7, 27, 782)
 * que se encuentren en otro array que se pasa como parámetro. El tamaño del array que se devuelve
 * será menor o igual al que se pasa como parámetro.
 * Utiliza esta función en un programa para comprobar que funcionan bien.
 * Para que el ejercicio resulte más fácil, las repeticiones de números que contienen 7 se conservan,
 * y si no existe ningún número que contiene 7 en el array x, se devuelve un array con el número -1 como único elemento.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_40ArraySoloConNumeros7{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que crea un array con los números introducidos por el usuario y que luego muestra los números introducidos que contienen al menos un 7.\n");
		
		System.out.print("Introduzca el tamaño del array: ");
		int tam = sc.nextInt(); 
		
		while(tam<=0){					// Impedimos al usuario introducir un tamaño del array menor o igual que 0.
			System.out.println("\nLo sentimos, pero el tamaño del array no puede ser menor o igual a 0. Por favor, vuelva a introducirlo.");
			System.out.print("Introduzca el tamaño del array: ");
			tam = sc.nextInt();
		}
		
		System.out.println("\nA continuación, vaya introduciendo todos los números del array.");
		
		int[] array = FunciArrays.introduceArrayInt(tam);					// Ejecutamos esta función, que será la encargada de pedirnos los números e introducirlos en el array.
				
		System.out.print("\nLos números introducidos que contienen al menos un 7 son: ");
		
		int[] arrayCon7 = FunciArrays.filtraCon7(array);					// Ejecutamos la función que crea un array con los números del array original que contienen al menos un 7.
		
		for(int i=0; i<arrayCon7.length; i++){					// Vaamos mostrando todos los elementos del array.
			System.out.print(arrayCon7[i] + " ");
		}
	}
}
