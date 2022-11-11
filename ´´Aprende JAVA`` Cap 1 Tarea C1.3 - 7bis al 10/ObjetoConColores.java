/*Programa diseñado por Lucas Bermudo que tiene como objetivo pintar por pantalla, con diversos colores, algún objeto.*/

public class ObjetoConColores{
  public static void main(String args[]){
    
    String colorDefecto="\033[39;49m", amarillo="\033[33m", negroClaro="\033[90m", azul="\033[34m", rojo="\033[31m", verde="\033[32m";
    char square = (char)9632, barraInvertida = (char)92, elipse = (char)11055;

    System.out.println(rojo+"                 "+square+square+square+square+square+square+square+square+square+square+square+square+square+square+square+colorDefecto);
    System.out.println(azul+"                //"+amarillo+"    @"+rojo+" │ "+amarillo+"   @ "+azul+"││");
    System.out.println(azul+"               //"+verde+"─)"+amarillo+"  ─│"+rojo+" │ "+amarillo+"   │ "+azul+"││");
    System.out.println(rojo+"         "+square+square+square+square+square+square+square+"───────────────"+square+square+square+square+square+square+square+square+square);
    System.out.println("        /    ──── "+rojo+"│ "+verde+"  ¬ "+rojo+"│  "+verde+" ¬ "+rojo+"│  ────   │");
    System.out.println("       │    / "+negroClaro+"── "+rojo+barraInvertida+"│     │     │ / "+negroClaro+"── "+rojo+barraInvertida+"  │");
    System.out.println("        "+square+square+square+square+negroClaro+" /  "+barraInvertida+rojo+" "+square+square+square+square+square+square+square+square+square+square+square+square+square+square+negroClaro+" /  "+barraInvertida+" "+rojo+square+square);
    System.out.println(negroClaro+"             "+barraInvertida+"  /                "+barraInvertida+"  /");
    System.out.println("              ──                  ──");
    System.out.println(negroClaro+"────────────────────────────────────────────────────"+colorDefecto);
  }
}
