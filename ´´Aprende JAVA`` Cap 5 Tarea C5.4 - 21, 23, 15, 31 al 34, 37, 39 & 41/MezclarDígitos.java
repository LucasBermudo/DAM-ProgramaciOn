import java.util.Scanner;

/**
 * Escribir un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los dígitos pares y los impares.
 * 
 * @autor Lucas Bermudo Junco
 */

public class MezclarDígitos{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		long num1, num2, numInv1Par = 0, numInv1Impar = 0, numInv2Par = 0, numInv2Impar = 0, numPar1 = 0, numImpar1 = 0, numPar2 = 0, numImpar2 = 0;
		int resto;
		
		System.out.print("Por favor, introduce el primer número (tiene que ser mayor que 0): ");
		num1 = sc.nextLong();
		
		while(num1<=0){
			System.out.println("\nLo sentimos, pero los números tienen que ser mayores que 0, y el número que acabas de introducir es el " + num1 + ".");
			System.out.print("Por favor, introduce el primer número (tiene que ser mayor que 0): ");
			num1 = sc.nextLong();
		}
		
		System.out.print("Por favor, introduce el segundo número (tiene que ser mayor que 0): ");
		num2 = sc.nextLong();
		
		while(num2<=0){
			System.out.println("\nLo sentimos, pero los números tienen que ser mayores que 0, y el número que acabas de introducir es el " + num2 + ".");
			System.out.print("Por favor, introduce el segundo número (tiene que ser mayor que 0): ");
			num2 = sc.nextLong();
		}
		
		while(num1>0){
			resto = (int)num1%10;
			num1/=10;
			
			if(resto%2==0 && resto!=0){
				numInv1Par = numInv1Par*10+resto;
			} else if(resto!=0){
				numInv1Impar = numInv1Impar*10+resto;
			}
		}
		
		while(num2>0){					// Invertimos los números para poder extraer uno por uno las cifras que nos interesen
			resto = (int)num2%10;
			num2/=10;
			
			if(resto%2==0 && resto!=0){												// Separamos las cifras pares de las cifras impares
				numInv2Par = numInv2Par*10+resto;					// Desplazamos las cifras anteriores a la izquierda y extraemos la siguiente cifra, añadiéndola a la derecha
			} else if(resto!=0){
				numInv2Impar = numInv2Impar*10+resto;
			}
		}
		
		// Volvemos a invertir los números para extraer uno por uno las cifras en el orden original
		
		while(numInv1Par>0){
			resto = (int)numInv1Par%10;
			numPar1 = numPar1*10+resto;
			numInv1Par/=10;
		}
		
		while(numInv1Impar>0){
			resto = (int)numInv1Impar%10;
			numImpar1 = numImpar1*10+resto;
			numInv1Impar/=10;
		}
		
		while(numInv2Par>0){
			resto = (int)numInv2Par%10;
			numPar2 = numPar2*10+resto;
			numInv2Par/=10;
		}
		
		while(numInv2Impar>0){
			resto = (int)numInv2Impar%10;
			numImpar2 = numImpar2*10+resto;
			numInv2Impar/=10;
		}
		
		// Unimos los números pares entre sí como un solo número, y hacemos lo mismo con los números impares
		
		String numDigPar = "" + numPar1 + numPar2;
		String numDigImpar = "" + numImpar1 + numImpar2;
		
		System.out.println("\nEl número formado por los dígitos pares es " + numDigPar);
		System.out.println("El número formado por los dígitos impares es " + numDigImpar);
	}
}
