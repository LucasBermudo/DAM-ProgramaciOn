import java.util.Scanner;

/**
 * Mostrar la tabla de multiplicar de un número introducido por teclado.
 *
 * @autor Lucas Bermudo Junco.
 */

public class TablaMultiplicar{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número del cual desee que se muestre la tabla de multiplicar: ");
		int numTabla = sc.nextInt();
		
		int numResu;
		
		System.out.println("\nLa tabla de multiplicar del " + numTabla + " es:\n");
		
		for(int i=1; i<=10; i++){					// Calculamos la tabla de multiplicar y la mostramos.
			numResu = numTabla*i;
			System.out.println(numTabla + " * " + i + " = " + numResu);
		}
	}
}
