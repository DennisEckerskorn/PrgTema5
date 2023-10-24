import java.util.Scanner;

public class Ejercicio2{
	public static void main(String[] args){
		//Se declaran las variables necesarias.
		Scanner lector = new Scanner(System.in);
		double radioUsuario;

		//Pedimos el valor de la circunferencia por entrada estandar.
		System.out.println("Dime el radio de la circunferencia en centímetros:");
		radioUsuario = Double.parseDouble(lector.nextLine());

		//Se imprimen los resultados.
		System.out.printf("El área de la circunferencia en centímetros cuadrados son: %.2fcm\n", calculoArea(radioUsuario));
		System.out.printf("La longitud de la circunferencia en centímetros son: %.2fcm", calculoLongitud(radioUsuario));

		//Exit Scanner
		lector.close();		
	}
	//Función para calcular el area de una circunferencia en centímetros cuadrados.
	public static double calculoArea(double radio){
		double calculoArea = Math.PI*(radio*radio);
		return calculoArea;
	}

	//Función para calcular la longitud de una circunferencia.
	public static double calculoLongitud(double radio){
		double calculoLongitud = 2*Math.PI*radio;
		return calculoLongitud;
	}
}