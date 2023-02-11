import java.util.Scanner;
import misFunciones.*;

/**
 * Crea una función con la siguiente cabecera:
 * public static String convierteEnPalotes(int n)
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de caracteres.
 * Por ejemplo, el 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes.
 * Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_35ConversorDecimalAPalotes{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Introduzca el número entero que quiera convertir a palotes: ");
		int num = sc.nextInt();
		
		System.out.println("\nEl número " + num + " convertido a palotes es: " + Varias.convierteEnPalotes(num));
	}
}
