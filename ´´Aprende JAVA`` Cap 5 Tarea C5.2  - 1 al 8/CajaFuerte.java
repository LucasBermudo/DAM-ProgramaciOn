import java.util.Scanner;

/**
 * Realizar el control de acceso a una caja fuerte.
 *
 * @autor Lucas Bermudo Junco.
 */

public class CajaFuerte{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int contraseña = 2468;					// Establecemos la contraseña correcta.
		
		System.out.print("Introduzca la contraseña: ");
		int contIntroducida = sc.nextInt();
		
		if(contraseña==contIntroducida){					// Comparamos la contraseña introducida con la contraseña correcta.
			System.out.println("\nContraseña correcta.");
		} else{					// Entramos en un bucle hasta que se introduzca la contraseña correcta o hasta que se acaben los intentos.
			int intRest = 3;
			do{
			System.out.println("\nContraseña incorrecta.");
			System.out.print("\nIntroduzca la contraseña de nuevo (le quedan " + intRest + " intentos): ");
			contIntroducida = sc.nextInt();
			
			intRest--;
			
			} while (contraseña!=contIntroducida && intRest>0);
			
			if(contraseña==contIntroducida){
				System.out.println("\nContraseña correcta.");
			} else{
			System.out.println("\nContraseña incorrecta. Ya no le quedan más intentos.");				
			}
		}
	}
}
