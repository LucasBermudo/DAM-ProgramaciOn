import java.util.Scanner;

/**
 * realizar un programa que haga presupuestos de tartas.
 *
 * @autor Lucas Bermudo
 */

public class PrecioTartas{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String sabor, saborChoc, nataSiNo, nombreSiNo;
		double precioBase = 0, suplNata = 0, suplNombre = 0, precioTotal;
		boolean correcto = true;
		
		System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
		sabor = sc.next();
		sabor = sabor.toLowerCase();					// Convertimos la respuesta introducida en minúsculas para poder aceptar la respuesta tanto en minúscula omo en mayúscula.
		
		if(sabor.equals("manzana") || sabor.equals("fresa") || sabor.equals("chocolate")){					// Establecemos las respuestas posibles.
			if(sabor.equals("chocolate")){					// Especificamos el sabor en caso de ser chocolate.
				System.out.print("¿Qué tipo de chocolate quieres? (negro o blanco): ");
				saborChoc = sc.next();
				saborChoc = saborChoc.toLowerCase();
				
				if(saborChoc.equals("negro") || saborChoc.equals("blanco") ){					// Establecemos el precio según el sabor.
					switch(saborChoc){
						case "negro":
							sabor = "chocolate negro";
							precioBase = 14;
							break;
						case "blanco":
							sabor = "chocolate blanco";
							precioBase = 15;
							break;
					}
				} else{					// Establecemos las respuestas posibles.
					correcto = false;
					
				}
			} else if(sabor.equals("manzana")){					// Establecemos el precio según el sabor.
				precioBase = 18;
			} else{
				precioBase = 16;
			}
			
			if(correcto==false){
				System.out.println("\nLo sentimos, pero el tipo de chocolate de la tarta está escrito incorrectamente.");
				System.out.println("Si quieres volver a intentarlo, por favor reinicia el programa y escribe el sabor correctamente, muchas gracias.");
			} else{
				System.out.print("¿Quiere nata? (sí o no): ");
				nataSiNo = sc.next();
				nataSiNo = nataSiNo.toLowerCase();
				
				if(nataSiNo.equals("sí") || nataSiNo.equals("si") || nataSiNo.equals("no")){
					if(!nataSiNo.equals("no")){
						suplNata = 2.5;
					}
				} else{
					correcto = false;
				}
				
				if(correcto==false){
					System.out.println("\nLo sentimos, pero la respuesta a la pregunta de la nata está escrita incorrectamente.");
					System.out.println("Si quieres volver a intentarlo, por favor reinicia el programa y escribe la respuesta correctamente, muchas gracias.");
				} else{
					System.out.print("¿Quiere ponerle un nombre? (sí o no): ");
					nombreSiNo = sc.next();
				 
				 if(nombreSiNo.equals("sí") || nombreSiNo.equals("si") || nombreSiNo.equals("no")){
					 if(!nombreSiNo.equals("no")){
						 suplNombre = 2.75;
						}
					} else{
						correcto = false;
					}
					
						if(correcto==false){
							System.out.println("\nLo sentimos, pero la respuesta a la pregunta del nombre está escrita incorrectamente.");
							System.out.println("Si quieres volver a intentarlo, por favor reinicia el programa y escribe la respuesta correctamente, muchas gracias.");
						} else{
						
							precioTotal = precioBase+suplNata+suplNombre;
							
							System.out.println("\nRESUMEN DEL PEDIDO");
							
							System.out.printf("\nTarta de %-18s %5.2f", sabor, precioBase);
							
							if(!nataSiNo.equals("no")){					// Mostramos un mensaje distinto según si lleva nata o no.
								System.out.printf("\n%-27s %5.2f", "Con Nata", suplNata);
							}
							
							if(nombreSiNo.equals("sí") || nombreSiNo.equals("si") || nombreSiNo.equals("no")){					// Mostramos un mensaje distinto según si lleva nombre o no.
							 if(!nombreSiNo.equals("no")){
									System.out.printf("\n%-27s %5.2f", "Con Nombre", suplNombre);
								}
							}
							
							System.out.printf("\n%-27s %5.2f", "Total", precioTotal);
						}
					}
				}
		} else{
			System.out.println("\nLo sentimos, pero el sabor de la tarta está escrito incorrectamente.");
			System.out.println("Si quieres volver a intentarlo, por favor reinicia el programa y escribe el sabor correctamente, muchas gracias.");
		}
	}
}
