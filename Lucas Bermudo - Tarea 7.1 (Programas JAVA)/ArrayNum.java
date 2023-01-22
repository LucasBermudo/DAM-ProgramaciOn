/**
 * Definir un array de 12 números enteros con nombre num y asignar los valores según la tabla mostrada en el enunciado del ejercicio.
 * Mostrar el contenido de todos los elementos del array.
 * 
 * @author Lucas Bermudo Junco
 */

public class ArrayNum{
	public static void main(String args[]){
	
		int[] num = new int[12];					// Creamos un array de tipo entero de 12 posiciones.
		
		// Asignamos los valores a varios elementos del array.
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		int i = 1;
		
		System.out.println("\nLos números del array se mostrarán a continuación:\n");
		
		for(int n : num){					// Mostramos todos los elementos del array.
			System.out.println(i + "º número: " + n);					// Los elementos que no han sido incializados adquieren el valor de ´´0`` por defecto.
			i++;
		}
	}
}
