package misFunciones;

/**
 * Funciones de arrays.
 * 
 * @author Lucas Bermudo Junco
 */

public class FunciArrays{
	
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
		
		for(int i=0; i<n; i++){					// Recorremos el array y le vamos asignando aleatoriamente valores que estén entre el min y el max ambos incluidos.
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
			if(i==0){					// El primer número lo almacenamos como mínimo, y a partir de é, vamos comparando el siguiente.
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
		
		for(int i=0; i<num.length; i++){					// El primer número lo almacenamos como máximo, y a partir de é, vamos comparando el siguiente.
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
			sumaDelArray+=(double)(num[i]);					// Vamos sumando todos los elementos del array.
		}
		
		mediaDelArray = sumaDelArray/num.length;					// Divimos la suma entre la cantidad de números del array.
		
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
			if(numBuscado==num[i]){					// En cuanto encontremos (si es que encontramos) el número buscado, devolvemos ´´true``.
				return true;
			}
		}
		
		return false;					// Si no hemos encontrado el número que buscábamos, devolvemos ´´false``.
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
			if(numPos==num[i]){					// En cuanto encontremos (si es que encontramos) el número buscado, devolvemos ´la posición que ocupa en el array.
				return i;
			}
		}
		
		return -1;					// Si no hemos encontrado el número que buscábamos, devolvemos ´´-1``.
	}
	
	/**
	 * Le da la vuelta a un array.
	 * 
	 * @param num[] un array de números enteros.
	 * @param numVolteado[] un array de números enteros.
	 * @return numVolteado[] el array num[] voteado.
	 */
	 
	public static void volteaArrayInt(int[] num, int[] numVolteado){
		
		int j = num.length-1;					// Empezamos el contador al final del array que queremos voltear.
		
		for(int i=0; i<num.length; i++){					// Vamos situando cada valor del array original en la posición inversa del array volteado.
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
		
		for(int i=1; i<=cantRotarDerecha; i++){					// Repetimos la rotación la cantidad de veces establecida.
			ultNum = num[num.length-1];					// Guardamos el último valor del array para no perderlo.
			
			for(int j=num.length-1; j>0; j--){					// Desplazamos los números del array 1 posición a la derecha.
				num[j] = num[j-1];
			}
			
			num[0] = ultNum;					// Por último, asignamos al primer número del array el valor que tenía antes el último número.
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
		
		for(int i=1; i<=cantRotarIzquierda; i++){					// Repetimos la rotación la cantidad de veces establecida.
			primerNum = numCopiado[0];					// Guardamos el primer valor del array para no perderlo.
			
			for(int j=0; j<numCopiado.length-1; j++){					// Desplazamos los números del array 1 posición a la derecha.
				numCopiado[j] = numCopiado[j+1];
			}
			
			numCopiado[numCopiado.length-1] = primerNum;									// Por último, asignamos al último número del array el valor que tenía antes el primer número.	
		}
		
		return numCopiado;
	}

	/**
	 * Crea un array con los primeros 100 números naturales
	 * 
	 * @param vacío.
	 * @return int[] un array de números enteros.
	 */
	
	public static int[] arrayNumerosNaturales(){
		
		int tam = 100;
		int[] num = new int[tam];
		
		for(int i=0; i<100; i++){					// Vamos asignando a todos los elementos del array un número mayor que el anterior.
			num[i] = i+1;
		}
		
		return num;
	}

	/**
	 *  Devuelve la suma de todos los elementos del array que se pasa como parámetro.
	 * 
	 * @param num[] un array de números enteros.
	 * @return suma la suma de todos los elementos de num[].
	 */
	
	public static int sumaDelArray(int[] num){
	
		int i=0, suma = 0;
		
		for(int n:num){					// Vamos sumando todos los números del array.
			suma+=n;
		} 
		
		return suma;
	}
}
