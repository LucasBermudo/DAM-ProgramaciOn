import java.util.Scanner;

/**
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil que se encuentra en esa posición.
 * Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con 64 casillas.
 * Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
 * 
 * @author Lucas Bermudo Junco
 */

public class AjedrezMovimientosAlfil{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int filaElegida, columnaElegidaNum, m = 1;
		String columnaElegidaLetra;
		char cuadrado = (char)9632;
		String casillaValida = String.valueOf(cuadrado) + cuadrado;
		String[][] tablero = new String[8][8];

		// Dibujamos el tablero de ajedrez.
		System.out.println("\n TABLERO DE AJEDREZ\n");
		System.out.println("   ┌──┬──┬──┬──┬──┬──┬──┬──┐");
		for(int i=8; i>=2; i--){
			System.out.println(" " + i + " |  |  |  |  |  |  |  |  |");
			System.out.println("   ├──┼──┼──┼──┼──┼──┼──┼──┤");
		}
		System.out.println(" 1 |  |  |  |  |  |  |  |  |");
		System.out.println("   └──┴──┴──┴──┴──┴──┴──┴──┘");
		System.out.println("    A  B  C  D  E  F  G  H");

		// Pedimos al usuario la posición del alfil.
		do{					// No salimos del bucle hasta que el usuario haya metido una posición dentro del tablero.
			System.out.println("\nIntroduzca la posición del alfil para saber cuáles son los movimientos que puede hacer.");
			System.out.print("Fila (de la 1 a la 8): ");
			filaElegida = sc.nextInt();
			System.out.print("Columna (de la A a la H): ");
			columnaElegidaLetra = sc.next();
			columnaElegidaLetra = columnaElegidaLetra.toUpperCase();

			// Asignamos el número correspondiente a la letra del tablero para usar las coordenadas en forma numérica.
			switch (columnaElegidaLetra) {
				case "A" -> columnaElegidaNum = 1;
				case "B" -> columnaElegidaNum = 2;
				case "C" -> columnaElegidaNum = 3;
				case "D" -> columnaElegidaNum = 4;
				case "E" -> columnaElegidaNum = 5;
				case "F" -> columnaElegidaNum = 6;
				case "G" -> columnaElegidaNum = 7;
				case "H" -> columnaElegidaNum = 8;
				default  -> columnaElegidaNum = 0;
			}

			if(filaElegida<1 || filaElegida>8 || columnaElegidaNum==0){
				System.out.println("""
						\nLo sentimos, pero la posición elegida para el alfil no se encuentra dentro del tablero de ajedrez.
						Por favor, vuelva a introducirla.""");
			}
		}while(filaElegida<1 || filaElegida>8 || columnaElegidaNum==0);

		// Asignamos la posición elegida dentro del array del tablero (es decir, con una posición menos en cada coordenada);
		filaElegida--;
		columnaElegidaNum--;

		//Rellenamos el tablero con el alfil y el resto de casillas vacías.
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if(i==filaElegida && j==columnaElegidaNum){
					tablero[i][j] = "&&";
				} else{
					tablero[i][j] = "  ";
				}
			}
		}

		// Establecemos los posibles movimientos del alfil.
		while(filaElegida-m>=0 && columnaElegidaNum-m>=0){
			tablero[filaElegida-m][columnaElegidaNum-m] = casillaValida;

			m++;
		}
		m = 1;
		while(filaElegida+m<8 && columnaElegidaNum-m>=0){
			tablero[filaElegida+m][columnaElegidaNum-m] = casillaValida;

			m++;
		}
		m = 1;
		while(filaElegida+m<8 && columnaElegidaNum+m<8){
			tablero[filaElegida+m][columnaElegidaNum+m] = casillaValida;

			m++;
		}
		m = 1;
		while(filaElegida-m>=0 && columnaElegidaNum+m<8){
			tablero[filaElegida-m][columnaElegidaNum+m] = casillaValida;

			m++;
		}

		// Dibujamos el tablero con el alfil y los movimientos que puede hacer.
		System.out.println("\n POSIBLES MOVIMIENTOS DEL ALFIL\n");
		System.out.println("   ┌──┬──┬──┬──┬──┬──┬──┬──┐");
		for(int i=7; i>=0; i--){
			System.out.print(" " + (i+1) + " |");
			for(int j=0; j<8; j++){
				System.out.print(tablero[i][j] + "|");
			}
			if(i>0){
				System.out.println("\n   ├──┼──┼──┼──┼──┼──┼──┼──┤");
			}
		}
		System.out.println("\n   └──┴──┴──┴──┴──┴──┴──┴──┘");
		System.out.println("    A  B  C  D  E  F  G  H");
	}
}
