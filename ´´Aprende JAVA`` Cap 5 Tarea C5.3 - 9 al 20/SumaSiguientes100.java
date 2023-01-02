import java.util.Scanner;

/**
 * Realizar un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado.
 * Se debe comprobar que el dato introducido es correcto (que es un número positivo).
 * 
 * @autor Lucas Bermudo Junco
 */

public class SumaSiguientes100{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el primer número de los que se tienen que sumar: ");
		int primNum = sc.nextInt();
		
		int suma = 0;
		
		while(primNum<=0){					// Nos aseguramos de que el primer número sea positivo.
			System.out.println("\nLo sentimos, pero el primer número de los que se tienen que sumar tiene que ser positivo, y el que has introducido (" + primNum + ") es negativo ó 0.");
			System.out.print("Por favor, vuelva a introducir el primer número de los que se tienen que sumar: ");
			primNum = sc.nextInt();
		}
		
		for(int i=primNum; i<=(primNum+100); i++){					// Realizamos la suma del primer número con los 100 siguientes números.
			suma+=i;
		}
		
		System.out.print("\nLa suma del número " + primNum + " con los siguientes 100 números es = " + suma);
	}
}
