/**
 * Realizar un array bidimensional cuyas filas empiecen por números pares del 0 al 8 y aumenten de 10 en 10 y acaben antes de llegar a 100.
 * 
 * @author Lucas Bermudo Junco
 */

public class TablaParesDe10En10{
	public static void main(String args[]){
	
		int tamFilas = 5, tamColumnas = 10, valorAnterior = -2;
		int[][] num = new int[tamFilas][tamColumnas];
		
		for(int j=0; j<tamColumnas; j++){			
			for(int i=0; i<tamFilas; i++){
				num[i][j] = valorAnterior+=2;					// Vamos sumando 2 al valor en cada nueva posición.
				valorAnterior = num[i][j];
			}
		}
		
		System.out.println("El aray es el siguiente:\n");
		
		for(int i=0; i<tamFilas; i++){
			for(int j=0; j<tamColumnas; j++){
				System.out.printf("%-6s", num[i][j]);
			}
			
			System.out.println();
		}
	}
}
