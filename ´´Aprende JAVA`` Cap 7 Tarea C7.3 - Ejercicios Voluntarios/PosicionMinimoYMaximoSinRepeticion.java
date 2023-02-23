/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 * Instrucciones del programa anterior:
 * Realizar un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
 * 
 * @author Lucas Bermudo Junco
 */

public class PosicionMinimoYMaximoSinRepeticion{
	public static void main(String[] args){
	
		int tamFilas = 6, tamColumnas = 10, numGenerado, min = 0, max = 0, filaMin = 0, filaMax = 0, columnaMin = 0, columnaMax = 0, k, l;
		int[][] num = new int[tamFilas][tamColumnas];
		boolean numPertenece;
		
		// Procedemos a construir la tabla de los números y a localizar los números mínimo y máximo.
		for(int i=0; i<tamFilas; i++){
			for(int j=0; j<tamColumnas; j++){
				// Generamos un número al azar pero todavía no lo introducimos dentro del array.
				numGenerado = (int)(Math.random()*1001);

				// Comparamos el nuevo número con todos los anteriores (excepto si se trata del primer número).
				if(i==0 && j==0){					// El primer número lo introducimos directamente en el array.
					num[i][j] = numGenerado;
				}else{					// A partir del segundo número, comparamos el nuevo número con todos los anteriores.
					// Vamos generando nuevos números mientras los nuevos números ya estén dentro del array.
					do{
						numPertenece = false;					// Colocamos este indicador como falso antes de comparar el nuevo número con todos los anteriores.

						// Recorremos el array de la forma que convenga para comparar el nuevo número con los anteriores.
						if(i>0){					// Si la fila actual es mayor que la primera fila (fila 0), comparamos el nuevo número con todos los números de todas las filas anteriores.
							for(k=0; k<i; k++){
								for(l=0; l<tamColumnas; l++){
									if(numGenerado==num[k][l]){					// En caso de que el nuevo número coincida con algún número ya establecido del array, cambiamos el indicador a true para indicar que hay como mínimo un número igual en el array.
										numPertenece = true;
									}
								}
							}
						}

						if(j>0){					// Si la columna actual es mayor que la primera columna (columna 0), comparamos el nuevo número con todos los números de esa fila.
							for (l=0; l<j; l++){
								if(numGenerado==num[i][l]){
									numPertenece = true;
								}
							}
						}
						
						if(numPertenece){					// En caso de que el nuevo número ya esté repetido, volvemos a generar un número al azar y para volverlo a comparar con todos los anteriores.
							numGenerado = (int)(Math.random()*1001);
						}
					}while(numPertenece);

					num[i][j] = numGenerado;					// Cuando hayamos comprobado que el nuevo número no está dentro del array, lo introducimos en esa posición.
				}

				if(i==0 && j==0){					// Establecemos el primer valor introducido tanto como mínimo como como máximo y guardamos su posición.
					min = num[i][j];
					filaMin = i;
					columnaMin = j;
					
					max = num[i][j];
					filaMax = i;
					columnaMax = j;
				}else{
					if(num[i][j]<min){					// Cada vez que añadamos un valor menor que el mínimo, establecemos ese valor como el nuevo mínimo y guardamos su posición.
						min = num[i][j];
						filaMin = i;
						columnaMin = j;
					}else if(num[i][j]>max){					// Cada vez que añadamos un valor mayor que el máximo, establecemos ese valor como el nuevo máximo y guardamos su posición.
						max = num[i][j];
						filaMax = i;
						columnaMax = j;
					}
				}
			}
		}
		
		System.out.println("El array sin números repetidos es el siguiente:\n");
		
		System.out.printf("%7s", " ");
		for(int j=0; j<10; j++){
			System.out.printf("%-4s%-2s", "Col.", j);
		}
		
		for(int i=0; i<tamFilas; i++){
			System.out.print("\nFila " + i + ":\t");
			
			for(int j=0; j<tamColumnas; j++){
				System.out.printf("%-6s", num[i][j]);
			}
		}
		
		System.out.println("\n\nEl número mínimo del array es el " + min  + " y se encuentra en la fila " + filaMin + " y en la columna " + columnaMin);
		System.out.println("El número máximo del array es el " + max  + " y se encuentra en la fila " + filaMax + " y en la columna " + columnaMax);
	}
}
