import java.util.Scanner;

/**
 * Mostrar el área de una figura de entre varias figuras posibles.
 * 
 * @autor Lucas Bermudo Junco
 */

public class MenúÁreas{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" CÁLCULO DE ÁREAS");
		System.out.println(" ----------------");
		System.out.println(" 1. Triángulo");
		System.out.println(" 2. Rombo");
		System.out.println(" 3. Romboide");
		System.out.println(" 4. Trapecio");
		System.out.println(" ----------------");
		
		System.out.print("\nPor favor, introduzca la figura de la cual desee calcular el área (del 1 al 4): ");
		int figura = sc.nextInt();
	
		double área, base, altura, diagMayor, diagMenor, baseMayor, baseMenor;
	
		switch (figura) {
			case 1:
				System.out.print("\n\n,Introduzca la base del triángulo en cm: ");
				base = sc.nextDouble();
				System.out.print("Introduzca la altura del triángulo en cm: ");
				altura = sc.nextDouble();
				área = (base * altura) / 2;
				System.out.printf("\nEl área del triángulo es %.4f", área);
				System.out.printf(" cm^2");
				break;
			case 2:
				System.out.print("\nIntroduzca la diagonal mayor del rombo en cm: ");
				diagMayor = sc.nextDouble();
				System.out.print("Introduzca la diagonal menor del rombo en cm: ");
				diagMenor = sc.nextDouble();
				área = (diagMayor*diagMenor)/2;
				System.out.printf("\nEl área del rombo es %.4f", área);
				System.out.printf(" cm^2");
				break;
			case 3:
				System.out.print("\nIntroduzca la base del rombiode en cm: ");
				base = sc.nextDouble();
				System.out.print("Introduzca la altura del rombiode en cm: ");
				altura = sc.nextDouble();
				área = base*altura;
				System.out.printf("\nEl área del rombiode es %.4f", área);
				System.out.printf(" cm^2");
			break;
			case 4:
				System.out.print("\nIntroduzca la base mayor del trapecio en cm: ");
				baseMayor = sc.nextDouble();
				System.out.print("Introduzca la base menor del trapecio en cm: ");
				baseMenor = sc.nextDouble();
				System.out.print("Introduzca la altura del trapecio en cm: ");
				altura = sc.nextDouble();
				área = altura*((baseMayor+baseMenor)/2);
				System.out.printf("\nEl área del trapecio es %.4f", área);
				System.out.printf(" cm^2");
				break;
			default:
				System.out.printf("\nLo sentimos, pero la opción elegida no existe.");
		}
	}
}
