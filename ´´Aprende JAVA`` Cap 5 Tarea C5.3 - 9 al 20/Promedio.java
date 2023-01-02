import java.util.Scanner;

/**
 * Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
 * El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Promedio{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int i = 1;
		double numAct = 0, sumNum= 0;
		
		System.out.print("Introduce el " + i + "º número: ");
		numAct = sc.nextDouble();
		
		if(numAct<0){
			System.out.println("\nComo el primer número que has introducido es negativo, no se ha llegado a realizar la media de ningún número.");
		} else{
			
			sumNum+=numAct;
			i++;
			
			while(numAct>=0){					// Establecemos el final de la suma.
				System.out.print("Introduce el " + i + "º número: ");
				numAct = sc.nextDouble();
				
				if(numAct>=0){
					sumNum+=numAct;
					i++;
				} else{
					i--;
				}
			}
			
			int cantNum = i;
			double prom = sumNum/cantNum;
			
			System.out.println("\nSuma de los números = " + sumNum);
			System.out.println("Cantidad de números = " + cantNum);
			System.out.println("La media de todos los números introducidos es = " + prom);
		}
	}
}
