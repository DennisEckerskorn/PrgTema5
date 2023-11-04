import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        //Variables
        Scanner lector = new Scanner(System.in);
        int ancho;
        int alto;
        char caracter;
        //Se llaman los metodos para pedir datos y validar las entradas.
        alto = LibDos.solicitarEntero("Ingresa el alto:", 0, 30);
        ancho = LibDos.solicitarEntero("Ingresa el ancho:", 0, 30);
        caracter = LibDos.solicitarCaracter("Ingresa un caracter o simbolo:");//Falta validar esta función.
        //Imprimimos el resultado de la función.
        System.out.println(rectangulo(alto, ancho, caracter));
        //Exit Scanner.
        lector.close();
    }
    //Función para devolver un rectángulo personalizado por simbolos.
    public static String rectangulo(int numFilas, int numSimbolos, char ch){
        String resultado = "";
        //Recorremos el numero de filas.
        for (int i = 0; i < numFilas; i++){
            //Recorremos la cantidad de simbolos que se imprimiran por cada fila.
           for (int j = 0; j < numSimbolos; j++){
                resultado += ch;
            }
            resultado += "\n";
        }    
        return resultado;
    }
}
