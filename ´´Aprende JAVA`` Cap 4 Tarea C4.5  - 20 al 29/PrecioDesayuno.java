import java.util.Scanner;

/**
 * Realizar un programa que calcule el precio de un desayuno.
 *
 * @autor Lucas Bermudo Junco
 */

public class PrecioDesayuno{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String comida, comidaMinus, saborPitufo = "", saborPitufoMinus = "", bebida, bebidaMinus;
		double precioComida = 0, precioBebida = 0, precioFinal;
		boolean correcto = true;
		
		System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
		comida = sc.next();
		comidaMinus = comida.toLowerCase();					// Convertimos la respuesta introducida en minúsculas para poder aceptar la respuesta tanto en minúscula como en mayúscula.
		
		if(comidaMinus.equals("palmera") || comidaMinus.equals("donut") || comidaMinus.equals("pitufo")){					// Establecemos las respuestas posibles.
			switch(comidaMinus){
				case "palmera":
					precioComida = 1.40;					// Establecemos el precio de la comida.
					break;
				case "donut":
					precioComida = 1;
					break;
				case "pitufo":
					System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");					// Especificamos el tipo de pitufo.
					saborPitufo = sc.next();
					saborPitufoMinus = saborPitufo.toLowerCase();
					
					if(saborPitufoMinus.equals("aceite") || saborPitufoMinus.equals("tortilla")){
						switch(saborPitufoMinus){
							case "aceite":
								precioComida = 1.20;
								break;
							case "tortilla":
								precioComida = 1.60;
								break;
						}
					} else{
						correcto = false;					// Identificamos la respuesta intorucida incorrectamente.
					}
					break;
			}
			
			if(correcto==false){
				System.out.println("\nLo sentimos, pero has escrito incorrectamente el acompañamiento del pitufo.");
				System.out.println("Si quieres volver a intentarlo, por favor reinicia el programa e inctroduce el acompañamiento correctamente, muchas gracias.");
			} else{
				System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
				bebida = sc.next();
				bebidaMinus = bebida.toLowerCase();					// Convertimos la respuesta introducida en minúsculas para poder aceptar la respuesta tanto en minúscula como en mayúscula.
				
				if(bebidaMinus.equals("zumo") || bebidaMinus.equals("café") || bebidaMinus.equals("cafe")){
					switch(bebidaMinus){
						case "zumo":
							precioBebida = 1.50;
							break;
						case "café":
						case "cafe":
							precioBebida = 1.20;
							break;
					}
					
					precioFinal = precioComida+precioBebida;
					
					System.out.println("\nRESUMEN DEL PEDIDO");
					
					if(comidaMinus.equals("palmera") || comidaMinus.equals("donut")){					// Mostramos un mensaje distinto en función del tipo de desayuno.
						System.out.printf("\n%-19s %5.2f", comidaMinus, precioComida);
					} else{
						System.out.printf("\npitufo con %-8s %5.2f", saborPitufoMinus, precioComida);
					}
					
					System.out.printf("\n%-19s %5.2f", bebidaMinus, precioBebida);
					System.out.printf("\n%-19s %5.2f", "Total Desayuno", precioFinal);
				} else{
					System.out.println("\nLo sentimos, pero has introducido incorrectamente la opción de la bebida.");
					System.out.println("Si quieres volver a intentarlo, por favor reinicia el programa introduce la bebida correctamente, muchas gracias.");
				}
			}
		} else{
			System.out.println("\nLo sentimos, pero has introducido incorrectamente la opción de la comida.");
			System.out.println("Si quieres volver a intentarlo, por favor reinicia el programa introduce la comida correctamente, muchas gracias..");
		}
	}
}
