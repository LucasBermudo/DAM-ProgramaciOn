import java.util.Scanner;

/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios.
 * El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias
 * del primer valor por el segundo en la lista generada anteriormente.
 * 
 * @author Lucas Bermudo Junco
 */

public class CambioOcurrencias{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int i = 0, numQuitado, numPuesto;
		
		System.out.println("Los números del array son los siguientes:\n");
		
		for(int n : num){
			num[i] = (int)(Math.random()*21);					// Generamos todos los números del array de forma aleatoria entre 0 y 100.
			
			if(i<=(99-2)){
				System.out.print(num[i] + ", ");
			} else if(i<=(99-1)){
				System.out.print(num[i] + " y ");
			} else{
				System.out.print(num[i]);
			}
			
			i++;
		}
		
		System.out.println("\n\n¿Qué número quieres sustituir con qué otro número?");
		System.out.print("Introduce el número que quieres sustituir: ");
		numQuitado = sc.nextInt();
		
		while(numQuitado<0 || numQuitado>20){					// Obligamos a introducir un número que esté en la lista.
			System.out.println("\nLo sentimos, pero el número que has introducido, el " + numQuitado + ", no está en la lista. " +
																"Por favor, vuelve a introducir el número a continuación asegurándote que esté en la lista, muchas gracias.");
			System.out.print("Introduce el número que quieres sustituir: ");
			numQuitado = sc.nextInt();
		}
		
		System.out.print("Introduce el número que quieres poner en su lugar: ");
		numPuesto = sc.nextInt();
		
		System.out.println("\nLos números del array con el número " + numQuitado + " sustituido por el " + numPuesto + " son los siguientes:");
		
		i = 0;
		
		for(int n : num){
			if(num[i]==numQuitado){					// Cambiamos todos los números que se van a quitar por el número que se va a poner.
				num[i] = numPuesto;
			}
			
			if(i<=(99-2)){
				System.out.print(num[i] + ", ");
			} else if(i<=(99-1)){
				System.out.print(num[i] + " y ");
			} else{
				System.out.print(num[i]);
			}
			
			i++;
		}
	}
}








