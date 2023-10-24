public class Ejercicio1{
	public static void main(String[] args){
		//Variables.
		double num1 = 5;
		double num2 = 5;

		//Se imrpime el resultado.
		System.out.printf("La suma es: %.2f", suma(num1, num2));
	}
	//Función para sumar 2 numeros.
	public static double suma(double num1, double num2){
		double suma = num1 + num2;
		return suma;
	}
}