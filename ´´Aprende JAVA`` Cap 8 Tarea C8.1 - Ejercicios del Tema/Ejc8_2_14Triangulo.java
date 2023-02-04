import java.util.Scanner;
import misFunciones.*;

/**
 * Escribir una función que muestre por pantalla un triángulo como el del ejemplo.
 * Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_14Triangulo{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de líneas de altura que quiera usted que tenga la pirámide: ");
		int cantLineas = sc.nextInt();
		
		while(cantLineas<=1){					// Impedimos que el usuario introduzca menos de 2 líneas de altura para la pirámide.
			System.out.println("\nLo sentimos, pero la pirámide no puede tener menos de 2 líneas de altura. Por favor, vuelva a introducirlo.");
			System.out.print("Introduzca la cantidad de líneas que quiera usted que tenga la pirámide: ");
			cantLineas = sc.nextInt();
		}
		
		System.out.print("\nIntroduzca el caracter con el que quiera usted que se dibuje la pirámide: ");
		String caracter = sc.next();
		
		while(caracter.length()>1){					// Impedimos que el usuario introduzca más de un caracter.
			System.out.println("\nLo sentimos, pero solo se puede introducir 1 caracter (aunque sea el mismo repetido varias veces). Por favor, vuelva a introducirlo.");
			System.out.print("\nIntroduzca el caracter con el que quiera usted que se dibuje la pirámide: ");
			caracter = sc.next();
		}
		
		System.out.println("\nEl triángulo con " + cantLineas  + " líneas de altura y con el caracter ´´" + caracter + "`` es:\n");
		
		Varias.triangulo(cantLineas, caracter);					//  Ejecutamos esa función, la cual será la encargada de mostrar por pantalla el triángulo.
	}
}
