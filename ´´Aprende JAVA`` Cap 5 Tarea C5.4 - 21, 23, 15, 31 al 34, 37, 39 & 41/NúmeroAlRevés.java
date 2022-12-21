import java.util.Scanner;

/**
 * Realizar un programa que pida un número por teclado y que luego muestre ese número al revés.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmeroAlRevés{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int numOrig, numInv = 0, numMani, resto;
		
		System.out.print("Por favor, introduce el número que quieras que se muestre al revés: ");
		numOrig = sc.nextInt();
		numMani = numOrig;					// Copiamos el número para no perderlo y así poderlo usar luego
		
		while(numMani>0){
			resto = numMani%10;										// Extraemos la última cifra
			numInv = numInv*10+resto;					// Desplazamos las cifras anteriores a la izquierda y extraemos la siguiente cifra, añadiéndola a la derecha
			numMani/=10;															// Eliminamos la útlima cifra usada para poder acceder a la siguiente
		}
		
		System.out.println("\nEl número " + numOrig + " al revés es " + numInv);
	}
}
