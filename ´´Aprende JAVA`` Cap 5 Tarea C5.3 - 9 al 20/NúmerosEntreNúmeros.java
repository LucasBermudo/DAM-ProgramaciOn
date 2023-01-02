import java.util.Scanner;

/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos.
 * El programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmerosEntreNúmeros{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el primer número de los que se tienen que mostrar: ");
		int primNum = sc.nextInt();
		
		System.out.print("Por favor, introduzca el último número de los que se tienen que mostrar: ");
		int ultNum = sc.nextInt();
		
		while(primNum==ultNum){					// Establecemos que los 2 números no puedan ser iguales.
			System.out.println("\nLo sentimos, pero los 2 números introducidos tienen que ser distintos.");
			System.out.println("Por favor, vuelva a introducir los números.\n");
			
			System.out.print("Primer número: ");
			primNum = sc.nextInt();
		
			System.out.print("Último número: ");
			ultNum = sc.nextInt();
		}
		
		if(primNum>ultNum){					// Si el primer número es mayor que el segundo, los cambiamos de orden para mostrarlos siempre de menor a mayor.
			int aux = primNum;
			primNum = ultNum;
			ultNum = aux;
		}
		
		System.out.print("\nLos números comprendidos entre el " + primNum + " y el " + ultNum + ", contando de 7 en 7, son: ");
		
		for(int i=primNum; i<=ultNum; i+=7){					// Mostramos los números de 7 en 7 que hay desde el primer número hasta el último número.
			System.out.print(i + ", ");
		}
	}
}
