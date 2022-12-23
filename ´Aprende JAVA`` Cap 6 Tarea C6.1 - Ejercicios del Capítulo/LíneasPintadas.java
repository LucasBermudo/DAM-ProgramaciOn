/**
 * Realizar un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes:  *, -, =, ., |, @.
 * Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 * 
 * @autor Lucas Bermudo Junco
 */

public class LíneasPintadas{
	public static void main(String args[]){
	
		String car = "";
		int i, j, numCar, cantCar;
		
		for(i=1; i<=10; i++){
			numCar = (int)(Math.random()*6)+1;
			cantCar = (int)(Math.random()*40)+1;
			
			switch(numCar){
				case 1:
					car = "*";
					break;
				case 2:
					car = "-";
					break;
				case 3:
					car = "=";
					break;
				case 4:
					car = ".";
					break;
				case 5:
					car = "|";
					break;
				case 6:
					car = "@";
					break;
			}
			
			for(j= 1; j<=cantCar; j++){
				System.out.print(car);
			}
			
			System.out.println("");
		}
	}
}
