/**
 * Diseñar un programa que calcule y muestre por pantalla la suma y el producto de los 10 primeros números naturales.
 * 
 * @autor Lucas Bermudo Junco
 */

public class SumaYProducto{
	public static void main(String args[]){
	
		int resuSuma = 0, resuProd = 1;
		
		for(int i=1; i<=10; i++){
			resuSuma += i;
			resuProd = resuProd*i;
		}
		
		System.out.println("La suma de los 10 primeros números naturales es: " + resuSuma);		
		System.out.println("El producto de los 10 primeros números naturales es: " + resuProd);
	}
}
