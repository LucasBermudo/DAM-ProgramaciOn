import java.util.Scanner;

/**
 * Escribir un programa que pida 10 números por teclado y que luego muestre los números introducidos
 * junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
 * 
 * @author Lucas Bermudo Junco
 */

public class ArrayMáximoMínimo{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		double[] num = new double[10];	
		int i;				// Creamos un array de tipo double de 10 elementos.
		double max = 0, min = 0;					// Creamos las variables para almacenar los números mínimo y máximo.
		
		System.out.println("A continuación, introduce 10 números.\n");
		
		for(i=0; i<10; i++){
			System.out.print((i+1) + "º número: ");
			num[i] = sc.nextDouble();
			
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
		}
		
		System.out.println("\nLos números de la lista son:");
		
		for(i=0; i<10; i++){
			if(i<(10-2)){
				System.out.print(num[i]);
				
				if(num[i]==min){
					System.out.print(" (mínimo)");
				} else if(num[i]==max){
					System.out.print(" (máximo)");
				}
				
				System.out.print(", ");
			} else if(i<(10-1)){
				System.out.print(num[i]);
				
				if(num[i]==min){
					System.out.print(" (mínimo)");
				} else if(num[i]==max){
					System.out.print(" (máximo)");
				}
				
				System.out.print(" y ");
			} else{
				System.out.print(num[i]);
				
				if(num[i]==min){
					System.out.print(" (mínimo)");
				} else if(num[i]==max){
					System.out.print(" (máximo)");
				}
			}
		}
	}
}
