import java.util.Scanner;

public class Ejercicio15{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		String word1, word2, word3;
		int option;
		boolean valid;
		
		do{
		
			showMenu();
			option = Integer.parseInt(lector.nextLine());
			

			
			valid = option <= 0;
		}while(!valid);
		
		System.out.println("Dime 3 palabras, apreta intro despues de cada una:");
		word1 = lector.nextLine();
		word2 = lector.nextLine();
		word3 = lector.nextLine();
		
		System.out.println("La palabra más larga es: " + shortWord(word1, word2, word3));
			
	}
	public static void showMenu(){
		System.out.println("MENÚ PRINCIPAL");
		System.out.println("==============");
		System.out.println("1. Palabra más larga.");
		System.out.println("2. Palabra más corta.");
		System.out.println("3. Número de vocales.");
		System.out.println("----------------------------------");
		System.out.println("0. Salir");
	}

	public static String longWord(String w1, String w2, String w3){
		if(w1.length() >= w2.length() && w1.length() >= w3.length()){
			return w1;
		} else if(w2.length() >= w1.length() && w2.length() >= w3.length()){
			return w2;
		}else{
			return w3;
		}  
	}
	
	public static String shortWord(String w1, String w2, String w3){
		if(w1.length() <= w2.length() && w1.length() <= w3.length()){
			return w1;
		} else if(w2.length() <= w1.length() && w2.length() <= w3.length()){
			return w2;
		}else{
			return w3;
		}
	
	}
	
	public static vocals(String w1, String w2, String w3){
		
	}
}