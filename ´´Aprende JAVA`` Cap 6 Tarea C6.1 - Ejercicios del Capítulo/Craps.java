import java.util.Scanner;

/**
 * Realizar el juego del “Craps”.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Craps{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int dado1, dado2, sumaDados1 = 0, sumaDados2 = 0;
		double apuesta, premio;
		
		System.out.println("Bienvenido al juego Craps");
		System.out.println("*************************\n");
		System.out.println("Las reglas son las siguientes: Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar. Se " +
															"muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u 11, " +
															"el jugador gana la misma cantidad que apostó y termina la partida. Por ej. si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. " +
															"Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. " +
															"Si no se da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. " +
															"En esta etapa, el jugador buscará volver a obtener ese número en los dados. Si consigue repetir ese número, gana. " +
															"Si sale un 7, pierde. Si sale otro número, tiene que seguir tirando.\n");
		
		System.out.print("Introduce cuánto dinero quieres apostar en Euros: ");
		apuesta = sc.nextDouble();
		
		while(apuesta<=0){
			System.out.println("\nLo sentimos, pero la cantidad apostada tiene que ser mayor que 0. Por favor, vuelve a introducir cuánto quieres apostar en Euros.");
			System.out.print("Introduce cuánto dinero quieres apostar en Euros: ");
			apuesta = sc.nextDouble();
		}
		
		System.out.println("\nHas apostado " + apuesta + " Euros.\n");
		
		dado1 = (int)(Math.random()*6+1);					// Generamos para los dados 2 números aleatorios entre el 1 y el 6 (ambos incluidos).
		dado2 = (int)(Math.random()*6+1);
		
		sumaDados1 = dado1+dado2;
		
		System.out.println("Dado 1: " + dado1 + "\n");
		System.out.println("Dado 2: " + dado2 + "\n");
		System.out.println("Suma de los 2 dados = " + sumaDados1 + "\n");
		
		if(sumaDados1==7 || sumaDados1==11){					// Comparamos la suma de los dados y procedemos según ella.
			premio = apuesta*2;
			System.out.println("Enhorabuena, has ganado " + premio + " Euros.");
		} else if(sumaDados1==2 || sumaDados1==3 || sumaDados1==12){
			System.out.println("Lo sentimos, has perdido la partida.");
		} else{
			System.out.println("El juego entra en la segunda fase.\n");
			System.out.println("Por favor, tira de nuevo los dados.\n");
			
			while(sumaDados2!=sumaDados1 && sumaDados2!=7){					// Entramos en la segunda etapa y acabamos el juego cuando la nueva suma sea la misma que la primera suma o cuando sea 7.
				dado1 = (int)(Math.random()*6+1);
				dado2 = (int)(Math.random()*6+1);
				
				sumaDados2 = dado1+dado2;
				
				System.out.println("Dado 1: " + dado1 + "\n");
				System.out.println("Dado 2: " + dado2 + "\n");
				System.out.println("Suma de los 2 dados = " + sumaDados2 + "\n");
				
				if(sumaDados2==sumaDados1){					// Mostramos el resultado de la segunda etapa del juego .
					System.out.println("Suma de los 2 dados de la 1ª tirada = " + sumaDados1 + "\n");
					premio = apuesta*2;
					System.out.println("Enhorabuena, has ganado " + premio + " Euros.");
				} else if(sumaDados2==7){
					System.out.println("Lo sentimos, has perdido la partida.");
				} else{
					System.out.println("Suma de los 2 dados de la 1ª tirada = " + sumaDados1 + "\n");
					System.out.println("La partida sigue en juego\n");
					System.out.println("Por favor, tira de nuevo los dados.\n");
				}
			}
		}
	}
}
