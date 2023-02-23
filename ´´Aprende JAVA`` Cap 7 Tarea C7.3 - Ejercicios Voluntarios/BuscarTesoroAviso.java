import java.util.Scanner;

/**
 * Mejorar el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 * 
 * @author Lucas Bermudo Junco
 */

public class BuscarTesoroAviso{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		final int VACIO = 0, MINA = 1, TESORO = 2, INTENTO = 3;
		int x, y, minaX, minaY, tesoroX, tesoroY, cantIntentos = 0;
		int[][] cuadrante = new int[5][4];
		boolean aviso = false, posOcupada, salir = false;
		String c = "";

		// Inicializamos el array con todos los espacios vacíos.
		for(x=0; x<4; x++){
			for(y=0; y<3; y++){
				cuadrante[x][y] = VACIO;
			}
		}

		// Colocamos la mina.
		minaX = (int)(Math.random()*5);
		minaY = (int)(Math.random()*4);
		cuadrante[minaX][minaY] = MINA;

		// Colocamos el tesoro en un sitio al azar excepto en el sitio donde está la mina.
		do{					// Repetimos el bucle hasta que encontremos una coordenada donde no esté la mina.
			tesoroX = (int)(Math.random()*5);
			tesoroY = (int)(Math.random()*4);
		} while(tesoroX==minaX && tesoroY==minaY);
		cuadrante[tesoroX][tesoroY] = TESORO;

		// Una vez establecido el juego, empezamos a jugarlo.
		System.out.println("\n¡BUSCA EL TESORO!\n");

		// Comenzamos a jugar.
		do{					// Repetimos el bucle mientras la partida siga en juego.
			// Pintamos el cuadrante.
			for(y=3; y>=0; y--){
				System.out.print((y+1) + "|");
				for(x=0; x<5; x++){
					if(cuadrante[x][y]==INTENTO){
						System.out.print("X ");
					} else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println(" └─────────\n  1 2 3 4 5\n");

			if(aviso){					// Si el booleano ´´aviso`` está en true, mostramos el aviso.
				System.out.println("¡CUIDADO! ¡HAY UNA MINA CERCA!\n");
			} else if(cantIntentos>0){
				System.out.println("Hueco vacío ¡Sigue probando!\n");
			}
			aviso = false;					// Antes de pedir las coordenadas al usuario, devolvemos este booleano a su valor inicial.

			// Pedimos las coordenadas al jugador.
			do {					// Realizamos el bucle hasta que el usuario introduzca unas coordenadas dentro del tablero de juego.
				posOcupada = false;					// Cada vez que pidamos una nueva coordenada al jugador, devolvemos este booleano a su valor inicial.

				System.out.println("Adivina dónde está el tesoro (¡Pero cuidado con la mina!)");
				System.out.print("Coordenada X: ");
				x = sc.nextInt();
				System.out.print("Coordenada Y: ");
				y = sc.nextInt();

				if(x<1 || x>5 || y<1 || y>4){
					System.out.println("\nLas coordenadas no se encuentran dentro del tablero de juego. Por favor, vuelva a introducirlas.\n");
				} else if(cuadrante[x-1][y-1]==INTENTO){
					System.out.println("\nEsa posición ya ha sido elegida previamente. Por favor, vuelva a introducir las coordenadas.\n");
					posOcupada = true;
				}
			}while(x<1 || x>5 || y<1 || y>4 || posOcupada);

			// Colocamos las coordenadas elegidas en su posición correcta dentro del array (es decir, 1 posición más pequeña.)
			x--;
			y--;

			System.out.println();

			// Comparamos las coordenadas introducidas por el usuario con las coordenadas del juego y procedemos según toque.
			switch(cuadrante[x][y]){
				case VACIO:
					cuadrante[x][y] = INTENTO;
					break;
				case MINA:
					System.out.println("\nLo siento, has perdido.\n");
					salir = true;
					break;
				case TESORO:
					System.out.println("\n¡Enhorabuena! ¡Has encontrado el tesoro!\n");
					salir = true;
					break;
			}

			// En caso de haber una mina cerca, cambiamos el booleano ´´aviso`` a true para posteriormente mostrar un mensaje de aviso.
			if((x==(minaX) && y==(minaY+1)) || (x==(minaX+1) && y==(minaY+1)) || (x==(minaX+1) && y==(minaY)) ||
					(x==(minaX+1) && y==(minaY-1)) || (x==(minaX) && y==(minaY-1)) || (x==(minaX-1) && y==(minaY-1)) ||
					(x==(minaX-1) && y==(minaY)) || (x==(minaX-1) && y==(minaY+1))){
				aviso = true;
			}
			
			cantIntentos++;
		} while(!salir);

		// Pintamos el cuadrante final.
		for(y=3; y>=0; y--){
			System.out.print((y+1) + "|");
			for(x=0; x<5; x++){
				switch(cuadrante[x][y]){
					case VACIO:
						c = "  ";
						break;
					case MINA:
						c = "* ";
						break;
					case TESORO:
						c = "# ";
						break;
					case INTENTO:
						c = "X ";
						break;
					default:
				}
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println(" └─────────\n  1 2 3 4 5\n");
	}
}
