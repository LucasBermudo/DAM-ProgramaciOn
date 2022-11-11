/**
 * Asignarle a una cadena de caracteres, como valor, la concatenación de variables de tipo char que hayamos delarado anteriormente.
 * 
 * @autor Lucas Bermudo Junco
 */

public class CadenaCaracteres{
	public static void main(String args[]){
	
		char pMayus = 'P', r = 'r', o = 'o', g = 'g', a = 'a', m = 'm', c = 'c', i = 'i', ó = 'ó', n = 'n';
		String asignatura = pMayus + "" +  r + "" + o + "" + g + "" + r + "" + a + "" + m + "" + a + "" + c + "" + i + "" + ó + "" + n;
		
		System.out.println("Esta asignatura se llama " + asignatura);
		System.out.println("");
		System.out.print("Como hemos podido comprobar, no se puede crear una variable de tipo String concatenando variables de tipo char una tras otra");
		System.out.println(" porque el sistema interpreta la concatenación como la suma de los valores ASCII de cada variable de tipo char.");
		System.out.println("");
		System.out.print("La solución consiste en añadir, entre cada concatenación de cada variable de tipo char, un espacio para que");
		System.out.print(" el sistema interprete cada variable de tipo char como un símbolo en lugar de como un valor ASCII.");
	}
}
