/**
 * Realizar un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
 * 
 * @author Lucas Bermudo Junco
 */

public class PosiciónMínimioYMáximo{
	public static void main(String args[]){
	
		int tamFilas = 6, tamColumnas = 10, min = 0, max = 0, filaMin = 0, filaMax = 0, columnaMin = 0, columnaMax = 0;
		int[][] num = new int[tamFilas][tamColumnas];
		
		for(int i=0; i<tamFilas; i++){
			for(int j=0; j<tamColumnas; j++){
				num[i][j] = (int)(Math.random()*1001);
				
				if(i==0 && j==0){					// Establecemos el primer valor introducido tanto como mínimo como como máximo y guardamos su posición.
					min = num[i][j];
					filaMin = i;
					columnaMin = j;
					
					max = num[i][j];
					filaMax = i;
					columnaMax = j;
				} else{
					if(num[i][j]<min){					// Cada vez que añadamos un valor menor que el mínimo, establecemos ese valor como el nuevo mínimo y guardamos su posición.
						min = num[i][j];
						filaMin = i;
						columnaMin = j;
					} else if(num[i][j]>max){					// Cada vez que añadamos un valor mayor que el máximo, establecemos ese valor como el nuevo máximo y guardamos su posición.
						max = num[i][j];
						filaMax = i;
						columnaMax = j;
					}
				}
			}
		}
		
		System.out.println("El array es el siguiente:");
		
		for(int i=0; i<tamFilas; i++){
			
			System.out.print("\nFila " + i + ":\t");
			
			for(int j=0; j<tamColumnas; j++){
				System.out.print(num[i][j] + "\t");
			}
		}
		
		System.out.println("\n\nEl número mínimo del array es el " + min  + " y se encuentra en la fila " + filaMin + " y en la columna " + columnaMin);
		System.out.println("El número máximo del array es el " + max  + " y se encuentra en la fila " + filaMax + " y en la columna " + columnaMax);
	}
}
