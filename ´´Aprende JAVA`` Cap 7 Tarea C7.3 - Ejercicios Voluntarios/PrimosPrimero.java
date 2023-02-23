import java.util.Scanner;

/**
 * Realizar un programa que pida 10 números por teclado y que los almacene en un array.
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla.
 * Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de números
 * (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el array resultante.
 * 
 * @author Lucas Bermudo Junco
 */

public class PrimosPrimero{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int tam = 10, contDivisores1, contDivisores2, aux;
		int[] num = new int[tam];
		
		System.out.println("Introduzca a continuación 10 números mayores que 0.");
		
		for(int i=0; i<tam; i++){
			System.out.print((i+1) + "º número: ");
			num[i] = sc.nextInt();
			
			while(num[i]<1){					// Impedimos al usuario introducir números negativos.
				System.out.println("\nLo sentimos, pero el número tiene que ser mayor que 0.");
				System.out.print("Por favor, vuelve a introducir el " + (i+1) + "º número: ");
				num[i] = sc.nextInt();
			}
		}
		
		// Mostramos la tabla creada.
		
		System.out.println("\nLa tabla con los números introducidos es la siguiente:\n");
		System.out.printf("%-11s", "Posición:");
		
		for(int i=0; i<tam; i++){
			System.out.printf("%-4d", i);
		}
		
		System.out.printf("\n%-10s---------------------------------------\n", " ");
		System.out.printf("%-11s", "Número:");
		
		for(int i=0; i<tam; i++){
			System.out.printf("%-4d", num[i]);
		}
		
		for(int i=0; i<(tam-1); i++){					// Procedemos a ordenar el array con los números primos primero.
			for(int j=0; j<(tam-1); j++){
				//Establecemos los contadores de los divisores a 0.
				
				contDivisores1 = 0;
				contDivisores2 = 0;
				
				// Comprobamos si son primos tanto el núm[j] como el siguiente número, es decir, el num[j+1].
				
				for(int k=2; k<=(num[j]/2); k++){
					if(num[j]%k==0){					// Cada vez que encontremos un divisor del número en cuestión, sumamos 1 al contador de los divisores de ese número.
						contDivisores1++;
					}
				}
				
				for(int k=2; k<=(num[j+1]/2); k++){
					if(num[j+1]%k==0){
						contDivisores2++;
					}
				}
				
				if(contDivisores1>0 && contDivisores2==0){					// Cada vez que el num[j] no sea primo y el siguiente (num[j+1]) sí lo sea, los intercambiamos entre sí.
					aux = num[j+1];
					num[j+1] = num[j];
					num[j] = aux;
				}
			}
		}
		
		// Mostramos la tabla con los números primos al principio.
		
		System.out.println("\n\nLa tabla con los números primos al principio es la siguiente:\n");
		System.out.printf("%-11s", "Posición:");
		
		for(int i=0; i<tam; i++){
			System.out.printf("%-4d", i);
		}
		
		System.out.printf("\n%-10s---------------------------------------\n", " ");
		System.out.printf("%-11s", "Número:");
		
		for(int i=0; i<tam; i++){
			System.out.printf("%-4d", num[i]);
		}
	}
}
