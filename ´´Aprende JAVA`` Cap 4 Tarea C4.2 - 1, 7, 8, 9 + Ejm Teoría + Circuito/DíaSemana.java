import java.util.Scanner;

/**
 * Mostrar el nombre del día de la semana a partir de su número.
 * 
 * @autor Lucas Bermudo Junco
 */

public class DíaSemana{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número del día de la semana que desee saber: ");
		int día = sc.nextInt();
		
		String nombreDelDía;
		
		switch (día) {
			case 1:
				nombreDelDía = "lunes";
				System.out.println("El nombre del " + día + "º día de la semana es: " + nombreDelDía);
			break;
			case 2:
				nombreDelDía = "martes";
				System.out.println("El nombre del " + día + "º día de la semana es: " + nombreDelDía);
			break;
			case 3:
				nombreDelDía = "miércoles";
				System.out.println("El nombre del " + día + "º día de la semana es: " + nombreDelDía);
			break;
			case 4:
				nombreDelDía = "jueves";
				System.out.println("El nombre del " + día + "º día de la semana es: " + nombreDelDía);
			break;
			case 5:
				nombreDelDía = "viernes";
				System.out.println("El nombre del " + día + "º día de la semana es: " + nombreDelDía);
			break;
			case 6:
				nombreDelDía = "sábado";
				System.out.println("El nombre del " + día + "º día de la semana es: " + nombreDelDía);
			break;
			case 7:
				nombreDelDía = "domingo";
				System.out.println("El nombre del " + día + "º día de la semana es: " + nombreDelDía);
			break;
			default:
				System.out.println("La semana tiene 7 días, por lo que no existe ese día de la semana.");
		}
	}
}
