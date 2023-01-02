import java.util.Scanner;

/**
 * Realizar un programa que diga si un número entero positivo introducido por teclado es capicúa.
 *
 * @autor Lucas Bermudo Junco.
 */

public class NúmeroCapicúo{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int numOrig, numInv = 0, numMani, numAbs, cantCifras, resto;
		
		System.out.print("Por favor, introduzca el número entero del cual desees averiguar si es capicúo o no: ");
		numOrig = sc.nextInt();
		
		numMani = numOrig;					// Guardamos el número original en otra variable para no perderlo.
		numAbs = Math.abs(numOrig);					// Convertimos el número en positivo para poder calcular la cantidad de cifras.
		cantCifras = (int)Math.log10(numAbs)+1;					// Calculamos la cantidad de cifras del número.
		
		if(cantCifras<=5){					// Obtenemos la última cifra y la movemos a la izquierda tantas veces como sea necesario.
			if(cantCifras==5){				
				resto = numMani%10;					//Averiguamos la última cifra del número y la movemos a la izquierda para dejar hueco a la siguiente cifra.
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
			} else if(cantCifras==4){
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
			} else if(cantCifras==3){
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
			} else if(cantCifras==2){
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
				
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
			} else{
				resto = numMani%10;
				numInv = numInv*10+resto;
				numMani/=10;
			}
			
			if(numOrig==numInv){					// Comparamos el número original con su número al revés para averiguar si es capicúo o no.
				System.out.println("\nEl número " + numOrig + " es capicúo.");
			} else{
				System.out.println("\nEl número " + numOrig + " no es capicúo.");
			}
		} else{
			System.out.println("\nLo sentimos, pero el número tiene que tener como máximo 5 dígitos.");
			System.out.println("Si quieres volver a intentarlo, por favor reinicia el programa e introduce un número que tenga como máximo 5 dígitos, muchas gracias.");
		}
	}
}
