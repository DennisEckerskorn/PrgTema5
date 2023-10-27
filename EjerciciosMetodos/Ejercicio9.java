import java.util.Scanner;

public class Ejercicio9{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numero;

		//Se pide el numero.
		System.out.println("Ingresa un número para calcular el sumatorio de este:");
		numero = Integer.parseInt(lector.nextLine());

		//Se imprime el resultado mediante la función.
		System.out.printf("%d", sumatorio(numero));
		
		//Exit Scanner.
		lector.close();
		
	}
	//Función para calcular el sumatorio de numero con un bucle while. Ejemplo: 5 = 5+4+3+2+1 = 15.
	public static int sumatorio1(int num){
		int suma = 0;
		int contador = num;
		while (contador != 0){
			suma += contador;
			contador--;
		}
		return suma;		
	}
	//Función para calcular el sumatorio de un numero con un bucle for.
	public static int sumatorio(int num){
		int suma = 0;
		int contador = num;
		for (int i = 0; i < num; i++){
			suma += contador;
			contador--;
		}
		return suma;
	}
}