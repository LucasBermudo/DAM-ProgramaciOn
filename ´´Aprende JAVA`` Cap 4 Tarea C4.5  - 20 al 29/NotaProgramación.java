import java.util.Scanner;

/**
 * Calcular la nota de un trimestre de la asignatura Programación.
 *
 * @autor Lucas Bermudo Junco.
 */

public class NotaProgramación{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la nota del 1º examen: ");
		double nota1 = sc.nextDouble();
		System.out.print("Introduzca la nota del 2º examen: ");
		double nota2 = sc.nextDouble();
		
		double notaMedia = (nota1+nota2)/2;
				
		if(notaMedia>=5){					// Establecemos si el alumno ha aprobado o no en función de la nota media.
			System.out.println("\nEl alumno ha aprobado con una nota de " + notaMedia);
		} else{
			System.out.println("\nEl alumno ha suspendido y ha tenido que hacer la recuperación.");
						
			System.out.println("\n¿Cuál ha sido el resultado de la recuperación? ¿Apto o no apto?");
			String recup = sc.next();
			
			System.out.print("\nLa nota obtenida tras la recuperación es ");
			
			String notaFinal = "";
			
			if(recup.equals("apto")){					// Establecemos si el alumno ha aprobado la recuperación o no en función de la nota de recuperación.
				notaFinal = "apto";
				System.out.println(notaFinal + ", por lo que el alumno ha aprobado la asignatura con un 5.");
			} else{
				notaFinal = "no apto";
				System.out.println(notaFinal + ", por lo que el alumno ha suspendido la asignatura con un " + notaMedia + ".");
			}
		}
	}
}
