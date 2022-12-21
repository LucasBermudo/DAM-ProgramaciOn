import java.util.Scanner;

/**
 * Escribir un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares.
 * Los dígitos pares se deben mostrar en orden, de izquierda a derecha.
 * 
 * @autor Lucas Bermudo Junco
 */

public class DígitosPares{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		long numOrig, numMani, numInv1 = 0, numInv2 = 0;
		int resto1, resto2, suma = 0;
		
		System.out.print("Por favor, introduzca un número entero positivo: ");
		numOrig = sc.nextLong();
		
		while(numOrig<=0){
			System.out.println("\nLo sentimos, pero el número que has introducido (" + numOrig + ") es negativo ó 0.");
			System.out.print("Por favor, introduzca un número entero positivo: ");
			numOrig = sc.nextLong();
		}
		
		numMani = numOrig;					// Copiamos el número para no perderlo y así poderlo usar luego
		
		System.out.print("\nLos dígitos pares del número " + numOrig + " son: ");
		
		while(numMani>0){							// Invertimos el número para poder luego invertirlo de nuevo y extraer uno por uno las cifras en el orden original
			resto1 = (int)numMani%10;					// Extraemos la última cifra
			numMani/=10;							// Eliminamos la útlima cifra usada para poder acceder a la siguiente después
			
			if(resto1%2==0 && resto1!=0){						// Escogemos las cifras pares
				numInv1 = numInv1*10+resto1;					// Desplazamos las cifras anteriores a la izquierda y añadimos la siguiente cifra, a la derecha
				suma+=resto1;
			}
		}
		
		while(numInv1>0){					// Volvemos a invertir el número para extraer uno por uno las cifras en el orden original
			resto2 = (int)numInv1%10;
			numInv2 = numInv2*10+resto2;
			numInv1/=10;
					
			System.out.print(resto2 + " ");
		}
		
		System.out.println("\nLa suma de los dígitos pares es: " + suma);
	}
}
