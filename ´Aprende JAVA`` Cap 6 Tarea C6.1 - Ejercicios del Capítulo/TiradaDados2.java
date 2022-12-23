/**
 * Escribir un programa que simule la tirada de dos dados. El programa deberá continuar tirando los dados una y otra vez
 * hasta que en alguna tirada los dos dados tengan el mismo valor.
 * 
 * @autor Lucas Bermudo Junco
 */

public class TiradaDados{
	public static void main(String args[]){
	
		int dado1, dado2;
		int i = 1;
		
		System.out.println("Tiradas de dados hasta que se produzca un doble:\n");
		
		do{
			dado1 = (int)(Math.random()*6+1);
			dado2 = (int)(Math.random()*6+1);
			
			System.out.println("TIRADA " + i + ":\tDado 1: " + dado1 + "\tDado 2: " + dado2);
			
			i++;
		} while(dado1!=dado2);					// Continuamos tirando los dados hasta que salgan dobles.
	}
}
