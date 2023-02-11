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
	 * Devuelve un array con todas las cifas del número introducido.
	 * 
	 * @param num un número entero.
	 * @return cifra[] un array con todas las cifas del número introducido.
	 */
	
	public static int[] guardarCifrasDeUnNumero(int num){
	
		int[] cifra = new int[(int)(Math.log10(num)+1)];
		
		for(int i=(int)(Math.log10(num)); i>=0; i--){					// Creamos un array con las cifras del número del revés.
			cifra[i] = num%10;
			num/=10;
		}
		
		return cifra;
	}
	
	/**
	 * Voltea un número entero.
	 * 
	 * @param x un número entero positivo.
	 * @return el número original volteado.
	 */
	 
	public static int voltea(int x){
		
		int numVolteado = 0;
		
		int[] cifraOrdenada = guardarCifrasDeUnNumero(x);
		
		for(int i=(int)(Math.log10(x)); i>=0; i--){					// Vamos colocando del revés las cifras del número.
			numVolteado+=cifraOrdenada[i];
			
			if(i>0){
				numVolteado*=10;					// Multiplicamos por 10 el número volteado para hacer hueco a la siguiente cifra.
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
	 * Devuelve el número binario que hayamos introducido correctamente.
	 * 
	 * @param vacío.
	 * @return numEnBinario un número entero.
	 */
	
	public static long introducirYComprobarNumeroBinario(){
	
		Scanner sc = new Scanner(System.in);
		long numOriginal;
		long numEnBinario = 0;
		boolean contieneDigitosNoBinarios;					// Declaramos la variable ´´contieneDigitosNoBinarios`` para comprobar si el número que se va a introducir
																																// contiene algún dígito que no se encuentre dentro de los dígitos binarios, es decir, 0 y 1.
		boolean introducidoAlgunNoBinario = false;
		
		do{					// Procedemos a comprobar si el número contiene algún dígito que no se encuentre dentro de los dígitos binarios, es decir, 0 y 1.
			contieneDigitosNoBinarios = false;					// Establecemos este valor a ´´false`` para comprobar el número que se va a introducir a continuación.
			
			System.out.print("Introduzca el número en binario que desee usted convertir: ");
			numOriginal = sc.nextLong();
			numEnBinario = numOriginal;
			
			while(numOriginal>=1){					// Vamos comprobando cifra a cifra si alguna cifra es no binaria.
				if(numOriginal%10!=0 && numOriginal%10!=1){
					contieneDigitosNoBinarios = true;					// En caso de que alguna cifra sea no binaria, cambiamos ´´contieneDigitosNoBinarios`` a ´´true``
					introducidoAlgunNoBinario = true;					// En caso de que hayamos introducido algún número no binario, esta variable nos lo hará saber para luego.
				}
				
				numOriginal/=10;
			}
			
			if(contieneDigitosNoBinarios){
				System.out.println("\nLo sentimos, pero el número introducido contiene algún dígito no binario, es decir, distinto a 0 y 1. Por favor, vuelva a introducirlo.\n");
			} else if(!contieneDigitosNoBinarios && introducidoAlgunNoBinario){					// En caso de que hayamos introducido algún número no binario,
																																																								// este mensaje nos hará saber cuándo hayamos introducido un número binario correcto.
				System.out.println("\nEl número introducido sí contiene solamente cifras binarias.");
			}
		}while(contieneDigitosNoBinarios);					// No dejamos continuar hasta que el usuario introduzca un número binario válido, es decir, que solo contenga dígitos que sean 0 y 1.
		
		return numEnBinario;
	}

	/**
	 * Devuelve el número octal que hayamos introducido correctamente.
	 * 
	 * @param vacío.
	 * @return numEnOctal un número entero.
	 */
	
	public static long introducirYComprobarNumeroOctal(){
	
		Scanner sc = new Scanner(System.in);
		long numOriginal;
		long numEnOctal = 0;
		boolean contieneDigitosNoOctales;					// Declaramos la variable ´´contieneDigitosNoBinarios`` para comprobar si el número que se va a introducir
																																// contiene algún dígito que no se encuentre dentro de los dígitos binarios, es decir, 0 y 1.
		boolean introducidoAlgunNoOctales = false;
		
		do{					// Procedemos a comprobar si el número contiene algún dígito que no se encuentre dentro de los dígitos binarios, es decir, 0 y 1.
			contieneDigitosNoOctales = false;					// Establecemos este valor a ´´false`` para comprobar el número que se va a introducir a continuación.
			
			System.out.print("Introduzca el número en octal que desee usted convertir: ");
			numOriginal = sc.nextLong();
			numEnOctal = numOriginal;
			
			while(numOriginal>=1){					// Vamos comprobando cifra a cifra si alguna cifra es no binaria.
				if(numOriginal%10==8 || numOriginal%10==9){
					contieneDigitosNoOctales = true;					// En caso de que alguna cifra sea no binaria, cambiamos ´´contieneDigitosNoBinarios`` a ´´true``
					introducidoAlgunNoOctales = true;					// En caso de que hayamos introducido algún número no binario, esta variable nos lo hará saber para luego.
				}
				
				numOriginal/=10;
			}
			
			if(contieneDigitosNoOctales){
				System.out.println("\nLo sentimos, pero el número introducido contiene algún dígito no octal, es decir, 8 ó 9. Por favor, vuelva a introducirlo.\n");
			} else if(!contieneDigitosNoOctales && introducidoAlgunNoOctales){					// En caso de que hayamos introducido algún número no binario,
																																																								// este mensaje nos hará saber cuándo hayamos introducido un número binario correcto.
				System.out.println("\nEl número introducido sí contiene solamente cifras octales.");
			}
		}while(contieneDigitosNoOctales);					// No dejamos continuar hasta que el usuario introduzca un número binario válido, es decir, que solo contenga dígitos que sean 0 y 1.
		
		return numEnOctal;
	}

	/**
	 * Devuelve el número hexadecimal que hayamos introducido correctamente.
	 * 
	 * @param vacío.
	 * @return numEnHexadecimal un String.
	 */
	
	public static String introducirYComprobarNumeroHexadecimal(){
	
		Scanner sc = new Scanner(System.in);
		String numEnHexadecimal = "";
		char caracter;
		char[] caracterHexadecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};					//Declaramos el array de char y asignamos directamente los valores.
		boolean[] arrayBooleano;
		boolean contieneSoloDigitosHexadecimales;					// Declaramos la variable ´´contieneSoloDigitosHexadecimales`` para comprobar si el número que se va a introducir
																																						// contiene algún dígito que se encuentre fuera de los dígitos hexadecimales.
		boolean introducidoAlgunNoHexadecimales = false;
		
		do{					// Procedemos a comprobar si el número contiene algún dígito que no se encuentre dentro de los dígitos hexadecimales.
			contieneSoloDigitosHexadecimales = true;					// Establecemos este valor en ´´true`` para comprobar el número que se va a introducir a continuación.
			
			System.out.print("Introduzca el número en hexadecimal que desee usted convertir: ");
			numEnHexadecimal = sc.next();
			numEnHexadecimal = numEnHexadecimal.toUpperCase();					// Convertimos todas las letras del número en mayúsculas para poder compararlas más eficientemente.
			
			arrayBooleano = new boolean[numEnHexadecimal.length()];					// Establecemos la longitud del array booleano igual que la longitud del número hexadecimal que queremos comparar.
			
			for(int i=0; i<numEnHexadecimal.length(); i++){
				caracter = numEnHexadecimal.charAt(i);
				arrayBooleano[i] = false;					// Establecemos siempre por defecto los booleanos de todos los números como ´´false``.
				
				for(int j=0; j<caracterHexadecimal.length; j++){
					if(caracterHexadecimal[j]==caracter){
						arrayBooleano[i] = true;					// En caso de encontrar algún carácter fuera de las cifras hexadecimales, cambia este valor a ´´true``.
					}
				}
			}
			
			for(int i=0; i<arrayBooleano.length; i++){
				if(!arrayBooleano[i]){					// Si hay algun booleano en el array que sea ´´false``, cambiamos la variable ´´contieneSoloDigitosHexadecimales`` a false.
					contieneSoloDigitosHexadecimales = false;
				}
			}
			
			if(!contieneSoloDigitosHexadecimales){
				System.out.println("\nLo sentimos, pero el número introducido contiene algún dígito no hexadecimal, es decir, una letra que no esté entre la ´´a`` y la ´´f``. Por favor, vuelva a introducirlo.\n");
				introducidoAlgunNoHexadecimales = true;
			} else if(contieneSoloDigitosHexadecimales && introducidoAlgunNoHexadecimales){					// En caso de que hayamos introducido algún número no hexadecimal,
																																																																			// este mensaje nos hará saber cuándo hayamos introducido un número hexadecimal correcto.
				System.out.println("\nEl número introducido sí contiene solamente cifras hexadecimales.");
			}
		}while(!contieneSoloDigitosHexadecimales);					// No dejamos continuar hasta que el usuario introduzca un número hexadecimal válido, es decir, que no contenga una letra que no esté entre la ´´a`` y la ´´f``
		
		return numEnHexadecimal;
	}

	/**
	 * Devuelve en decimal un número introducido en binario.
	 * 
	 * @param numEnBinario un número entero.
	 * @return numEnDecimal un número entero.
	 */
	
	public static long conversorBinarioADecimal(long numEnBinario){
	
		long signo = 1, numEnDecimal = 0, potencia = 0;
		
		if(numEnBinario<0){					// En caso de que el número original sea negativo, establecemos el signo en -1 para multiplicarlo luego por el número en binario.
			signo = -1;
		}
		
		numEnBinario = Math.abs(numEnBinario);
		
		while(numEnBinario>=1){
			numEnDecimal+=(numEnBinario%2)*Math.pow(2,potencia);					// Al número binario le sumamos el resto que resulta de dividir el número decimal entre 2, y colocamos ese resto en su lugar correspondiente según la potencia en la que estemos en cada momento.
			
			numEnBinario/=10;
			potencia+=1;
		}
		
		numEnDecimal*=signo;					// Colocamos el signo adecuado al número.
		
		return numEnDecimal;
	}
	
	/**
	 * Devuelve en binario un número introducido en decimal.
	 * 
	 * @param numEnDecimal un número entero.
	 * @return numEnBinario un número entero.
	 */
	
	public static long conversorDecimalABinario(long numEnDecimal){
	
		long signo = 1, numEnBinario = 0, potencia = 1;
		
		if(numEnDecimal<0){					// En caso de que el número original sea negativo, establecemos el signo en -1 para multiplicarlo luego por el número en binario.
			signo = -1;
		}
		
		numEnDecimal = Math.abs(numEnDecimal);
		
		while(numEnDecimal>=1){
			numEnBinario+=(numEnDecimal%2)*potencia;					// Al número binario le sumamos el resto que resulta de dividir el número decimal entre 2, y colocamos ese resto en su lugar correspondiente según la potencia en la que estemos en cada momento.
			
			numEnDecimal/=2;
			potencia*=10;
		}
		
		numEnBinario*=signo;					// Colocamos el signo adecuado al número.
		
		return numEnBinario;
	}

	/**
	 * Devuelve en decimal un número introducido en octal.
	 * 
	 * @param numEnOctal un número entero.
	 * @return numEnDecimal un número entero.
	 */
	
	public static long conversorOctalADecimal(long numEnOctal){
	
		long signo = 1, numEnDecimal = 0, potencia = 0;
		
		if(numEnOctal<0){					// En caso de que el número original sea negativo, establecemos el signo en -1 para multiplicarlo luego por el número en binario.
			signo = -1;
		}
		
		numEnOctal = Math.abs(numEnOctal);
		
		while(numEnOctal>=1){
		numEnDecimal+=(numEnOctal%10)*Math.pow(8,potencia);					// Al número binario le sumamos el resto que resulta de dividir el número decimal entre 2,
																																																	// y colocamos ese resto en su lugar correspondiente según la potencia en la que estemos en cada momento.
			
			numEnOctal/=10;
			potencia+=1;
		}
		
		numEnDecimal*=signo;					// Colocamos el signo adecuado al número.
		
		return numEnDecimal;
	}
	
	/**
	 * Devuelve en octal un número introducido en decimal.
	 * 
	 * @param numEnDecimal un número entero.
	 * @return numEnOctal un número entero.
	 */
	
	public static long conversorDecimalAOctal(long numEnDecimal){
	
		long signo = 1, numEnOctal = 0, potencia = 1;
		
		if(numEnDecimal<0){					// En caso de que el número original sea negativo, establecemos el signo en -1 para multiplicarlo luego por el número en binario.
			signo = -1;
		}
		
		numEnDecimal = Math.abs(numEnDecimal);
		
		while(numEnDecimal>=1){
			numEnOctal+=(numEnDecimal%8)*potencia;					// Al número binario le sumamos el resto que resulta de dividir el número decimal entre 2, y colocamos ese resto en su lugar correspondiente según la potencia en la que estemos en cada momento.
			
			numEnDecimal/=8;
			potencia*=10;
		}
		
		numEnOctal*=signo;					// Colocamos el signo adecuado al número.
		
		return numEnOctal;
	}

	/**
	 * Devuelve en decimal un número introducido en hexadecimal.
	 * 
	 * @param numEnHexadecimal un String.
	 * @return numEnDecimal un número entero.
	 */
	
	public static long conversorHexadecimalADecimal(String numEnHexadecimal){
	
		int valorDeCifraEnDecimal = 0, potencia = 0;					// Declaramos la variable a la que le vamos a asignar el valor de cada cifra hexadecimal.
		long numEnDecimal = 0;
		
		for(int i=(numEnHexadecimal.length())-1; i>=0; i--){					// Realizamos este bucle el número de veces igual a la longitud del número hexadecimal.
			switch(numEnHexadecimal.charAt(i)){					//Para cada cifra hexadecimal, asignamos el valor que le corresponde en números decimales.
				case '0':
					valorDeCifraEnDecimal = 0;
					break;
				case '1':
					valorDeCifraEnDecimal = 1;
					break;
				case '2':
					valorDeCifraEnDecimal = 2;
					break;
				case '3':
					valorDeCifraEnDecimal = 3;
					break;
				case '4':
					valorDeCifraEnDecimal = 4;
					break;
				case '5':
					valorDeCifraEnDecimal = 5;
					break;
				case '6':
					valorDeCifraEnDecimal = 6;
					break;
				case '7':
					valorDeCifraEnDecimal = 7;
					break;
				case '8':
					valorDeCifraEnDecimal = 8;
					break;
				case '9':
					valorDeCifraEnDecimal = 9;
					break;
				case 'A':
					valorDeCifraEnDecimal = 10;
					break;
				case 'B':
					valorDeCifraEnDecimal = 11;
					break;
				case 'C':
					valorDeCifraEnDecimal = 12;
					break;
				case 'D':
					valorDeCifraEnDecimal = 13;
					break;
				case 'E':
					valorDeCifraEnDecimal = 14;
					break;
				case 'F':
					valorDeCifraEnDecimal = 15;
					break;
			}
			
			numEnDecimal+=(valorDeCifraEnDecimal*Math.pow(16,potencia));					// Vamos realizando la operación para construir el número decimal.
			potencia++;
		}
		
		return numEnDecimal;
	}

	/**
	 * Devuelve en hexadecimal un número introducido en decimal.
	 * 
	 * @param numEnDecimal un número entero.
	 * @return numEnHexadecimal un String.
	 */
	
	public static String conversorDecimalAHexadecimal(long numEnDecimal){
	
		String digitoHexadecimal = "", numEnHexadecimal = "";
		String[] cifraHexadecimal = new String[(int)(Math.log10(numEnDecimal)+1)];
		int cont = 0;
		
		do{					// Realizamos este bucle hasta haber manipulado lo suficiente al número decimal.
			switch((int)(numEnDecimal%16)){					//Para cada resto, asignamos el valor que le corresponde en números hexadecimales.
				case 0:
					digitoHexadecimal = "0";
					break;
				case 1:
					digitoHexadecimal = "1";
					break;
				case 2:
					digitoHexadecimal = "2";
					break;
				case 3:
					digitoHexadecimal = "3";
					break;
				case 4:
					digitoHexadecimal = "4";
					break;
				case 5:
					digitoHexadecimal = "5";
					break;
				case 6:
					digitoHexadecimal = "6";
					break;
				case 7:
					digitoHexadecimal = "7";
					break;
				case 8:
					digitoHexadecimal = "8";
					break;
				case 9:
					digitoHexadecimal = "9";
					break;
				case 10:
					digitoHexadecimal = "A";
					break;
				case 11:
					digitoHexadecimal = "B";
					break;
				case 12:
					digitoHexadecimal = "C";
					break;
				case 13:
					digitoHexadecimal = "D";
					break;
				case 14:
					digitoHexadecimal = "E";
					break;
				case 15:
					digitoHexadecimal = "F";
					break;
			}
			
			for(int i=0; i<(int)(Math.log10(numEnDecimal)+1); i++){					// Vamos guardando las cifras hexadecimales en el array creado para ello.
				cifraHexadecimal[i] = digitoHexadecimal;
			}
			
			cont++;					// Contamos el número de cifras hexadecimales que se han guardado.
			
			numEnDecimal/=16;
		}while((int)(numEnDecimal)>0);
			
			for(int i=0; i<cont; i++){					// Vamos concatenando las cifras hexadecimales para construir el número hexadecimal.
				numEnHexadecimal+=cifraHexadecimal[i];
			}
			
			return numEnHexadecimal;
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

	/**
	 * Devuelve un número convertido al sistema de palotes.
	 * 
	 * @param n un número entero.
	 * @return numeroConPalotes un String con el número convertido a palotes.
	 */
	
	public static String convierteEnPalotes(int n){
	
		int[] cifra = guardarCifrasDeUnNumero(n);					// Ejecutamos la función que nos crea un array con todas las cifras del número en cuestión.
		String numeroConPalotes = "", palote = "|", separ = "-";
		
		for(int i=0; i<cifra.length; i++){					// Realizamos este bucle el mismo número de veces que la longitud del array ´´cifra``.
			for(int j=0; j<cifra[i]; j++){					// Realizamos este bucle el mismo número de veces que el valor del elemento ´´cifra[i]``.
				numeroConPalotes+=palote;					// Contatenamos 1 palote en cada bucle tantas veces como el valor del elemento ´´cifra[i]``.
			}
			
			numeroConPalotes+=separ;					// Añadimos la separación después de terminar con los palotes de cada cifra.
		}
		
		return numeroConPalotes;
	}

	/**
	 * Devuelve un número entero convertido a Morse. 
	 * 
	 * @param n un número entero.
	 * @return numeroEnPalabras un String con el número convertido a palabras.
	 */
	
	public static String convierteEnMorse(int n){
	
		int[] cifra = guardarCifrasDeUnNumero(n);					// Ejecutamos la función, que nos crea un array con todas las cifras del número en cuestión.
		String numeroEnMorse = "", cifraEnMorse = "";
		
		for(int i=0; i<cifra.length; i++){
			switch(cifra[i]%10){					// Guardamos cada cifra con su expresión en Morse.
				case 0:
					cifraEnMorse = "_ _ _ _ _";
				break;
				case 1:
					cifraEnMorse = ". _ _ _ _";
				break;
				case 2:
					cifraEnMorse = ". . _ _ _";
				break;
				case 3:
					cifraEnMorse = ". . . _ _";
				break;
				case 4:
					cifraEnMorse = ". . . . _";
				break;
				case 5:
					cifraEnMorse = ". . . . .";
				break;
				case 6:
					cifraEnMorse = "_ . . . ";
				break;
				case 7:
					cifraEnMorse = "_ _ . . .";
				break;
				case 8:
					cifraEnMorse = "_ _ _ . .";
				break;
				case 9:
					cifraEnMorse = "_ _ _ _ .";
				break;
			}
			
			numeroEnMorse+=cifraEnMorse;					// Vamos concatenando la cifra en Morse al número en Morse
																															// que llevamos construido hasta el momento.
			
			if(i<(cifra.length)-1){					// Añadimos un espacio después de cada cifra en Morse.
				numeroEnMorse+="    ";
			}
		}
		
		return numeroEnMorse;
	}

	/**
	 * Devuelve un número entero expresado en palabras. 
	 * 
	 * @param n un número entero.
	 * @return numeroEnPalabras un String con el número convertido a palabras.
	 */
	
	public static String convierteEnPalabras(int n){
	
		int[] cifra = guardarCifrasDeUnNumero(n);					// Ejecutamos la función, que nos crea un array con todas las cifras del número en cuestión.
		String numeroEnPalabras = "", palabra = "";
		
		for(int i=0; i<cifra.length; i++){
			switch(cifra[i]){					// Guardamos cada cifra con su expresión en palabras.
				case 0:
					palabra = "cero";
				break;
				case 1:
					palabra = "uno";
				break;
				case 2:
					palabra = "dos";
				break;
				case 3:
					palabra = "tres";
				break;
				case 4:
					palabra = "cuatro";
				break;
				case 5:
					palabra = "cinco";
				break;
				case 6:
					palabra = "seis";
				break;
				case 7:
					palabra = "siete";
				break;
				case 8:
					palabra = "ocho";
				break;
				case 9:
					palabra = "nueve";
				break;
			}
			
			numeroEnPalabras+=palabra;					// Vamos concatenando la cifra en palabras al número en palabras
																													// que llevamos construido hasta el momento.
			
			if(i<(cifra.length)-1){
				numeroEnPalabras+=", ";
			}
		}
		
		return numeroEnPalabras;
	}
}
