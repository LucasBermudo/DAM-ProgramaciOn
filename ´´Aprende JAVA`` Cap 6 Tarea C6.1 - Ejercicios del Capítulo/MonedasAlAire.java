/**
 * Realizar un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire.
 * 
 * @autor Lucas Bermudo Junco
 */

public class MonedasAlAire{
	public static void main(String args[]){
	
		int numeMon, numeLanz;
		String nombreMon = "", nombreLanz = "";
		
		System.out.println("5 lanzamientos de monedas:\n");
		
		for(int i=1; i<=5; i++){
			numeMon = (int)(Math.random()*8)+1;					// Generamos al azar un número para seleccionar la moneda.
			
			switch(numeMon){					// Asignamos un nombre para cada número generado.
				case 1:
					nombreMon = "1 céntimo";
					break;
				case 2:
					nombreMon = "2 céntimos";
					break;
				case 3:
					nombreMon = "5 céntimos";
					break;
				case 4:
					nombreMon = "10 céntimos";
					break;
				case 5:
					nombreMon = "20 céntimos";
					break;
				case 6:
					nombreMon = "50 céntimos";
					break;
				case 7:
					nombreMon = "1 euro";
					break;
				case 8:
					nombreMon = "2 euros";
					break;
			}
			
			numeLanz = (int)(Math.random()*2)+1;					// Generamos al azar un número para seleccionar el lanzamiento.
			
			switch(numeLanz){					// Asignamos un nombre para cada número generado.
				case 1:
					nombreLanz = "cara";
					break;
				case 2:
					nombreLanz = "cruz";
					break;
			}
			
			System.out.printf("%-11s", nombreMon);
			System.out.println(" - " + nombreLanz);
		}
	}
}
