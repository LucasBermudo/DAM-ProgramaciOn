import java.util.Scanner;

/**
 * Realizar un programa que pida 10 números por teclado y que los almacene en un array.
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
 * Seguidamente el programa pedirá dos posiciones a las que llamaremos “inicial” y “final”.
 * Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9.
 * El programa deberá colocar el número de la posición inicial en la posición final,
 * rotando el resto de números para que no se pierda ninguno. Al final se debe mostrar el array resultante.
 * 
 * @author Lucas Bermudo Junco
 */

public class InicialYFinal{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int tam = 10;
		double[] num = new double[tam];
		double ultNum;
		
		System.out.println("A continuación, introduzca 10 números para almacenarlos en un array.\n");
		
		for(int i=0; i<tam; i++){
			System.out.print((i+1) + "º Número: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\nEl array generado con los números introducidos es el siguiente:\n");
		
		for(int i=0; i<tam; i++){
			System.out.print("Nº " + i + ": " + num[i] + "  ");
		}
		
		System.out.println("\n\nA continuación, introduzca una posición inicial y otra final, y el programa rotará el array " + 
															"hasta colocar el número que ocupa la posición inicial en la posición final.");
		
		System.out.print("Introduzca la posición inicial del array: ");
		int posInicial = sc.nextInt();
		
		System.out.print("Introduzca la posición final del array: ");
		int posFinal = sc.nextInt();
		
		while(posInicial<0 || posInicial>=tam || posFinal<0 || posFinal>=tam || posInicial>=posFinal){					// Impedimos que el usuario introduzca una posición inicial y final que no sean posibles.
			System.out.println("\nLo sentimos, pero la posición final tiene que ser mayor que la posición inicial y ambas tienen que estar entre 0 y " + (tam-1) + " ambos incluidos.");
			System.out.println("Usted ha introducido para la posición inicial el número " + posInicial + " y para la posición final el número " + posFinal + ". Por favor, vuelva a introducirlas.");
			System.out.print("Introduzca la posición inicial del array: ");
			posInicial = sc.nextInt();
			System.out.print("Introduzca la posición final del array: ");
			posFinal = sc.nextInt();
			
			if(posInicial>=0 && posInicial<tam && posFinal>=0 && posFinal<tam && posInicial<posFinal){					// Cuando hayamos metido una posición incial y final válidas, se nos mostrará un mensaje confirmándonoslo.
				System.out.println("\nLas posiciones inicial: " + posInicial + " y final: " + posFinal + " sí son válidas.");
			}
		}
		
		double numPosInicial = num[posInicial];					// Guardamos el elemento que ocupa la posición inicial del array original para usarlo más adelante.
		
		do{					// Comenzamos la rotación del array.
			ultNum = num[tam-1];					// Guardamos el último número para que no se pierda.
			
			for(int i=(tam-1); i>0; i--){					// Le damos a cada elemento del array el valor del elemento anterior; así hasta llegar a la posición 1, que es la última que realizaremos en este bucle.
				num[i] = num[i-1];
			}
			
			num[0] = ultNum;					// Le damos al elemento 0 del array el valor que tenía el último elemento del array.
		} while(numPosInicial != num[posFinal]);					// Realizamos la rotación hasta que el número que estaba en la posición inicial ocupe la posición final establecida por el usuario del array.
		
		System.out.println("\nEl array generado, con el número que ocupaba la posición " + posInicial + " en la posición " + posFinal + ", es el siguiente:\n");
			
		for(int i=0; i<tam; i++){					// Finalmente mostramos el array rotado con el número que ocupaba la posición inicial ocupando la posición final.
			System.out.print("Nº " + i + ": " + num[i] + "  ");
		}
	}
}
