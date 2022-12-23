/**
 * Realizar un programa que muestre al azar el nombre de una carta de la baraja española, en la que no aparecerá ni el 8 ni el 9.
 * 
 * @autor Lucas Bermudo Junco
 */

public class BarajaEspañola{
	public static void main(String args[]){
	
		int numePalo = (int)(Math.random()*4)+1, numeCarta = (int)(Math.random()*10)+1;					// Generamos los números al azar tanto de los palos (4) como de las cartas (10).
		String nombrePalo = "", nombreCarta = "";
		
		switch(numePalo){					// Asignamos el número al azar del palo con el palo correspondiente.
			case 1:
				nombrePalo = "espadas";
				break;
			case 2:
				nombrePalo = "basto";
				break;
			case 3:
				nombrePalo = "oro";
				break;
			case 4:
				nombrePalo = "copas";
				break;
		}
		
		switch(numeCarta){					// Asignamos el número al azar de la carta con la carta correspondiente.
			case 1:
				nombreCarta = "as";
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
				nombreCarta = "sota";
				break;
			case 9:
				nombreCarta = "caballo";
				break;
			case 10:
				nombreCarta = "rey";
				break;
		}
		
		System.out.println("La carta elegida al azar de la baraja española es el " + nombreCarta + " de " + nombrePalo + ".");
	}
}
