import java.util.Scanner;

/**
 * Implementa el juego piedra, papel y tijera.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PiedraPapelTijera{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in	);
		String elecPersonaPala = "", elecMáquinaPala = "", jugar = "";
		int elecPersonaNum = 0, elecMáquinaNum = 0;
		
		do{
			System.out.println("¿Qué quieres sacar?¿Piedra, papel o tijera?");					// Generamos al azar un número para la seleccionar la tirada.
			System.out.print("Elige ´´1`` para piedra, ´´2`` para papel y ´´3`` para tijera: ");
			elecPersonaNum = sc.nextInt();
			
			while(elecPersonaNum<1 || elecPersonaNum>3){
				System.out.print("\nLo sentimos, pero solo hay 3 opciones disponibles, y tú has elegido ´´" + elecPersonaNum + "``, que no es una opción disponible. ");
				System.out.println("Por favor, responde otra vez, muchas gracias.");
				System.out.println("\n¿Qué quieres sacar?¿Piedra, papel o tijera?");
				System.out.print("Elige ´´1`` para piedra, ´´2`` para papel y ´´3`` para tijera: ");
				elecPersonaNum = sc.nextInt();
			}
			
			switch(elecPersonaNum){					// Asignamos un nombre para cada número de la tirada.
				case 1:
					elecPersonaPala = "Piedra";
					break;
				case 2:
					elecPersonaPala = "Papel";
					break;
				case 3:
					elecPersonaPala = "Tijera";
					break;
			}
			
			System.out.println("\nTú has sacado: " + elecPersonaPala);
			
			elecMáquinaNum = (int)(Math.random()*3)+1;					// Generamos de nuevo al azar un número para la seleccionar la tirada.
			
			switch(elecMáquinaNum){					// Asignamos de nuevo un nombre para cada número de la tirada.
				case 1:
					elecMáquinaPala = "Piedra";
					break;
				case 2:
					elecMáquinaPala = "Papel";
					break;
				case 3:
					elecMáquinaPala = "Tijera";
					break;
			}
			
			System.out.println("\nLa máquina ha sacado: " + elecMáquinaPala);
			
			System.out.println();
					
			if(elecPersonaPala.equals(elecMáquinaPala)){					// Comparamos todas las combinaciones posibles de las 3 tiradas posibles enfrentadas de 2 en 2.
				System.out.println("Resultado de la partida: Empate");
			} else if(elecPersonaPala.equals("Piedra") && elecMáquinaPala.equals("Tijera") || elecPersonaPala.equals("Papel") && elecMáquinaPala.equals("Piedra") || 
										elecPersonaPala.equals("Tijera") && elecMáquinaPala.equals("Papel")){
				System.out.println("Enhorabuena, has ganado");
			} else if(elecPersonaPala.equals("Piedra") && elecMáquinaPala.equals("Papel") || elecPersonaPala.equals("Papel") && elecMáquinaPala.equals("Tijera") || 
										elecPersonaPala.equals("Tijera") && elecMáquinaPala.equals("Piedra")){
				System.out.println("Lo sentimos, la máquina ha ganado");
			}
			
			System.out.print("\n¿Quieres volver a jugar? Si quieres volver a jugar, conesta que sí, y si no quieres volver a jugar, responde cualquier otra cosa: ");
			jugar = sc.next();
			
			if((jugar.equals("sí") || jugar.equals("si") || jugar.equals("sÍ") || jugar.equals("sI") ||
					jugar.equals("Sí") || jugar.equals("Si") || jugar.equals("SÍ") || jugar.equals("SI"))){
				System.out.println();
			}
		} while(jugar.equals("sí") || jugar.equals("si") || jugar.equals("sÍ") || jugar.equals("sI") ||
								jugar.equals("Sí") || jugar.equals("Si") || jugar.equals("SÍ") || jugar.equals("SI"));
		
		System.out.println("\nJuego terminado.");
	}
}
