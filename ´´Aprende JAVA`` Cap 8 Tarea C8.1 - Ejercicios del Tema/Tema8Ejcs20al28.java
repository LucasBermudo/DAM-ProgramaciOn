import java.util.Scanner;

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

public class Tema8Ejcs20al28{
	
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
		
		int[] num = generaArrayInt(tam, min, max);					// Llamamos a la funcion ´´generaArrayInt`` para que genere el array con los valores que introducimos en ella.
		System.out.println("\nEl array generado de " + tam + " números enteros aleatorios que van desde el " + min + " hasta el " + max + " ambos incluidos es el siguiente:");
		
		for(int i=0; i<num.length; i++){					// Mostramos el array generado en la anterior función.
			System.out.print(num[i] + "  ");
		}
		
		// Mostramos información variada sobre el array.
		
		System.out.println("\n\nEl número mínimo del array es el " + minimoArrayInt(num) + ".");
		
		System.out.println("\nEl número máximo del array es el " + maximoArrayInt(num) + ".");
		
		System.out.printf("\nLa media de los números del array es %.2f.\n", mediaArrayInt(num));
		
		System.out.print("\nIntroduzca el número del cual quiera saber si se encuentra o no dentro del array: ");
		int numBuscado = sc.nextInt();
		
		if(estaEnArrayInt(num, numBuscado)){					// En función de si la función ´´estaEnArrayInt`` devuelva true o false, mostramos el mensaje correspondiente.
			System.out.println("\nEl número " + numBuscado + " sí se encuentra dentro del array.");
		} else{
			System.out.println("\nEl número " + numBuscado + " no se encuentra dentro del array.");
		}
		
		System.out.print("\nIntroduzca el número del cual quiera saber su posición dentro del array: ");
		int numPos = sc.nextInt();
		
		if(posicionEnArray(num, numPos)!=-1){					// En función de si la función ´´posicionEnArray`` devuelva true o false, mostramos el mensaje correspondiente.
			System.out.println("\nEl número " + numPos + " se encuentra en la posición " + posicionEnArray(num, numPos) + " del array.");
		} else{
			System.out.println("\nEl número " + numPos + " no se encuentra dentro del array, por lo que no ocupa ninguna posición dentro del mismo.");
		}
		
		System.out.println("\nEl array original, volteado, queda de la siguiente forma:");
		
		int[] numVolteado = new int[tam];					// Creamos un array vacío con el mismo tamaño que el array que queremos voltear.
		volteaArrayInt(num, numVolteado);					// Ejecutamos la función ´´volteaArrayInt`` introduciendo el array original y el array que queremos rellenar con los valores volteados del array original.
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
		
		rotaDerechaArrayInt(num, cantRotarDerecha);					// Ejecutamos la función ´´rotaDerechaArrayInt`` introduciendo el array original y la cantidad de veces que queremos rotarlo hacia la derecha.
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
		
