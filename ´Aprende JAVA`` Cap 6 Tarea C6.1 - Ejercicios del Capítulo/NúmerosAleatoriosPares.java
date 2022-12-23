/**
 * Realizar un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números hasta que no saque el 24.
 * El programa deberá decir al final cuántos números se han generado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NúmerosAleatoriosPares{
	public static void main(String args[]){
	
		int numAlea, cantNum = 0;
		
		System.out.print("Números aleatorios pares entre 0 y 100 excepto el 24 son: ");
		
		do{
			numAlea = (int)(Math.random()*101);
			
			if(numAlea%2==0){					// Solo guardamos los números pares.
				if(numAlea!=24){					// Guardamos todos los números pares menos el 24.
					System.out.print(numAlea + ", ");
					cantNum++;
				}
			}
		} while(numAlea!=24);					// Continuamos generando números aleatorios hasta que salga el 24.
		
		System.out.println("\nEl programa ha generado " + cantNum + " números pares.");
	}
}
