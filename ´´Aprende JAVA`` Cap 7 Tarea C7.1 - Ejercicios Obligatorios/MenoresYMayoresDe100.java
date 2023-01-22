/**
 * Realizar un programa que genere 10 números enteros aleatorios entre 0 y 200 ambos incluidos y que los almacene en un array.
 * A continuación, el programa debe mostrar el contenido de ese array junto al índice (0 – 9).
 * Seguidamente el programa debe colocar de forma alterna y en orden los menores o iguales de 100 y los mayores de 100:
 * primero menor, luego mayor, luego menor, luego mayor...
 * Cuando se acaben los menores o los mayores, se completará con los números que queden.
 * 
 * @author Lucas Bermudo Junco
 */

public class MenoresYMayoresDe100{
	public static void main(String args[]){
	
		int tam = 10, contMenoresOIguales = 0, contMayores = 0, j = 0, k = 0;
		int[] numDesor = new int [tam], numOrd = new int [tam], menorOIgual = new int[tam], mayor = new int[tam];
		
		System.out.println("El array original es el siguiente:\n");
		
		for(int i=0; i<tam; i++){					// Creamos el array y lo vamos mostrando por pantalla.
			numDesor[i] = (int)(Math.random()*201);
			System.out.print(numDesor[i] + "  ");
			
			if(numDesor[i]<=100){					// Vamos creando el array tanto de los números menores o iguales que 100 como el de los mayores de 100, y vamos contando cuántos números hay de cada tipo.
				menorOIgual[contMenoresOIguales] = numDesor[i];
				contMenoresOIguales++;
			} else{
				mayor[contMayores] = numDesor[i];
				contMayores++;
			}
		}
		
		System.out.println("\n\nEl array ordenado queda así:\n");
		
		for(int i=0; i<tam; i++){					// Vamos ordenando el array original y para ello creamos al mismo tiempo el array ordenado.
			if(j<contMenoresOIguales && k<contMayores){					// Vamos colocando primero los menores o iguales que 100 y los mayores que 100 mientras queden de ambos.
				if(i%2==0){					// Vamos colocando en las posiciones pares los números menores o iguales que 100, y en las posiciones impares los mayores que 100.
					numOrd[i] = menorOIgual[j];
					j++;
				} else{
					numOrd[i] = mayor[k];
					k++;
				}
			}
			
			else{					// Cuando ya no queden números de alguno de los 2 grupos, colocamos el resto de los números del grupo que sí quede.
				if(contMenoresOIguales>contMayores){
					numOrd[i] = menorOIgual[j];
					j++;
				} else{
					numOrd[i] = mayor[k];
					k++;
				}
			}
			
			System.out.print(numOrd[i] + "  ");
		}
	}
}
