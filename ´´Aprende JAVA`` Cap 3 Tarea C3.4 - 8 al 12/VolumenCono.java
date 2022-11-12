import java.util.Scanner;
import java.lang.Math;

/**
 * Calcular el volumen de un cono.
 * 
 * @autor Lucas Bermudo Junco
 */

public class VolumenCono{
	public static void main(String args[]){
	
		final double pi = 3.141592;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduce el radio del cono: ");
		double radio = s.nextDouble();
		
		System.out.print("Por favor, introduce la altura del cono: ");
		double altura = s.nextDouble();
		
		double volCono = (1/3.0)*pi*Math.pow(radio,2)*altura;
		
		System.out.print("El volumen de un cono de radio " + radio + " y de altura " + altura + " unidades es = ");
		System.out.printf("%.4f", volCono);
		System.out.print(" unidades^3");
	}
}
