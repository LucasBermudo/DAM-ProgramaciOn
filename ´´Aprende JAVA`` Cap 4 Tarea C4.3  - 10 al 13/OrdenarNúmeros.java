import java.util.Scanner;

/**
 * Escribir un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class OrdenarNúmeros{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int orden, numUno, numDos, numTres, auxiliar;
		
		System.out.println("Este programa tiene como objetivo ordenar 3 números enteros que sean distintos entre sí.\n");
		
		System.out.println("A continuación, introduce los 3 números enteros que quieras que se ordenen:");
		System.out.print("Primer número: ");
		numUno = sc.nextInt();
		System.out.print("Segundo número: ");
		numDos = sc.nextInt();
		System.out.print("Tercer número: ");
		numTres = sc.nextInt();
		
		if(numUno==numDos || numUno==numTres || numDos==numTres){					// Establecemos que ningún número pueda ser igual a otro.
			System.out.println("\nLo sentimos, pero has introducido al menos 2 números iguales, y este programa no está diseñado para ordenar números que sean iguales.");
			System.out.println("Si deseas realizar de nuevo la tarea, aquí te mostramos los números que has introducido para que puedas detectar el error, muchas gracias.\n");
			System.out.println("Primer número = " + numUno);
			System.out.println("Segundo número = " + numDos);
			System.out.println("Tercer número = " + numTres);
		} else{
			System.out.println("\n¿Cómo quieres que se ordenen los 3 números enteros?");
			System.out.print("Introduce ´´1`` si quieres que se ordenen en orden Ascendente y ´´2`` si quieres que se ordenen en orden Descendente: ");
			orden = sc.nextInt();
		
			if(orden==1){					// Procedemos a ordenar los números usando la variable ´´auxiliar`` para guardar los números.
				if(numUno<numDos && numDos<numTres){
					System.out.println("\nLos números ya han sido introducidos en orden ascendente, por lo que no ha sido necesario ordenarlos.");
				} else{
					System.out.println("\nLos números " + numUno + ", " + numDos + " y " + numTres + " quedan ordenados en orden ascendente de la siguiente forma:");
					if(numUno<numTres && numTres<numDos){
						auxiliar = numTres;
						numTres = numDos;
						numDos = auxiliar;	
					} else if(numDos<numUno && numUno<numTres){
						auxiliar = numDos;
						numDos = numUno;
						numUno = auxiliar;
					} else if(numDos<numTres && numTres<numUno){
						auxiliar = numDos;
						numDos = numUno;
						numUno = auxiliar;
						auxiliar = numTres;
						numTres = numDos;
						numDos = auxiliar;
					} else if(numTres<numUno && numUno<numDos){
						auxiliar = numTres;
						numTres = numDos;
						numDos = auxiliar;
						auxiliar = numDos;
						numDos = numUno;
						numUno = auxiliar;
					} else{
						auxiliar = numTres;
						numTres = numUno;
						numUno = auxiliar;
					}
					System.out.println(numUno + ", " + numDos + " y " + numTres);
				}
			} else if(orden==2){
				if(numUno>numDos && numDos>numTres){
					System.out.println("\nLos números ya han sido introducidos en orden descendente, por lo que no ha sido necesario ordenarlos.");
				} else{
					System.out.println("\nLos números " + numUno + ", " + numDos + " y " + numTres + " quedan ordenados en orden descendente de la siguiente forma:");
					if(numUno>numTres && numTres>numDos){
						auxiliar = numTres;
						numTres = numDos;
						numDos = auxiliar;	
					} else if(numDos>numUno && numUno>numTres){
						auxiliar = numDos;
						numDos = numUno;
						numUno = auxiliar;
					} else if(numDos>numTres && numTres>numUno){
						auxiliar = numDos;
						numDos = numUno;
						numUno = auxiliar;
						auxiliar = numTres;
						numTres = numDos;
						numDos = auxiliar;
					} else if(numTres>numUno && numUno>numDos){
						auxiliar = numTres;
						numTres = numDos;
						numDos = auxiliar;
						auxiliar = numDos;
						numDos = numUno;
						numUno = auxiliar;
					} else{
						auxiliar = numTres;
						numTres = numUno;
						numUno = auxiliar;
					}
					System.out.println(numUno + ", " + numDos + " y " + numTres);					// Mostramos el resultado final de la ordenación.
				}
			} else{
					System.out.println("\nLo sentimos, pero el orden introducido (" + orden + ") no se encuentra dentro de las opciones disponibles.");
					System.out.println("Si quieres volverlo a intentar, por favor comprueba que has introducido bien el orden en el que quieres que se ordenen, muchas gracias.");
			}
		}
	}
}
