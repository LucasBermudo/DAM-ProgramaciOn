import java.util.Scanner;

/**
 * Realizar un programa que resuelva una ecuación de segundo grado.
 * 
 * @autor Lucas Bermudo Junco
 */

public class EcuaciónSegundoGrado{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("¿Cuánto vale ´´a``?: ");
		a = sc.nextDouble();
		
		System.out.print("¿Cuánto vale ´´b``?: ");
		b = sc.nextDouble();
		
		System.out.print("¿Cuánto vale ´´c``?: ");
		c = sc.nextDouble();
		
		if(a==0){
			System.out.println("El resultado no existe, ya que el denominador es 0.");
			
		} else{
			double radicando = Math.pow(b,2)-(4*a*c);
			
			if(radicando<0){
				System.out.println("El valor de ´´x`` no pertenece a los números Reales.");
			
			} else {
				double x1 = (-b+Math.sqrt(radicando))/2*a;
				double x2 = (-b-Math.sqrt(radicando))/2*a;
				
				if(x1==x2){
					System.out.println("El valor de ´´x`` es = " + x1);
				} else {
					System.out.println("Los valores de ´´x`` son = " + x1 + " & " + x2);
				}
			}
		}
	}
}
