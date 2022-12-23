import java.util.Scanner;

/**
 * Realizar un programa que pinte por pantalla una pecera con un pececito dentro.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Pecera{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int altura = 0, ancho = 0, filaPez, coluPez, i, j = 1;
		String pared = "*", pez = "&", espacio = " ";
		
		System.out.print("Por favor, introduce la altura de la pecera (tiene que ser como mínimo 4): ");
		altura = sc.nextInt();
		
		while(altura<4){
			System.out.println("Lo sentimos, pero la altura tiene que ser como mínimo 4.");
			System.out.print("Por favor, introduce la altura de la pecera (tiene que ser como mínimo 4): ");
			altura = sc.nextInt();
		}
		
		System.out.print("Por favor, introduce el ancho de la pecera (tiene que ser como mínimo 6): ");
		ancho = sc.nextInt();
		
		while(ancho<6){
			System.out.println("Lo sentimos, pero el ancho tiene que ser como mínimo 6.");
			System.out.print("Por favor, introduce el ancho de la pecera (tiene que ser como mínimo 6): ");
			ancho = sc.nextInt();
		}
		
		System.out.println("\nPECERA\n");
		
		filaPez = (int)(Math.random()*(altura-2))+2;					// Establecemos al azar las coordenadas del pez dentro de la pecera (excluyendo las paredes).
		coluPez = (int)(Math.random()*(ancho-2))+2;
		
		for(i=1; i<=altura; i++){
			if(i==1 || i==altura){					// Dibujamos las paredes horizontales.
				for(j=1; j<=ancho; j++){
					if(j!=ancho){
						System.out.print(pared);
					} else{
						System.out.println(pared);
					}
				}
			} else{
				for(j=1; j<=ancho; j++){
					if(j==1){					// Dibujamos las paredes verticales.
						System.out.print(pared);
					} else if(j==ancho){
						System.out.println(pared);
					} else{
						if(i==filaPez && j==coluPez){
							System.out.print(pez);					// Dibujamos el pez.
						} else{
							System.out.print(espacio);
						}
					}
				}
			}
		}
	}
}
