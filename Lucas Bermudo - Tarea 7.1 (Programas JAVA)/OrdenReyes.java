import java.util.Scanner;

/**
 * Implementar un programa que calcule la denominación ordinal de los reyes de una secuencia histórica.
 * El programa solicitará la cantidad de reyes que se van a introducir, y a continuación recibirá los nombres de los reyes.
 * Presentará por pantalla dichos nombres, pero colocándoles el ordinal correspondiente.
 * Así, por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería aparecer como Felipe 1º y el segundo como Felipe 2º.
 * 
 * @author Lucas Bermudo Junco
 */

public class OrdenReyes{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int cont;
		String numRomano = "";
		
		System.out.print("A continuación, introduzca cuántos reyes usted va a introducir con un máximo de 30 reyes, muchas gracias: ");
		int tam = sc.nextInt();
		
		while(tam<1 || tam>30){
			System.out.println("\nLo sentimos, pero el número de reyes tiene que estar entre 1 y 30 ambos incluidos, y usted ha introducido el número " + tam + ".");
			System.out.print("Por favor, vuelve a introducir cuántos reyes usted va a introducir con un máximo de 30 reyes, muchas gracias: ");
			tam = sc.nextInt();
		}
		
		String[] rey = new String[tam];
		
		System.out.println("\nAhora, introduzca el nombre de esos " + tam + " reyes en el orden en que reinaron, muchas gracias.");
		
		for(int i=0; i<tam; i++){
			System.out.print((i+1) + "º rey: ");
			rey[i] = sc.next();
			rey[i] = rey[i].toLowerCase();
		}
		
		System.out.println("\nLos reyes que han reinado son:\n");
		
		for(int i=0; i<tam; i++){
			cont = 1;
			for(int j=0; j<i; j++){
				if(rey[i].equals(rey[j])){
					cont++;
				}
			}
			switch(cont){
				case 1:
					numRomano = "I";
					break;
				case 2:
					numRomano = "II";
					break;
				case 3:
					numRomano = "III";
					break;
				case 4:
					numRomano = "IV";
					break;
				case 5:
					numRomano = "V";
					break;
				case 6:
					numRomano = "VI";
					break;
				case 7:
					numRomano = "VII";
					break;
				case 8:
					numRomano = "VIII";
					break;
				case 9:
					numRomano = "IX";
					break;
				case 10:
					numRomano = "X";
					break;
				case 11:
					numRomano = "XI";
					break;
				case 12:
					numRomano = "XII";
					break;
				case 13:
					numRomano = "XIII";
					break;
				case 14:
					numRomano = "XIV";
					break;
				case 15:
					numRomano = "XV";
					break;
				case 16:
					numRomano = "XVI";
					break;
				case 17:
					numRomano = "XVII";
					break;
				case 18:
					numRomano = "XVIII";
					break;
				case 19:
					numRomano = "XIX";
					break;
				case 20:
					numRomano = "XX";
					break;
				case 21:
					numRomano = "XXI";
					break;
				case 22:
					numRomano = "XXII";
					break;
				case 23:
					numRomano = "XXIII";
					break;
				case 24:
					numRomano = "XXIV";
					break;
				case 25:
					numRomano = "XXV";
					break;
				case 26:
					numRomano = "XXVI";
					break;
				case 27:
					numRomano = "XXVII";
					break;
				case 28:
					numRomano = "XXVIII";
					break;
				case 29:
					numRomano = "XXIX";
					break;
				case 30:
					numRomano = "XXX";
					break;
				}
			
			System.out.println(rey[i].toUpperCase().charAt(0) + rey[i].substring(1, rey[i].length()) + " " + numRomano);
		}
	}
}
