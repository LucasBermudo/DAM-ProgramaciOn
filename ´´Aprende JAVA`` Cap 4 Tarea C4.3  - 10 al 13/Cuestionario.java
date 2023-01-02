import java.util.Scanner;

/**
 * Realizar un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Cuestionario{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String respuesta, respCorrecta;
		int puntuación = 0;
		String colorDefecto = "\u001B[0m", colorCianClaro = "\033[96m", colorVerde = "\033[32m", colorRojo = "\033[31m", amarillo="\033[33m";
		
		System.out.println("Test sobre el contenido de los primeros 4 capítulos del libro APRENDE JAVA CON EJERCICIOS.\n");
		System.out.println("A continuación, se le realizarán 10 preguntas donde habrán varias opciones, de entre la que usted deberá seleccionar la opción que crea correcta.\n");
		System.out.println("Por favor, responda solamente con la letra de la opción que usted considera correcta, muchas gracias.\n");
		
		System.out.println(colorCianClaro + "1. ¿Cómo se utiliza la salida formateada ´´System.out.printf()``?" + colorDefecto);
		System.out.println("a) Colocando los números después de las comillas tras el símbolo ´´+``.");
		System.out.println("b) Colocando los números despues de las comillas tras el símbolo ´´,``.");
		System.out.println("c) Ninguna de las 2 primeras opciones son correctas.");
		System.out.println("d) Las 2 primeras opciones son correctas.");
		
		respCorrecta = "b";					// Establecemos la respuesta correcta para cada ejercicio.
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){					// Si la respuesta introducida coincide con la rspuesta correcta de esa pregunta, sumamos 1 a la puntuación.
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "2. ¿Cuál de las siguientes letras se usa en las salidas formateadas para indicar números enteros?" + colorDefecto);
		System.out.println("a) La letra ´´d``");
		System.out.println("b) La letra ´´f``");
		System.out.println("c) La letra ´´s``");
		System.out.println("d) La letra ´´p``");
		
		respCorrecta = "a";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "3. ¿Qué ocurre si concatenamos caracteres sueltos sin concatenar además ningún espacio entre comillas?" + colorDefecto);
		System.out.println("a) Los caracteres se muestran unidos uno detrás del otro en una cadena de tipo String");
		System.out.println("b) El sistema no admite esa sintaxis y no permite compilar el programa");
		System.out.println("c) Se suman los valores de su código ASCII");
		
		respCorrecta = "c";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "4. ¿En qué consiste realizar un casting a una variable?" + colorDefecto);
		System.out.println("a) Convertir una variable de un tipo a otro distinto.");
		System.out.println("b) Elegir una variable de entre un conjunto de variables.");
		System.out.println("c) Declarar la variable.");
		System.out.println("d) Hacer que no se pueda alterar esa variable.");
		
		respCorrecta = "a";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "5. ¿Qué sentencia se usa para realizar lecturas de texto?" + colorDefecto);
		System.out.println("a) Integer.parseInt()");
		System.out.println("b) Float.parseFloat()");
		System.out.println("c) System.console().readLine()");
		
		respCorrecta = "c";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "6. ¿Qué hay que realizar para usar la lectura de datos mediante la clase Scanner?" + colorDefecto);
		System.out.println("a) Escribir la clase en minúscula.");
		System.out.println("b) Importar la librería Java que la contiene al principio del programa.");
		System.out.println("c) Introducir la clase Scanner dentro del segundo paréntesis de ´´System.console().readLine()``");
		System.out.println("d) Nombrar la variable antes de indicar que es de la clase Scanner.");
		
		respCorrecta = "b";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "7. ¿Qué tipo de sentencia nos permite comparar directamente valores concretos?" + colorDefecto);
		System.out.println("a) If/Else");
		System.out.println("b) Switch");
		System.out.println("c) While");
		System.out.println("d) For");
		
		respCorrecta = "b";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "8. ¿Es correcto escribir las intrucciones sin llaves dentro de un If/Else en algún caso?" + colorDefecto);
		System.out.println("a) No, siempre es incorrecto");
		System.out.println("b) Es correcto si hay más de 1 instrucción");
		System.out.println("c) Es correcto si hay solo 1 instrucción");
		System.out.println("d) Es correcto si no se pone el punto y coma al final");
		
		respCorrecta = "c";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "9. ¿Qué significa la expresión ´´!=``?" + colorDefecto);
		System.out.println("a) Factorial de...");
		System.out.println("b) Distinto que...");
		System.out.println("c) NOT");
		System.out.println("d) Igual al Factorial de...");
		
		respCorrecta = "b";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("");
		
		System.out.println(colorCianClaro + "10. ¿Es correcto escribir un switch sin los ´´break`` al final de cada ´´case``?" + colorDefecto);
		System.out.println("a) Sí, en cuyo caso el programa ejecuta todos los ´´case`` seguidos hasta encontrar un ´´break``");
		System.out.println("b) Sí, ya que los ´´break`` son aconsejables para la claridad del programa pero no tienen un valor real y se pueden omitir sin que cambie el programa");
		System.out.println("c) No, ya que los ´´break`` son imprescindibles");
		
		respCorrecta = "a";
		
		System.out.print(amarillo + "Respuesta: ");
		respuesta = sc.next();
		System.out.print(colorDefecto);
		
		if(respuesta.equals(respCorrecta)){
			puntuación++;
			System.out.println(colorVerde + "¡Respuesta correcta!" + colorDefecto);
		} else{
			System.out.println(colorRojo + "Respuesta incorrecta." + colorDefecto + " La respuesta correcta es la opción " + respCorrecta + ").");
		}
		
		System.out.println("\nTu puntuación ha sido: " + puntuación + "\n");
		
		if(puntuación>=0 && puntuación<5){					// Mostramos el resultado del cuestionario según la puntuación obtenida.
				System.out.println("Lo sentimos, has suspendido el test. Te animamos a seguir aprendiendo, ¡Mucho ánimo!");
			} else if(puntuación>=5 && puntuación<6){
				System.out.println("Enhorabuena, has aprobado el test. Te animamos a seguir aprendiendo, ¡Mucho ánimo!");
			} else if(puntuación>=6 && puntuación<7){
				System.out.println("Enhorabuena, has aprobado el test. Te animamos a seguir aprendiendo, ¡Mucho ánimo!");
			} else if(puntuación>=7 && puntuación<9){
				System.out.println("Enhorabuena, has aprobado el test de forma notable. Te animamos a seguir aprendiendo, ¡Mucho ánimo!");
			} else if(puntuación>=9 && puntuación<=10){
				System.out.println("Enhorabuena, has aprobado el test de forma sobresaliente. Te animamos a seguir aprendiendo, ¡Mucho ánimo!");
			}
	}
}
