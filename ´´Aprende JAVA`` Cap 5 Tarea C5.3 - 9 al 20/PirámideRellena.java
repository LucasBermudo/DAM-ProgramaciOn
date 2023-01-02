import java.util.Scanner;

/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
 * El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PirámideRellena{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número de filas que quiera usted que tenga la pirámide: ");
		int filas = sc.nextInt();
		
		while(filas<2){					// Establecemos que haya más de 1 fila, ya que si no la figura sería un solo caracter.
			System.out.println("\nLo sentimos, pero el número de filas de la pirámide de la pirámide tiene que ser mayor que 1, y usted ha establecido que la pirámide tenga " + filas + " filas.");
			System.out.print("Por favor, vuelva a introducir el número de filas que quiera usted que tenga la pirámide: ");
			filas = sc.nextInt();
		}
		
		System.out.print("Por favor, introduzca el carácter con el que usted quiera que se dibuje la pirámide: ");
		String car = sc.next();
		
		System.out.println();
		
		int i, j;
		int cantEsp = filas-1;					// Establecemos la cantidad de espacios que habrá desde el comienzo de la línea hasta la pared de la pirámide.
		String esp = " ";
		
		for(i=1; i<=filas; i++){					// Empezamos a dibujar la pirámide.
			for(j=cantEsp; j>0; j--){					// Dibujamos os espacios hasta la pared de la pirámide.
				System.out.print(esp);
			}
			
			for(j=1; j<=(i*2)-1; j++){					// Dibujamos cada fila de la pirámide.
				System.out.print(car);
			}
			
			System.out.println();
			cantEsp--;					// Reducimos la cantidad de espacios que habrá desde el comienzo de la línea hasta la pared de la pirámide.
		}
	}
}
