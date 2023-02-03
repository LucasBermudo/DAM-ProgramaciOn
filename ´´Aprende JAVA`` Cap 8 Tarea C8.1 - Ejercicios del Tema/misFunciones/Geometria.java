package misFunciones;

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
}
