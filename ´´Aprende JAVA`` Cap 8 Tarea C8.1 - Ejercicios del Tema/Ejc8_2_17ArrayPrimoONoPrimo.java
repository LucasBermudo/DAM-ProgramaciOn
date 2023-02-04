import java.util.Scanner;
import misFunciones.*;

/**
 * Realizar un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
 * para cada número introducido si es primo o no.
 * Hay que recordar que un número es primo si es divisible por sí mismo y por 1.
 * El 1 no es primo por convenio. Se debe crear una función que pasándole un número entero devuelva si es primo o no.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_17ArrayPrimoONoPrimo{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num, i=1;
		String siONo;
		
		System.out.println("A continuación, vaya introduciendo números enteros para saber si son primos o no, hasta que usted introduzca el número 0, " + 
															"momento en el que el programa finalizará.\n");
		
		do{					// Vamos realizando la acción hasta quue el usuario introduzca un 0.
			System.out.print(i + "º número: ");
			num = sc.nextInt();
			
			if(num!=0){					// Si el número es distinto a 0, procedemos a realizar la función´´esPrimo``.
				
				if(Varias.esPrimo(num)){					// En caso de lo que la función ´´esPrimo`` devuelva, realizamos una acción u otra.
					siONo = "sí";					// Asignamos ´´sí`` a la variable ´´siONo``.
				} else{
					siONo = "no";					// Asignamos ´´no`` a la variable ´´siONo``.
				}
				
				System.out.println("El " + num + " " + siONo + " es primo.\n");					// Mostramos un mensaje con lo que se haya asignado a la variable ´´siONo``.
			} else{					// Si el número es 0, mostramos el mensaje de que el 0 no es primo.
				System.out.println("El 0 no es primo.");
			}
			
			i++;
		} while(num!=0);
	}
}
