public class Ejercicio20 {
    //Constantes para el limite del String de la fecha de nacimiento.
    public static final int MIN_VALUE = 7;
    public static final int MAX_VALUE = 10;
    public static void main(String[] args) {
        //Variables.
        int fechaN, sumaFecha, sumaDigitoFecha;
        String fechaNacimiento;
        
        //Se pide la fecha mediante una función desde LibDos.java
        fechaNacimiento = LibDos.solicitarString("Ingresa tu fecha de nacimiento, formato dd-mm-aaaa", MIN_VALUE, MAX_VALUE);
        //sumaFecha = sumarDigitos(fechaNacimiento);
        //Se llama la función para convertir el String que contiene la fecha introducida en el formato dado a un Entero.
        fechaN = convertirStringEntero(fechaNacimiento);

        //Se llama la función sumarDigitos para hacer la suma de la fecha de nacimiento.
        sumaFecha = sumarDigitos(fechaN);

        System.out.println(sumaFecha);
        
        //Se llama la función sumarDigitos para sumar los dígitos de la suma de sumaFecha.
        sumaDigitoFecha = sumarDigitos(sumaFecha);

        //Finalmente imprimimos el LUCKY NUMBER en la consola.
        System.out.println(sumaDigitoFecha);
    }
        //Función para convertir un String a un Entero (Fecha Nacimiento con formato (dd-mm-aaaa);
        public static int convertirStringEntero(String fN){
            //Se quitan los guiones, barras o espacios de la cadena.
            fN = fN.replaceAll("-", "");
            fN = fN.replaceAll("/", "");
            fN = fN.replaceAll(" ", "");
            //Convertimos el String a un int para trabajar con el.
            int fechaN = Integer.parseInt(fN);
            return fechaN;
        } 

         //Función para suma digitos de un entero con un bucle while. Ejemplo: 1805 = 1+8+0+5.
        public static int sumarDigitos (int num){
            int result = 0;
            while (num > 0){
                result += num % 10;
                num = num / 10;
            }
            return result;
        }
    /* 
        public static int sumarDigitos(String num){
            int result = 0;
            for (int i = 0; i < num.length(); i++){
                char digito = num.charAt(i);
                if (Character.isDigit(digito)) {
                    int digitoEntero = Character.getNumericValue(digito);
                    result += digitoEntero;
                }
            }
            return result;  
        }
        */
    


}
