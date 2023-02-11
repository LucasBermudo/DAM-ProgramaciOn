import java.util.Scanner;
import misFunciones.*;

/**
 * Crea una función con la siguiente cabecera:
 * public String convierteEnPalabras(int n)
 * Esta función convierte los dígitos del número n en las correspondientes palabras y
 * lo devuelve todo en una cadena de caracteres.
 * Por ejemplo, el 470213 convertido a palabras sería: cuatro, siete, cero, dos, uno, tres.
 * Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.
 * Fíjate que hay una coma detrás de cada palabra salvo al final.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_39ConversorDecimalAPalabras{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número que quiera convertir a palabras: ");
		int num = sc.nextInt();
		
		System.out.println("\nEl número " + num + " escrito con palabras es: " + Varias.convierteEnPalabras(num) + ".");
	}
}
