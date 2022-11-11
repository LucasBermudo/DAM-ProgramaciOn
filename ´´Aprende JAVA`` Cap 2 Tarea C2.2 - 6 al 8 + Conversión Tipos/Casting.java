/**
 * Probar qué resultado se consigue con cada una de las diferentes combinaciones de casting de las variables
 * 
 * @autor Lucas Bermudo Junco
 */

public class Casting{
	public static void main(String args[]){
	
		int x = 2;
		int y = 9;
		
		double división = (double) y / (double) x;
		
		System.out.println("El resultado de la división es " + división);
		System.out.println("Como acabamos de comprobar, haciendo Casting a todos los valores, el resultado sale en decimal con los decimales correctos.");
		System.out.println("");
		
		división = (double) y / x;
		
		System.out.println("El resultado de la división es " + división);
		System.out.println("Como acabamos de comprobar, con hacer Casting a uno de los valores, el resultado sale en decimal con los decimales correctos");
		System.out.println("");
		
		división = y / (double) x;
		
		System.out.println("El resultado de la división es " + división);
		System.out.println("Como acabamos de comprobar de nuevo, con hacer Casting a uno de los valores, el resultado sale en decimal con los decimales correctos.");
		System.out.println("");
		
		división = y / x;
		
		System.out.println("El resultado de la división es " + división);
		System.out.println("Como acabamos de comprobar, si no hacemos casting a ninguno de los valores, el resultado sale en decimal pero con la parte decimal nula.");
		System.out.println("");
		
	}
}
