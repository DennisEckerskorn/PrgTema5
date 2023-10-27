import java.util.Scanner;

public class Ejercicio10{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numero;
		boolean validado;
		final int VECES = 10;
		//Se repite hasta que el numero sea menor que 0.
		do{	
			//Se pide el número al usuario.
			System.out.println("Ingresa un número para imprimir la tabla de multiplicar de este:");
			numero = Integer.parseInt(lector.nextLine());

			//Se muestra el resultado llamando al metodo tablaMultiplicar, pasandole dos parametros..
			System.out.println(tablaMultiplicar(numero, VECES));

			//Condición para cambiar el valor de validado.
			validado = numero <= 0;
		}while(!validado);
		
		//Exit Scanner.
		lector.close();
			
	}
	//MÉTODO:
	//Funcion para la tabla de multiplicar de un numero.
	public static String tablaMultiplicar(int numTabla, int numVeces){
		String resultado = "";
		for (int i = 1; i <= numVeces; i++){
			resultado += numTabla + " * " + i + " = " + (i*numTabla) + "\n"; 
		}
		return resultado;
		
	}
}