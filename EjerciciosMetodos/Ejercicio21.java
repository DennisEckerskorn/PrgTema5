public class Ejercicio21 {
    public static boolean plantado = false;
    public static int tiradaPlayer;
    public static int puntosPlayer = 0;
    public static int porrasPlayer = 0;
    public static int tiradaCPU;
    public static int puntosCPU = 0;
    public static int porrasCPU = 0;
    public static int opcion;
    public static char plantarse;
    public static void main(String[] args) {
        do{
            opcion = mostrarMenu();
                do{
                    System.out.println("Jugador lanza el dado al aire ...");
                    tiradaPlayer = lanzarDado();
                    System.out.println("\n*****");
                    System.out.println("* " + tiradaPlayer + " *");
                    System.out.println("*****");
                    puntosPlayer += tiradaPlayer;
                    System.out.println("\nTu puntuación actual es " + puntosPlayer);
                    if (puntosPlayer < 11){
                        plantarse = LibDos.solicitarCaracter("¿Deseas plantarte con " + puntosPlayer + " puntos? (s/n): ");

                    }
                }while (porrasPlayer < 5 && porrasCPU < 5);
            

        }while (opcion != 0);

    }

    //Mostrar Menu y pedimos Entero.
    public static int mostrarMenu(){
        int opcion;
        System.out.println("***************************");
        System.out.println("*** JUEGO DE DADOS ONCE ***");
        System.out.println("***************************");
        System.out.println("1. Nueva partida ...");
        System.out.println("0. Salir");
        opcion = LibDos.solicitarEntero("Elige una opcion", 0, 1);
        if (opcion == 1){
            porrasCPU = 0;
            porrasPlayer = 0;
            puntosCPU = 0;
            puntosPlayer = 0;
        }
        return opcion;
    }

    //Lanzarl el dado.
    public static int lanzarDado(){
        int dado = LibDos.random(0, 6); 
        return dado;
    }








   
}
