import java.util.Scanner;

/**
 * Realizar un programa que, dado un día de la semana (de lunes a viernes) y una hora, calcule cuántos minutos faltan para el fin de semana,
 * considerando que el fin de semana comienza el viernes a las 15:00h y dando por hecho que el usuario introducirá un día y hora correctos,
 * anterior al viernes a las 15:00h.
 *
 * @autor Lucas Bermudo Junco.
 */

public class MinutosRestantes{
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
																
		System.out.print("Por favor, introduce el número del día de la semana: ");
		int día = sc.nextInt();
		System.out.print("Por favor, introduce la hora: ");
		int horas = sc.nextInt();
		System.out.print("Por favor, introduce los minutos: ");
		int minutos = sc.nextInt();
		
		int minActuales = (minutos+horas*60+(día-1)*60*24);					// Transformamos las horas, minutos y segundos en segundos.
		int minFinSem = (60*24*4+60*15);					// Calculamos los segundos del fin de semana.
		
		int minRestantes = minFinSem - minActuales;
		
		System.out.println("\nQuedan " + minRestantes + " minutos desde las " + horas + ":" + minutos + " del " + día + "º día de la semana hasta el fin de semana.");
	}
}
