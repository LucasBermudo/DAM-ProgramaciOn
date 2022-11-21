import java.util.Scanner;

/**
 * Mostrar en qué estación se encuentra el mes seleccionado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class EstaciónAño{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número del mes del año del cual desee saber la estación en la que se encuentra: ");
		int mes = sc.nextInt();
		
		String estación;
		
		switch (mes) {
			case 1:
			case 2:
			case 3:
				estación = "invierno";
				System.out.println("El " + mes + "º mes del año se encuentra en la estación de " + estación + ".");
				break;
			case 4:
			case 5:
			case 6:
				estación = "primavera";
				System.out.println("El " + mes + "º mes del año se encuentra en la estación de " + estación + ".");
				break;
			case 7:
			case 8:
			case 9:
				estación = "verano";
				System.out.println("El " + mes + "º mes del año se encuentra en la estación de " + estación + ".");
				break;
			case 10:
			case 11:
			case 12:
				estación = "otoño";
				System.out.println("El " + mes + "º mes del año se encuentra en la estación de " + estación + ".");
				break;
			default:
				System.out.println("El año tiene 12 meses, por lo que no existe ese mes.");
		}
	}
}
