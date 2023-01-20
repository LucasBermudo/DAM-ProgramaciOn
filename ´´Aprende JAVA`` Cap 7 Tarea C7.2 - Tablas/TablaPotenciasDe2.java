/**
 * Realizar una tabla de 3 filas y 7 columnas con los resultados de las potencias de 2.
 * 
 * @author Lucas Bermudo Junco
 */

public class TablaPotenciasDe2{
	public static void main(String args[]){
	
		int tamFilas = 7, tamColumnas = 3, potencia = 0;
		int[][] num = new int[tamFilas][tamColumnas];
		
		for(int j=0; j<tamColumnas; j++){
			for(int i=0; i<tamFilas; i++){
				num[i][j] = (int)(Math.pow(2,potencia));
				potencia++;
			}
		}
		
		System.out.println("La tabla con las potencias de 2 es la siguiente:\n");
		
		for(int i=0; i<tamFilas; i++){
			for(int j=0; j<tamColumnas; j++){
				System.out.print(num[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
}
