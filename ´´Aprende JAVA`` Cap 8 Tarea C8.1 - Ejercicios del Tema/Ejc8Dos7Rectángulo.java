import java.util.Scanner;
import misFunciones.Geometria;

/**
 * Escribir un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y su perímetro.
 * Implementar y utilizar las funciones:
 * double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 * double areaRectangulo(double ancho, double alto) // Devuelve el área
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8Dos7Rectángulo{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca, separado por un espacio, el ancho y el alto del rectángulo del cual desee saber su perímetro y su área: ");
		int ancho = sc.nextInt();
		int alto = sc.nextInt();
		
		while(ancho<=0 || alto<=0){					// Impedimos que el usuario introduzca tanto un ancho como un alto menores o iguales a 0.
			System.out.println("Lo sentimos, pero tanto el ancho como el alto tienen que ser mayores que 0. Por favor, vuelva a introducirlos.");
			System.out.println("Introduzca, separado por un espacio, el ancho y el alto del rectángulo del cual desee saber su perímetro y su área: ");
			ancho = sc.nextInt();
			alto = sc.nextInt();
		}
		
		System.out.println("\nEl perímetro del rectángulo de ancho " + ancho + " unidades y de alto " + alto + " unidades es " + Geometria.perimetroRectangulo(ancho, alto) + " unidades.");
		
		System.out.println("\nEl área del rectángulo de ancho " + ancho + " unidades y de alto " + alto + " unidades es " + Geometria.areaRectangulo(ancho, alto) + " unidades cuadradas.");
	}
}
