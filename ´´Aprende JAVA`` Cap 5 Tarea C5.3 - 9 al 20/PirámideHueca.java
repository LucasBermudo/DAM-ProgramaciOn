import java.util.Scanner;

/**
 * Realiza un programa que pinte una pirámide hueca por pantalla. La altura se debe pedir por teclado.
 * El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PirámideHueca{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int filas, i, j, cantEsp;
		String paredIzq, paredDer, paredInf, esp = " ";
		
		System.out.print("Por favor, introduzca el número de filas que quiera usted que tenga la pirámide (mínimo 2): ");
		filas = sc.nextInt();
		
		while(filas<2){					// Establecemos que haya más de 1 fila, ya que si no la figura sería un solo caracter.
			System.out.println("\nLo sentimos, pero el número de filas de la pirámide de la pirámide tiene que ser mayor que 1, y usted ha establecido que la pirámide tenga " + filas + " filas.");
			System.out.print("Por favor, vuelva a introducir el número de filas que quiera usted que tenga la pirámide: ");
			filas = sc.nextInt();
		}
		
		cantEsp = filas-1;					// Establecemos la cantidad de espacios que habrá desde el comienzo de la línea hasta la pared de la pirámide.
		
		System.out.print("Por favor, introduzca el carácter con el que usted quiera que se dibuje la pared izquierda de la pirámide: ");
		paredIzq = sc.next();
		
		System.out.print("Por favor, introduzca el carácter con el que usted quiera que se dibuje la pared derecha de la pirámide: ");
		paredDer = sc.next();
		
		System.out.print("Por favor, introduzca el carácter con el que usted quiera que se dibuje la pared inferior de la pirámide: ");
		paredInf = sc.next();
		
		for(i=1; i<=filas; i++){					// Empezamos a dibujar la pirámide.
			for(j=cantEsp; j>0; j--){					// Dibujamos os espacios hasta la pared de la pirámide.
				System.out.print(esp);
			}
						
			if(i<filas){					// Dibujamos la pared izquierda de la pirámide.
				System.out.print(paredIzq);
				
				if(i>1){
					for(j=1; j<=(i*2)-3; j++){					//Dibujamos los huecos de la pirámide.
						System.out.print(esp);
					}
					
					System.out.print(paredDer);					// Dibujamos la pared derecha de la pirámide.
				}
			} else{
				for(j=1; j<=(filas*2-1); j++){					// Dibujamos la pared inferior de la pirámide.
					System.out.print(paredInf);
				}
			}
			
			System.out.println();
			cantEsp--;
		}
	}
}
