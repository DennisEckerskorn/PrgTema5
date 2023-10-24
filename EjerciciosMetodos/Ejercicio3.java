import java.util.Scanner;

public class Ejercicio3{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		double num1, num2;

		//Pedimos datos.
		System.out.println("Ingresa un número:");
		num1 = Double.parseDouble(lector.nextLine());
		System.out.println("Ingresa un número:");
		num2 = Double.parseDouble(lector.nextLine());

		//Resultado mayor entre dos.
		System.out.printf("El número %.2f es mayor.", mayor(num1, num2));

		//Exit Scanner.
		lector.close();
	}
	//Función para comprobar cual de los numeros es mayor.
	public static double mayor(double numero1, double numero2){
		double numeroMayor = numero1;
		if(numero1 >= numero2){
			return numero1;
		}else {
			return numero2;
		}
	}
}