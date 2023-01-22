/**
 * Modificar el programa anterior de tal forma que los números que se introducen en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Lucas Bermudo Junco
 */

public class HojaCálculoAleatoria{
	public static void main(String args[]){
	
		int[][] num = new int[4][5];
		int[] sumaFila = new int[4], sumaColumna = new int[5];
		int i, j, sumaTotal = 0;
		
		for(j=0; j<5; j++){
			for(i=0; i<4; i++){
				num[i][j] = (int)(Math.random()*900+100);
				
				sumaColumna[j]+=num[i][j];					// Sumamos los elementos de la misma columna.
			}
			
			sumaTotal+=sumaColumna[j];					// Sumamos los elementos de todas las columnas.
		}
		
		System.out.println("┌───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
		
		for(i=0; i<4; i++){
			for(j=0; j<5; j++){
				System.out.print("|\t" + num[i][j] + "\t");
				
				sumaFila[i]+=num[i][j];					// Sumamos los elementos de la misma fila al mismo tiempo que vamos mostrándolos.
			}
			
			System.out.print("|\t" + sumaFila[i] + "\t|");
			System.out.println("\n├───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");
		}
		
		for(j=0; j<5; j++){
			System.out.print("|\t" + sumaColumna[j] + "\t");
		}
		
		System.out.print("|\t" + sumaTotal + "\t|");
		System.out.println("\n└───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
	}
}
