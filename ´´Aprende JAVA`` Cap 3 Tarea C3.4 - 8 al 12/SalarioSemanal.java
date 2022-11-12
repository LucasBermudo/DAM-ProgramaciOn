import java.util.Scanner;

/**
 * Calcular el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @autor Lucas Bermudo Junco
 */

public class SalarioSemanal{
	public static void main(String args[]){
	
		int salarPorHora = 12;
		Scanner s = new Scanner (System.in);
		
		System.out.print("Por favor, introduce la cantidad de horas que el empleado ha trabajado esa semana: ");
		int horasTrabaj = s.nextInt();
		
		int salarSem = horasTrabaj * salarPorHora;
		
		System.out.println("El salario del empleado esa semana es de: " + salarSem + " euros.");
	}
}
