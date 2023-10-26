import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        //Inicialización de variables
        Scanner lector = new Scanner(System.in);
        int numberUser = 0;
        boolean validado = false;

        
        //Loop to proof if number is more then 10 and if not to keep asking a number till it is correct.
        do{
            System.out.println("Ingresa un número de 4 dígitos para comprobar si es capicua o no");
            numberUser = Integer.parseInt(lector.nextLine());
            if (numberUser > 10){
            validado = true;
        }
        }while(!validado);

        

        //If function is true is capicua.
        if(capicua(numberUser) == true){
            System.out.println("El número " + numberUser + " es capicua");
        } else {
            System.out.println("El numero " + numberUser + " no es capicua");
        }
        
        //Exit Scanner.
        lector.close();

    }
    //Function to convert number to a String and compare each caracter.
    //If you can read the number the same from the right to the left or from the left to the right. Capicua
    public static boolean capicua(int number){
        String numberStr = String.valueOf(number); //Assign number to the String
        int numberLength = numberStr.length();
        for (int i = 1; i <= numberLength / 2; i++){
            if (numberStr.charAt(i) != numberStr.charAt(numberLength - 1 - i)){
                return false;
            }
        }
        return true;
    }
}