import java.util.Scanner;

/**
 * Escribir un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 * @autor Lucas Bermudo Junco
 */

public class Horóscopo{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String nomMesNac = "", horóscopo = "";
		
		System.out.println("A continuación, se te mostrará tu horóscopo tras introducir tu día y mes de nacimiento.\n");
		System.out.print("Por favor, introduce el día de tu nacimiento: ");
		int díaNac = sc.nextInt();
		System.out.print("Por favor, introduce el número del mes de tu nacimiento: ");
		int numMesNac = sc.nextInt();
		
		if(numMesNac<1 || numMesNac>12 || díaNac<1 || numMesNac==1 && díaNac>31 || numMesNac==2 && díaNac>29 || numMesNac==3 && díaNac>31 || numMesNac==4 && díaNac>30 ||
		numMesNac==5 && díaNac>31 || numMesNac==6 && díaNac>30 || numMesNac==7 && díaNac>31 || numMesNac==8 && díaNac>31 || numMesNac==9 && díaNac>30 ||
		numMesNac==10 && díaNac>31 || numMesNac==11 && díaNac>30 || numMesNac==12 && díaNac>31){					// Establecemos que solo se puedan introducir las fechas correctas del calendario
			System.out.println("\nLo sentimos, pero la fecha introducida no existe.");
			System.out.println("Si quieres volver a intentarlo, aquí te mostramos la fecha que has introducido para que puedas detectar el error, muchas gracias.");
			System.out.println("Día de nacimiento: " + díaNac);
			System.out.println("Mes de nacimiento: " + numMesNac);
		} else{
			switch(numMesNac){					// Asignamos los 2 signos del horóscopo de cada mes según el día del mes.
				case 1:
					nomMesNac = "enero";
					if(díaNac<20){
						horóscopo = "Capricornio";
					} else{
						horóscopo = "Acuario";
					}
					break;
				case 2:
					nomMesNac = "febrero";
					if(díaNac<19){
						horóscopo = "Acuario";
					} else{
						horóscopo = "Piscis";
					}
					break;
				case 3:
					nomMesNac = "marzo";
					if(díaNac<21){
						horóscopo = "Acuario";
					} else{
						horóscopo = "Aries";
					}
					break;
				case 4:
					nomMesNac = "abril";
					if(díaNac<20){
						horóscopo = "Aries";
					} else{
						horóscopo = "Tauro";
					}
					break;
				case 5:
					nomMesNac = "mayo";
					if(díaNac<21){
						horóscopo = "Tauro";
					} else{
						horóscopo = "Géminis";
					}
					break;
				case 6:
					nomMesNac = "junio";
					if(díaNac<21){
						horóscopo = "Géminis";
					} else{
						horóscopo = "Cáncer";
					}
					break;
				case 7:
					nomMesNac = "julio";
					if(díaNac<23){
						horóscopo = "Cáncer";
					} else{
						horóscopo = "Leo";
					}
					break;
				case 8:
					nomMesNac = "agosto";
					if(díaNac<23){
						horóscopo = "Leo";
					} else{
						horóscopo = "Virgo";
					}
					break;
				case 9:
					nomMesNac = "septiembre";
					if(díaNac<23){
						horóscopo = "Virgo";
					} else{
						horóscopo = "Libra";
					}
					break;
				case 10:
					nomMesNac = "octubre";
					if(díaNac<23){
						horóscopo = "Libra";
					} else{
						horóscopo = "Escorpio";
					}
					break;
				case 11:
					nomMesNac = "noviembre";
					if(díaNac<22){
						horóscopo = "Escorpio";
					} else{
						horóscopo = "Sagitario";
					}
					break;
				case 12:
					nomMesNac = "diciembre";
					if(díaNac<22){
						horóscopo = "Capricornio";
					} else{
						horóscopo = "Acuario";
					}
					break;
			}
			System.out.println("\nAl haber nacido el " + díaNac + " de " + nomMesNac + ", tu horóscopo es " + horóscopo + ".");
		}
	}
}
