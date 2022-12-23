/**
 * Escribir un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
 * 
 * @autor Lucas Bermudo Junco
 */

public class TiradaDados{
	public static void main(String args[]){
	
		System.out.print("Las 3 tiradas de dados son las siguientes: ");
		
		int tiradaDados, sumaTiradas = 0;
		
		for(int i=1; i<=3; i++){
			tiradaDados = (int)(Math.random()*6)+1;						// Generamos números aleatorios entre el 1 y el 6 (ambos incluidos).
			
			if(i<=(3-2)){	
				System.out.print(tiradaDados + ", ");
			}
			
			if(i==(3-1)){
				System.out.print(tiradaDados + " y ");
			}
			
			if(i==3){
				System.out.print(tiradaDados + "\n");
			}
			
			sumaTiradas+=tiradaDados;
		}
		
		System.out.println("\nLa suma de las 3 tiradas de los dados es " + sumaTiradas);
	}
}
