import java.util.Scanner;

public class Ejercicio6{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		char caracter = ' ';
		int numeroVeces;
		int numeroLineas;
		
		//Se piden datos.
		System.out.println("Ingresa un carácter a imprimir:");
		caracter = lector.next().charAt(0);
		lector.nextLine();
		
		System.out.println("Indica cuántas veces quieres imprimir el carácter:");
		numeroVeces = Integer.parseInt(lector.nextLine());

		System.out.println("Indica cuántas líneas quieres imprimir");
		numeroLineas = Integer.parseInt(lector.nextLine());		
		
		//Se llama al método.
		System.out.print(print(caracter, numeroVeces, numeroLineas));
		
		//Exit
		lector.close();
		
				
	}
	//Método para devolver devolver un caracter que se imprime x veces en x lineas.
	public static String print(char c, int columns, int rows){
		String result = "";
		for (int i = 1; i <= rows; i++){
			result += print(c, columns);
			result += "\n";
		}
		return result;
	}
	//Metodo para devolver un caracter x veces.
	public static String print(char c, int times){
		String result = "";
		for (int i = 1; i <= times; i++){
			result += c;
		}
		return result;
	}
}