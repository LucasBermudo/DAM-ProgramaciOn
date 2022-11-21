import java.util.Scanner;

/**
 * 
 * 
 * @autor Lucas Bermudo Junco
 */

public class ViajeMálagaMadrid{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación, se detallará el trayecto desde Málaga a Madrid.");
		
		System.out.print("Por favor, sin usar tildes, introduce el lugar desde el que comenzarás el viaje: ");
		String comienzo = sc.nextLine();
		String comienzoSwitch = comienzo.toLowerCase();
						
		if(comienzoSwitch.equals("malaga") || comienzoSwitch.equals("casabermeja") || comienzoSwitch.equals("villanueva del trabuco") || comienzoSwitch.equals("villanueva del rosario")
		|| comienzoSwitch.equals("loja") || comienzoSwitch.equals( "huetor tajar") || comienzoSwitch.equals("granada") || comienzoSwitch.equals("iznalloz")
		|| comienzoSwitch.equals("noalejo") || comienzoSwitch.equals("pegalajar") || comienzoSwitch.equals("jaen") || comienzoSwitch.equals("bailen")
		|| comienzoSwitch.equals("almuradiel") || comienzoSwitch.equals("valdepeñas") || comienzoSwitch.equals("ciudad real") || comienzoSwitch.equals("puerto lapice")
		|| comienzoSwitch.equals("consuegra") || comienzoSwitch.equals("tembleque") || comienzoSwitch.equals("toledo") || comienzoSwitch.equals("ocaña")
		|| comienzoSwitch.equals("aranjuez") || comienzoSwitch.equals("valdemoro") || comienzoSwitch.equals("pinto")){
			
			String trayecto = "";

			switch(comienzoSwitch){
				case "malaga":
					trayecto += "Málaga, ";
				case "casabermeja":
					trayecto += "Casabermeja, ";
				case "villanueva del trabuco":
					trayecto += "Villanueva del Trabuco, ";
				case "villanueva del rosario":
					trayecto += "Villanueva del Rosario, ";
				case "loja":
					trayecto += "Loja, ";
				case  "huetor tajar":
					trayecto +=  "Huétor Tájar, ";
				case "granada":
					trayecto += "Granada, ";
				case "iznalloz":
					trayecto += "Iznalloz, ";
				case "noalejo":
					trayecto += "Noalejo, ";
				case "pegalajar":
					trayecto += "Pegalajar, ";
				case "jaen":
					trayecto += "Jaén, ";
				case "bailen":
					trayecto += "Bailén, ";
				case "almuradiel":
					trayecto += "Almuradiel, ";
				case "valdepeñas":
					trayecto += "Valdepeñas, ";
				case "ciudad real":
					trayecto += "Ciudad Real, ";
				case "puerto lapice":
					trayecto += "Puerto Lápice, ";
				case "consuegra":
					trayecto += "Consuegra, ";
				case "tembleque":
					trayecto += "Tembleque, ";
				case "toledo":
					trayecto += "Toledo, ";
				case "ocaña":
					trayecto += "Ocaña, ";
				case "aranjuez":
					trayecto += "Aranjuez, ";
				case "valdemoro":
					trayecto += "Valdemoro, ";
				case "pinto":
					trayecto += "Pinto ";
					break;
			}
			
			 trayecto += "y Madrid";
			 comienzo = comienzo.toUpperCase().charAt(0) + comienzo.substring(1, comienzo.length());
			 System.out.println("\nEl trayecto desde " + comienzo + " hasta Madrid pasa por las siguientes ciudades:");
			 System.out.println(trayecto);
			 
		} else if(comienzoSwitch.equals("madrid")){
			
		 System.out.println("Has elegido que el comienzo de tu viaje a Madrid sea la propia Madrid, así que ¡Enhorabuena, en ese caso ya estarías en Madrid!");
		 
		} else{
			
		System.out.println("\nLo sentimos, pero el lugar que has introducido (" + comienzo + ") no se encuentra dentro del trayecto de Málaga a Madrid.\n");
		System.out.println("Es posible que haya ocurrido alguno de los siguientes problemas:");
		System.out.println("· El lugar se encuentra dentro del recorrido pero no se ha tenido en cuenta en este viaje.");
		System.out.println("· Has introducido mal el lugar (incluido las tildes, pero las mayúsculas y minúsculas no importan).");
		System.out.println("· El lugar no se encuentra dentro del trayecto.\n");
		System.out.println("Si quieres obtener el trayecto a Madrid, por favor reinicia el programa y asegúrate de introducir un valor válido, muchas gracias.");
		
		}
	}
}
