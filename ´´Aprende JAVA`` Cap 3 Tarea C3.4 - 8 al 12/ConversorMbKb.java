import java.util.Scanner;

/**
 * Realizar un conversor de Mb a Kb.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ConversorMbKb{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		double cambioMbKb = 1024;
		
		System.out.print("Por favor, introduce la cantidad de Megabits que desees convertir a Kilobits: ");
		double cantMb = s.nextDouble();
		
		double cantKb = cantMb*1024;
		
		System.out.print(cantMb + " Mb = " + cantKb + " Kb");
	}
}
