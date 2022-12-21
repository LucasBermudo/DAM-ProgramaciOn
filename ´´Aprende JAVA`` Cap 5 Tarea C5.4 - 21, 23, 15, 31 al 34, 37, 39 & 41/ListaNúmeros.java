import java.util.Scanner;

/**
 * Realizar un programa que vaya pidiendo números hasta que se introduzca un numero negativo
 * y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ListaNúmeros{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num = 0, contNum = 0, mayorPar = 0, sumaImpar = 0, cantImpar = 0;
		double mediaImpar;
		
		System.out.print("Por favor, introduce números positivos hasta que quieras terminar. ");
		System.out.println("Cuando quieras terminar, introduce un número negativo, que no entrara dentro del recuento.\n");
		
		for(int i=1; num>=0; i++){
			System.out.print(i + "º número: ");
			num = sc.nextInt();
			
			if(num%2==0){								// Escogemos los números pares
				if(num>mayorPar){					// Comparamos cada número nuevo con el mayor hasta el momento
					mayorPar = num;
				}
			} else if(num%2==1){					//Escogemos los números impares
				sumaImpar+=num;
				cantImpar++;
			}
			
			if(num>=0){
				contNum++;
			}
		}
		
		mediaImpar = (double)sumaImpar/cantImpar;
		
		System.out.println("\nSe han introducido " + contNum + " números en total.");
		System.out.printf("La media de los números impares es %.2f", mediaImpar);
		System.out.println("\nEl mayor de los números pares es " + mayorPar);
	}
}
