import java.util.Scanner;

/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras correspondientes a colores se deben almacenar
 * al comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays auxiliares como quieras.
 * Los colores que conoce el programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.
 * 
 * @author Lucas Bermudo Junco
 */

public class ColoresPrimero{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int tam = 8;
		String[] palabra = new String[tam];
		boolean color = true;
		int i = 0, j = 1;
		String aux = "";
		
		System.out.println("A continuación, introduce 8 palabras.\n");
		
		for(String n : palabra){
			System.out.print((i+1) + "ª palabra: ");
			palabra[i] = sc.next();
			
			i++;
		}
		
		i = 0;
		
		// Mostramos la tabla con el array original.
		
		System.out.println("\nEl array original de las palabras es el siguiente:\n");
		System.out.println("┌───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
		System.out.print("|\t");
		
		for(String n : palabra){
			System.out.print(i + " \t|\t");
			
			i++;
		}
		
		i = 0;
		
		System.out.println("\n├───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");
		System.out.print("|");

		for(String n : palabra){
			System.out.print(palabra[i] + " \t");
			
			if(palabra[i].length()<=5){					// Añadimos un tabulador extra en caso de que la palabra que ocupa la celda sea demasiado corta, para de esa forma mantener fijo el tamaño de la celda.
				System.out.print("\t");
			}
			
			System.out.print("|");
			
			i++;
		}
		
		i = 0;
		
		System.out.println("\n└───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
		
		// Vamos comparando las palabras del array original de 2 en 2 desplazándonos por las palabras usando los índices.
		
		for(String n : palabra){
			for(i=0; i<(tam-1); i++){
				
				// En caso de que la segunda palabra sea un color y la primera no, las intercambiamos de lugar usando la variable auxiliar.
				
				if(!palabra[i].equals("verde") && !palabra[i].equals("rojo") && !palabra[i].equals("azul") && !palabra[i].equals("amarillo") && !palabra[i].equals("naranja") &&
						!palabra[i].equals("rosa") && !palabra[i].equals("negro") && !palabra[i].equals("blanco") && !palabra[i].equals("morado") &&
						(palabra[j].equals("verde") || palabra[j].equals("rojo") || palabra[j].equals("azul") || palabra[j].equals("amarillo") || palabra[j].equals("naranja") ||
						palabra[j].equals("rosa") || palabra[j].equals("negro") || palabra[j].equals("blanco"))){
					aux = palabra[i];
					palabra[i] = palabra[j];
					palabra[j] = aux;
				}
				
				j++;					// Desplazamos los índices una posición para poder comparar el segundo número con el siguiente (y el índice ´´i`` se autoincrementa 1 posición en el propio bucle ´´for``).
			}
			
			// Devolvemos los índices al principio para volver a repetir el bucle desde las primeras palabras del array.
			
			i = 0;
			j = 1;
		}
		
		i = 0;
		
		// Mostramos el array ya ordenado con los colores al principio y el resto de palabras al final.
		
		System.out.println("\nEl array de las palabras con los colores primero es el siguiente:\n");
		System.out.println("┌───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
		System.out.print("|\t");
		
		for(String n : palabra){
			System.out.print(i + " \t|\t");
			
			i++;
		}
		
		i = 0;
		
		System.out.println("\n├───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");
		System.out.print("|");

		for(String n : palabra){
			System.out.print(palabra[i] + " \t");
			
			if(palabra[i].length()<=5){
				System.out.print("\t");
			}
			
			System.out.print("|");
			
			i++;
		}
		
		i = 0;
		
		System.out.println("\n└───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
	}
}
