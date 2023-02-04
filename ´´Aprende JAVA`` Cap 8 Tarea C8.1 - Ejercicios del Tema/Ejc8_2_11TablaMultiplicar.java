import java.util.Scanner;
import misFunciones.*;

/**
 * Realizar un programa que escriba la tabla de multiplicar de un número introducido por teclado.
 * Para ello, implementar una función que reciba como parámetro un número entero y
 * muestre por pantalla la tabla de multiplicar de dicho número.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_11TablaMultiplicar{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número del cual desee usted saber su tabla de multiplicar: ");
		int num = sc.nextInt();
		
		System.out.println("\nTabla de multiplicar del " + num + ":");
		
		Varias.tablaMultiplicar(num);					// Ejecutamos esa función, la cual será la encargada de mostrar por pantalla la tabla de multiplicar.
	}
}
