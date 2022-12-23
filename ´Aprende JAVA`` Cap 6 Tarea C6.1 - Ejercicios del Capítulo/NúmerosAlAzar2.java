/**
 * Mostrar 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
 * Mostrar también el máximo, el mínimo y la media de esos números.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmerosAlAzar2{
	public static void main(String args[]){
	
		int numAlea, numMax = 100-1, numMin = 199+1, suma = 0;
		double media;
		
		System.out.print("50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios son: ");
		
		for(int i=1; i<=50; i++){
			numAlea = (int)(Math.random()*100)+100;
			
			System.out.print(numAlea + " ");
			
			if(numAlea<numMin){					// Comparamos el nuevo número con el mínimo hasta ese momento, y si es menor, lo cambiamos por el nuevo número.
				numMin = numAlea;
			}
			
			if(numAlea>numMax){					// Comparamos el nuevo número con el máximo hasta ese momento, y si es mayor, lo cambiamos por el nuevo número.
				numMax = numAlea;
			}
			
			suma+=numAlea;
		}
		
		media = (double) suma/50;
		
		System.out.println("\n");
		
		System.out.println("El número mínimo de todos los números de la lista es el " + numMin + "\n");
		System.out.println("El número máximo de todos los números de la lista es el " + numMax + "\n");
		System.out.println("La media de todos los números de la lista es " + media);
	}
}
