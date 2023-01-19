/**
 * Realizar la tabla de multiplicar del 1 al 10.
 * 
 * @author Lucas Bermudo Junco
 */

public class TablaMultiplicar{
	public static void main(String args[]){
	
		int tamFilas = 10, tamColumnas = 10, j = 0, valorAnterior;
		int[][] num = new int[tamFilas][tamColumnas];
		
		for(int i=0; i<tamFilas; i++){
			num[i][j] = (i+1);					// Establecemos el 1º valor de cada fila.
			valorAnterior = num[i][j];
			
			for(j=1; j<tamColumnas; j++){				
				num[i][j] = valorAnterior+(i+1);					// Vamos sumando el propio valor al valor en cada columna.
				valorAnterior = num[i][j];
			}
			
			j = 0;
		}
		
		System.out.println("Tabla de multiplicar del 1 al 10:\n");
		
		for(int i=0; i<tamFilas; i++){
			for(j=0; j<tamColumnas; j++){
				System.out.printf("%-6s", num[i][j]);
			}
			
			System.out.println();
		}
	}
}
