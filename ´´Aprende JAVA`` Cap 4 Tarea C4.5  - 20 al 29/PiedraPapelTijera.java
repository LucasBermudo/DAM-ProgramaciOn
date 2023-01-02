import java.util.Scanner;

/**
 * Implementar el juego piedra, papel y tijera para 2 jugadores.
 *
 * @autor Lucas Bermudo Junco
 */

public class PiedraPapelTijera{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String elecPersona1, elecPersona2;
		
		System.out.print("Turno del jugador 1 (Introduce piedra, papel o tijera): ");
		elecPersona1 = sc.next();
		elecPersona1 = elecPersona1.toLowerCase();					// Convertimos la respuesta introducida en minúsculas para poder aceptar la respuesta tanto en minúscula omo en mayúscula.
		
		System.out.print("Turno del jugador 2 (Introduce piedra, papel o tijera): ");
		elecPersona2 = sc.next();
		elecPersona2 = elecPersona2.toLowerCase();
		
		if((elecPersona1.equals("piedra") || elecPersona1.equals("papel") || elecPersona1.equals("tijera")) && 
				(elecPersona2.equals("piedra") || elecPersona2.equals("papel") || elecPersona2.equals("tijera"))){					// Establecemos las respuestas posibles.
			if(elecPersona1.equals(elecPersona2)){					// Comparamos todas las combinaciones posibles de las 3 tiradas posibles enfrentadas de 2 en 2.
				System.out.println("\nResultado de la partida: Empate");
			} else if(elecPersona1.equals("piedra") && elecPersona2.equals("tijera") || elecPersona1.equals("papel") && elecPersona2.equals("piedra") || 
										elecPersona1.equals("tijera") && elecPersona2.equals("papel")){
				System.out.println("\nGana el jugador 1");
			} else if(elecPersona1.equals("piedra") && elecPersona2.equals("papel") || elecPersona1.equals("papel") && elecPersona2.equals("tijera") || 
										elecPersona1.equals("tijera") && elecPersona2.equals("piedra")){
				System.out.println("\nGana el jugador 2");
			}
		} else{
			System.out.println("\nLo sentimos, pero alguno de los jugadores ha introducido mal su tirada.");
			System.out.println("Si queréis volver a intentarlo, por favor reiniciad el programa e introducid correctamente las tiradas, muchas gracias.");
		}
	}
}
