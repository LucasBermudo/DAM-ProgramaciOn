import java.util.Scanner;

/**
 * Realizar un simulador de máquina tragaperras
 * 
 * @autor Lucas Bermudo Junco
 */

public class Tragaperras{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String nombreFigura = "", figura1 = "", figura2 = "", figura3 = "", jugar = "";
		int i, numeFigura, codFigura = 0, codFigura1 = 0, codFigura2 = 0, codFigura3 = 0, cantJuegos = 0;
		
		System.out.println("Para jugar, por favor inserte 1 moneda de 1 Euro.\n");
		
		do{
			System.out.println("Usted acaba de insertar 1 moneda de 1 Euro.\n");
			System.out.println("TIRADA:\n");
			
			for(i=1; i<=3; i++){
				numeFigura = (int)(Math.random()*5)+1;					// Generamos al azar los números para las figuras.
				
				switch(numeFigura){					// Le damos nombre y un código a cada número elegido al azar.
					case 1:
						nombreFigura = "corazón";
						codFigura = 1;
						break;
					case 2:
						nombreFigura = "diamante";
						codFigura = 2;
						break;
					case 3:
						nombreFigura = "herradura";
						codFigura = 3;
						break;
					case 4:
						nombreFigura = "campana";
						codFigura = 4;
						break;
					case 5:
						nombreFigura = "limón";
						codFigura = 5;
						break;
				}
				
				switch(i){
					case 1:
						figura1 = nombreFigura;
						codFigura1 = codFigura;					// Le damos a esa tirada el código de la figura que ha salido para poder compararla después.
						break;
					case 2:
						figura2 = nombreFigura;
						codFigura2 = codFigura;
						break;
					case 3:
						figura3 = nombreFigura;
						codFigura3 = codFigura;
						break;
				}
			}
			
			System.out.printf("%-11s %-11s %-11s", figura1, figura2, figura3);
			
			if(codFigura1==codFigura2 && codFigura2==codFigura3){					// Comparamos las figuras para obtener los resultados del juego.
				System.out.println("\n\nEnhorabuena, ha ganado 10 Euros.");
			} else if((codFigura1==codFigura2 && codFigura2!=codFigura3) || (codFigura1!=codFigura2 && codFigura1==codFigura3) || (codFigura1==codFigura2 && codFigura2!=codFigura3)){
				System.out.println("\n\nBien, ha recuperado su Euro.");
			} else{
				System.out.println("\n\nLo siento, ha perdido.");
			}
			
			cantJuegos++;
			
			if(cantJuegos<10){					// Establecemos un límite de 10 partidas seguidas.
				System.out.print("\n¿Quiere volver a jugar? Si quiere volver a jugar, conteste que sí, y si no quiere volver a jugar, responda cualquier otra cosa: ");
				jugar = sc.next();
				
				if((jugar.equals("sí") || jugar.equals("si") || jugar.equals("sÍ") || jugar.equals("sI") ||
						jugar.equals("Sí") || jugar.equals("Si") || jugar.equals("SÍ") || jugar.equals("SI")) && cantJuegos<=10);{
					System.out.println();
				}
			} else{
				System.out.println("\n\nLo sentimos, solo se puede jugar 10 veces seguidas. Para volver a jugar, por favor reinicie el juego, muchas gracias.");
			}
		} while((jugar.equals("sí") || jugar.equals("si") || jugar.equals("sÍ") || jugar.equals("sI") ||
								jugar.equals("Sí") || jugar.equals("Si") || jugar.equals("SÍ") || jugar.equals("SI")) && cantJuegos<10);
								
		if(cantJuegos<10){
			System.out.println("Juego terminado. Muchas gracias por jugar.");
		}
	}
}
