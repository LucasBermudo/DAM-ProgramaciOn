import java.util.Scanner;

/**
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos y cuántos son negativos.
 * 
 * @autor Lucas Bermudo Junco
 */

public class PositivosYNegativos{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		double num;
		int pos = 0, neg = 0, ceros = 0;
		
		for(int i=1; i<=10; i++){
			System.out.print("Introduce el " + i + "º número: ");
			num = sc.nextDouble();
			
			if(num>0){					// Diferenciamos los números positivos de los negativos y de los ceros, y sumamos cuántos hay de cada tipo.
				pos++;
			} else if(num<0){
				neg++;
			} else{
				ceros++;
			}
		}
		
		System.out.print("\nDe los 10 números introducidos, " + pos + " son positivos y " + neg + " son negativos. ");
		
		if(ceros>0){					// En caso de haber algún cero, mostramos el mensaje sobre cuántos ceros hay.
			if(ceros==1){
				System.out.print(ceros + " número introducido es el número 0, por lo que no es ni positivo ni negativo.");
			} else{
				System.out.print(ceros + " números introducidos son el número 0, por lo que no son ni positivos ni negativos.");
			}
		}
	}
}
