import java.util.Scanner;

public class Ejercicio4{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		double num1, num2, num3, num4, resultado;

		//Se piden los numeros.
		System.out.println("Ingresa el primer número:");
		num1 = Double.parseDouble(lector.nextLine());
		System.out.println("Ingresa el segundo número:");
		num2 = Double.parseDouble(lector.nextLine());
		System.out.println("Ingresa el tercer número:");
		num3 = Double.parseDouble(lector.nextLine());
		System.out.println("Ingresa el cuarto número:");
		num4 = Double.parseDouble(lector.nextLine());

		//Se imprime el resultado de la función, con formato de 2 decimales.
		System.out.printf("El número %.2f es mayor que los otros", mayorCuatro(num1, num2, num3, num4));
		
		//Exit Scanner.
		lector.close();
	}
	//Función para comprobar cual de los numeros es mayor.
	public static double mayorDos(double numero1, double numero2){
		if(numero1 >= numero2){
			return numero1;
		}else {
			return numero2;
		}
	}
	//Función para comprobar cual de los cuatro números es mayor.
	public static double mayorCuatro(double numero1, double numero2, double numero3, double numero4){
		double mayor1 = mayorDos(numero1, numero2);
		double mayor2 = mayorDos(numero3, numero4);
		return mayorDos(mayor1, mayor2);
	}
}