/**
 * Mostrar por pantalla 10 palabras en inglés junto a su correspondiente traducción al castellano.
 * Las palabras deben estar distribuidas en dos columnas y alineadas a la izquierda.
 * 
 * @autor Lucas Bermudo Junco
 */

public class TraducciónBis{
  public static void main(String args[]){

    String pal1ing="computer", pal1esp="ordenador", pal2ing="student", pal2esp="alumno/a", pal3ing="cat", pal3esp="gato",
    pal4ing="penguin", pal4esp="pingüino", pal5ing="machine", pal5esp="máquina", pal6ing="nature", pal6esp="naturaleza",
    pal7ing="light", pal7esp="luz", pal8ing="green", pal8esp="verde", pal9ing="book", pal9esp="libro",
    pal10ing="pyramid", pal10esp="pirámide";
    
    System.out.printf("%-12s %-12s\n", pal1ing, pal1esp);
    System.out.printf("%-12s %-12s\n", pal2ing, pal2esp);
    System.out.printf("%-12s %-12s\n", pal3ing, pal3esp);
    System.out.printf("%-12s %-12s\n", pal4ing, pal4esp);
    System.out.printf("%-12s %-12s\n", pal5ing, pal5esp);
  }
}
