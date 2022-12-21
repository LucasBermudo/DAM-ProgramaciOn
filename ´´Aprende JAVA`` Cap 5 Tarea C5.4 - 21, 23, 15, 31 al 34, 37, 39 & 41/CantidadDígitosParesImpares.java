import java.util.Scanner;

/**
 * Escribir un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número.
 * 
 * @autor Lucas Bermudo Junco
 */

public class CantidadDígitosParesImpares{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		long numMani, numOrig, resto;
		int cantPar = 0, cantImpar = 0;
		
		System.out.print("Por favor, introduzca un número entero positivo: ");
		numMani = sc.nextLong();
		
		while(numMani<=0){
			System.out.println("\nLo sentimos, pero el número tiene que ser un número entero positivo.");
			System.out.print("Por favor, introduzca un número entero positivo: ");
			numMani = sc.nextLong();
		}
		
		numOrig = numMani;
		
		while(numMani>0){
			resto = numMani%10;					// Extraemos la última cifra
			numMani/=10;										// Eliminamos la útlima cifra usada para poder acceder a la siguiente
			
			if(resto%2==0 && resto!=0){					// Separamos las cifras pares de las cifras impares
				cantPar++;
			} else if(resto!=0){
				cantImpar++;
			}
		}
		
		System.out.println("\nEl " + numOrig + " contiene " + cantPar + " dígitos pares y " + cantImpar + " dígitos impares.");
	}
}
