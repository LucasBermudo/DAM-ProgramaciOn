import java.util.Scanner;

/**
 * Realizar un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura e
 * insertará un espacio y pintará dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PintarLetraU{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String car = "*";
		int altura, base, i, j;
		
		System.out.print("Por favor, introduce la altura que quieres que tenga la letra U (como mínimo tiene que ser 3): ");
		altura = sc.nextInt();
		
		while(altura<3){
			System.out.println("\nLo sentimos, pero la altura de la letra tiene que ser como mínimo 3.");
			System.out.print("Por favor, introduce la altura que quieres que tenga la letra U (como mínimo tiene que ser 3): ");
			altura = sc.nextInt();
		}
		
		base = altura;
		
		System.out.println();
		
		for(i=1; i<=altura; i++){					// Dibujamos la letra
			if(i!=altura){													// Dibujamos la letra de arriba a abajo hasta llegar a la base
				for(j=1; j<=base; j++){
					if(j==1 || j==base){					// Dibujamos la primera y la útlima posición de la fila, dejando vacío el centro
						System.out.print(car);
					} else if(j==base){
						System.out.println(car);					// Insertamos un salto de línea después de la útlima posicion de la fila
					} else{
						System.out.print(" ");
					}
				}
			} else{																// Dibujamos la base de la letra
				for(j=1; j<=base; j++){
					if(j==1){													// Dibujamos el centro de la fila, dejando vacías la primera y la última posición de la fila
						System.out.print(" ");
					} else if(j==base){
						System.out.println(" ");
					} else{
						System.out.print(car);
					}
				}
			}
		}
	}
}
