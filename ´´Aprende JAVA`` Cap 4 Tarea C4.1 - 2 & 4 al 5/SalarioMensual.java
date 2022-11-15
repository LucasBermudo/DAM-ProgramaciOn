/**
 * Escribir un programa que calcule el salario semanal de un trabajador teniendo en cuenta las horas ordinarias y las extraordinarias.
 * 
 * @autor Lucas Bermudo Junco
 */

public class SalarioMensual{
	public static void main(String args[]){
	
		int salHorNorm = 12, salHorExtr = 16;
		
		System.out.print("¿Cuántas horas ha trabajado esta semana el trabajador?: ");
		String línea = System.console().readLine();
		int horTrab = Integer.parseInt(línea);
		
		if(horTrab >= 0){
			if(horTrab <= 40 ){
			int salSem = horTrab * salHorNorm;
			System.out.println("El salario semanal del trabajador es: " + salSem + " euros.");		
			} else {
			int salSem = (40 * salHorNorm) + ((horTrab-40) * salHorExtr);
			System.out.println("El salario semanal del trabajador es: " + salSem + " euros.");
			}
		} else {
		System.out.println("Lo sentimos, pero el número de horas trabajadas no puede ser un número negativo.");
		}
	}
}
