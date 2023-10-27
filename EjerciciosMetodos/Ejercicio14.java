import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
    //Variable.
    Scanner lector = new Scanner(System.in);
    int numN;
    int numM;
    //User input for numN and numM.
    System.out.println("Dime el numero N:");
    numN = Integer.parseInt(lector.nextLine());

    System.out.println("Dime el numero M:");
    numM = Integer.parseInt(lector.nextLine());
    //We call the method to show the result of N,M and the combinatori number.
    System.out.println(factorial(numN, numM));
    //Exit Scanner.
    lector.close();
    }

    //Method to calculate the combinatori number. ***NEEDS CHECKING IF IT CALCULATES CORRECTLY***
    public static String factorial(int numberN, int numberM){
		long factorialN = 1;
        long factorialM = 1;
        long combinatorialNumber;
        String result = "";
        //Factorial N        
		for (int i = 1; i <= numberN; i++){
			factorialN *= i;
		}
        //Factorial M
        for (int j = 1; j <= numberM; j++){
            factorialM *= j;
        }
        //Operation to calculate the combinatori number of N and M.
        combinatorialNumber = factorialN / factorialM * (factorialN - factorialM);

        result += "N es: " + factorialN + " M es: " + factorialM + " y el número combinatorio es: " + combinatorialNumber;

		return result;
	}
}
