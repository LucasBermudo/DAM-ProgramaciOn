import java.util.Scanner;

/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función del número de personas y del día de la semana.
 *
 * @autor Lucas Bermudo Junco.
 */

public class PrecioEntradas{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		double precioBase = 8, descuento, precioDoble = 11, precioPersonas = 0, precioFinal;
		int personas;
		String día, tarjeta;
		
		System.out.println("Venta de entradas CineCampa");
		System.out.print("Número de entradas (aforo máximo: 100): ");
		personas = sc.nextInt();
		
		if(personas>1 && personas<=100){
			System.out.print("Día de la semana: ");
			día = sc.next();
			día = día.toLowerCase();
			
			if(día.equals("lunes") || día.equals("martes") || día.equals("miércoles") || día.equals("miercoles") || día.equals("jueves") || 
					día.equals("viernes") || día.equals("sábado") || día.equals("sabado") || día.equals("domingo")){
				System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
				tarjeta = sc.next();
				
				if(!tarjeta.equals("s") && !tarjeta.equals("n")){					// Establecemos por defecto las respuestas distintas como respuestas negativas.
					System.out.println("\nA la pregunta de si tiene usted tarjeta bordado o no, usted ha respondido ´´" + 
																		tarjeta + "``, que no es ninguna de las 2 opciones disponibles (s/n), por lo que " + 
																		"este programa interpreta por defecto que la respuesta es ´´no``\n");
				}
				
				if(tarjeta.equals("s")){
					descuento=0.9;					// Establecemos el cálculo para el descuento.
				} else{
					descuento=1;
				}
				
				if(día.equals("miércoles") || día.equals("miercoles")){					// Establecemos el precio por entrada según el día de la semana.
					if(personas%2==0){					// Establecemos el precio de los miércoles seguún si hay un número par o impar de personas.
						precioPersonas = (personas/2*precioDoble);
					} else{
						precioPersonas = (personas/2*precioDoble)+8;
					}
				} else{
					precioPersonas = personas*precioBase;
				}
				
				precioFinal = precioPersonas*descuento;
				
				descuento = precioFinal-precioPersonas;
				
				System.out.println("\nAquí tiene sus entradas. Gracias por su compra.\n");
				System.out.printf("%-32s %d entradas\n", "Entradas individuales", personas);
				
				if(!día.equals("miércoles") && !día.equals("miercoles")){					// Mostramos un mensaje distinto según el día de la semana, y en caso del miércoles, según si hay un número par o impar de personas.
					System.out.printf("%-32s %.2f Euros\n", "Precio por entrada individual", precioBase);
				} else{
					if(personas%2==0){
						System.out.printf("%-32s %.2f Euros\n", "Precio por entrada doble", precioDoble);
					} else{
						System.out.printf("%-32s %.2f Euros\n", "Precio por entrada individual", precioBase);
						System.out.printf("%-32s %.2f Euros\n", "Precio por entrada doble", precioDoble);
					}
				}
				
				
				
				if(tarjeta.equals("s")){					// Mostramos mensajes distintos según si hay descuento o no.
					System.out.printf("%-32s %.2f Euros\n", "Total", precioPersonas);
					System.out.printf("%-32s %.2f Euros\n", "Descuento por tarj. CinceCampa", descuento);
					System.out.printf("%-32s %.2f Euros\n", "A pagar", precioFinal);
				} else{
					System.out.printf("%-32s %.2f Euros\n", "Total a pagar", precioFinal);
				}
				
			} else{
				System.out.println("\nLo sentimos, pero el día de la semana ha sido escrito incorrectamente.");
				System.out.println("Si quieres volver a intentarlo, por favor reinicie el programa e introduzca el día correctamente, muchas gracias.");
			}
		} else{
			if(personas<0){
				System.out.println("\nLo sentimos, pero el número de personas tiene que ser mayor que 0.");
				System.out.println("Si quieres volver a intentarlo, por favor reinicie el programa e introduzca un número de personas válido, muchas gracias.");
			} else{
				System.out.println("\nLo sentimos, pero el número de personas tiene que ser menor o igual que 100, que es el aforo máximo de la sala.");
				System.out.println("Si quieres volver a intentarlo, por favor reinicie el programa e introduzca un número de personas válido, muchas gracias.");
			}
		}
	}
}
