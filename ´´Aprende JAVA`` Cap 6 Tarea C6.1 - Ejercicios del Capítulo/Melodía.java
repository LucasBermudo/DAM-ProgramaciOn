/**
 * Realizar un generador de melodía.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Melodía{
	public static void main(String args[]){
	
		String nomNota = "", primNota = "", barra = "|";
		int cantComp, numNota, i, j;
		
		System.out.println("Las notas de la melodía son: \n");
		
		do{
			cantComp = (int)(Math.random()*28)+1;					// Solo permitimos que el tamaño de la melodía sea entre 1 y 28.
		} while(cantComp%4!=0);								// Solo permitimos que el tamaño de la melodía sea un múltiplo de 4.
		
		for(i=1; i<=cantComp; i++){
			numNota = (int)(Math.random()*7)+1;					// Generamos una nota al azar.
			
			switch(numNota){					// Le damos nombre a la nota generada.
				case 1:
					nomNota = "do";
					break;
				case 2:
					nomNota = "re";
					break;
				case 3:
					nomNota = "mi";
					break;
				case 4:
					nomNota = "fa";
					break;
				case 5:
					nomNota = "sol";
					break;
				case 6:
					nomNota = "la";
					break;
				case 7:
					nomNota = "si";
					break;
			}
			
			if(i==1){					// Guardamos la primera nota de la melodía para poder usarla al final.
				primNota = nomNota;
			}
			
			if(i<cantComp){
				System.out.print(nomNota + " ");
				
				if(i%4==0){					// Colocamos una barra después de cada 4 notas (excepto después de la última nota de la melodía).
					System.out.print(barra + " ");
				}
			} else{
				System.out.print(primNota + " " + barra + barra);					// Para la última nota, colocamos la misma nota que la primera de la melodía, y al final colocamos 2 barras.
			}
		}
	}
}
