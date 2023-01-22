/**
 * Definir tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
 * 
 * @author Lucas Bermudo Junco
 */

public class ArrayNumeroCuadradoCubo{
	public static void main(String args[]){
	
		int[] numero = new int[20], cuadrado = new int[20], cubo = new int[20];
		int i = 0;
		
		System.out.println("A continuación, introduce cada uno de los 20 números de tu lista:\n");
		
		for(i=0; i<20; i++){
			numero[i] = (int)(Math.random()*101);					// Introducimos de forma aleatoria entre 0 y 100 cada uno de los valores del 1º array.
			
			cuadrado[i] = (int)(Math.pow((numero[i]),2));					// Obtenemos el 2º array calculando el cuadrado de cada uno de los elementos del 1º array.
			cubo[i] = (int)(Math.pow((numero[i]),3));					// Obtenemos el 3º array calculando el cubo de cada uno de los elementos del 1º array.
		}
		
		System.out.println("\nLos números con sus respectivos cuadrados y cubos son:\n");
		
		for(i=0; i<20; i++){					// Mostramos los elementos de los 3 arrays en 3 columnas diferentes.
			System.out.println((i+1) + "º número: " + numero[i] + "     \t   cuadrado: " + cuadrado[i] + "  \t   cubo: " + cubo[i]);
		}
	}
}
