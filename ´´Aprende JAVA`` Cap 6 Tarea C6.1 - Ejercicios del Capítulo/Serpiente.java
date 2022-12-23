import java.util.Scanner;

/**
 * Realizar un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Serpiente{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int longiSerp = 0, i, j, posAct = 13, posAntigua = 13, numAzar = 0;
		String espacio = " ", cabezaSerp = "@", cuerpoRecto = "|", cuerpoDer = "/";
		char cuerpoIzq = (char)92;
		
		System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza (tiene que medir como mínimo 2 espacios): ");
		longiSerp = sc.nextInt();
		
		while(longiSerp<2){
			System.out.println("Lo sentimos, pero la serpiente tiene que medir como mínimo 2 espacios.");
			System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza (tiene que medir como mínimo 2 espacios): ");
			longiSerp = sc.nextInt();
		}
		
		for(i=1; i<=longiSerp; i++){
			for(j=1; j<=posAct; j++){
				if(j<posAct){
					System.out.print(espacio);					// Situamos a la serpiente en el lugar que se ha establecido al azar.
				} else{					
					if(i==1){
						System.out.print(cabezaSerp);					// Dibujamos la cabeza de la serpiente
					} else{
						if(posAct==posAntigua){					// Si no se mueve la serpiente, dibujamos una línea recta.
							System.out.print(cuerpoRecto);
						} else{					// Si se mueve la serpiente, dibujamos una barra inclidana hacia el lado hacia el que se mueva.
							if(posAct<posAntigua){
								System.out.print(cuerpoDer);
							} else{
								System.out.print(cuerpoIzq);
							}
						}
					}
				}
			}
			
			posAntigua = posAct;
			
			// Elegimos al azar el movimiento de la serpiente (y si está en el límite del borde, no podrá superarlo).
			
			if(posAct==1){
				numAzar = (int)(Math.random()*2)+1;
				
				switch(numAzar){
					case 1:
						// La posición se mantendrá, por lo que no hay que mover la posición actual.
						break;
					case 2:
						posAct++;
						break;
				}
			} else if(posAct==25){
				numAzar = (int)(Math.random()*2)+1;
				
				switch(numAzar){
					case 1:
						posAct--;
						break;
					case 2:
						// La posición se mantendrá, por lo que no hay que mover la posición actual.
						break;
				}
			} else{
				numAzar = (int)(Math.random()*3)+1;
				
				switch(numAzar){
					case 1:
						posAct--;
						break;
					case 2:
						// La posición se mantendrá, por lo que no hay que mover la posición actual.
						break;
					case 3:
						posAct++;
						break;
				}
			}
			
			System.out.println();
		}
	}
}
