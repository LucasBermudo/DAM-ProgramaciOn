import java.util.Scanner;
import misFunciones.*;

/**
 * Implementar las siguientes funciones:
 * 1) esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 2) esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 * 3) siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * 4) potencia: Dada una base y un exponente devuelve la potencia.
 * 5) digitos: Cuenta el número de dígitos de un número entero.
 * 6) voltea: Le da la vuelta a un número.
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_1_1al16{
	
	// Programa principal ////////////////////
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número principal (entero positivo): ");
		int numPrincipal = sc.nextInt();
		
		while(numPrincipal<=0){
			System.out.println("Lo sentimos, pero el número tiene que ser mayor que 0. Por favor, introdúzcalo de nuevo.");
			System.out.print("Introduzca el número principal (entero positivo): ");
			numPrincipal = sc.nextInt();
		}
		
		if(Varias.esCapicua(numPrincipal)){					// En función de si la función ´´esCapicua`` devuelve un true o un false, mostramos un mensaje u otro.
			System.out.println("\nEl número " + numPrincipal + " es capicúa.");
		} else{
			System.out.println("\nEl número " + numPrincipal + " no es capicúa.");
		}
		
		if(Varias.esPrimo(numPrincipal)){					// En función de si la función ´´esPrimo`` devuelve un true o un false, mostramos un mensaje u otro.
			System.out.println("\nEl número " + numPrincipal + " es primo.");
		} else{
			System.out.println("\nEl número " + numPrincipal + " no es primo.");
		}
		
		System.out.println("\nEl siguiente número primo al número " + numPrincipal + " es el número " + Varias.siguientePrimo(numPrincipal) + ".");
		
		System.out.print("\nIntroduzca el índice al que desee elevar el número " + numPrincipal + ": ");
		int exponente = sc.nextInt();
		
		System.out.println("\nEl resultado de " + numPrincipal + " elevado a " + exponente + " es: " + Varias.potencia(numPrincipal, exponente) + ".");
		
		System.out.println("\nEl número " + numPrincipal + " tiene " + Varias.digitos(numPrincipal) + " dígitos.");
		
		System.out.println("\nEl número " + numPrincipal + " volteado es: " + Varias.voltea(numPrincipal) + ".");
		
		System.out.print("\nIntroduzca la posición del número en la que usted quiera saber qué dígito se encuentra: ");
		int pos = sc.nextInt();
		
		while(pos<1 || pos>(int)(Math.log10(numPrincipal)+1)){					// Impedimos al usuario introducir una posición que no se encuentre dentro de las posibles posiciones del número.
			System.out.println("\nLa posición que usted ha introducido no se encuentra dentro de las posiciones posibles.");
			System.out.print("Por favor, vuelva a introducir la posición del número en la que usted quiera saber qué dígito se encuentra (el número empieza por la posición 0): ");
			pos = sc.nextInt();
		}
		
		System.out.println("\nEl dígito que se encuentra en la posición " + pos + " del número " + numPrincipal + " es el " + Varias.digitoN(numPrincipal, pos) + ".");
		
		System.out.print("\nIntroduzca la ocurrencia de la que quiera saber su posición dentro del número " + numPrincipal + ": ");
		int ocurr = sc.nextInt();
		
		if(Varias.posicionDeDigito(numPrincipal, ocurr)!=-1){					// En función de si la función ´´posicionDeDigito`` devuelve un -1 ó no, mostramos un mensaje u otro.
			System.out.println("\nLa primera ocurrencia con valor " + ocurr + " se encuentra en la posición " + Varias.posicionDeDigito(numPrincipal, ocurr) + " del número " + numPrincipal + ".");
		} else{
			System.out.println("\nNo existen ocurrencias con valor " + ocurr + " en el número " + numPrincipal + ".");
		}
		
		System.out.print("\nIntroduzca cuántos dígitos quiere usted quitarle por detrás al número " + numPrincipal + ": ");
		int cantDigitQuitadosPorDetras = sc.nextInt();
		
		while(cantDigitQuitadosPorDetras>(Math.log10(numPrincipal+1))){					// Impedimos al usuario introducir una cantidad de dígitos mayor que la cantidad de dígitos que tiene el número.
			System.out.println("\nLo sentimos, pero no se puede quitar " + cantDigitQuitadosPorDetras + " dígitos al número " + numPrincipal + " porque solo contiene " + (int)(Math.log10(numPrincipal)+1) + ".");
			System.out.print("Por favor, vuelva a introducir cuántos dígitos quiere usted quitarle por detrás al número " + numPrincipal + ": ");
		}
		
		System.out.println("\nEl número " + numPrincipal + " con " + cantDigitQuitadosPorDetras + " dígitos quitados por la detrás es " + Varias.quitaporDetras(numPrincipal, cantDigitQuitadosPorDetras) + ".");
		
		System.out.print("\nIntroduzca cuántos dígitos quiere usted quitarle por delante al número " + numPrincipal + ": ");
		int cantDigitQuitadosPorDelante = sc.nextInt();
		
		while(cantDigitQuitadosPorDelante>(Math.log10(numPrincipal+1))){					// Impedimos al usuario introducir una cantidad de dígitos mayor que la cantidad de dígitos que tiene el número.
			System.out.println("\nLo sentimos, pero no se puede quitar " + cantDigitQuitadosPorDetras + " dígitos al número " + numPrincipal + " porque solo contiene " + (int)(Math.log10(numPrincipal)+1) + ".");
			System.out.print("Por favor, vuelva a introducir cuántos dígitos quiere usted quitarle por detrás al número " + numPrincipal + ": ");
		}
		
		System.out.println("\nEl número " + numPrincipal + " con " + cantDigitQuitadosPorDelante + " dígitos quitados por la delante es " + Varias.quitaPorDelante(numPrincipal, cantDigitQuitadosPorDelante) + ".");
		
		System.out.print("\nIntroduzca el dígito que usted quiera añadir al número " + numPrincipal + " por detrás: ");
		int numeroAñadidoDetras = sc.nextInt();
		
		while((int)(Math.log10(numeroAñadidoDetras))+1>1){					// Impedimos al usuario introducir más de 1 dígito.
			System.out.println("Lo sentimos, pero solo se puede añadir 1 solo digito. Por favor, vuelva a introducirlo.");
			System.out.print("\nIntroduzca el dígito que usted quiera añadir al número " + numPrincipal + " por detrás: ");
			numeroAñadidoDetras = sc.nextInt();
		}
		
		System.out.println("\nEl número " + numPrincipal + " con el dígito " + numeroAñadidoDetras + " añadido por detrás queda así: " + Varias.pegaPorDetras(numPrincipal, numeroAñadidoDetras));
		
		System.out.print("\nIntroduzca el dígito que usted quiera añadir al número " + numPrincipal + " por delante: ");
		int numeroAñadidoDelante = sc.nextInt();
		
		while((int)(Math.log10(numeroAñadidoDelante))+1>1){					// Impedimos al usuario introducir más de 1 dígito.
			System.out.println("Lo sentimos, pero solo se puede añadir 1 solo digito. Por favor, vuelva a introducirlo.");
			System.out.print("\nIntroduzca el dígito que usted quiera añadir al número " + numPrincipal + " por detrás: ");
			numeroAñadidoDelante = sc.nextInt();
		}
		
		System.out.println("\nEl número " + numPrincipal + " con el dígito " + numeroAñadidoDelante + " añadido por detrás queda así: " + Varias.pegaPorDelante(numPrincipal, numeroAñadidoDelante));
		
		System.out.print("\nSeleccione, separados por un espacio, tanto la posición incial como la posición final del trozo que desee cortar del número " + numPrincipal + ": ");
		int posInicial = sc.nextInt();
		int posFinal = sc.nextInt();
		
		while(posInicial>posFinal){					// Impedimos al usuario introducir una posición inicial que sea mayor que la posición final.
			System.out.println("\nLo sentimos, pero la posición inicial del trozo no puede ser mayor que la posición final. Por favor, introdúzcalo de nuevo.");
			System.out.print("Seleccione, separados por un espacio, tanto la posición incial como la posición final del trozo que desee cortar del número " + numPrincipal + ": ");
			posInicial = sc.nextInt();
			posFinal = sc.nextInt();
		}
		
		System.out.println("\nEl trozo del número " + numPrincipal + " que va desde la posición " + posInicial + " hasta la posición " + posFinal + " es el " + Varias.trozoDeNumero(numPrincipal, posInicial, posFinal));
		
		System.out.print("\nIntroduzca el número que desee usted unir al número " + numPrincipal + " por delante: ");
		int numPegado = sc.nextInt();
		numPegado = Math.abs(numPegado);
		
		System.out.println("\nLos números " + numPrincipal + " y " + numPegado + ", al quedar juntados, quedan así: " + Varias.juntaNumeros(numPrincipal, numPegado));
		
		int numEvaluado = 1;
		System.out.println("\nEntre 1 y 1000 hay " + Varias.PrimosEntre1Y1000(numEvaluado) + " números primos.");
		
		System.out.println("\nEntre 1 y 99999 hay " + Varias.CapicuasEntre1y99999(numEvaluado) + " números capicúas.");
	}
}
