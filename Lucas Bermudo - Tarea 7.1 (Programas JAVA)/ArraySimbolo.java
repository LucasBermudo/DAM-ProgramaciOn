/**
 * Definir un array de 10 caracteres con nombre simbolo y asignar los valores según la tabla mostrada en el enunciado del ejercicio.
 * Mostrar el contenido de todos los elementos del array.
 * 
 * @author Lucas Bermudo Junco
 */

public class ArraySimbolo{
	public static void main(String args[]){
	
		String[] simbolo = new String[10];					// Creamos un array de tipo String de 10 posiciones.
		
		simbolo[0] = "a";
		simbolo[1] = "x";
		simbolo[4] = "@";
		simbolo[6] = " ";
		simbolo[7] = "+";
		simbolo[8] = "Q";
		
		int i = 1;
		
		System.out.println("\nLos símbolos del array se mostrarán a continuación:\n");
		
		for(String s : simbolo){					// Mostramos todos los elementos del array.
			System.out.println(i + "º símbolo: " + s);					// Los elementos que no han sido incializados adquieren el valor de ´´null`` por defecto.
			i++;
		}
	}
}
