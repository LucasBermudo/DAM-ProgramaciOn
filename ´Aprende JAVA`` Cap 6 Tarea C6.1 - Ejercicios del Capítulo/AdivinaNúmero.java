import java.util.Scanner;

/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades.
 * Después de cada intento fallido, el programa dirá cuántas oportunidades quedan
 * y si el número introducido es menor o mayor que el número secreto.
 * 
 * @autor Lucas Bermudo Junco
 */

public class AdivinaNúmero{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int numAlea = (int)(Math.random()*101), numAdivi;
		int i = 4;
		
		System.out.println("Intenta adivinar el número entre 0 y 100.\n");
		
		do{
			System.out.print("Introduce el número que estás pensando: ");
			numAdivi = sc.nextInt();
			
			while(numAdivi<0 || numAdivi>100){
				System.out.println("\nLo sentimos, pero el número tiene que estar entre 0 y 100. Prueba de nuevo.\n");
				System.out.print("Introduce el número que estás pensando: ");
				numAdivi = sc.nextInt();
			}
			
			System.out.println();
			
			if(numAdivi==numAlea){					// Comparamos el número introducido con el número generado por la máquina.
				System.out.println("¡Enhorabuena, has acertado el número!");
			} else if(numAdivi<numAlea){
				System.out.println("¡Error! El número secreto es mayor que el número que has probado.");
			} else{
				System.out.println("¡Error! El número secreto es menor que el número que has probado.");
			}
			
			if(numAdivi!=numAlea && i>0){
				System.out.println("Te queda(n) " + i + " intento(s).\n");
			}
			
			i--;
		} while(i>=0 && numAdivi!=numAlea);					// Terminamos el bucle cuando adivinemos el número o cuando se nos acaben los intentos.
		
		if(i<0 && numAdivi!=numAlea){
			System.out.println("\nLo sentimos, pero ya no te quedan más intentos.\n");
			System.out.println("El número secreto es el " + numAlea);
		}
	}
}
