import java.util.Scanner;

/**
 * Escribir un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PrimeraAsignatura{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número del día de la semana del cual desee saber la primera asignatura que toca ese día: ");
		int día = sc.nextInt();
		
		String primAsig;
		
		switch (día) {
			case 1:
				primAsig = "Sistemas Informáticos";
				System.out.println("La primera asignatura del lunes es: " + primAsig + ".");
				break;
			case 2:
				primAsig = "Programación";
				System.out.println("La primera asignatura del martes es: " + primAsig + ".");
				break;
			case 3:
				primAsig = "Sistemas Informáticos";
				System.out.println("La primera asignatura del miércoles es: " + primAsig + ".");
				break;
			case 4:
				primAsig = "Programación";
				System.out.println("La primera asignatura del jueves es: " + primAsig + ".");
				break;
			case 5:
				primAsig = "Programación";
				System.out.println("La primera asignatura del lunes es: " + primAsig + ".");
				break;
			case 6:
				System.out.println("No hay clase el sábado.");
			break;
			case 7:
				System.out.println("No hay clase el domingo.");
			break;
			default:
				System.out.println("La semana tiene 7 días, por lo que no existe ese día de la semana.");
		}
	}
}
