import java.util.Scanner;

/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado, permitiendo elegir al usuario mediante un menú la orientación del vértice de la pirámide.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PirámideOrientada{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String colorDefecto = "\u001B[0m", celeste = "\033[94m", blanco = "\033[37m";
		
		System.out.println("Este programa tiene como objetivo dibujar una pirámide rellena con el carácter y con la orientación que usted desee.");
		System.out.print("Por favor, introduzca el carácter con el que usted desee pintar la pirámide: ");
		char caracter = sc.next().charAt(0);
		System.out.println("\nPor favor, introduzca ahora la orientación con la que usted desee que se muestre la pirámide.");
		System.out.print("Introduzca ´´1`` si desea que la orientación sea para arriba, ´´2`` para abajo, ´´3`` para la izquierda y ´´4`` para la derecha: ");
		int orientación = sc.nextInt();
		System.out.println("");
		
		switch(orientación){					// Dibujamos la pirámide con su orientación elegida.
			case 1:
				System.out.println("    " + celeste + caracter + "    ");
				System.out.println("   " + blanco + caracter + celeste + caracter + blanco  + caracter + "   ");
				System.out.println("  " + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + "  ");
				System.out.println(" " + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + " ");
				System.out.println("" + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + colorDefecto);
				break;
			case 2:
				System.out.println("" + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter);
				System.out.println(" " + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + " ");
				System.out.println("  " + celeste + caracter + blanco  + caracter + celeste + caracter + blanco  + caracter + celeste + caracter + "  ");
				System.out.println("   " + blanco + caracter + celeste + caracter + blanco  + caracter + "   ");
				System.out.println("    " + celeste + caracter + colorDefecto + "    ");
				break;
			case 3:
				System.out.println("      " + celeste + caracter);
				System.out.println("    " + celeste + caracter + blanco + caracter + celeste + caracter);
				System.out.println("  " + celeste + caracter +blanco + caracter + celeste + caracter + blanco + caracter + celeste + caracter);
				System.out.println("" + caracter + blanco + caracter + celeste + caracter + blanco + caracter + celeste + caracter + blanco + caracter + celeste + caracter);
				System.out.println("  " + celeste + caracter +blanco + caracter + celeste + caracter + blanco + caracter + celeste + caracter);
				System.out.println("    " + celeste + caracter + blanco + caracter + celeste + caracter);
				System.out.println("      " + celeste + caracter + colorDefecto);
				break;
			case 4:
				System.out.println(celeste + caracter + "      ");
				System.out.println(celeste + caracter + blanco + caracter + celeste + caracter + "    ");
				System.out.println(celeste + caracter +blanco + caracter + celeste + caracter + blanco + caracter + celeste + caracter + "  ");
				System.out.println(caracter + blanco + caracter + celeste + caracter + blanco + caracter + celeste + caracter + blanco + caracter + celeste + caracter + "");
				System.out.println(celeste + caracter +blanco + caracter + celeste + caracter + blanco + caracter + celeste + caracter + "  ");
				System.out.println(celeste + caracter + blanco + caracter + celeste + caracter + "    ");
				System.out.println(celeste + caracter + colorDefecto + "      ");
				break;
			default:
				System.out.println("Lo sentimos, pero la orientación introducida (" + orientación + ") no se encuentra dentro de las orientaciones disponibles.");
				System.out.println("Si lo desea volver a intentar, por favor asegúrese de introducir una orientación disponible, muchas gracias.");
		}
	}
}
