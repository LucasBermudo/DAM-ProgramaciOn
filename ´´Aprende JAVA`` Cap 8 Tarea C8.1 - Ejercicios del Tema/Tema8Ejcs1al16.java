import java.util.Scanner;

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

public class Tema8Ejcs1al16{
	
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
		
		if(esCapicua(numPrincipal)){					// En función de si la función ´´esCapicua`` devuelve un true o un false, mostramos un mensaje u otro.
			System.out.println("\nEl número " + numPrincipal + " es capicúa.");
		} else{
			System.out.println("\nEl número " + numPrincipal + " no es capicúa.");
		}
		
		if(esPrimo(numPrincipal)){					// En función de si la función ´´esPrimo`` devuelve un true o un false, mostramos un mensaje u otro.
			System.out.println("\nEl número " + numPrincipal + " es primo.");
		} else{
			System.out.println("\nEl número " + numPrincipal + " no es primo.");
		}
		
		System.out.println("\nEl siguiente número primo al número " + numPrincipal + " es el número " + siguientePrimo(numPrincipal) + ".");
		
		System.out.print("\nIntroduzca el índice al que desee elevar el número " + numPrincipal + ": ");
		int exponente = sc.nextInt();
		
		System.out.println("\nEl resultado de " + numPrincipal + " elevado a " + exponente + " es: " + potencia(numPrincipal, exponente) + ".");
		
		System.out.println("\nEl número " + numPrincipal + " tiene " + digitos(numPrincipal) + " dígitos.");
		
		System.out.println("\nEl número " + numPrincipal + " volteado es: " + voltea(numPrincipal) + ".");
		
		System.out.print("\nIntroduzca la posición del número en la que usted quiera saber qué dígito se encuentra: ");
		int pos = sc.nextInt();
		
		while(pos<1 || pos>(int)(Math.log10(numPrincipal)+1)){					// Impedimos al usuario introducir una posición que no se encuentre dentro de las posibles posiciones del número.
			System.out.println("\nLa posición que usted ha introducido no se encuentra dentro de las posiciones posibles.");
			System.out.print("Por favor, vuelva a introducir la posición del número en la que usted quiera saber qué dígito se encuentra (el número empieza por la posición 0): ");
			pos = sc.nextInt();
		}
		
		System.out.println("\nEl dígito que se encuentra en la posición " + pos + " del número " + numPrincipal + " es el " + digitoN(numPrincipal, pos) + ".");
		
		System.out.print("\nIntroduzca la ocurrencia de la que quiera saber su posición dentro del número " + numPrincipal + ": ");
		int ocurr = sc.nextInt();
		
		if(posicionDeDigito(numPrincipal, ocurr)!=-1){					// En función de si la función ´´posicionDeDigito`` devuelve un -1 ó no, mostramos un mensaje u otro.
			System.out.println("\nLa primera ocurrencia con valor " + ocurr + " se encuentra en la posición " + posicionDeDigito(numPrincipal, ocurr) + " del número " + numPrincipal + ".");
		} else{
			System.out.println("\nNo existen ocurrencias con valor " + ocurr + " en el número " + numPrincipal + ".");
		}
		
		System.out.print("\nIntroduzca cuántos dígitos quiere usted quitarle por detrás al número " + numPrincipal + ": ");
		int cantDigitQuitadosPorDetras = sc.nextInt();
		
		while(cantDigitQuitadosPorDetras>(Math.log10(numPrincipal+1))){					// Impedimos al usuario introducir una cantidad de dígitos mayor que la cantidad de dígitos que tiene el número.
			System.out.println("\nLo sentimos, pero no se puede quitar " + cantDigitQuitadosPorDetras + " dígitos al número " + numPrincipal + " porque solo contiene " + (int)(Math.log10(numPrincipal)+1) + ".");
			System.out.print("Por favor, vuelva a introducir cuántos dígitos quiere usted quitarle por detrás al número " + numPrincipal + ": ");
		}
		
