import java.util.Scanner;

/**
 * Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países.
 * El array que contiene los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}.
 * Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210.
 * Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países (no se pueden escribir directamente).
 * 
 * @author Lucas Bermudo Junco
 */

public class Estatura{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int tamFilas = 4, tamColumnas = 10;
		String[] país = {"España", "Rusia", "Japón", "Australia"};
		int[] suma = new int[tamFilas], media = new int[tamFilas], min = new int[tamFilas], max = new int[tamFilas];
		int[][] altura = new int[tamFilas][tamColumnas];
		
		for(int i=0; i<tamFilas; i++){
			for(int j=0; j<tamColumnas; j++){
				altura[i][j] = (int)(Math.random()*71+140);
				suma[i] += altura[i][j];					// Sumamos todos los números de la misma fila.
				
				if(j==0){					// El primer número lo establecemos tanto como mínimo como como máximo, y a partir del segundo vamos comparándolos con el mínimo y el máximo por si tenemos que establecer un nuevo mínimo o máximo.
					min[i] = altura[i][j];
					max[i] = altura[i][j];
				} else if(altura[i][j]<min[i]){
					min[i] = altura[i][j];
				} else if(altura[i][j]>max[i]){
					max[i] = altura[i][j];
				}
			}
			
			media[i] = suma[i]/tamColumnas;					// Clalculamos la media de todos los números de cada fila.
		}
		
		System.out.println("Tabla del estudio sobre las estaturas de las personas en 4 países distintos:\n");
		
		for(int j=1; j<=15; j++){					// Escribimos la fila de la cabecera dejando los mismos huecos que ocupará cada columna de la tabla final.
			if(j==1){
				System.out.printf("%10s", " ");
			} else if(j<=12){
				System.out.printf("%4s", " ");
			} else if(j==13){
				System.out.printf("%4s", "MED");
			} else if(j==14){
				System.out.printf("%4s", "MIN");
			} else{
				System.out.printf("%4s", "MAX");
			}
		}
		
		System.out.println();
		
		for(int i=0; i<tamFilas; i++){
			System.out.printf("%9s: ", país[i]);
			
			for(int j=0; j<tamColumnas; j++){
				System.out.printf("%-4s", altura[i][j]);
			}
			
			System.out.print(" |  ");
			System.out.printf("%-4s", media[i]);
			System.out.printf("%-4s", min[i]);
			System.out.printf("%-4s", max[i]);
			
			System.out.println();
		}
	}
}
