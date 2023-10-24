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
		imprimirCaracter(caracter, numeroVeces);
		
		//Exit
		lector.close();
		
				
	}
	//Método para imprimir un caracter una cierta cantidad de veces. No es una funcion ya que no devuelve un valor sino lo imprime.
	public static void imprimirCaracter(char c, int veces){
		for (int i = 0; i < veces; i++){
			System.out.print(c);	
		}
		System.out.println("");
	}
}