		System.out.println("\nEl número " + numPrincipal + " con " + cantDigitQuitadosPorDetras + " dígitos quitados por la detrás es " + quitaporDetras(numPrincipal, cantDigitQuitadosPorDetras) + ".");
		
		System.out.print("\nIntroduzca cuántos dígitos quiere usted quitarle por delante al número " + numPrincipal + ": ");
		int cantDigitQuitadosPorDelante = sc.nextInt();
		
		while(cantDigitQuitadosPorDelante>(Math.log10(numPrincipal+1))){					// Impedimos al usuario introducir una cantidad de dígitos mayor que la cantidad de dígitos que tiene el número.
			System.out.println("\nLo sentimos, pero no se puede quitar " + cantDigitQuitadosPorDetras + " dígitos al número " + numPrincipal + " porque solo contiene " + (int)(Math.log10(numPrincipal)+1) + ".");
			System.out.print("Por favor, vuelva a introducir cuántos dígitos quiere usted quitarle por detrás al número " + numPrincipal + ": ");
		}
		
		System.out.println("\nEl número " + numPrincipal + " con " + cantDigitQuitadosPorDelante + " dígitos quitados por la delante es " + quitaPorDelante(numPrincipal, cantDigitQuitadosPorDelante) + ".");
		
		System.out.print("\nIntroduzca el dígito que usted quiera añadir al número " + numPrincipal + " por detrás: ");
		int numeroAñadidoDetras = sc.nextInt();
		
		while((int)(Math.log10(numeroAñadidoDetras))+1>1){					// Impedimos al usuario introducir más de 1 dígito.
			System.out.println("Lo sentimos, pero solo se puede añadir 1 solo digito. Por favor, vuelva a introducirlo.");
			System.out.print("\nIntroduzca el dígito que usted quiera añadir al número " + numPrincipal + " por detrás: ");
			numeroAñadidoDetras = sc.nextInt();
		}
		
		System.out.println("\nEl número " + numPrincipal + " con el dígito " + numeroAñadidoDetras + " añadido por detrás queda así: " + pegaPorDetras(numPrincipal, numeroAñadidoDetras));
		
		System.out.print("\nIntroduzca el dígito que usted quiera añadir al número " + numPrincipal + " por delante: ");
		int numeroAñadidoDelante = sc.nextInt();
		
		while((int)(Math.log10(numeroAñadidoDelante))+1>1){					// Impedimos al usuario introducir más de 1 dígito.
			System.out.println("Lo sentimos, pero solo se puede añadir 1 solo digito. Por favor, vuelva a introducirlo.");
			System.out.print("\nIntroduzca el dígito que usted quiera añadir al número " + numPrincipal + " por detrás: ");
			numeroAñadidoDelante = sc.nextInt();
		}
		
		System.out.println("\nEl número " + numPrincipal + " con el dígito " + numeroAñadidoDelante + " añadido por detrás queda así: " + pegaPorDelante(numPrincipal, numeroAñadidoDelante));
		
		System.out.print("\nSeleccione, separados por un espacio, tanto la posición incial como la posición final del trozo que desee cortar del número " + numPrincipal + ": ");
		int posInicial = sc.nextInt();
		int posFinal = sc.nextInt();
		
		while(posInicial>posFinal){					// Impedimos al usuario introducir una posición inicial que sea mayor que la posición final.
			System.out.println("\nLo sentimos, pero la posición inicial del trozo no puede ser mayor que la posición final. Por favor, introdúzcalo de nuevo.");
			System.out.print("Seleccione, separados por un espacio, tanto la posición incial como la posición final del trozo que desee cortar del número " + numPrincipal + ": ");
			posInicial = sc.nextInt();
			posFinal = sc.nextInt();
		}
		
		System.out.println("\nEl trozo del número " + numPrincipal + " que va desde la posición " + posInicial + " hasta la posición " + posFinal + " es el " + trozoDeNumero(numPrincipal, posInicial, posFinal));
		
