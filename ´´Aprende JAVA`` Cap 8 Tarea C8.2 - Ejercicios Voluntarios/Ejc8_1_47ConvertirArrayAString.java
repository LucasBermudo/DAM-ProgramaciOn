import java.util.Scanner;
import misFunciones.*;

/**
 * Definir la función convierteArrayEnString con la siguiente cabecera:
 * public static String convierteArrayEnString(int[] a)
 * Esta función toma como parámetro un array que contiene números y
 * devuelve una cadena de caracteres con esos números.
 * Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”;
 * si a = { 8 }, convierteArrayEnString(a) devuelve “8”;
 * si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve “62501”.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_47ConvertirArrayAString{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el tamaño del array que usted quiera convertir en un solo número: ");
		int tam = sc.nextInt();
		
		while(tam<=0){					// Impedimos al usuario introducir un tamaño del array menor o igual que 0.
			System.out.println("\nLo sentimos, pero el tamaño del array no puede ser menor o igual que 0. Por favor, vuelva a introducirlo.");
			System.out.print("Introduzca el tamaño del array que usted quiera convertir en un solo número: ");
			tam = sc.nextInt();
		}
		
		System.out.println("\nA continuación, vaya introduciendo los números del array:");
		
		int[] array = FunciArrays.introduceArrayInt(tam);					// Ejecutamos esta función, que será la encargada de pedirnos los números y guardarlos en un array, y la copiamos en este programa.
		
		System.out.println("\nEl array introducido, convertido en un solo número, es: " + FunciArrays.convierteArrayEnString(array));
	}
}
