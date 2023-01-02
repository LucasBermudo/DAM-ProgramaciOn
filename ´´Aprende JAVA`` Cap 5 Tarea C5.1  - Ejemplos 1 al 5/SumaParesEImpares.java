/**
 * Diseñar un programa que calcule y muestre por pantalla, independientemente, la suma de los números pares
 * y la suma de impares de los números comprendidos entre 100 y 200.
 * 
 * @autor Lucas Bermudo Junco
 */

public class SumaParesEImpares{
	public static void main(String args[]){
	
		int resuSumaPar = 0, resuSumaImpar = 0;
		
		for(int i=100; i<=200; i+=1){
			if(i%2==0){					// Separamos los números pares de los impares para sumarlos por separado.
				resuSumaPar += i;
			} else{
				resuSumaImpar += i;
			}
		}
		
		System.out.println("La suma de los números pares entre 100 y 200 es: " + resuSumaPar);		
		System.out.println("La suma de los números impares entre 100 y 200 es: " + resuSumaImpar);
	}
}
