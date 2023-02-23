import java.util.Scanner;

/**
 * Realizar el juego del tres en raya.
 * 
 * @author Lucas Bermudo Junco
 */

public class TresEnRaya{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int cantFilas = 3, cantColumnas = 3, turno, jugadorActual, jugadorSiguiente, filaElegida, columnaElegida;
		String[][] tabla = new String[cantFilas][cantColumnas];
		String caracter, nuevaPartida;
		boolean empate, fin;
		
		System.out.println("Bienvenidos al juego del TRES EN RAYA");

		do {                    // Permitimos jugar tantas veces como se quiera.
			System.out.println("\nEl jugador que empiece la partida usará la ficha ´´o``.\nEl segundo jugador usará la ficha ´´x``.\n");

			// Cada vez que empecemos a jugar una partida, establecemos este/estos valor(es) a su(s) posición(es) original(es).

			turno = 1;
			fin = false;

			// Rellenamos la tabla con espacios vacíos.

			for (int i = 0; i < cantFilas; i++) {
				for (int j = 0; j < cantColumnas; j++) {
					tabla[i][j] = " ";
				}
			}

			do {					// Jugamos la partida hasta que alguien gane o hasta que no queden huecos libres.
				empate = true;					// Cada turno, establecemos este/estos valor(es) a su(s) posición(es) original(es).

				// Dibujamos la tabla con las fichas actuales.

				for (int i = (cantFilas - 1); i >= 0; i--) {
					System.out.print((i + 1) + " | ");

					for (int j = 0; j < cantColumnas; j++) {
						System.out.print(tabla[i][j] + "  ");
					}

					System.out.println("\n  |");
				}

				System.out.println("  └────────");
				System.out.println("    1  2  3");

				// Cambiamos el caracter y los jugadores cada turno.

				if (turno % 2 == 1) {
					caracter = "o";
					jugadorActual = 1;
					jugadorSiguiente = 2;
				} else {
					caracter = "x";
					jugadorActual = 2;
					jugadorSiguiente = 1;
				}

				do {                    // Pedimos al usuario las coordenadas de su intento.
					do {                    // Comprobamos que la posición elegida sea válida.
						System.out.print("\nJugador " + jugadorActual + ", introduzca la posición (fila y columna separadas por un espacio): ");
						filaElegida = sc.nextInt();
						filaElegida--;
						columnaElegida = sc.nextInt();
						columnaElegida--;

						if (filaElegida < 0 || filaElegida > 2 || columnaElegida < 0 || columnaElegida > 2) {
							System.out.println("\nLa posición elegida no se encuentra dentro de la tabla (filas y columnas de la 1 a la 3 ambas incluidas). Por favor, introdúzcala de nuevo.");
						}
					} while (filaElegida < 0 || filaElegida > 2 || columnaElegida < 0 || columnaElegida > 2);                    // No dejamos continuar el juego hasta que el jugador introduzca una posición válida.

					if (!tabla[filaElegida][columnaElegida].equals(" ")) {                    // Si la posición ya está ocupada, avisamos al jugador.
						System.out.println("\nPosición ya ocupada. Por favor, elija otra que no esté ocupada.");
					}
				} while (!tabla[filaElegida][columnaElegida].equals(" "));                    // No dejamos continuar el juego hasta que el jugador actual rellene una posición vacía.

				System.out.println();

				tabla[filaElegida][columnaElegida] = caracter;                    // Una vez comprobado que la posición no estaba ocupada, introducimos su elección en la tabla.

				// Comprobamos si quedan huecos libres para saber si se ha producido un empate.

				for (int i = 0; i < cantFilas; i++) {
					for (int j = 0; j < cantColumnas; j++) {
						if (tabla[i][j].equals(" ")) {
							empate = false;
							break;
						}
					}
				}

				// Comparamos la tirada del jugador actual con las combinaciones ganadoras y con el empate.

				if ((tabla[0][0].equals(caracter) && tabla[0][1].equals(caracter) && tabla[0][2].equals(caracter)) ||
						(tabla[1][0].equals(caracter) && tabla[1][1].equals(caracter) && tabla[1][2].equals(caracter)) ||
						(tabla[2][0].equals(caracter) && tabla[2][1].equals(caracter) && tabla[2][2].equals(caracter)) ||
						(tabla[0][0].equals(caracter) && tabla[1][0].equals(caracter) && tabla[2][0].equals(caracter)) ||
						(tabla[0][1].equals(caracter) && tabla[1][1].equals(caracter) && tabla[2][1].equals(caracter)) ||
						(tabla[0][2].equals(caracter) && tabla[1][2].equals(caracter) && tabla[2][2].equals(caracter)) ||
						(tabla[0][0].equals(caracter) && tabla[1][1].equals(caracter) && tabla[2][2].equals(caracter)) ||
						(tabla[0][2].equals(caracter) && tabla[1][1].equals(caracter) && tabla[2][0].equals(caracter)) ||
						empate) {
					fin = true;
				}

				turno++;                    // Avanzamos el turno.
			} while (!fin);

			// Dibujamos la tabla con las fichas finales.

			for (int i = (cantFilas - 1); i >= 0; i--) {
				System.out.print((i + 1) + " | ");

				for (int j = 0; j < cantColumnas; j++) {
					System.out.print(tabla[i][j] + "  ");
				}

				System.out.println("\n  |");
			}

			System.out.println("  └────────");
			System.out.println("    1  2  3");

			// Mostramos un mensaje con el resultado de la partida.

			if(!empate){
				System.out.println("\nEnhorabuena, jugador " + jugadorActual + ", ¡has ganado!.");
				System.out.println("\nLo sentimos, jugador " + jugadorSiguiente + ", ¡sigue intentándolo!");
			}else{
				System.out.println("\n¡Empate! La partida ha terminado en empate. ¡Buena partida, jugadores!");
			}

			do{					// Preguntamos al usuario si quiere repetir la partida.
				System.out.print("\n¿Quieren ustedes jugar otra partida? Por favor, respondan sí o no: ");
				nuevaPartida = sc.next();
				nuevaPartida = nuevaPartida.toLowerCase();

				if(!nuevaPartida.equals("sí") && !nuevaPartida.equals("si") && !nuevaPartida.equals("no")){
					System.out.println("""
							Lo sentimos, pero la respuesta introducida no se encuentra dentro de las posibles respuestas.\s
							Por favor, vuelva a contestar la pregunta, muchas gracias.
							""");
				}
			}while(!nuevaPartida.equals("sí") && !nuevaPartida.equals("si") && !nuevaPartida.equals("no"));

			if(nuevaPartida.equals("sí") || nuevaPartida.equals("si")){
				System.out.println("\n¡Entonces empecemos la partida de nuevo!");
			}
		}while(nuevaPartida.equals("sí") || nuevaPartida.equals("si"));

		System.out.println("\n¡Gracias por jugar! ¡Hasta pronto!");
	}
}
