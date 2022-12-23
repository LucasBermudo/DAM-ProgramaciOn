/**
 * Escribir un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @autor Lucas Bermudo Junco
 */

public class Quiniela{
	public static void main(String args[]){
	
		int i, j, resultado;
		String equipo1 = "", equipo2 = "", apuesta = "";
		
		System.out.println("Quiniela Jornada 3 La Liga Temporada 2022-2023\n");
		System.out.printf("%-30s %-10s %-10s %-10s", "PARTIDO", "Apuesta 1", "Apuesta 2", "Apuesta 3");
		System.out.println("\n");
		
		for(i=1; i<=15; i++){
			
			if(i==15){
				System.out.println("\nPLENO AL 15\n");
			}
			
			switch(i){					// Establecemos los equipos que juegan ese partido.
				case 1:
				equipo1 = "Málaga";
				equipo2 = "Granada";
				break;
				case 2:
				equipo1 = "Levante";
				equipo2 = "Valladolid";
				break;
				case 3:
				equipo1 = "Valencia";
				equipo2 = "Sevilla";
				break;
				case 4:
				equipo1 = "Cádiz";
				equipo2 = "Zaragoza";
				break;
				case 5:
				equipo1 = "Huesca";
				equipo2 = "Deportivo";
				break;
				case 6:
				equipo1 = "Oviedo";
				equipo2 = "Ath. Bilbao";
				break;
				case 7:
				equipo1 = "Real Sociedad";
				equipo2 = "Getafe";
				break;
				case 8:
				equipo1 = "Betis";
				equipo2 = "Español";
				break;
				case 9:
				equipo1 = "Celta de Vigo";
				equipo2 = "Racing Sant.";
				break;
				case 10:
				equipo1 = "Gran Canaria";
				equipo2 = "Tenerife";
				break;
				case 11:
				equipo1 = "Córdoba";
				equipo2 = "Albacete";
				break;
				case 12:
				equipo1 = "Cáceres";
				equipo2 = "León";
				break;
				case 13:
				equipo1 = "Salamanca";
				equipo2 = "Jaén";
				break;
				case 14:
				equipo1 = "Atlético";
				equipo2 = "Villarreal";
				break;
				case 15:
				equipo1 = "Madrid";
				equipo2 = "Barcelona";
				break;
			}
			
			System.out.printf("%-15s %-15s", equipo1, equipo2);
			
			for(j=1; j<=3; j++){					// Establecemos los 3 resultados del partido en cuestión.
				resultado = (int)(Math.random()*3+1);
			
				switch(resultado){
					case 1:
						apuesta = "1";
						break;
					case 2:
						apuesta = "X";
						break;
					case 3:
						apuesta = "2";
				}
				
				System.out.printf("%-10s", apuesta);
			}
			
			System.out.println();
		}
	}
}
