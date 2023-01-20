/**
 * Realizar una tabla de 3 filas y 7 columnas con los resultados de las potencias de 2.
 * 
 * @author Lucas Bermudo Junco
 */

public class TablaPotenciasDe2{
	public static void main(String args[]){
	
		int tamFilas = 7, tamColumnas = 5, potencia = 0;
		long[][] num = new long[tamFilas][tamColumnas];
		
		for(int j=0; j<tamColumnas; j++){
			for(int i=0; i<tamFilas; i++){
				num[i][j] = (long)(Math.pow(2,potencia));					// Vamos creando las potencias de 2 según el exponente que tengamos en ese momento.
				potencia++;					// Vamos incrementando el exponente de 1 en 1.
			}
		}
		
		System.out.println("La tabla con las potencias de 2 es la siguiente:\n");
		
		for(int i=0; i<tamFilas; i++){
			for(int j=0; j<tamColumnas; j++){
				System.out.printf("%-12s", num[i][j]);
			}
			
			System.out.println();
		}
	}
}
