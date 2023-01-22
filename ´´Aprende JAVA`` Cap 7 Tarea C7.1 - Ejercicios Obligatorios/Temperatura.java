import java.util.Scanner;

/**
 * Realizar un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y
 * que muestre a continuación un diagrama de barras horizontales con esos datos.
 * Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Temperatura{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int[] temp = new int[12];
		int i = 0, j, numeroMes = 1;
		String nombreMes = "";
		double tempConDecimales;
		char cuadrado = (char)9632;
		
		System.out.println("A continuación, introduce la temperatura media de cada mes del año pasado (tiene que ser igual o mayor a 0, " +
															"ya que 0 es la temperatura más baja que se va a mostrar en esta gráfica).\n");
		
		for(int n : temp){					// Introducimos la temperatura de cada mes.
			switch(i){					// Asignamos el nombre de cada mes al número del mes (empezando por el 0 y terminando por el 11).
				case 0:
					nombreMes = "enero";
					break;
				case 1:
					nombreMes = "febrero";
					break;
				case 2:
					nombreMes = "marzo";
					break;
				case 3:
					nombreMes = "abril";
					break;
				case 4:
					nombreMes = "mayo";
					break;
				case 5:
					nombreMes = "junio";
					break;
				case 6:
					nombreMes = "julio";
					break;
				case 7:
					nombreMes = "agosto";
					break;
				case 8:
					nombreMes = "septiembre";
					break;
				case 9:
					nombreMes = "octubre";
					break;
				case 10:
					nombreMes = "noviembre";
					break;
				case 11:
					nombreMes = "diciembre";
					break;
			}
			
			System.out.print(nombreMes + ": ");
			tempConDecimales = sc.nextDouble();					// Permitimos introducir la temperatura con decimales (aunque luego vayamos a desechar la parte decimal para poder mostrar las barras concatenando bloques).
			
			while(tempConDecimales<0){					// Obligamos a introducir temperaturas iguales o mayores que 0, puesto que esa temperatura va a ser el valor más pequeño de nuestra gráfica.
				System.out.println("\nLo sentimos, pero la temperatura tiene que ser igual o mayor que 0. Por favor, vuelva a introducir la temperatura de " + nombreMes + ", muchas gracias.");
				tempConDecimales = sc.nextDouble();
			}
			
			temp[i] = (int)tempConDecimales;					// Convertimos la temperatura introducida en un entero (desechando la parte decimal del número).
			
			i++;
		}
		
		i = 0;
		
		System.out.println("\nEvolución de la temperatura a lo largo de los meses del año pasado:\n");
		
		for(int n : temp){
			switch(i){
				case 0:
					nombreMes = "enero";
					break;
				case 1:
					nombreMes = "febrero";
					break;
				case 2:
					nombreMes = "marzo";
					break;
				case 3:
					nombreMes = "abril";
					break;
				case 4:
					nombreMes = "mayo";
					break;
				case 5:
					nombreMes = "junio";
					break;
				case 6:
					nombreMes = "julio";
					break;
				case 7:
					nombreMes = "agosto";
					break;
				case 8:
					nombreMes = "septiembre";
					break;
				case 9:
					nombreMes = "octubre";
					break;
				case 10:
					nombreMes = "noviembre";
					break;
				case 11:
					nombreMes = "diciembre";
					break;
			}
			
			System.out.print(nombreMes + ":   \t|  ");
			
			for(j=1; j<=temp[i]; j++){					// Rellenamos la barra de cada temperatura.
				System.out.print(cuadrado);
			}
			
			System.out.println();
			
			i++;
		}
		
		System.out.println("────────────────┼─────────────────────────────────────────────────────");
		System.out.println("\t\t   0    5   10   15   20   25   30   35   40   45   50");
	}
}
