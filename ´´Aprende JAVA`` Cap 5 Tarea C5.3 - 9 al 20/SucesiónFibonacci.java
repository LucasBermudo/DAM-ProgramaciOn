import java.util.Scanner;

/**
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El número n se debe introducir por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class SucesiónFibonacci{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuántos números de la sucesión de Fibonacci quieres que se muestren? (Mínimo 2): ");
		int cantNum = sc.nextInt();
		
		while(cantNum<2){
			System.out.println("\nLo sentimos, pero la cantidad de números que se van a mostrar de la sucesión de Fibonacci tiene que ser igual o mayor a 2. " + 
																"Por favor, vuelve a introducir la cantidad de números.");
			System.out.print("¿Cuántos números de la sucesión de Fibonacci quieres que se muestren? (Mínimo 2): ");
			cantNum = sc.nextInt();
		}
		
		int a = 0, b = 1, c = 0, i = 0;					// Establecemos el inicio del cálculo.
		
		System.out.print("\nLos " + cantNum + " primeros números de la sucesión de Fibonacci son: ");
		
		while(i<(cantNum-2)){
			System.out.print(c + ", ");
			
			c = a+b;					// Procedemos a reordenar los números para obtener la sucesión de Fibonacci.
			b = a;
			a = c;
			
			i++;
		}
		
		System.out.print(c + " & ");
		c = a+b;
		System.out.print(c);

	}
}
