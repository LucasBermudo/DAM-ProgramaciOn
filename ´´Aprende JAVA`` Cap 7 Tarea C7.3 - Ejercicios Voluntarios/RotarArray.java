import java.util.Scanner;

/**
 * Escribir un programa que muestre por pantalla un array de 10 números enteros generados al azar entre 0 y 100.
 * A continuación, el programa debe pedir un número al usuario.
 * Se debe comprobar que el número introducido por teclado se encuentra dentro del array,
 * en caso contrario se mostrará un mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno correctamente.
 * A continuación, el programa rotará el array hacia la derecha las veces que haga falta hasta que el número introducido quede situado en la posición 0 del array.
 * Por último, se mostrará el array rotado por pantalla.
 * 
 * @author Lucas Bermudo Junco
 */

public class RotarArray{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int tam = 10, cont = 0, ultNum;
		int[] num = new int[tam];
		
		System.out.println("El array generado al azar es el siguiente:\n");
		
		for(int i=0; i<tam; i++){					// Generamos el array de números aleatorios y lo mostramos al mismo tiempo.
			num[i] = (int)(Math.random()*101);
			System.out.print(num[i] + " ");
		}
		
		System.out.print("\n\nA continuación, introduzca el número del array que usted quiera colocar en la primera posición del array: ");
		int numElegido = sc.nextInt();
		boolean numPertenece = false;
		
		while(!numPertenece){					// Obligamos a introducir un número que se encuentre dentro del array generado.
			for(int i=0; i<tam; i++){					// Recorremos el array y al mismo tiempo vamos comparando si el número elegido coincide con algún número del array.
				if(numElegido == num[i]){
					numPertenece = true;
				}
			}
			
			if(!numPertenece){					// En caso de que el número elegido no se encuentre, volvemos a pedir al usuario que introduzca otro número.
				System.out.println("\nEl número que ha introducio usted (" + numElegido + ") no se encuentra dentro del array generado.");
				System.out.print("Por favor, introduzca un número que se encuentre dentro del array: ");
				numElegido = sc.nextInt();
			
				cont++;
			}
			
			if(cont>0 && numPertenece){					// Si el usuario ha introducido previamente uno o varios números fuera del array, le mostramos un mensaje cuando lo haya encontrado de que efectivamente lo ha encontrado.
				System.out.println("\nEl número que ha introducio usted (" + numElegido + ") sí se encuentra dentro del array generado.");
			}
		}
		
		if(numElegido == num[0]){
			System.out.println("\nEl número elegido es el que ocupa la posición 0 del array generado, por lo que no hay que rotarlo para que ocupe dicha posición");
		} else{					// Si el número elegido no se encuentra en la posición 0, procedemos a rotar el array para colocar a dicho número en dicha posición.
			do{					// Comenzamos la rotación del array.
				ultNum = num[tam-1];					// Guardamos el último número para que no se pierda.
				
				for(int i=(tam-1); i>0; i--){					// Le damos a cada elemento del array el valor del elemento anterior; así hasta llegar a la posición 1, que es la última que realizaremos en este bucle.
					num[i] = num[i-1];
				}
				
				num[0] = ultNum;					// Le damos al elemento 0 del array el valor que tenía el último elemento del array.
			} while(numElegido != num[0]);					// Realizamos la rotación hasta que el número elegido ocupe la posición 0 del array.
			
			System.out.println("\nEl array generado, con el número " + numElegido + " en la posición 0, es el siguiente:\n");
			
			for(int i=0; i<tam; i++){					// Finalmente mostramos el array rotado con el número elegido ocupando la posición 0.
				System.out.print(num[i] + " ");
			}
		}
	}
}
