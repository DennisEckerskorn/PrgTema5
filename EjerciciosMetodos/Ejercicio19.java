public class Ejercicio19 {
    public static final int MIN_DNI = 0;
    public static final int MAX_DNI = 99999999;
    public static void main(String[] args) {
        int dni;
        char letra;
        String nif;

        //Pide el número, lo valida y devuelve un Entero.
        dni = LibDos.solicitarDNI("Introduzca su DNI:", MIN_DNI, MAX_DNI);

        //Genera el caracter correspondiente al NIF y devuelve una letra.
        letra = LibDos.calcularLetraNif(dni);
        nif = String.valueOf(dni) + String.valueOf(letra);
        
        System.out.println(nif);

        if (validarNIF(nif)){
            System.out.println("El NIF es correcto");
        } else {
            System.out.println("El NIF no es correcto");
        }
    }
    
    public static boolean validarNIF(String nif){
        char letra = nif.charAt(nif.length() - 1);
        int dni = Integer.parseInt(nif.substring(0,nif.length() - 1));
        return letra == LibDos.calcularLetraNif(dni);
    }
}    

