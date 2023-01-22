import java.util.Scanner;

/**
 * Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
 * A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7.
 * Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
 * 
 * @author Lucas Bermudo Junco
 */

public class ResaltarMúltiplos{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int tam = 20;
		int num[] = new int[tam];
		int i = 0, resaltar;
		
		System.out.println("Los elementos del array, separados por espacios, son los siguientes:");
		
		for(int n : num){
			num[i] = (int)(Math.random()*401);					// Rellenamos el array con 20 números aleatorios comprendidos entre 0 y 400.
			
			System.out.print(num[i] + " ");
			
			i++;
		}
		
		System.out.print("\n\n¿Qué números quieres resaltar? ¿Los múltiplos de 5 o los de 7? (Responde ´´5`` ó ´´7``): ");
		resaltar = sc.nextInt();
		
		while(resaltar!=5 && resaltar!=7){					// Obligamos al usuario a introducir el número 5 ó el 7.
			System.out.println("\nLo sentimos, pero solo hay 2 opciones (´´5`` para múltiplos de 5 y ´´7`` para para múltiplos de 7) . Por favor, vuelva a responder la pregunta, muchas gracias.");
			
			System.out.print("¿Qué números quieres resaltar? ¿Los múltiplos de 5 o los de 7? (Responde ´´5`` ó ´´7``): ");
			resaltar = sc.nextInt();
		}
		
		System.out.println("\nLos elementos del array, separados por espacios y con los múltiplos de " + resaltar + " resaltados entre corchetes, son los siguientes:\n");
		
		i = 0;
		
		for(int n : num){					// Vamos mostrando el array de los números con la particularidad de los múltiplos de 5 ó de 7 (los que correspondan), que los mostraremos entre corchetes.
			if(resaltar==5 && num[i]%5==0){
				System.out.print("[" + num[i] + "] ");
			} else if(resaltar==7 && num[i]%7==0){
				System.out.print("[" + num[i] + "] ");
			} else{
				System.out.print(num[i] + " ");
			}
			
			i++;
		}
	}
}
