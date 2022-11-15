/**
 * Realizar un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * @autor Lucas Bermudo Junco
 */

public class EcuaciónPrimerGrado{
	public static void main(String args[]){
	
		System.out.print("¿Cuál es el valor de ´´a``?: ");
		String línea = System.console().readLine();
		double a = Double.parseDouble(línea);
		
		System.out.print("¿Cuál es el valor de ´´b``?: ");
		línea = System.console().readLine();
		double b = Double.parseDouble(línea);
		
		double x = -b/a;
		
		if(a != 0){
		System.out.println("El valor de la incógnita ´´x``, con todos sus decimales, es: " + x);		
		} else{
		System.out.println("Esa ecuación no tiene solución real.");		
		}
	}
}
