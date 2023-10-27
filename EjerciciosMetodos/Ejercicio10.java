import java.util.Scanner;

public class Ejercicio10{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numero;
		boolean validado;
		//Se repite hasta que el numero sea menor que 0.
		do{	
			//Se pide el número.
			System.out.println("Ingresa un número para imprimir la tabla de multiplicar de este:");
			numero = Integer.parseInt(lector.nextLine());

			//Se muestra el resultado.
			System.out.println(tablaMultiplicar(numero));

			//Condición para cambiar el valor de validado.
			validado = numero <= 0;
		}while(!validado);
		
		//Exit Scanner.
		lector.close();
			
	}
	//Funcion para la tabla de multiplicar. ¿¿¿FALTA IMPRIMIR TODOS LOS RESULTADOS DE CADA ITERACION, DE MOMENTO SOLO DEVUELVE EL RESULTADO FINAL.???
	public static int tablaMultiplicar(int num){
		int resultado = 0;
		String impresion = "";
		for (int i = 1; i <= 10; i++){
			resultado = num * i;
			impresion = num + " * " + i + " = " + resultado; 
		}
		return impresion;
		
	}
}