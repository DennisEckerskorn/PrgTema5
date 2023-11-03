import java.util.Scanner;

public class CorrecionEj15{
	public static Scanner lector = new Scanner(System.in); //Disponible para todo.
	public static void main(String[] args){
		do{
			int opcion = mostrarMenu();
			switch (opcion){
				case 1:
					String s1 = Lib.solicitarString("Introduce la primera palabra", 2, 20);
					String s2 = Lib.solicitarString("Introduce la segunda palabra", 2, 20);
					String s3 = Lib.solicitarString("Introduce la tercera palabra", 2, 20);
					System.out.printf("La palabra más larga es %s\n", palabraMasLarga(s1, s2, s3));
					break;
				case 2:
					String s1 = Lib.solicitarString("Introduce la primera palabra", 2, 20);
					String s2 = Lib.solicitarString("Introduce la segunda palabra", 2, 20);
					String s3 = Lib.solicitarString("Introduce la tercera palabra", 2, 20);
					System.out.printf("La palabra más corta es %s\n", palabraMasCorta(s1, s2, s3));
					break;
					break;
				case 3:
					String s1 = Lib.solicitarString("Introduce una palabra", 2, 20);
					int numVocales = cuentaVocales(s1);
					System.out.printf("La palabra %s tiene %d vocales\n", s1, numVocales);//Falta acabar
					break;
		
			}
		}while(opcion != 0);
	}
	public static int mostrarMenu(){
		int opcion;
		boolean valido;
		do{
			System.out.println("1. Palabra más larga");
			System.out.println("2. Palabra más corta");
			System.out.println("3. Número de vocales");
			System.out.println("--------------------");
			System.out.println("0. Salir");
			opcion = Lib.solicitarEntero("Introduce una opción", 0, 3);
		}while(!valido);
		return opcion;
	}

	public static String palabraMasLarga(String s1, String s2, String s3){
		String masLarga = palabraMasLarga(s1, s2);
		return palabraMasLarga(masLarga, s3);
	}
	
	public static String palabraMasLarga(String s1, String s2){
		return s1.length() > s2.length() ? s1 : s2;
	}

	public static String palabraMasCorta(String s1, String s2, String s3){
		String masCorta = palabraMasCorta(s1, s2);
		return palabraMasCorta(masCorta, s3);
	}
	
	public static String palabraMasCorta(String s1, String s2){
		return s1.length() < s2.length() ? s1 : s2;
	}
	
	public static int cuentaVocales(String s1){
		int contador = 0;
		for (int i = 0; i < s.length(); i++){
			if (esVocal(s.charAt(i))) {
				contador++;
			}
		}
		return contador;
	}

	public static boolean esVocal(char c){
		c = Character.toLowerCase(c);
		String vocales = "aáàeéèiíìoóòuúù";
		return vocales.indexOf(c) >= 0;
	}
}