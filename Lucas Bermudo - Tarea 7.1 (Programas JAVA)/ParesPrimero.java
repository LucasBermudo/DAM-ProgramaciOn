/**
 * Escribir un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
 * El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes.
 * 
 * @author Lucas Bermudo Junco
 */

public class ParesPrimero{
	public static void main(String args[]){
	
		int[] num = new int[20], numImpar = new int[20], numPar = new int[20], numOrd = new int[20];					// Creamos todos los arrays que vayamos a necesitar.
		int i = 0, j, cantImpar = 0, cantPar = 0;
		
		for(int n: num){
			num[i] = (int)(Math.random()*101);					// Vamos creando números al azar entre 0 y 100.
			
			if(num[i]%2!=0){					// Almacenamos los números impares en el array de los impares y vamos contando cuántos impares hay, y hacemos lo mismo con los pares.
				numImpar[cantImpar] = num[i];
				cantImpar++;
			} else{
				numPar[cantPar] = num[i];
				cantPar++;
			}
			
			i++;
		}
		
		i = 0;
		
		// Creamos el array final asignándole primero los números pares que están guardados en el array de los pares y asignándole después los impares.
		
		for(j=0; j<cantPar; j++){
			numOrd[i] = numPar[j];
			
			i++;
		}
		
		for(j=0; j<cantImpar; j++){
			numOrd[i] = numImpar[j];
			
			i++;
		}
		
		i = 0;
		
		System.out.println("El array creado de forma aleatoria queda ordenado con los números pares primero y los impares después:");
		
		for(int n : numOrd){
			if(i<(20-2)){
				System.out.print(numOrd[i] + ", ");
			} else if(i<(20-1)){
				System.out.print(numOrd[i] + " y ");
			} else{
				System.out.print(numOrd[i]);
			}
			
			i++;
		}
	}
}
