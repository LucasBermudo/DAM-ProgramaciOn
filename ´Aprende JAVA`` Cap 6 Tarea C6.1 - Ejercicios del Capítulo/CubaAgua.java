import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua.
 * 
 * @autor Lucas Bermudo Junco
 */

public class CubaAgua{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String paredVert = "|", paredHor = "─", agua = "~", espacio = " ", esqIzq = "└", esqDer = "┘";
		int capac = 0, altura = 0, ancho = 20, cantAgua, i, j;
		
		System.out.print("Por favor, indique la capacidad de la cuba en litros (tiene que ser como mínimo 3 y como máximo 10): ");
		capac = sc.nextInt();
		
		while(capac<3 || capac>10){
			System.out.println("\nLo sentimos, pero la capacidad tiene que ser como mínimo 3 y como máximo 10.");
			System.out.print("Por favor, indique la capacidad de la cuba en litros (tiene que ser como mínimo 3 y como máximo 10): ");
			capac = sc.nextInt();
		}
		
		altura = capac+1;					// añadimos la base de la cuba a la capacidad de la cuba.
		
		System.out.println();
		
		cantAgua = (int)(Math.random()*(altura));
		
		for(i=1; i<=altura; i++){
			if(i!=altura){					// Dibujamos el interior de la cuba y las paredes verticales.
				for(j=1; j<=ancho; j++){
					if(j==1){					// Dibujamos las paredes verticales.
						System.out.print(paredVert);
					} else if(j==ancho){
						System.out.println(paredVert);
					} else{					// Dibujamos el interior de la cuba.
						if(i<(altura-cantAgua)){					// Dibujamos el espacio vacío del interior de la cuba.
							System.out.print(espacio);
						} else{					// Dibujamos el agua del interior de la cuba.
							System.out.print(agua);
						}
					}
				}
			} else{					// Dibujamos la base de la cuba.
				for(j=1; j<=ancho; j++){
					if(j==1){
						System.out.print(esqIzq);
					} else if(j==ancho){
						System.out.print(esqDer);
					} else{
						System.out.print(paredHor);
					}
				}
			}
		}
		
		System.out.print("\n\nLa cuba tiene una capacidad de " + capac + " litros ");
		
		if(cantAgua==0){
			System.out.println("y está vacía.");
		} else if(cantAgua==1){
			System.out.println("y contiene 1 litro.");
		} else if(cantAgua>1 && cantAgua<capac){
			System.out.println("y contiene " + cantAgua + " litros.");
		} else{
			System.out.println("y está llena.");
		}
	}
}
