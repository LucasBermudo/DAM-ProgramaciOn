import java.util.Scanner;

/**
 * Realiza un programa que pinte un sendero aleatorio.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Sendero{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int longitud = 0, i, j, bordeDer = 17, bordeIzq = 12, obsSiNo = 0, obsTipoNume = 0, obsPos = 0, numAzar = 0;
		String espacio = " ", barra = "|", obsTipoFigura = "";
		
		System.out.print("Por favor, introduce la longitud del sendero en metros: ");
		longitud = sc.nextInt();
		
		while(longitud<1){
			System.out.println("Lo sentimos, pero la longitud del sendero tiene que ser igual o mayor a 1.");
			System.out.print("Por favor, vuelve a introducir la longitud del sendero: ");
			longitud = sc.nextInt();
		}
		
		System.out.println("\n¡CUIDADO CON LAS PLANTAS Y PIEDRAS EN EL CAMINO!\n");
		
		for(i=1; i<=longitud; i++){
			obsSiNo = (int)(Math.random()*2)+1;					// Establecemos un 50 por ciento de posibilidad de que haya un obstáculo.
			
			if(obsSiNo==1){					// Si hay un obstáculo, establecemos el lugar del sendero donde se encuentra dicho obstáculo.
				obsPos = (int)(Math.random()*4)+(bordeIzq+1);
			}
			
			for(j=1; j<=bordeDer; j++){
				if((j>=1 && j<bordeIzq)){					// Situamos al sendero en el lugar que se ha establecido al azar.
					System.out.print(espacio);
				} else if(j==bordeIzq){					// Dibujamos el borde izquierdo del sendero.
					System.out.print(barra);
				} else if(j>bordeIzq && j<bordeDer){					// Dibujamos el interior del sendero.
					
					
					if(obsSiNo==1){					// Si hay un obstáculo, procedemos a elegir el tipo de obstáculo.
						obsTipoNume = (int)(Math.random()*2)+1;					// Generamos al azar un número para obtener el tipo de obstáculo.
						
						switch(obsTipoNume){					// Asignamos el número obtenido al azar con el nombre del obstáculo.
							case 1:
								obsTipoFigura = "*";
								break;
							case 2:
								obsTipoFigura = "o";
								break;
						}
						
						if(j==obsPos){					// Dibujamos el obstáculo en la posición asignada.
							System.out.print(obsTipoFigura);
						} else{
							System.out.print(espacio);
						}
					} else{
						System.out.print(espacio);
					}
				} else if(j==bordeDer){					// Dibujamos el borde derecho del sendero.
					System.out.println(barra);
				}
			}
			
			// Elegimos al azar el movimiento del sendero (y si está en el límite del borde, no podrá superarlo).
			
			if(bordeIzq==1){
				numAzar = (int)(Math.random()*2)+1;
				
				switch(numAzar){
					case 1:
						// La posición se mantendrá, por lo que no hay que mover la posición actual.
						break;
					case 2:
						bordeIzq++;
						bordeDer++;
						break;
				}
			} else if(bordeIzq==25){
				numAzar = (int)(Math.random()*2)+1;
				
				switch(numAzar){
					case 1:
						bordeIzq--;
						bordeDer--;
						break;
					case 2:
						// La posición se mantendrá, por lo que no hay que mover la posición actual.
						break;
				}
			} else{
				numAzar = (int)(Math.random()*3)+1;
				
				switch(numAzar){
					case 1:
						bordeIzq--;
						bordeDer--;
						break;
					case 2:
						// La posición se mantendrá, por lo que no hay que mover la posición actual.
						break;
					case 3:
						bordeIzq++;
						bordeDer++;
						break;
				}
			}
		}
	}
}
