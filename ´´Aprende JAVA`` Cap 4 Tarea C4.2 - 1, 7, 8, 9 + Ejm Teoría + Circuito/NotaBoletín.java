import java.util.Scanner;

/**
 * Realizar un programa que calcule la media de tres notas y que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).
 * 
 * @autor Lucas Bermudo Junco
 */

public class NotaBoletín{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3;
		
		System.out.print("Por favor, introduce la nota del 1º examen: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Por favor, introduce la nota del 2º examen: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Por favor, introduce la nota del 3º examen: ");
		nota3 = sc.nextDouble();
		
		if(nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10){
			double notaMedia = (nota1 + nota2 + nota3)/3;
			
			System.out.print("\nLa nota media de los 3 exámenes es: ");
			System.out.printf("%.2f", notaMedia);
			System.out.println("\n");
			
			if(notaMedia>=0 && notaMedia<5){
				System.out.println("La nota es: insuficiente.");
			} else if(notaMedia>=5 && notaMedia<6){
				System.out.println("La nota es: suficiente.");
			} else if(notaMedia>=6 && notaMedia<7){
				System.out.println("La nota es: bien.");
			} else if(notaMedia>=7 && notaMedia<9){
				System.out.println("La nota es: notable.");
			} else if(notaMedia>=9 && notaMedia<=10){
				System.out.println("La nota es: sobresaliente.");
			}
		} else{
			System.out.println("\nLo sentimos, ha tenido que haber algún error al introducir las notas, ya que alguna de ellas es menor que 0 ó mayor que 10, y este sistema de notas solo acepta notas entre 0 y 10 ambos incluidos.");
			System.out.println("Si quieres volver a intentarlo, aquí te mostramos las notas que has introducido para que puedas detectar el error:");
			System.out.println("1º nota: " + nota1);
			System.out.println("2º nota: " + nota2);
			System.out.println("3º nota: " + nota3);
		}
	}
}
