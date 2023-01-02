import java.util.Scanner;

/**
 * Hacer un configurador que calcule el precio de una bandera.
 *
 * @autor Lucas Bermudo Junco.
 */

public class PrecioBandera{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int altura, anchura, área;
		double precioBase = 0, precioPorCm = 0.01, suplEsc = 0, precioTotal, gastEnvío = 3.25;
		String escudo;
		
		System.out.print("Por favor, introduce la altura de la bandera en centímetros: ");
		altura = sc.nextInt();
		
		System.out.print("Por favor, introduce la anchura de la bandera en centímetros: ");
		anchura = sc.nextInt();
		
		System.out.print("¿Quiere escudo bordado? (s/n): " );
		escudo = sc.next();
		
		if(!escudo.equals("s") && !escudo.equals("n")){					// Establecemos por defecto las respuestas distintas como respuestas negativas.
			System.out.println("\nA la pregunta de si quiere usted escudo bordado o no, usted ha respondido ´´" + 
															escudo + "``, que no es ninguna de las 2 opciones disponibles (s/n), por lo que " + 
															"este programa interpreta por defecto que la respuesta es ´´no``\n");
		}
		
		System.out.println("\nGracias. Aquí tiene el desglose de su compra.\n");
		
		if(altura>0 && anchura>0){
			área = altura*anchura;
			precioBase = precioPorCm*área;					// Establecemos el precio base según las dimensiones de la bandera.
			
			System.out.printf("Bandera de %d cm2:   %5.2f Euros\n", área, precioBase);
			
			if(escudo.equals("s")){					// Añadimos o no el precio del escudo al precio base.
				suplEsc = 2.50;
				System.out.print("Con ");
			} else{
				System.out.print("Sin ");
			}
			
			precioTotal = precioBase+suplEsc+gastEnvío;
			
			System.out.printf("%-19s %2.2f Euros\n", "escudo:", suplEsc);
			System.out.printf("%-23s %1.2f Euros\n", "Gastos de envío:", gastEnvío);
			System.out.printf("%-22s %5.2f Euros\n", "Total:", precioTotal);
		} else{
			System.out.println("Lo sentimos, pero la altura y el ancho de la bandera tienen que ser mayores que 0, y usted ha respondido:");
			System.out.println("Altura: " + altura + "\nAncho: ");
			System.out.println("Si quiere volver a realizar el pedido, reinicie el programa y vuelva a introducir los datos, muchas gracias.");
		}
	}
}
