package misFunciones;

import java.util.Scanner;

/**
 * Funciones varias.
 * 
 * @author Lucas Bermudo Junco
 */

public class Varias{
	
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
	 * El 1 no es primo por convenio.
	 *
	 * @param x un número entero positivo.
	 * @return <code>true</code> si el número es primo.
	 * @return <code>false</code> si el número no es primo.
	 */

	public static boolean esPrimo(int x){
		
		if(x==1){
			return false;
		} else{
			for(int i=2; i<x; i++){
				if((x%i)==0){					// En caso de encontrar algún divisor que no sea 1 ó el propio número, devolvemos a la función el valor false.
					return false;
				} 
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
	
	/**
	 * Devuelve la multiplicación de dos números.
	 * 
	 * @param a un número double.
	 * @param b un número double.
	 * @return producto el producto de a*b.
	 */
	
	public static double multiplica(double a, double b){
	
		double producto = a*b;					// Calculamos el producto de ´´a`` y ´´b``.
		
		return producto;
	}
	
	/**
	 * Devuelve el menor de 2 números.
	 * 
	 * @param a un número double.
	 * @param b un número double.
	 * @return min el número menor entre a y b.
	 */
	
	public static int minimo(int a, int b){
		
		if(a<b){					// Devolvemos el valor mínimo entre ´´a`` y ´´b``.
			return a;
		} else{
			return b;
		}
	}
	
	/**
	 * Muestra si es positivo, negativo o cero.
	 * 
	 * @param a un número entero.
	 * @return -1 si a es negativo.
	 * @return 0 si a es 0.
	 * @return 1 si a es positivo.
	 */
	
	public static int dimeSigno(int a){
		
		if(a>0){					// Devolvemos 1 si ´´a`` es positivo, 0 si es 0 y -1 si es negativo.
			return 1;
		} else if(a==0){
			return 0;
		} else{
			return -1;
		}
	}
	
	/**
	 * Devuelve la suma de enteros de 1 a n.
	 * 
	 * @param n un número entero positivo.
	 * @return suma la suma de de enteros de 1 a n.
	 */
	 
	public static int suma1aN(int n){
	
		int suma = 1;
		
		for(int i=2; i<=n; i++){					// Calculamos el sumatorio de todos los números entre 1 y ´´n``.
			suma+=i;
		}
		
		return suma;
	}
	 
	/**
	 * Devuelve el producto de enteros de 1 a n.
	 * 
	 * @param n un número entero positivo.
	 * @return producto el producto de enteros de 1 a n.
	 */
	 
	public static int producto1aN(int n){
		
		double producto = 1;
		
		for(int i=2; i<=n; i++){					// Calculamos el producto de todos los números entre 1 y ´´n``.
			producto*=i;
		}
		
		return (int)(producto);
	}
	 
	/**
	 * Devuelve el valor intermedio entre 1 y n.
	 * 
	 * @param n un número entero positivo.
	 * @return media el valor intermedio entre 1 y n.
	 */
	 
	public static double intermedio1aN(int n){
		
		double suma = 1, cantNum = 1;
		
		for(int i=2; i<=n; i++){					// Calculamos el sumatorio de todos los números entre 1 y ´´n``.
			suma+=i;
			cantNum++;
		}
		
		double media = suma/cantNum;					// Calculamos la media de todos los números entre 1 y ´´n``.
		
		return media;
	}
	
	/**
	 * Devuelve el mayor número de entre 2 números introducidos.
	 * 
	 * @param num1 un número entero.
	 * @param num2 un número entero.
	 * @return el mayor número de entre num1 ó num2.
	 */
	
	public static int numMayorPrimerOSeg(int num1, int num2){
		
		if(num1>num2){
			return num1;
		} else{
			return num2;
		}
	}

	/**
	 * Muestra un mensaje con la tabla de multiplicar del número introducido.
	 * 
	 * @param num un número entero.
	 * @return vacío (void).
	 */
	
	public static void tablaMultiplicar(int num){
		
		for(int i=1; i<=10; i++){
			System.out.println(num + "*" + i + " = " + num*i);
		}
	}

	/**
	 * Muestra un mensaje con el triángulo con la cantidad de líneas y el caracter introducidos..
	 * 
	 * @param cantLineas un número entero mayor que 1.
	 * @param caracter un String.
	 * @return vacío (void).
	 */
	
	public static void triangulo(int cantLineas, String caracter){
		
		int cantEsp = cantLineas-1;					// Establecemos la cantidad de espacios que habrá desde el comienzo de la línea hasta la pared de la pirámide.
		String esp = " ";
		
		for(int i=1; i<=cantLineas; i++){					// Empezamos a dibujar la pirámide.
			for(int j=cantEsp; j>0; j--){					// Dibujamos los espacios hasta la pared de la pirámide.
				System.out.print(esp);
			}
			
			for(int j=1; j<=(i*2)-1; j++){					// Dibujamos cada fila de la pirámide.
				System.out.print(caracter);
			}
			
			System.out.println();
			cantEsp--;					// Reducimos la cantidad de espacios que habrá desde el comienzo de la línea hasta la pared de la pirámide.
		}
	}

	/**
	 * Devuelve la letra que le corresponde a cada número del NIF.
	 * 
	 * @param num un número entero.
	 * @return letra un String.
	 */
	
	public static String letraNIF(int num){
	
		String letra = "";
		
		switch(num%23){					// En función de cuál sea el resultado de num%23, guardamos la letra correspondiente en la variable ´´letra``.
			case 0:
				letra = "T";
			break;
			case 1:
				letra = "R";
			break;
			case 2:
				letra = "W";
			break;
			case 3:
				letra = "A";
			break;
			case 4:
				letra = "G";
			break;
			case 5:
				letra = "M";
			break;
			case 6:
				letra = "Y";
			break;
			case 7:
				letra = "F";
			break;
			case 8:
				letra = "P";
			break;
			case 9:
				letra = "D";
			break;
			case 10:
				letra = "X";
			break;
			case 11:
				letra = "B";
			break;
			case 12:
				letra = "N";
			break;
			case 13:
				letra = "J";
			break;
			case 14:
				letra = "Z";
			break;
			case 15:
				letra = "S";
			break;
			case 16:
				letra = "Q";
			break;
			case 17:
				letra = "V";
			break;
			case 18:
				letra = "H";
			break;
			case 19:
				letra = "L";
			break;
			case 20:
				letra = "C";
			break;
			case 21:
				letra = "K";
			break;
			case 22:
				letra = "E";
			break;
		}
		
		return letra;
	}

	/**
	 * Muestra el menú y devuelve el número elegido.
	 * 
	 * @param vacío.
	 * @return num un número entero entre 1 y 1 ambos incluidos.
	 */
	
	public static int menu(){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduzca lo que desea calcular de un círculo:");
		System.out.println("1 para calcular la longitud de la circunferencia");
		System.out.println("2 para calcular el área");
		System.out.print("Elección: ");
		int eleccion = sc.nextInt();
		
		while(eleccion<1 || eleccion>3){					// Impedimos al usuario introducir un número distinto de 1 ó 2.
			System.out.println("\nLo sentimos, pero solo hay 2 ocpiones disponibles (la 1 y la 2). Por favor, vuelva a introducirlo.");
			System.out.print("Elección: ");
			eleccion = sc.nextInt();
		}
		
		return eleccion;
	}

	/**
	 * Pide que se introduzca el radio y lo devuelve.
	 * 
	 * @param vacío.
	 * @return radio un número double.
	 */
	
	public static double pideRadio(){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el radio del círculo del cual desee averiguar sus dimensiones: ");
		double radio = sc.nextDouble();
		
		while(radio<=0){					// Impedimos al usuario introducir un radio menor o igual que 0.
			System.out.println("\nLo sentimos, pero el radio de un círculo no puede ser menor o igual a 0. Por favor, vuelva a introducirlo.");
			System.out.print("Introduzca el radio del círculo del cual desee averiguar la longitud de su circunferencia y su área:");
			radio = sc.nextDouble();
		}
		
		return radio;
	}
}
