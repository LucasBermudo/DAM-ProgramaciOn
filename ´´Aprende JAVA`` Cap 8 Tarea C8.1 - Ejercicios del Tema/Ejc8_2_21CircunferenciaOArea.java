import misFunciones.*;

/**
 * Escribir un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
 * En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo oportuno.
 * Implementar las funciones:
 * int menu() // Muestra el menú y devuelve el número elegido
 * double pideRadio() // Pide que se introduzca el radio y lo devuelve
 * double circunferencia(double r) // Calcula la circunferencia y la devuelve
 * double area(double r) // Calcula el área y la devuelve
 * 
 * @author Lucas Bermudo Junco
 */

public class Ejc8_2_21CircunferenciaOArea{
	public static void main(String args[]){
	
		int eleccion = Varias.menu();					// Ejecutamos y guardamos en una variable esa función, que será la encargada de pedirnos la opción que queremos elegir y de devolvérnosla una vez la hayamos introducido.
		
		System.out.println();
		
		double radio = Varias.pideRadio();					// Ejecutamos y guardamos en una variable esa función, que será la encargada de pedirnos el radio y de devolvérnoslo una vez lo hayamos introducido.
		
		System.out.println();
		
		if(eleccion==1){					// En función de la opción elegida, ejecutamos la función correspondiente.
			System.out.printf("La circunferencia del círculo de radio %.2f es %.2f.", radio, Geometria.circunferencia(radio));
		} else{
			System.out.printf("El área del círculo de radio %.2f es %.2f.", radio, Geometria.area(radio));
		}
	}
}
