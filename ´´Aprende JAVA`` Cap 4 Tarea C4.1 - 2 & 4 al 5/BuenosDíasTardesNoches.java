/**
 * Realizar un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora.
 * 
 * @autor Lucas Bermudo Junco
 */

public class BuenosDíasTardesNoches{
	public static void main(String args[]){
			
		System.out.print("¿Qué hora es ahora mismo? Por favor, introduce solamente la hora, sin los minutos ni segundos: ");
		String línea = System.console().readLine();
		int hora = Integer.parseInt(línea);
		
		if(hora >= 0 && hora <= 23){
			if(hora >= 6 && hora <= 12){
			System.out.println("Buenos días, ¡que tengas un buen día!");
			} else if(hora >= 13 && hora <= 20){
			System.out.println("Buenas tardes, ¡que tengas una buena tarde!");
			} else {
			System.out.println("Buenas noches, ¡que tengas un buen descanso!");
			}		
		} else if(hora == 24){
		System.out.println("Lo sentimos, pero la hora introducida (" + hora + ") no existe. Puede que te estuvieras refiriendo a las 12 de la noche, en cuyo caso, te deseo buenas noches, ¡que tengas un buen descanso!");
		} else {
		System.out.println("Lo sentimos, pero la hora introducida no existe.");
		}
	}
}
