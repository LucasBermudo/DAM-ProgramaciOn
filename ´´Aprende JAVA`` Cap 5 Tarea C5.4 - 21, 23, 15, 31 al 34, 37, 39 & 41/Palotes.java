import java.util.Scanner;

/**
 * Realizar un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Palotes{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		long num, numInv = 0, resto;
		int i;
		String palote = "|", separ = "-";
		
		System.out.print("Por favor, introduce el número que quieras convertir al sistema de palotes (que no sea divisible entre 10, es decir, que no acabe en 0): ");
		num = sc.nextLong();
		
		while(num%10==0 && num!=0){					// Establecemos que no se puedan escoger los números acabados en 0 debido al método usado, en el que, al invertir el número, se eliminan los ceros a la izquierda
			System.out.println("\nLo sentimos, pero el número no puede ser divisible entre 10, es decir, no puede acabar en 0): ");
			System.out.print("Por favor, introduce el número que quieras convertir al sistema de palotes (que no sea divisible entre 10, es decir, que no acabe en 0): ");
			num = sc.nextLong();
		}
		
		System.out.print("\nEl " + num + " en decimal es el ");
		
		while(num>0){								// Invertimos el número para poder luego invertirlo de nuevo y extraer uno por uno las cifras en el orden original
			resto = num%10;							// Extraemos la última cifra
			numInv = numInv*10+resto;					// Desplazamos las cifras anteriores a la izquierda y añadimos la siguiente cifra a la derecha
			num/=10;							// Eliminamos la útlima cifra usada para poder acceder a la siguiente después
		}
		
		while(numInv>0){					// Volvemos a invertir el número para extraer uno por uno las cifras en el orden original
			resto = numInv%10;
			
			for(i=1; i<=resto; i++){					// Dibujamos tantos palotes como grande sea la cifra
				System.out.print(palote);
			}
			
			if((Math.log10(numInv))>1){					//Dibujamos un guión después de todas las cifras excepto después de la última
				System.out.print(separ);
			}
			
			numInv/=10;
		}
		
		System.out.print(" en el sistema de palotes.");
	}
}