		System.out.print("\nIntroduzca el número que desee usted unir al número " + numPrincipal + " por delante: ");
		int numPegado = sc.nextInt();
		numPegado = Math.abs(numPegado);
		
		System.out.println("\nLos números " + numPrincipal + " y " + numPegado + ", al quedar juntados, quedan así: " + juntaNumeros(numPrincipal, numPegado));
		
		int numEvaluado = 1;
		System.out.println("\nEntre 1 y 1000 hay " + PrimosEntre1Y1000(numEvaluado) + " números primos.");
		
		System.out.println("\nEntre 1 y 99999 hay " + CapicuasEntre1y99999(numEvaluado) + " números capicúas.");
	}
	
	// Funciones //////////////////////////
	
	/**
	 * Comprueba si un número entero es capicúa o no.
	 * 
	 * @param x un número entero positivo.
	 * @return <code>true</code> si el número es capicúa.
	 * @return <code>false</code> si el número no es capicúa.
	 */
	 
	public static boolean esCapicua(int x){
		
		int numVolteado = 0, numManipulado = x, numOriginal = x;
		
		for(int i=1; i<=(Math.log10(x)+1); i++){					// Procedemos a voltear el número.
			numVolteado+=numManipulado%10;					// Vamos añadiendo la última cifra del número original al número volteado.
			
			if(i<=(Math.log10(x))){
				numVolteado*=10;					// Multiplicamos por 10 el número volteado para hacer hueco a la siguiente cifra.
				numManipulado/=10;					// Eliminamos al número original la última cifra que acaba de ser añadida al número volteado.
			}
		}
		
		if(numOriginal==numVolteado){					// Si el número original coincide con el volteado, devolvemos a la función el valor true, y en caso contrario, false;
			return true;
		} else{
			return false;
		}
	}
	
	/**
	 * Comprueba si un número entero positivo es primo o no.
	 * Un número es primo cuando únicamente es divisible entre él mismo y la unidad.
	 *
	 * @param x un número entero positivo.
	 * @return <code>true</code> si el número es primo.
	 * @return <code>false</code> si el número no es primo.
	 */

	public static boolean esPrimo(int x){
		
		for(int i=2; i<x; i++){
			if((x%i)==0){					// En caso de encontrar algún divisor que no sea 1 ó el propio número, devolvemos a la función el valor false.
				return false;
			} 
		}
		
		return true;					// En caso de no encontrar nigún divisor que no sea 1 ó el propio número, devolvemos a la función el valor true.
	}
	
	/**
	 * Comprueba cuál es el siguiente número primo a un número entero.
	 * 
	 * @param x un número entero positivo.
	 * @return el siguiente número primo al número introducido.
	 */
	 
	public static int siguientePrimo(int x){
		
		int cont;
		
		do{
			x++;					// En cada bucle, vamos aumentando el número que estamos comprobando en 1 unidad.
			cont = 0;					// En cada bucle, devolvemos el valor del contador de los divisores a 0 para empezar de nuevo a valorarlos.
			
			for(int i=2; i<x; i++){
				if((x%i)==0){
					cont++;
				} 
			}
		} while(cont>0);					// Seguimos evaluando los divisores de todos los números hasta encontrar algún divisor de algún número.
		
		return x;					// Devolvemos a la función el primer número del cual hayamos encontrado algún divisor que no sea 1 ó ese número.
	}
	
	/**
	 * Calcula la potencia que resulta de calcular un número entero elevado a otro número entero.
	 * 
	 * @param x un número entero positivo.
	 * @param x un número entero positivo.
	 * @return la potencia que resulta de calcular el primer número introducido elevado al segundo número introducido.
	 */
	 
	public static int potencia(int x, int y){
		
		int pot = (int)(Math.pow(x, y));
		
		return pot;
	}
	
	/**
	 * Devuelve el número de dígitos que contiene un número entero.
	 * 
	 * @param x un número entero positivo.
	 * @return el número de dígitos que contiene un número entero.
	 */
	
	public static int digitos(int x){
		
		int digitos = (int)(Math.log10(x)+1);					// Le sumamos 1 al logaritmo en base 10 del número en cuestión.
		
		return digitos;
	}
	
	/**
	 * Voltea un número entero.
	 * 
	 * @param x un número entero positivo.
	 * @return el número original volteado.
	 */
	 
	public static int voltea(int x){
		
		int numVolteado = 0, numManipulado = x;
		
		for(int i=1; i<=(Math.log10(x)+1); i++){					// Procedemos a voltear el número.
			numVolteado+=numManipulado%10;					// Vamos añadiendo la última cifra del número original al número volteado.
			
			if(i<=(Math.log10(x))){
				numVolteado*=10;					// Multiplicamos por 10 el número volteado para hacer hueco a la siguiente cifra.
				numManipulado/=10;					// Eliminamos al número original la última cifra que acaba de ser añadida al número volteado.
			}
		}
		
		return numVolteado;
	}
	
	/**
	 * Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
	 * 
	 * @param x un número entero positivo.
	 * @param y un número entero positivo.
	 * @return el dígito que está en la posición n de un número entero.
	 */
	 
	public static int digitoN(int x, int y){
		
		int num = voltea(x);					// Asignamos a la variable num el resultado de la función ´´voltea()``.
		int digito;
		
		for(int i=1; i<=y-1; i++){					// Vamos eliminando la última cifra del número hasta llegar a la cifra que queremos encontrar.
			num/=10;
		}
		
		digito = num%10;					// Cuando lleguemos a la cifra que queremos encontrar, la guardamos en la variable ´´digito``.
		
		return digito;
	}
	
	/**
	 * Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
	 * 
	 * @param x un número entero positivo.
	 * @param y un número entero positivo.
	 * 
	 * @return la posición de la primera ocurrencia de un dígito dentro de un número entero.
	 */
	 
	public static int posicionDeDigito(int x, int y){
	
		int num = voltea(x);					// Invertimos el número para poder ir comparando sus cifras desde la primera a la última.
		int pos = 1;					// Empezamos el contador con la primera cifra del número.
		
		while(x%10!=y && pos<=(int)(Math.log10(num)+1)){					// Buscamos la cifra con este bucle hasta encontrarla o hasta haber recorrido el número entero.
			x/=10;					// Vamos eliminando la última cifra del número para evaluar la siguiente cifra.
			
			pos++;
		}
		
		if(pos>0){					// En caso de que ´´pos`` sea mayor que 0, devolvemos a la función el valor de la posición, y en caso contrario, devolvemos el valor -1.
			return pos;
		}
		
		return -1;
	}
	
	/**
	 * Le quita a un número n dígitos por detrás (por la derecha).
	 * 
	 * @param x un número entero positivo.
	 * @param y un número entero positivo.
	 * @return el número con ´´y`` dígitos quitados por detrás.
	 */
	 
	public static int quitaporDetras(int x, int y){
	
		for(int i=1; i<=y; i++){					// Repetimos el bucle tantas veces como dígitos queramos quitar por detrás.
			x/=10;					// Vamos elminando cada vez el último dígito.
		}
		
		return x;					// Devolvemos a la función el número que nos quede después de haber eliminado los dígitos que no queríamos conservar.
	}
	
	/**
	 * Le quita a un número n dígitos por delante (por la izquierda).
	 * 
	 * @param x un número entero positivo.
	 * @param y un número entero positivo.
	 * @return el número con ´´y`` dígitos quitados por delante.
	 */
	
	public static int quitaPorDelante(int x, int y){
		
		int numero = x, numResultado = 0;
		
		for(int i=1; i<=(int)(Math.log10(x)+1)-y; i++){					// Recorremos este bucle las veces que sea necesaria hasta llegar al primer dígito de los que queramos eliminar.
			numResultado*=10;					// Hacemos hueco para el siguiente dígito.
			numResultado+=numero%10;					// Incorporamos el nuevo dígito al final del número que estamos generando.
			numero/=10;					// Eliminamos del número original el dígito que acabamos de añadir al nuevo número.
		}
		
		numResultado = voltea(numResultado);					// Volteamos el número que acabamos de generar para devolverlo a su orden original.
		
		return numResultado;
	}
	
	/**
	 * Añade un dígito a un número por detrás.
	 * 
	 * @param x un número entero positivo.
	 * @param y un número entero positivo.
	 * @return el número con el dígito ´´y`` añadido por detrás.
	 */
	
	public static int pegaPorDetras(int x, int y){
		
		int numPegado = x*10+y;					// La ´´x`` la agrandamos lo suficiente para hacerle hueco a la ´´y``, la cual añadimos al final de la ´´x``.
		
		return numPegado;
	}
	
	/**
	 * Añade un dígito a un número por delante.
	 * 
	 * @param x un número entero positivo.
	 * @param y un número entero positivo.
	 * @return el número con el dígito ´´y`` añadido por delante.
	 */
	
	public static int pegaPorDelante(int x, int y){
		
		int longitudX = (int)(Math.log10(x))+1;
		int yEngrandecida = (int)(y*Math.pow(10, longitudX));					// La ´´y`` la agrandamos lo suficiente para hacerle hueco a la ´´x``.
		int numPegado = yEngrandecida+x;					// Añadimos la ´´x`` al final de la ´´y``.
		
		return numPegado;
	}

	/**
	 * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
	 * 
	 * @param x un número entero positivo.
	 * @param y un número entero positivo.
	 * @return el trozo del número desde la posición ´´y`` hasta la posición ´´z``.
	 */
	
	public static int trozoDeNumero(int x, int y, int z){
		
		int numRecortado = 0;
		
		for(int i=(int)(Math.log10(x)+1); i>=1; i--){					// Recorremos todas las cifras del número.
			if(i>=y && i<=z){					// Desde que lleguemos a la posición inicial y hasta que sobrepasemos la posición final, almacenamos los dígitos que estén entre esas posiciones.
				numRecortado*=10;
				numRecortado+=x%10;
			}
			
			x/=10;
		}
		
		numRecortado = voltea(numRecortado);					// Volteamos el número que acabamos de generar para devolverlo a su orden original.
		
		return numRecortado;
	}
	
	/**
	 * Pega dos números para formar uno.
	 * 
	 * @param x un número entero positivo.
	 * @param y un número entero positivo.
	 * @return el número que resulta de concatenar los números ´´x`` e ´´y``.
	 */
	
	public static int juntaNumeros(int x, int y){
		
		int numJuntado = pegaPorDelante(x, y);					// Llamamos a la función ´´pegaPorDelante`` y le pasamos los parámetros de los 2 números que queremos juntar.
		
		return numJuntado;
	}
	
	/**
	 * Muestra los números primos que hay entre 1 y 1000.
	 * 
	 * @param x un número entero.
	 * @return un array de números enteros con los números primos que hay entre 1 y 1000.
	 */
	 
	public static int PrimosEntre1Y1000(int x){
		
		int cantPrimos = 0;
		
		for(int i=x; i<=1000; i++){
			if(esPrimo(i)){					// Llamamos a la función ´´esPrimo``, y en caso de que se nos devuelva el valor true, sumamos 1 al contador de los números primos.
				cantPrimos++;
			}
		}
		
		return cantPrimos;
	}
	
	/**
	 * Muestra los números capicúa que hay entre 1 y 99999.
	 * 
	 * @param x un número entero.
	 * @return un array de números enteros con los números capicúa entre 1 y 99999.
	 */
	
	public static int CapicuasEntre1y99999(int x){
		
		int cantCapicúas = 0;
		
		for(int i=x; i<=99999; i++){
			if(esCapicua(i)){					// Llamamos a la función ´´esCapicua``, y en caso de que se nos devuelva el valor true, sumamos 1 al contador de los números capicúa.
				cantCapicúas++;
			}
		}
		
		return cantCapicúas;
	}
}









