import java.util.Scanner;

/**
 * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
 * A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el máximo o el mínimo.
 * Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.
 * 
 * @author Lucas Bermudo Junco
 */

public class DestacarMínimoYMáximo{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int i = 0, max = 0, min = 0, destacar;
		String palabra = "";
		
		System.out.println("Los elementos del array, separados por espacios, son los siguientes:");
		
		for(int n : num){
			num[i] = (int)(Math.random()*501);
			System.out.print(num[i] + " ");
			
			if(i==0){					// Establecemos el 1º valor introducido tanto como mínimo como como máximo.
				min = num[i];
				max = num[i];
			} else{
				if(num[i]<min){					// Cambiamos el valor de la variable min cada vez que se añada un valor más pequeño que el valor min.
					min = num[i];
				} else if(num[i]>max){					// Cambiamos el valor de la variable max cada vez que se añada un valor más grande que el valor max.
					max = num[i];
				}
			}
			
			i++;
		}
		
		System.out.print("\n\n¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
		destacar = sc.nextInt();
		
		while(destacar<1 || destacar>2){
			System.out.println("\nLo sentimos, pero solo hay 2 opciones (´´1`` para mínimo y ´´2`` para máximo. Por favor, vuelva a responder la pregunta, muchas gracias.)");
			
			System.out.print("\n¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
			destacar = sc.nextInt();
		}
		
		switch(destacar){					// Escogemos la palabra ´´mínimo`` o ´´máximo``(la que corresponda) para usarla más adelante.
			case 1:
				palabra = "mínimo";
				break;
			case 2:
				palabra = "máximo";
				break;
		}
		
		System.out.println("\nLos elementos del array, separados por espacios y con el valor " + palabra + " destacado con dobles asteriscos (**), son los siguientes:");
		
		i = 0;
		
		for(int n : num){					// Vamos mostrando el array de los números con la particularidad del número mínimo o máximo (el que corresponda), que lo mostraremos entre dobles asteriscos.
			if(destacar==1 && num[i]==min){
				System.out.print("**" + num[i] + "** ");
			} else if(destacar==2 && num[i]==max){
				System.out.print("**" + num[i] + "** ");
			} else{
				System.out.print(num[i] + " ");
			}
			
			i++;
		}
	}
}
