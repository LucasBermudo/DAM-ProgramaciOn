/**
 * Realizar un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios entre 200 y 300.
 * A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha,
 * así como el máximo, el mínimo y la media de los números que hay en esa diagonal.
 * 
 * @author Lucas Bermudo Junco
 */

public class DiagonalPrincipal{
	public static void main(String args[]){
	
		int tamFilas = 10, tamColumnas = 10, min = 0, max = 0;
		double suma = 0, cantidad, media = 0;
		int[][] num = new int[tamFilas][tamColumnas];
		int[] diagonal = new int[tamFilas];
		
		System.out.println("El array original es el siguiente:\n");
		
		for(int i=0; i<tamFilas; i++){
			for(int j=0; j<tamColumnas; j++){
				num[i][j] = (int)(Math.random()*101+200);
				System.out.printf("%-6s", num[i][j]);
				
				if(i==j){					// Guardamos todos los elementos de la diagonal principal y los sumamos entre ellos.
					diagonal[i] = num[i][j];
					suma+=diagonal[i];
					
					if(i==1){					// Establecemos el primer valor de la diagonal tanto como mínimo como como máximo.
						min = num[i][j];
						max = num[i][j];
					} else if(num[i][j]<min){					// Cada vez que añadamos un valor menor que el mínimo, establecemos ese valor como el nuevo mínimo.
						min = num[i][j];
					} else if(num[i][j]>max){					// Cada vez que añadamos un valor mayor que el máximo, establecemos ese valor como el nuevo máximo.
						max = num[i][j];
					}
				}
			}
			
			System.out.println();
		}
		
		System.out.print("\nLos elementos de la diagonal principal son:\n\n");
			
		for(int i=0; i<tamFilas; i++){
			System.out.printf("%-6s", diagonal[i]);
		}
		
		media = suma/tamFilas;
		
		System.out.print("\n\nEl elemento mínimo de la diagonal principal es el número " + min + ", el máximo es el " + max + " y " +
														"la media de todos los elementos de la diagonal principal es " + media + ".");
	}
}
