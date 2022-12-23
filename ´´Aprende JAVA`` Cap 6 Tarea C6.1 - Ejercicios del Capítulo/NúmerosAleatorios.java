/**
 * Escribir un programa que muestre 50 números enteros aleatorios comprendidos  * entre el -100 y el 200 ambos incluidos y separados por espacios.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmerosAleatorios{
	public static void main(String args[]){
	
		int num, numMay = -101, numMen = 201;
		double sumaNum = 0, media;
		
		System.out.println("Números aleatorios entre el -100 y el 200 separados por espacios:\n");
		
		for(int i=1; i<=50; i++){
			num = (int)(Math.random()*301)-100;					// Establecemos el rango de los números aleatorios entre el -100 y el 200 (ambos incluidos).
			sumaNum+=num;
			
			System.out.print(num + " ");
			
			if(num%2==0 && num!=0){
				if(num>numMay){					// Comparamos el nuevo número con el mayor número par, y en caso de ser mayor, lo sustituimos.
					numMay = num;
				}
			} else if(num!=0){					// Comparamos el nuevo número con el menor número impar, y en caso de ser menor, lo sustituimos.
				if(num<numMen){
					numMen = num;
				}
			}
		}
		
		media = sumaNum/50;
		
		System.out.println("\n\nEl número máximo de los pares es " + numMay);
		System.out.println("El número mínimo de los impares es " + numMen);
		System.out.printf("La media de todos los números es %.2f", media);
	}
}
