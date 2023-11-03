import java.util.Random;
import java.util.Scanner;

public class LibDos {
	private static Random rnd = new Random();
	private static Scanner lector = new Scanner(System.in);

	public static int random(int min, int max){
		return rnd.nextInt(max - min + 1) + min;
	}

	public static double random(double min, double max){
		return rnd.nextDouble() * (max - min) + min;
	}

	public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
		boolean valido;
		String resultado;
		do {
			System.out.println(mensaje);
			resultado = lector.nextLine();
			valido = resultado.length() >= longitudMinima && resultado.length() <= longitudMaxima;
			if(!valido){
				System.out.printf("Error => Longitud mínima: %d, Longitud máxima: %d\n", longitudMinima, longitudMaxima);
			}
		}while(!valido);
		return resultado;
	}

	public static int solicitarEntero(String mensaje, int valorMin, int valorMax){
		boolean valido;
		int resultado;
		do{
			System.out.println(mensaje);
			resultado = Integer.parseInt(lector.nextLine());
			valido = (resultado >= valorMin && resultado <= valorMax);
			if (!valido){
				System.out.printf("Error => Valor mínimo: %d, Valor máximo: %d\n", valorMin, valorMax);
			}
		}while (!valido);
		return resultado;
	}
}