/**
 * Definir un array de números enteros de 3 filas por 6 columnas con nombre num y asignar los valores según la tabla indicada en el ejercicio.
 * Mostrar el contenido de todos los elementos del array dispuestos en forma de tabla.
 * 
 * @author Lucas Bermudo Junco
 */

public class ArrayBiNum{
	public static void main(String args[]){
	
		int[][] num = new int[3][6];
		int n, i = 0, j = 0;
		
		// Establecemos valores para varios elementos del array.
		
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		System.out.println("\nArray num     Columna 0     Columna 1       Columna 2       Columna 3       Columna 4       Columna 5");
		System.out.println("\t   ┌────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
		
		for(i=0; i<3; i++){					//  Vamos rellenando los elementos del array bidimensional.
			System.out.print("Fila " + i + "     |     ");
			
			for(j=0; j<6; j++){					// Vamos rellenando las columnas con los elementos de la misma fila.
				System.out.print(num[i][j] + "\t|\t");
			}
			
			if(i<2){
				System.out.println("\n\t   ├────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");
			} else{
				
			System.out.println("\n\t   └────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
			}
		}
	}
}
