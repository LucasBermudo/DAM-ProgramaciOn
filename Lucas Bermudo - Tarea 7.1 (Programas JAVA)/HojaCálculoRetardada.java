/**
 * Modificar el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retardo,.
 * 
 * @autor Lucas Bermudo Junco
 */

public class HojaCálculoRetardada{
	public static void main(String args[])
		throws InterruptedException{
	
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
				
				Thread.sleep(1000);					// Establecemos una pausa de 1 segundo (1000 milisegundos) antes de mostrar el mensaje con la suma de las filas.
				System.out.print("|\t" + sumaFila[i] + "\t|");
				System.out.println("\n├───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");
			}
			
			for(j=0; j<5; j++){
				Thread.sleep(1000);					// Establecemos otra pausa de 1 segundo (1000 milisegundos) antes de mostrar el mensaje con la suma de las columnas.
				System.out.print("|\t" + sumaColumna[j] + "\t");
			}
			
			Thread.sleep(1000);
			System.out.print("|\t" + sumaTotal + "\t|");
			System.out.println("\n└───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
	}
}
