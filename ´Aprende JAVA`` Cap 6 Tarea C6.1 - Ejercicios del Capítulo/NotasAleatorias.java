/**
 * Escribir un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.
 * Al final aparecerá el número de notas de cada tipo.
 * 
 * @autor Lucas Bermudo Junco
 */

public class NotasAleatorias{
	public static void main(String args[]){
	
		int cantSusp = 0, cantSuf = 0, cantBien = 0, cantNotable = 0, cantSobr = 0;
		int numNota;
		String nombreNota = "";
		
		System.out.println("20 notas generadas al azar son:\n");
		
		for(int i=1; i<=20; i++){
			numNota = (int)(Math.random()*5)+1;
			
			switch(numNota){					// Asignamos cada número aleatorio a cada nota y vamos almacenando cuántas notas hay de cada tipo.
				case 1:
					nombreNota = "Suspenso";
					cantSusp++;
					break;
				case 2:
					nombreNota = "Suficiente";
					cantSuf++;
					break;
				case 3:
					nombreNota = "Bien";
					cantBien++;
					break;
				case 4:
					nombreNota = "Notable";
					cantNotable++;
					break;
				case 5:
					nombreNota = "Sobresaliente";
					cantSobr++;
					break;
			}
			
			System.out.print("Nota " + i + ": " + nombreNota + "\n");
		}
		
		System.out.println("\nCantidad de notas de cada tipo:");
		System.out.printf("Suspensos: %-3s Suficientes: %-3s Bien: %-3s Notables: %-3s Sobresalientes: %-3s", cantSusp, cantSuf, cantBien, cantNotable, cantSobr);
	}
}
