import java.util.Scanner;
import misFunciones.*;

/**
 * Crea una función con la siguiente cabecera:
 * public String convierteEnMorse(int n)
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse.
 * Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
 * desde el programa principal.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_37ConversorDecimalAMorse{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Introduzca el número que quiera convertir a Morse: ");
		int num = sc.nextInt();
		
		System.out.println("\nEl número " + num + " escrito en Morse es: " + Varias.convierteEnMorse(num));
	}
}
