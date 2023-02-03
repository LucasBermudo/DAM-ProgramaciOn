package misFunciones;

/**
 * Funciones varias.
 * 
 * @author Lucas Bermudo Junco
 */

public class Varias{
	
	/**
	 * Devuelve la multiplicación de dos números.
	 * 
	 * @param a un número double.
	 * @param b un número double.
	 * @return producto el producto de a*b.
	 */
	
	public static double multiplica(double a, double b){
	
		double producto = a*b;					// Calculamos el producto de ´´a`` y ´´b``.
		
		return producto;
	}
	
	/**
	 * Devuelve el menor de 2 números.
	 * 
	 * @param a un número double.
	 * @param b un número double.
	 * @return min el número menor entre a y b.
	 */
	
	public static int minimo(int a, int b){
		
		if(a<b){					// Devolvemos el valor mínimo entre ´´a`` y ´´b``.
			return a;
		} else{
			return b;
		}
	}
	
	/**
	 * Muestra si es positivo, negativo o cero.
	 * 
	 * @param a un número entero.
	 * @return -1 si a es negativo.
	 * @return 0 si a es 0.
	 * @return 1 si a es positivo.
	 */
	
	public static int dimeSigno(int a){
		
		if(a>0){					// Devolvemos 1 si ´´a`` es positivo, 0 si es 0 y -1 si es negativo.
			return 1;
		} else if(a==0){
			return 0;
		} else{
			return -1;
		}
	}
	
	/**
	 * Devuelve la suma de enteros de 1 a n.
	 * 
	 * @param n un número entero positivo.
	 * @return suma la suma de de enteros de 1 a n.
	 */
	 
	public static int suma1aN(int n){
	
		int suma = 1;
		
		for(int i=2; i<=n; i++){					// Calculamos el sumatorio de todos los números entre 1 y ´´n``.
			suma+=i;
		}
		
		return suma;
	}
	 
	/**
	 * Devuelve el producto de enteros de 1 a n.
	 * 
	 * @param n un número entero positivo.
	 * @return producto el producto de enteros de 1 a n.
	 */
	 
	public static int producto1aN(int n){
		
		double producto = 1;
		
		for(int i=2; i<=n; i++){					// Calculamos el producto de todos los números entre 1 y ´´n``.
			producto*=i;
		}
		
		return (int)(producto);
	}
	 
	/**
	 * Devuelve el valor intermedio entre 1 y n.
	 * 
	 * @param n un número entero positivo.
	 * @return media el valor intermedio entre 1 y n.
	 */
	 
	public static double intermedio1aN(int n){
		
		double suma = 1, cantNum = 1;
		
		for(int i=2; i<=n; i++){					// Calculamos el sumatorio de todos los números entre 1 y ´´n``.
			suma+=i;
			cantNum++;
		}
		
		double media = suma/cantNum;					// Calculamos la media de todos los números entre 1 y ´´n``.
		
		return media;
	}
}















