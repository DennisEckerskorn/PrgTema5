import java.util.Scanner;

public class Ejercicio7{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		
		int numeroUsuario;

		//Se piden datos.
		System.out.println("Indica un número para calcular el factorial:");
		numeroUsuario = Integer.parseInt(lector.nextLine());

		long fact = factorial(numeroUsuario);

		//Imprimir el resultado.
		System.out.println("El factorial es !" + fact);
		
		//Exit Scanner.
		lector.close();
		
	}
	//Metodo que calcula el factorial.
	public static long factorial(int number){
		long resultado = 1;
		for (int i = 1; i <= number; i++){
			resultado *= i;
		}
		return resultado;
	}
}