import java.util.Scanner;

/**
 * Escribe un programa que genere la nómina bien desglosada de un empleado.
 *
 * @autor Lucas Bermudo Junco.
 */

public class Nómina{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int cargo, visita, estCivil;
		double sueldoBase = 0, dietas, sueldoBruto = 0, sueldoNeto = 0, dinIrpf = 0;
		String porcIrpf = "";
		
		System.out.println("FORMULARIO DE LA NÓMINA MENSUAL\n");
		
		System.out.println("1 - Programador Junior");
		System.out.println("2 - Programador Senior");
		System.out.println("3 - Jefe de Proyectos");
		
		System.out.print("Introduzca el cargo del empleado (1 - 3): ");
		cargo = sc.nextInt();
		
		System.out.print("¿Cuántos días ha estado de viaje visitando clientes? (0 - 31): ");
		visita = sc.nextInt();
		
		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		estCivil = sc.nextInt();
		
		if(cargo>=1 && cargo <=3 && visita >=0 && visita<=31 && estCivil>=1 && estCivil<=2){					// Establecemos las respuestas posibles.
			switch(cargo){					// Establecemos los valores para cada tipo de cargo.
				case 1:
					sueldoBase = 950;
					break;
				case 2:
					sueldoBase = 1200;
					break;
				case 3:
					sueldoBase = 1600;
					break;
			}
			
			dietas = visita*30;
			sueldoBruto = sueldoBase+(double)dietas;
			
			switch(estCivil){					// Establecemos los valores para cada tipo de estado civil.
				case 1:
					porcIrpf = "25%";
					dinIrpf = sueldoBruto*0.25;
					sueldoNeto = sueldoBruto-dinIrpf;
					break;
				case 2:
					porcIrpf = "20%";
					dinIrpf = sueldoBruto*0.20;
					sueldoNeto = sueldoBruto-dinIrpf;
					break;
			}
			
			System.out.println("\n\nNÓMINA MENSUAL\n");
			
			System.out.println("----------------------------------");
			System.out.printf("| %-22s %4.2f |\n", "Sueldo Base", sueldoBase);
			
			if(dietas<100){
				System.out.printf("| Dietas (%2d viajes) %-5s %4.2f |\n", visita, "", dietas);
			} else{
				System.out.printf("| Dietas (%2d viajes) %-4s %4.2f |\n", visita, "", dietas);
			}
			
			System.out.println("----------------------------------");
			System.out.printf("| %-22s %4.2f |\n", "Sueldo Bruto", sueldoBruto);
			System.out.printf("| Retención IRPF (%-3s)%-3s %4.2f |\n", porcIrpf, "",dinIrpf);
			System.out.println("----------------------------------");
			System.out.printf("| %-22s %4.2f |\n", "Sueldo Neto", sueldoNeto);
			System.out.println("----------------------------------");
		} else{
			System.out.println("\nLo sentimos, pero usted ha introducido algún dato incorrecto.");
			System.out.println("El cargo tiene que estar entre 1 y 3, el día entre 0 y 31 y el estado civil entre 1 y 3. Los datos que usted a introducido son:");
			System.out.println("Cargo: " + cargo);
			System.out.println("" + visita);
			System.out.println("" + estCivil);
			System.out.println("Si quiere volver a intentarlo, reinicie el programa y vuelva a introducir los datos, muchas gracias.");
		}
	}
}
