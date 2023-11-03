import java.util.Scanner;
public class EjercicioString {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char c1;
        char c2;
        String palabra;
        System.out.println("Dime una palabra:");
        palabra = lector.nextLine();
        System.out.println("Ingresa un caracter origen");
        c1 = lector.nextLine().charAt(0);
        System.out.println("Ingresa un caracter destino");
        c2 = lector.nextLine().charAt(0);

        System.out.println(sustituir(palabra, c1, c2));
    }
    public static String sustituir(String s, char origen, char destino){
        String resultado = "";
        for (int i = 0; i<s.length(); i++){
           resultado += s.charAt(i) == origen ? destino : s.charAt(i);
           
           /* if(s.charAt(i) == origen){
                resultado += destino;
            } else {
                resultado += s.charAt(i);
            }*/
            
        }
        return resultado;
    }
}
