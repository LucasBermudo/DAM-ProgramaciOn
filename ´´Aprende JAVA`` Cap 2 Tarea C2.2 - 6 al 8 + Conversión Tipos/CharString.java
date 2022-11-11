/**
 * Mostrar por pantalla en la misma línea y con una misma sentencia de Java todos las variables de tipo char y de tipo String que hayamos declarado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class CharString{
	public static void main(String args[]){
		
		char pMayus = 'P', r = 'r', o = 'o', g = 'g', a = 'a', m = 'm', c = 'c', i = 'i', ó = 'ó', n = 'n';
		String fp = "DAM";
		
		System.out.println("Estamos ahora mismo cursando la asignatura de " + pMayus + r + o + g + r + a + m + a + c + i + ó + n + " de 1º de " + fp);
		System.out.println("");
		System.out.print("Como acabamos de comprobar, sí se puede mostrar por pantalla en la misma línea y con una misma sentencia de Java"); 
		System.out.print(" todas las variables de tipo char y de tipo String que hayamos declarado.");
	}
}
