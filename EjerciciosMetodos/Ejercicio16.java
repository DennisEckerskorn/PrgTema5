import java.util.Scanner;

public class Ejercicio16{
	public static final int LOOP_REP = 9;
	
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int numberToReplace;
		char letter = ' ';

		System.out.println("REPLACE NUMBER WITH CHARACTER");
		System.out.println("Please write the number you want to replace:");
		numberToReplace = Integer.parseInt(lector.nextLine());

		System.out.println("Please write the letter you want to use to replace the number");
		letter = lector.next().charAt(0);

		System.out.println(replaceDigits(numberToReplace, letter));

		lector.close();
				
	}
	public static String replaceDigits(int n, char c){
		String result = "";
		for (int i = 0; i <= LOOP_REP; i++){
			for (int j = 0; j <= LOOP_REP; j++){
				for (int k = 0; k <= LOOP_REP; k++){
					for (int l = 0; l <= LOOP_REP; l++){
						String formattedString = String.format("%s-%s-%s-%s\n", i, j, k, l);
                        // Replace the specific number with the character
                        formattedString = formattedString.replace(String.valueOf(n), String.valueOf(c));
                        result += formattedString;
					}
				}		

			}
		}
		return result;
	}

	
	
}