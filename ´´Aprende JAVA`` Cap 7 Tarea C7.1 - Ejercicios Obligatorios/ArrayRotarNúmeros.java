import java.util.Scanner;

/**
 * Escribir un programa que lea 15 números por teclado y que los almacene en un array. Rotar los elementos de ese array 1 posición hacia delante.
 * Finalmente, mostrar el contenido del array.
 * 
 * @author Lucas Bermudo Junco
 */

public class ArrayRotarNúmeros{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		double[] num = new double[15];					// Creamos un array de tipo double de 15 elementos.
		double aux;					// Creamos la variable auxiliar para almacenar los números y poderlos manipular de manera independiente del array.
		int i;
		
		System.out.println("A continuación, introduce 15 números.\n");
		
		for(i=0; i<15; i++){
			System.out.print((i+1) + "º número: ");					// Guardamos los valores introducidos en la variable auxiliar.
			aux = sc.nextDouble();
			if(i<(15-1)){					// Copiamos la variable auxiliar en el siguiente elemento del array, excepto cuando ya lleguemos al último elemento.
				num[(i+1)] = aux;
			} else{					// Copiamos la variable auxiliar en el primer elemento del array.
				num[0] = aux;
			}
		}
		
		System.out.println("\nLos números de la lista son:");
		
		i = 0;
		
		for(double n : num){
			System.out.println((i+1) + "º número: " + n);
			i++;
		}
	}
}
