package misFunciones;

import java.util.Scanner;

/**
 * Funciones de geometría.
 * 
 * @author Lucas Bermudo Junco
 */

public class Geometria{
	
	/**
	 * Devuelve el perímetro de un rectángulo.
	 * 
	 * @param ancho un número double positivo.
	 * @param alto un número double positivo.
	 * @return perimetro el perimetro del rectángulo de base ´´ancho`` y de altura ´´alto``.
	 */
	 
	public static double perimetroRectangulo(double ancho, double alto){
		
		double perimetro = ancho*2 + alto*2;					// Calculamos el perímetro del rectángulo.
		
		return perimetro;
	}
	
	/**
	 * Devuelve el área de un rectángulo.
	 * 
	 * @param ancho un número double positivo.
	 * @param alto un número double positivo.
	 * @return area el área del rectángulo de base ´´ancho`` y de altura ´´alto``.
	 */
	
	public static double areaRectangulo(double ancho, double alto){
		
		double area = ancho*alto;					// Calculamos el área del rectángulo.
		
		return area;
	}

	/**
	 * Calcula la circunferencia de un círculo y la devuelve.
	 * 
	 * @param r un número double mayor que 0.
	 * @return circunferencia un número double.
	 */
	
	public static double circunferencia(double r){
	
		double circunferencia = Math.PI*2*r;					// Calculamos la circunferencia del círculo.
		
		return circunferencia;
	}

	/**
	 * Calcula el área de un círculo y la devuelve.
	 * 
	 * @param r un número double mayor que 0.
	 * @return circunferencia un número double.
	 * @return area un número double.
	 */
	
	public static double area(double r) {
	
		double area = Math.PI*Math.pow(r,2);					// Calculamos el área del círculo.
		
		return area;
	}
}