		rotaIzquierdaArrayInt(numCopiado, cantRotarIzquierda);					// Ejecutamos la función ´´rotaIzquierdaArrayInt`` introduciendo el array original y la cantidad de veces que queremos rotarlo hacia la izquierda.
		System.out.println("\nEl array original rotado " + cantRotarIzquierda + " posiciones a la izquierda queda así:");
		for(int i=0; i<numCopiado.length; i++){					// Moostramos el array rotado.
			System.out.print(numCopiado[i] + "  ");
		}
	}
		
	// Funciones //////////////////////////
	
	/**
	 * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
	 * 
	 * @param n un número entero positivo.
	 * @param min un número entero.
	 * @param max un número entero.
	 * @return el array de números enteros aleatorios de tamaño n que van desde el min hasta el max ambos incluidos.
	 */
	 
	 public static int[] generaArrayInt(int n, int min, int max){
		 
		 int[] num = new int[n];
		
		for(int i=0; i<n; i++){
			num[i] = (int)(Math.random()*((max-min)+1)+min);
		}
		
		return num;
	}
	
	/**
	 * Devuelve el mínimo del array que se pasa como parámetro.
	 * 
	 * @param num[] un array de números enteros.
	 * @return el número más pequeño del array num[].
	 */
	 
	public static int minimoArrayInt(int[] num){
		
		int minDelArray = 0;
		
		for(int i=0; i<num.length; i++){
			if(i==0){
				minDelArray = num[i];
			} else{
				if(num[i]<minDelArray){
					minDelArray = num[i];
				}
			}
		}
		
		return minDelArray;
	}
	
	/**
	 * Devuelve el máximo del array que se pasa como parámetro.
	 * 
	 * @param num[] un array de números enteros.
	 * @return el número más grande del array num[].
	 */
	 
	public static int maximoArrayInt(int[] num){
		
		int maxDelArray = 0;
		
		for(int i=0; i<num.length; i++){
			if(i==0){
				maxDelArray = num[i];
			} else{
				if(num[i]>maxDelArray){
					maxDelArray = num[i];
				}
			}
		}
		
		return maxDelArray;
	}
	
	/**
	 * Devuelve la media del array que se pasa como parámetro.
	 * 
	 * @param num[] un array de números enteros.
	 * @return la media del array num[].
	 */
	 
	public static double mediaArrayInt(int[] num){
	
		double sumaDelArray = 0, mediaDelArray = 0;
		
		for(int i=0; i<num.length; i++){
			sumaDelArray+=(double)(num[i]);
		}
		
		mediaDelArray = sumaDelArray/num.length;
		
		return mediaDelArray;
	}
	
	/**
	 * Dice si un número está o no dentro de un array.
	 * 
	 * @param num[] un array de números enteros.
	 * @param numBuscado un número entero.
	 * @return <code>true</code> si numBuscado se encuentra en num[].
	 * @return <code>false</code> si numBuscado no se encuentra en num[].
	 */
	
	public static boolean estaEnArrayInt(int[] num, int numBuscado){
		
		boolean pertenece = false;
		
		for(int i=0; i<num.length; i++){
			if(numBuscado==num[i]){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
	 * 
	 * @param num[] un array de números enteros.
	 * @param numPos un número entero.
	 * @return la posición de numPos dentro de num[] en caso de que se encuentre en él.
	 * @return -1 en caso de que numPos no se encuentre en num[].
	 */
	 
	public static int posicionEnArray(int[] num, int numPos){
	
		for(int i=0; i<num.length; i++){
			if(numPos==num[i]){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Le da la vuelta a un array.
	 * 
	 * @param num[] un array de números enteros.
	 * @param numVolteado[] un array de números enteros.
	 * @return numVolteado[] el array num[] voteado.
	 */
	 
	public static void volteaArrayInt(int[] num, int[] numVolteado){
		
		int j = num.length-1;
		
		for(int i=0; i<num.length; i++){
			numVolteado[j] = num[i];
			
			j--;
		}
	}
	
	/**
	 * Rota posiciones a la derecha los números de un array tantas veces como se introduzca.
	 * 
	 * @param num[] un array de números enteros.
	 * @param cantRotarDerecha un número entero igual o mayor que 0.
	 * @return num[] el array rotado cantRotarDerecha veces a la derecha.
	 */
	 
	public static int[] rotaDerechaArrayInt(int[] num, int cantRotarDerecha){		
		
		int ultNum;
		
		for(int i=1; i<=cantRotarDerecha; i++){
			ultNum = num[num.length-1];
			
			for(int j=num.length-1; j>0; j--){
				num[j] = num[j-1];
			}
			
			num[0] = ultNum;
		}
		
		return num;
	}
	
	/**
	 * Rota posiciones a la izquierda los números de un array tantas veces como se introduzca.
	 * 
	 * @param numCopiado[] un array de números enteros.
	 * @param cantRotarIzquierda un número entero igual o mayor que 0.
	 * @return numCopiado[] el array rotado cantRotarIzquierda veces a la izquierda.
	 */
	 
	public static int[] rotaIzquierdaArrayInt(int[] numCopiado, int cantRotarIzquierda){
		
		int primerNum;
		
		for(int i=1; i<=cantRotarIzquierda; i++){
			primerNum = numCopiado[0];
			
			for(int j=0; j<numCopiado.length-1; j++){
				numCopiado[j] = numCopiado[j+1];
			}
			
			numCopiado[numCopiado.length-1] = primerNum;
		}
		
		return numCopiado;
	}
}
