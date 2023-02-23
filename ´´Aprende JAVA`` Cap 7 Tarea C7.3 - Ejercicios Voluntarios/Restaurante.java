import java.util.Scanner;

/**
 * Realizar una aplicación con la siguiente información:
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas.
 * En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales (mesa llena).
 * Cuando llega un cliente se le pregunta cuántos son.
 * De momento el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo”.
 * Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas).
 * Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas,
 * se podrá colocar donde haya una o dos personas. Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4.
 * Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
 * Los grupos no se pueden romper aunque haya huecos sueltos suficientes.
 *
 * @author Lucas Bermudo Junco
 */

public class Restaurante{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tam = 10, cantComens, i, huecosLibres;

        int[] ocupacionMesa = new int[tam];
        boolean mesaVacia, mesaEncontrada;
        String masClientes;

        for(i=0; i<tam; i++){                   // Asignamos aleatoriamente el número de comensales iniciales de cada mesa.
            ocupacionMesa[i] = (int)(Math.random()*5);
        }

        // Mostramos la disposición actual de las mesas.

        System.out.println("La disposición actual de las mesas es la siguiente:\n");
        System.out.print(" Mesa nº    ");
        for(i=1; i<=tam; i++){
            System.out.print(i + "  ");
        }
        System.out.println("\n-----------------------------------------");
        System.out.print(" Ocupación: ");
        for(i=0; i<tam; i++){
            System.out.print(ocupacionMesa[i] + "  ");
        }
        System.out.println();

        do{                 // Realizamos la búsqueda de mesas mientras sigan llegando nuevos comensales.
            System.out.print("\nBuenos días/noches, ¿Cuántos sois para comer/cenar? ");
            cantComens = sc.nextInt();

            while(cantComens<1 || cantComens>4){                    // Impedimos introducir un número de comensales no permitido.
                if(cantComens<1){
                    System.out.println("""
                        \nLo siento, pero el número de comensales no puede ser menor a 1.
                        Por favor, vuelva a contestar a la pregunta.""");
                } else{
                    System.out.println("\nLo siento, no admitimos grupos de " + cantComens +
                                        ", haga grupos de 4 personas como máximo e intente de nuevo.");
                }

                System.out.print("\n¿Cuántos sois para comer/cenar? ");
                cantComens = sc.nextInt();

                if(cantComens>=1 && cantComens<=4){                 // En cuanto se introduzca al fin un número de comensales válido, el sistema nos lo hará saber.
                    System.out.println("\nEl número de comensales sí es correcto ahora, gracias.");
                }
            }

            // Establecemos todos los indicadores a sus posiciones iniciales cada vez que realicemos la búsqueda de mesas.
            i = 0;
            mesaVacia = false;
            mesaEncontrada = false;

            while(i<tam && !mesaVacia){                 // Buscamos si hay alguna mesa completamente vacía.
                if(ocupacionMesa[i]==0){                    // En caso de que encontremos una mesa completamente vacía, sentamos ahí a los comensales.
                    mesaVacia = true;
                    ocupacionMesa[i]+=cantComens;
                    System.out.println("\nPor favor, siéntense en la mesa número " + (i + 1) + ".");
                }

                i++;
            }

            if(!mesaVacia){                 // En caso de que ninguna mesa estuviera completamente vacía, procedemos a buscar la primera mesa en la que quepan los comensales.
                i = 0;

                while (i<tam && !mesaEncontrada) {
                    huecosLibres = 4 - ocupacionMesa[i];                  // Calculamos la cantidad de huecos libres de cada mesa.

                    if (cantComens <= huecosLibres) {
                        if (ocupacionMesa[i] > 0) {                 // En caso de tener que compartir mesa, avisamos a los comensales.
                            System.out.print("\nTendrán que compartir mesa.");
                        }

                        System.out.println("\nPor favor, siéntense en la mesa número " + (i + 1) + ".");

                        ocupacionMesa[i]+=cantComens;                   // Sumamos los nuevos comensales a la mesa en la que van a ser situados.
                        mesaEncontrada = true;                  // Cambiamos esta variable a ´´true`` para indicar al bucle que ya ha cumplido su objetivo.
                    } else if (i == (tam - 1)) {                  // En caso de que en la última vuelta del bucle no se hayan encontrado mesas,
                        // mostramos el mensaje indicando que no quedan mesas libres.
                        System.out.print("""
                                \nLo siento, pero no quedan mesas en la que quepa su grupo. Si quieren, pueden esperar un rato
                                e intentarlo de nuevo, lamento las molestias.
                                """);
                    }

                    i++;
                }
            }

            // Mostramos la disposición actual de las mesas cada vez que se sientan nuevos comensales en las mesas.

            System.out.println("\nLa disposición actual de las mesas es la siguiente:\n");
            System.out.print(" Mesa nº    ");
            for(i=1; i<=tam; i++){
                System.out.print(i + "  ");
            }
            System.out.println("\n-----------------------------------------");
            System.out.print(" Ocupación: ");
            for(i=0; i<tam; i++){
                System.out.print(ocupacionMesa[i] + "  ");
            }

            System.out.print("\n\n¿Hay más gente que quiere buscar mesa en el restaurante? ");
            masClientes = sc.next();
            masClientes = masClientes.toLowerCase();
            while(!masClientes.equals("sí") && !masClientes.equals("si") && !masClientes.equals("no")){
                System.out.println("\nRespuesta introducida incorrectamente. Vuelva a introducirla.");
                System.out.print("\n¿Hay más gente que quiere buscar mesa en el restaurante? ");
                masClientes = sc.next();
                masClientes = masClientes.toLowerCase();
            }

            if(masClientes.equals("sí") || masClientes.equals("si")){
                System.out.println("\nComo hay más gente buscando mesa, el programa continúa.");
            } else{
                System.out.println("\nComo no hay más gente buscando mesa, el programa finaliza ya.");
            }
        }while(masClientes.equals("sí") || masClientes.equals("si"));
    }
}
