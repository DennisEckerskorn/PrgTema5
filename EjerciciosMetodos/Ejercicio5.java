import java.util.Scanner;

public class Ejercicio5{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		char caracter = ' ';
		int numeroVeces;
		
		//Se piden datos.
		System.out.println("Ingresa un carácter a imprimir:");
		caracter = lector.next().charAt(0);
		lector.nextLine();
		
		System.out.println("Indica cuántas veces quieres imprimir el carácter:");
		numeroVeces = Integer.parseInt(lector.nextLine());		
		
		//Se llama al método.
		System.out.println(printChar(caracter, numeroVeces));
		
		//Exit
		lector.close();
		
				
	}
	//Método para devolver un caracter una cantidad de veces.
	public static String printChar(char c, int times){
		String result = "";
		for (int i = 0; i < times; i++){
			result += c;
		}
		return result;
	}
}