import misFunciones.*;

/**
 * Escribir un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
 * Luego, mostrar la suma total y la media.
 * Implementar una función que calcule la suma de un array y otra que calcule la media de un array.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_15ArraySumaTotalYMedia{
	public static void main(String args[]){
	
		System.out.println("Los primeros 100 números naturales son: ");
		
		int[] num = FunciArrays.arrayNumerosNaturales();					// Ejecutamos la función ´´arrayNumerosNaturales()`` 
																																									// y asignamos el valor devuelto directamente al array ´´num`` que acabamos de crear.
		
		int i=0;
		
		for(int n:num){					// Mostramos todos los elementos del array mediante un bucle.
			System.out.printf("%-4d", num[i]);
			
			i++;
		}
		
		System.out.println("\n\nLa suma de los 100 primeros números naturales es " + FunciArrays.sumaDelArray(num) + ".");
		
		System.out.println("\nLa media de los 100 primeros números naturales es " + FunciArrays.mediaArrayInt(num) + ".");
	}
}
