/*Programa diseñado por Lucas Bermudo que tiene como objetivo mostrar una pirámide de asteriscos de colores hueca por dentro, cuya base tiene 9 asteriscos*/

public class PirámideHuecaConColores{
  public static void main(String args[]){
  
    String colorDefecto="\033[39;49m", rojo="\033[31m"; 
    
    System.out.print(rojo);
    System.out.println("    *    ");
    System.out.println("   * *   ");
    System.out.println("  *   *  ");
    System.out.println(" *     *  ");
    System.out.println("*********");
    System.out.print(colorDefecto);
  }
}
