/**
 * Introducir texto por consola y mostrar un mensaje con dicho texto incluido en él.
 * 
 * @autor Lucas Bermudo Junco
 */

public class LecturaDeTexto{
	public static void main(String args[]){
	
		String nombre, apellidos;
		
		System.out.print("Por favor, dime cuál es tu nombre: ");
		nombre = System.console().readLine();
		System.out.print("Por favor, dime cuáles son tus apellidos: ");
		apellidos = System.console().readLine();
		System.out.println("Hola " + nombre + " " + apellidos + ", ¡encantado de conocerte!");
	}
}
