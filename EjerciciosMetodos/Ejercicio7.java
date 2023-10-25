import java.util.Scanner;

public class Ejercicio7{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numeroUsuario;

		//Se piden datos.
		System.out.println("Indica un número para calcular el factorial:");
		numeroUsuario = Integer.parseInt(lector.nextLine());

		//Imprimir el resultado.
		System.out.println("El factorial es !" + factorial(numeroUsuario));
		
		//Exit Scanner.
		lector.close();
		
	}
	//Metodo que calcula el factorial.
	public static double factorial(int number){
		double factorial = 1;
		for (int i = 1; i <= number; i++){
			factorial = factorial * i;
		}
		return factorial;
	}
}