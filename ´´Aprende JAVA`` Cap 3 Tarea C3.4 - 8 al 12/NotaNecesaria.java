import java.util.Scanner;

/**
 * Calcular la nota que hace falta sacar en el segundo examen de la asignatura Programación
 * para obtener la media deseada.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NotaNecesaria{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduce la nota que deseas obtener en la asignatura de Programación: ");
		double notaDese = s.nextDouble();
		
		System.out.print("Por favor, introduce ahora la nota que obtuviste en el 1º examen de dicha asignatura: ");
		double notaPrimExa = s.nextDouble();
		
		double notaSegExa = (notaDese-notaPrimExa*0.4)/0.6;
		
		System.out.print("Si deseas obtener un " + notaDese + " en la asignatura de Programación, deberás obtener un ");
		System.out.printf("%.2f", notaSegExa);
		System.out.print(" en el segundo examen.");
	}
}

