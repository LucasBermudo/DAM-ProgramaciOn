import java.util.Scanner;
import misFunciones.*;

/**
 * Escribir un programa que pase de decimal a binario.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_17ConversorBinarioADecimal{
	public static void main(String args[]){
		
		long numEnBinario = Varias.introducirYComprobarNumeroBinario();					// Ejecutamos esta función, que será la encargada de pedirnos el número en binario
																																																							// y de comprobar si lo hemos introducido correctamente, y guardamos ese número en la variable ´´numEnBinario``.
		
		// Ejecutamos la función del conversor de números y la mostramos directamente por pantalla.
		
		System.out.println("\nEl número binario " + numEnBinario + ", expresado en decimal, es el " + Varias.conversorBinarioADecimal(numEnBinario) + ".");
	}
}
