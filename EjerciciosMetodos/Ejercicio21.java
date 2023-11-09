import java.util.Scanner;
public class Ejercicio21 {
    public static final int PUNTOS_MAX = 11;
    public static int tiradaPlayer = 0;
    public static int puntosPlayer = 0;
    public static int porrasPlayer = 0;
    public static int tiradaCPU = 0;
    public static int puntosCPU = 0;
    public static int porrasCPU = 0;
    public static int opcion;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        do{
            opcion = mostrarMenu();
            if(opcion == 1){
                jugarJuego(lector);
                if (porrasCPU >= 5) {
                    System.out.println("\nCPU gana la partida!!! por " + porrasCPU + " porras a "+ porrasPlayer +"\n");
                } else if (porrasPlayer >= 5) {
                    System.out.println("\nPlayer gana la partida!!! por " + porrasPlayer + " porras a " + porrasCPU +"\n");
                }
            }
        }while (opcion != 0);
        System.out.println("Hasta pronto!!");
    }

    //Mostrar Menu y pedimos Entero 1 o 0.
    public static int mostrarMenu(){
        int opcion;
        System.out.println("***************************");
        System.out.println("*** JUEGO DE DADOS ONCE ***");
        System.out.println("***************************");
        System.out.println("1. Nueva partida ...");
        System.out.println("0. Salir");
        opcion = LibDos.solicitarEntero("Elige una opcion", 0, 1);
        return opcion;
    }

    //Lanzarl el dado.
    public static int lanzarDado(){
        int dado = LibDos.random(0, 6); 
        return dado;
    }
    //Empieza el juego, hay varias funciones en esta función.
    public static void jugarJuego(Scanner lector){
        porrasPlayer = 0;
        porrasCPU = 0;
        do{
            puntosPlayer = 0;
            puntosCPU = 0;

            puntosPlayer = turnoPlayer(puntosPlayer);

            if(puntosPlayer < PUNTOS_MAX){
                puntosCPU = turnoCPU(puntosCPU);

                ganador(puntosPlayer, puntosCPU, porrasPlayer, porrasCPU);
                mostrarGanador(porrasPlayer, porrasCPU);

                System.out.println("Presiona Enter para continuar...");
                lector.nextLine();
            }
        }while (porrasPlayer < 5 && porrasCPU < 5);
    }

    //Funcion para ejecutar el turno del jugador, se incializa en jugarJuego().
    public static int turnoPlayer(int puntosPlayer){
        char plantarse;
        boolean plantado = false;

        do{
            System.out.println("Jugador lanza el dado al aire ...");
            tiradaPlayer = lanzarDado();
            System.out.println("\n*****");
            System.out.println("* " + tiradaPlayer + " *");
            System.out.println("*****");

            puntosPlayer += tiradaPlayer;

            System.out.println("\nTu puntuación actual es " + puntosPlayer);

            if (puntosPlayer < PUNTOS_MAX){
                plantarse = LibDos.solicitarCaracter("¿Deseas plantarte con " + puntosPlayer +" puntos? (s/n): ", 's', 'n');
                plantado = plantarse == 's' || plantarse == 'S';

                if(plantado){
                    return puntosPlayer;
                }
            } else if (puntosPlayer == PUNTOS_MAX) {
                System.out.println("\n$$$$$$$$$$$$$$$$");
                System.out.println("$$$$ ¡ONCE! $$$$");
                System.out.println("$$$$$$$$$$$$$$$$");
                System.out.println("\n¡Bonificación! Doble porra");

                System.out.println("\n**********************");
                System.out.println("* " + porrasPlayer + " PLAYER  -  CPU " +porrasCPU + " *");
                System.out.println("**********************");
                System.out.print("\nPulsa intro para continuar...");

                porrasPlayer += 2;
                return puntosPlayer;
            }else {
                System.out.println("Ohh!! Te has pasado");
                System.out.println("Porra para la CPU");
                porrasCPU += 1;
                return puntosPlayer;

            }
        }while (true);
    }
    //Funcion para el turno de la cpu, se inicializa en jugarJuego().
    public static int turnoCPU(int puntosCPU){
        while (puntosCPU < PUNTOS_MAX){
            System.out.println("CPU lanza el dado al aire ...");
            tiradaCPU = lanzarDado();
            System.out.println("\n?????");
            System.out.println("? " + tiradaCPU + " ?");
            System.out.println("?????\n");
            puntosCPU += tiradaCPU;
            System.out.println("La puntuación actual de la CPU es " + puntosCPU);
        }
        return puntosCPU;
    }
    
    public static void ganador(int puntosPlayer, int puntosCPU, int porrasPlayer, int porrasCPU){
        if(puntosPlayer < PUNTOS_MAX && puntosCPU > PUNTOS_MAX){
            System.out.println("CPU se ha pasado. Porra para Player!!");
            porrasPlayer++;
        } else if (puntosCPU > puntosPlayer){
            if (puntosCPU == 11) {
                System.out.println("\n$$$$$$$$$$$$$$$$");
                System.out.println("$$$$ ¡ONCE! $$$$");
                System.out.println("$$$$$$$$$$$$$$$$");
                System.out.println("\nDoble porra para CPU\n");
                porrasCPU += 2;
            } else {
                System.out.println("CPU ha mejorado tu puntuación. Porra para CPU!!");
                porrasCPU++;
            }
            puntosCPU = 0;
            puntosPlayer = 0;
        } else { // Empate
            System.out.println("Empate!! Porra para los dos");
            porrasCPU++;
            porrasPlayer++;
        }
    }

    public static void mostrarGanador(int porrasPlayer, int porrasCPU){
        System.out.println("\n**********************");
        System.out.println("*** " + porrasPlayer + " PLAYER  -  CPU " + porrasCPU + " ***");
        System.out.println("**********************");
    }
}
