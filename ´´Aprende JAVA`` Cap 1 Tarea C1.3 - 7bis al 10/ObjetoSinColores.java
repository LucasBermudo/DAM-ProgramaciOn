/**
 * Pintar por pantalla algún objeto.
 * 
 * @autor Lucas Bermudo Junco
 */

public class ObjetoSinColores{
  public static void main(String args[]){
    
    char square = (char)9632, barraInvertida = (char)92;

    System.out.println("                 "+square+square+square+square+square+square+square+square+square+square+square+square+square+square+square);
    System.out.println("                //    @ │    @ ││");
    System.out.println("               //─)  ─│ │    │ ││");
    System.out.println("         "+square+square+square+square+square+square+square+"───────────────"+square+square+square+square+square+square+square+square+square);
    System.out.println("        /    ──── │   ¬ │   ¬ │  ────   │");
    System.out.println("       │    / ── "+barraInvertida + "│     │     │ / ── "+barraInvertida+"  │");
    System.out.println("        "+square+square+square+square + " /  "+barraInvertida+" "+square+square+square+square+square+square+square+square+square+square+square+square+square+square+" /  "+barraInvertida+" "+square+square);
    System.out.println("             "+barraInvertida+"  /                "+barraInvertida+"  /");
    System.out.println("              ──                  ──");
    System.out.println("────────────────────────────────────────────────────");
  }
}
