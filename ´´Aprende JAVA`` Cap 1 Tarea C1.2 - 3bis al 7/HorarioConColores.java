/**
 * Mostrar el horario de clase con colores.
 * 
 * @autor Lucas Bermudo Junco
 */

public class HorarioConColores{
  public static void main(String args[]){
  
    String colorDefecto="\033[39;49m", amarillo="\033[33m", azul="\033[34m", negroClaro="\033[90m", rojo="\033[31m", verde="\033[32m", magenta="\033[35m";
    
    System.out.println("┌───────────┬──────────────┬──────────────┬─────────────┬──────────────┬──────────────┐");
    System.out.println("│           │    LUNES     │    MARTES    │  MIÉRCOLES  │    JUEVES    │    VIERNES   │");
    System.out.println("├───────────┼──────────────┼──────────────┼─────────────┼──────────────┼──────────────┤");
    System.out.println("│15:15-16:15│ " + amarillo + " Sist. Inf. " + colorDefecto + " │              │ " + amarillo + " Sist. Inf. " + colorDefecto + "│              │              │");
    System.out.println("├───────────┼──────────────┤" + azul + " Programación " + colorDefecto + "├─────────────┤" + azul + " Programación " + colorDefecto + "│" + azul + " Programación " + colorDefecto + "│");
    System.out.println("│16:15-17:15│              │              │             │              │              │");
    System.out.println("├───────────┤" + azul + " Programación " + colorDefecto + "├──────────────┤    " + negroClaro + " FOL " + colorDefecto + "    ├──────────────┼──────────────┤");
    System.out.println("│17:15-18:15│              │" + verde + " Leng. Marca " + colorDefecto + " │             │   " + rojo + " BB.DD. " + colorDefecto + "   │   " + rojo + " BB.DD. " + colorDefecto + "   │");
    System.out.println("├───────────┼──────────────┴──────────────┴─────────────┴──────────────┴──────────────┤");
    System.out.println("│18:15-18:30│			        	RECREO				      │");
    System.out.println("├───────────┼──────────────┬──────────────┬─────────────┬──────────────┬──────────────┤");
    System.out.println("│18:30-19:30│    " + negroClaro + " FOL " + colorDefecto + "     │" + verde + " Leng. Marca " + colorDefecto + " │             │   " + rojo + " BB.DD. " + colorDefecto + "   │   " + rojo + " BB.DD. " + colorDefecto + "   │");
    System.out.println("├───────────┼──────────────┼──────────────┤ " + magenta + " Entornos " + colorDefecto + "  ├──────────────┼──────────────┤");
    System.out.println("│19:30-20:30│              │              │   " + magenta + " de " + colorDefecto + "      │              │              │");
    System.out.println("├───────────┤    " + rojo + "BB.DD. " + colorDefecto + "   │ " + amarillo + " Sist. Inf. " + colorDefecto + " │ " + magenta + " Desarrollo " + colorDefecto + "│ " + amarillo + " Sist. Inf. " + colorDefecto + " │" + verde + " Leng. Marca " + colorDefecto + " │");
    System.out.println("│20:30-21:30│              │              │             │              │              │");
    System.out.println("└───────────┴──────────────┴──────────────┴─────────────┴──────────────┴──────────────┘");
  }
}
