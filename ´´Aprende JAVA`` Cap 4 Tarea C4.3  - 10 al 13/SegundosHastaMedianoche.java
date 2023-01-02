import java.util.Scanner;

/**
 * Escribir un programa que, dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
 * 
 * @autor Lucas Bermudo Junco
 */

public class SegundosHastaMedianoche{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int segMedianoche = 60*60*24;					// Asignamos el valor de la medianoche en segundos.
		
		System.out.println("Este programa sirve para calcular cuántos segundos quedan para llegar a la medianoche.\n");
		System.out.println("Por favor, a continuación introduce las horas, minutos y segundos para poder calcular cuántos segundos quedan hasta la medianoche, muchas gracias.\n");
		System.out.println("Las horas deben estar entre 0 y 23 ambos incluidos (con una excepción indicada más abajo);\nLos minutos, entre 0 y 59 ambos incluidos;\nLos segundos, entre 0 y 59 ambos incluidos:\n");
		System.out.println("*Como observación, en este programa se considerará las 0:0:0 y las 24:0:0 como la misma hora, por lo que sí es válido introducir las 24:0:0.\n");
		System.out.print("Horas: ");
		int hora = sc.nextInt();
		System.out.print("Minutos: ");
		int minuto = sc.nextInt();
		System.out.print("Segundos: ");
		int segundo = sc.nextInt();
		
		if((hora==24 || hora==0) && minuto==0 && segundo==0){					// Establecemos los valores que ya están en la medianoche.
			System.out.println("\nLa hora introducida es justo la medianoche, por lo que no queda ningún segundo hasta la medianoche.");
			
		} else if(hora>=0 && hora<=23 && minuto>=0 && minuto<=59 && segundo>=0 && segundo<=59){
			int segActuales = hora*60*60+minuto*60+segundo;
			int segRestantes = segMedianoche-segActuales;
			
			System.out.println("\nQuedan " + segRestantes + " segundos desde las " + hora + ":" + minuto + ":" + segundo + " hasta la medianoche.");
			
		} else{
			System.out.println("\nLo sentimos, pero la hora introducida no se encuentra dentro de las horas existentes. Si quieres volverlo a intentar, te mostramos la hora que has introducido para que puedas detectar el error, muchas gracias.");
			System.out.println("Horas: " + hora);
			System.out.println("Minutos: " + minuto);
			System.out.println("Segundos: " + segundo);
			
		}
	}
}
