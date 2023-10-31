import java.util.Scanner;

public class Ejercicio15{
	public static void main(String[] args){
		//Variables:
		Scanner lector = new Scanner(System.in);
		String word1, word2, word3;
		int option;
		boolean valid = false;
		//Loop do-while to allow the selection of options.
		do{
			//We call the method showMenu which simply prints the text of the menu. Afterwards we read the value of option.
			showMenu();
			option = Integer.parseInt(lector.nextLine());
			//Switch to execute functions when option has the value given by user. 1 - longWord, 2 - shortWord, 3 - Vocal,Accent,Upper,Lower.
			switch(option){
				case 0:
					valid = true;
				break;		
				case 1:
					System.out.println("PALABRA MÁS LARGA");
					word1 = lector.nextLine();
					word2 = lector.nextLine();
					word3 = lector.nextLine();
					System.out.println("La palabra más larga es: " + longWord(word1, word2, word3));
				break;
				case 2:
					System.out.println("PALABRA MÁS CORTA");
					System.out.println("Dime 3 palabras, apreta intro despues de cada una:");
					word1 = lector.nextLine();
					word2 = lector.nextLine();
					word3 = lector.nextLine();
					System.out.println("La palabra más corta es: " + shortWord(word1, word2, word3));
				break;
				case 3:
					System.out.println("ENCUENTRA LAS VOCALES, ACENTOS, MAYÚSCULAS, MINÚSCULAS");
					System.out.println("Dime una palabra o una frase:");
					word1 = lector.nextLine();
					System.out.println("La palabra tiene en total " + vocalCount(word1) + " vocales.");
					System.out.println("La palabra tiene en total " + accentCount(word1) + " vocales con acento.");
					System.out.println("La palabra tiene en total " + upperCaseCount(word1) + " letras en mayúscula.");
					System.out.println("La palabra tiene en total " + lowerCaseCount(word1) + " letras en minúscula.");
				break;
				default:
					System.out.println("ERROR, introduce un número entre 0 y 3");
			}
		}while(!valid);	
	}

	//Method to print a menu on the console screen.
	public static void showMenu(){
		System.out.println("MENÚ PRINCIPAL");
		System.out.println("==============");
		System.out.println("1. Palabra más larga.");
		System.out.println("2. Palabra más corta.");
		System.out.println("3. Número de vocales.");
		System.out.println("----------------------------------");
		System.out.println("0. Salir");
	}

	//Function to return the longest word of 3.
	public static String longWord(String w1, String w2, String w3){
		if(w1.length() >= w2.length() && w1.length() >= w3.length()){
			return w1;
		} else if(w2.length() >= w1.length() && w2.length() >= w3.length()){
			return w2;
		} else{
			return w3;
		}  
	}

	//Function to return the shortest word of the 3.
	public static String shortWord(String w1, String w2, String w3){
		if(w1.length() <= w2.length() && w1.length() <= w3.length()){
			return w1;
		} else if(w2.length() <= w1.length() && w2.length() <= w3.length()){
			return w2;
		} else{
			return w3;
		}
	}

	//Function to count and return how many Vocals are in the given String.
	public static int vocalCount(String w1){
		int vocalCounter = 0;
		for (int i = 0; i < w1.length(); i++){
			char ch = w1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				vocalCounter++;
			}
			
		}
		return vocalCounter;
	}

	//Function to count and return how many Vocals with accents are in the given String.
	public static int accentCount(String w1){
		int accentCounter = 0;
		for (int i = 0; i < w1.length(); i++){
			char ch = w1.charAt(i);
			if(ch == 'á' || ch == 'é' || ch == 'í' || ch == 'ó' || ch == 'ú' || ch == 'Á' || ch == 'É' || ch == 'Í' || ch == 'Ó' || ch == 'Ú'){
				accentCounter++;
			}
		}
		return accentCounter;
	}

	//Function to count and return how many Upper Case letters are in the given String.
	public static int upperCaseCount(String w1){
		int counterUpperCase = 0;
		for (int i = 0; i < w1.length(); i++){
			char ch = w1.charAt(i);
			if(Character.isUpperCase(ch)){
				counterUpperCase++;
			}
		}
		return counterUpperCase;	
	}

	//Function to count and return how many Lower Case letters are in the given String.
	public static int lowerCaseCount(String w1){
		int counterLowerCase = 0;
		
		for (int i = 0; i < w1.length(); i++){
			char ch = w1.charAt(i);
			if(Character.isLowerCase(ch)){
				counterLowerCase++;
			}
		}
		return counterLowerCase;
	} 	
}