import java.util.Scanner;

/**
 * Realizar un programa que calcule la media de tres notas.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NotaMedia{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3;
		
		System.out.print("Por favor, introduce la nota del 1º examen: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Por favor, introduce la nota del 2º examen: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Por favor, introduce la nota del 3º examen: ");
		nota3 = sc.nextDouble();
		
		double notaMedia = (nota1 + nota2 + nota3)/3;
		
		System.out.print("\nLa nota media de los 3 exámenes es: ");
		System.out.printf("%.2f", notaMedia);
	}
}
