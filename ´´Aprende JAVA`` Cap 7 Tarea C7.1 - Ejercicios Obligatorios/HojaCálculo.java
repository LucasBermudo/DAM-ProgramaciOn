import java.util.Scanner;

/**
 * Escribir un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5 columnas.
 * El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
 * La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author Lucas Bermudo Junco
 */

public class HojaCálculo{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int tamFilas = 4, tamColumnas = 5;
		int[][] num = new int[tamFilas][tamColumnas];
		int[] sumaFila = new int[tamFilas], sumaColumna = new int[tamColumnas];
		int i, j, sumaTotal = 0;
		
		System.out.println("A continuación, introduzca los elementos de la tabla de 4 filas y 5 columnas, muchas gracias.\n");
		
		for(j=0; j<tamColumnas; j++){
			for(i=0; i<tamFilas; i++){
				System.out.print("Fila " + i + " Columna " + j + ": ");
				num[i][j] = sc.nextInt();
				
				sumaColumna[j]+=num[i][j];					// Sumamos los elementos de la misma columna.
			}
			
			sumaTotal+=sumaColumna[j];					// Sumamos los elementos de todas las columnas.
		}
		
		System.out.println();
		
		System.out.println("┌───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
		
		for(i=0; i<tamFilas; i++){
			for(j=0; j<tamColumnas; j++){
				System.out.print("|\t" + num[i][j] + "\t");
				
				sumaFila[i]+=num[i][j];					// Sumamos los elementos de la misma fila al mismo tiempo que vamos mostrándolos.
			}
			
			System.out.print("|\t" + sumaFila[i] + "\t|");
			System.out.println("\n├───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");
		}
		
		for(j=0; j<tamColumnas; j++){
			System.out.print("|\t" + sumaColumna[j] + "\t");
		}
		
		System.out.print("|\t" + sumaTotal + "\t|");
		System.out.println("\n└───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
	}
}
