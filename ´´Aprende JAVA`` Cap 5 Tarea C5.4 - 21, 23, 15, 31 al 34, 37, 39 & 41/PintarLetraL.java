import java.util.Scanner;

/**
 * Realizar un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura.
 * El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PintarLetraL{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String car = "*";
		
		System.out.print("¿Qué longitud de asteriscos quieres que tenga la letra L? (Tiene que ser como mínimo 3): ");
		int altura = sc.nextInt();
		
		while(altura<3){					// Establecemos la altura 3 como la mínima posible
			System.out.println("\nLo sentimos, pero la altura tiene que ser como mínimo 3.");
			System.out.print("¿Qué longitud de asteriscos quieres que tenga la letra L? (Tiene que ser como mínimo 3): ");
			altura = sc.nextInt();
		}
		
		int base = (altura/2)+1;
		
		System.out.println("La base es la mitad de la altura más 1, en este caso " + base + "\n");
		
		for(int i=1; i<=altura; i++){					// Dibujamos la letra
			if(i<altura){																// Dibujamos el palo vertical de la letra
				System.out.println(car);
			}
			
			if(i==altura){																	// Dibujamos el palo horizontal de la letra
				for(int j=1; j<=base; j++){					// Establecemos la longitud del palo horizontal
					System.out.print(car);
				}
			}
		}
	}
}
