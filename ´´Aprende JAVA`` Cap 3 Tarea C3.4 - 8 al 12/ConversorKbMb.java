import java.util.Scanner;

/**
 * Realizar un conversor de Kb a Mb.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ConversorKbMb{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		double cambioKbMb = 1/1024.0;
		
		System.out.print("Por favor, introduce la cantidad de Kilobits que desees convertir a Megabits: ");
		double cantKb = s.nextDouble();
		
		double cantMb = cantKb*cambioKbMb;
		
		System.out.print(cantKb + " Kb = " + cantMb + " Mb");
	}
}
