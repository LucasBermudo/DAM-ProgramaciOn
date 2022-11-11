/**
 * Mostrar por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @autor Lucas Bermudo Junco
 */

public class OperacionesConVariables{
  public static void main(String args[]){
    
    double x=144;
    double y=999;
    double sumaxy = x+y;
    double restaxy = x-y;
    double multiplicaciónxy = x*y;
    double divisiónxy = x/y;
    
    System.out.println("El valor de ´´x`` es : " + x);
    System.out.println("El valor de ´´y`` es : " + y);
    System.out.printf("La suma de los valores ´´x`` e ´´y`` es = %.3f", sumaxy);
    System.out.println("");
    System.out.printf("La resta de los valores ´´x`` e ´´y`` es = %.3f", restaxy);
    System.out.println("");
    System.out.printf("La multiplicación de los valores ´´x`` e ´´y`` es = %.3f", multiplicaciónxy);
    System.out.println("");
    System.out.printf("La división de los valores ´´x`` e ´´y`` es = %.3f", divisiónxy);
  }
}
