/**
 * Realizar un programa que muestre al azar el nombre de una carta de la baraja francesa.
 * 
 * @autor Lucas Bermudo Junco
 */

public class BarajaFrancesa{
	public static void main(String args[]){
	
		int numePalo = (int)(Math.random()*4)+1, numeCarta = (int)(Math.random()*13)+1;						// Generamos los números al azar tanto de los palos (4) como de las cartas (13).
		String nombrePalo = "", nombreCarta = "";
		
		switch(numePalo){					// Asignamos el número al azar del palo con el palo correspondiente.
			case 1:
				nombrePalo = "picas";
				break;
			case 2:
				nombrePalo = "corazones";
				break;
			case 3:
				nombrePalo = "diamantes";
				break;
			case 4:
				nombrePalo = "tréboles";
				break;
		}
		
		switch(numeCarta){					// Asignamos el número al azar de la carta con la carta correspondiente.
			case 1:
				nombreCarta = "A";
				break;
			case 2:
				nombreCarta = "2";
				break;
			case 3:
				nombreCarta = "3";
				break;
			case 4:
				nombreCarta = "4";
				break;
			case 5:
				nombreCarta = "5";
				break;
			case 6:
				nombreCarta = "6";
				break;
			case 7:
				nombreCarta = "7";
				break;
			case 8:
				nombreCarta = "8";
				break;
			case 9:
				nombreCarta = "9";
				break;
			case 10:
				nombreCarta = "10";
				break;
			case 11:
				nombreCarta = "J";
				break;
			case 12:
				nombreCarta = "Q";
				break;
			case 13:
				nombreCarta = "K";
				break;
		}
		
		System.out.println("La carta elegida al azar de la baraja francesa es el " + nombreCarta + " de " + nombrePalo + ".");
	}
}
