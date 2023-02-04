import java.util.Scanner;
import misFunciones.*;

/**
 * Implementar las siguientes funciones:
 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
 * 7. volteaArrayInt: Le da la vuelta a un array.
 * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
 * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_20al28{
	
	// Programa principal ////////////////////
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el tamaño del array que se va a crear: ");
		int tam = sc.nextInt();
		
		while(tam<1){					// Impedimos introducir un tamaño para el array menor que 1.
			System.out.println("\nLo sentimos, pero el tamaño del array tiene que ser mayor que 0. por favor, vuelva a introducirlo.");
			System.out.print("Introduzca el tamaño del array que se va a crear: ");
			tam = sc.nextInt();
		}
		
		System.out.print("Ahora introduzca, separados por un espacio, el mínimo y el máximo de los números que se van a generar aleatoriamente en el array: ");
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		while(min>=max){					// Impedimos introducir un mínimo que sea igual o mayor que el máximo.
			System.out.println("\nLo sentimos, pero el mínimo tiene que ser menor que el máximo. Por favor, vuelva a introducirlos.");
			System.out.print("Introduzca, separados por un espacio, el mínimo y el máximo de los números que se van a generar aleatoriamente en el array: ");
			min = sc.nextInt();
			max = sc.nextInt();
		}
		
		int[] num = FunciArrays.generaArrayInt(tam, min, max);					// Llamamos a la funcion ´´generaArrayInt`` para que genere el array con los valores que introducimos en ella.
		System.out.println("\nEl array generado de " + tam + " números enteros aleatorios que van desde el " + min + " hasta el " + max + " ambos incluidos es el siguiente:");
		
		for(int i=0; i<num.length; i++){					// Mostramos el array generado en la anterior función.
			System.out.print(num[i] + "  ");
		}
		
		// Mostramos información variada sobre el array.
		
		System.out.println("\n\nEl número mínimo del array es el " + FunciArrays.minimoArrayInt(num) + ".");
		
		System.out.println("\nEl número máximo del array es el " + FunciArrays.maximoArrayInt(num) + ".");
		
		System.out.printf("\nLa media de los números del array es %.2f.\n", FunciArrays.mediaArrayInt(num));
		
		System.out.print("\nIntroduzca el número del cual quiera saber si se encuentra o no dentro del array: ");
		int numBuscado = sc.nextInt();
		
		if(FunciArrays.estaEnArrayInt(num, numBuscado)){					// En función de si la función ´´estaEnArrayInt`` devuelva true o false, mostramos el mensaje correspondiente.
			System.out.println("\nEl número " + numBuscado + " sí se encuentra dentro del array.");
		} else{
			System.out.println("\nEl número " + numBuscado + " no se encuentra dentro del array.");
		}
		
		System.out.print("\nIntroduzca el número del cual quiera saber su posición dentro del array: ");
		int numPos = sc.nextInt();
		
		if(FunciArrays.posicionEnArray(num, numPos)!=-1){					// En función de si la función ´´posicionEnArray`` devuelva true o false, mostramos el mensaje correspondiente.
			System.out.println("\nEl número " + numPos + " se encuentra en la posición " + FunciArrays.posicionEnArray(num, numPos) + " del array.");
		} else{
			System.out.println("\nEl número " + numPos + " no se encuentra dentro del array, por lo que no ocupa ninguna posición dentro del mismo.");
		}
		
		System.out.println("\nEl array original, volteado, queda de la siguiente forma:");
		
		int[] numVolteado = new int[tam];					// Creamos un array vacío con el mismo tamaño que el array que queremos voltear.
		FunciArrays.volteaArrayInt(num, numVolteado);					// Ejecutamos la función ´´volteaArrayInt`` introduciendo el array original y el array que queremos rellenar con los valores volteados del array original.
		for(int i=0; i<num.length; i++){
			System.out.print(numVolteado[i] + "  ");
		}
		
		int[] numCopiado = new int[tam];					// Creamos un array vacío con el mismo tamaño que el array que queremos copiar.
		int j = 0;
		for(int i=0; i<num.length; i++){					// Hacemos las copias necesarias del array original para poder manipularlo las veces que queramos.
			numCopiado[j] = num[i];
			
			j++;
		}
		
		System.out.print("\n\nIntroduzca la cantidad de veces que usted quiera rotar el array original hacia la derecha: ");
		int cantRotarDerecha = sc.nextInt();
		
		while(cantRotarDerecha<0){					// Impedimos introducir un número negativo de veces para rotar el array.
			System.out.println("\nLo sentimos, pero el array no puede rotar un número negativo de veces. Por favor, vuelva a introducirlo.");
			System.out.print("Introduzca la cantidad de veces que usted quiera rotar el array original hacia la derecha: ");
			cantRotarDerecha = sc.nextInt();
		}
		
		FunciArrays.rotaDerechaArrayInt(num, cantRotarDerecha);					// Ejecutamos la función ´´rotaDerechaArrayInt`` introduciendo el array original y la cantidad de veces que queremos rotarlo hacia la derecha.
		System.out.println("\nEl array original rotado " + cantRotarDerecha + " posiciones a la derecha queda así:");
		for(int i=0; i<num.length; i++){					// Moostramos el array rotado.
			System.out.print(num[i] + "  ");
		}
		
		System.out.print("\n\nIntroduzca la cantidad de veces que usted quiera rotar el array original hacia la izquierda: ");
		int cantRotarIzquierda = sc.nextInt();
		
		while(cantRotarIzquierda<0){					// Impedimos introducir un número negativo de veces para rotar el array.
			System.out.println("\nLo sentimos, pero el array no puede rotar un número negativo de veces. Por favor, vuelva a introducirlo.");
			System.out.print("Introduzca la cantidad de veces que usted quiera rotar el array original hacia la izquierda: ");
			cantRotarIzquierda = sc.nextInt();
		}
		
		FunciArrays.rotaIzquierdaArrayInt(numCopiado, cantRotarIzquierda);					// Ejecutamos la función ´´rotaIzquierdaArrayInt`` introduciendo el array original y la cantidad de veces que queremos rotarlo hacia la izquierda.
		System.out.println("\nEl array original rotado " + cantRotarIzquierda + " posiciones a la izquierda queda así:");
		for(int i=0; i<numCopiado.length; i++){					// Moostramos el array rotado.
			System.out.print(numCopiado[i] + "  ");
		}
	}
}
