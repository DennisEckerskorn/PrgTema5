import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        //Variable.
        Scanner lector = new Scanner(System.in);
        String nameUser;
        int lang;
       //User input : Name.
        System.out.println("Welcome, please tell me your name:");
        nameUser = lector.nextLine();
        //Call to the method showMenu() to list the menu of languages.
        showMenu();
        //Read user input to use for the selectLanguage Method which returns the name and prefered language.
        lang = Integer.parseInt(lector.nextLine());
        System.out.println(selectLanguage(lang, nameUser));
        //Exit Scanner.
        lector.close();
    }
    //Methods:
    //Function to simply show a menu.
    public static void showMenu(){
            System.out.println("Select your language:");
            System.out.println("1. Valenciano");
            System.out.println("2. Castellano");
            System.out.println("3. English");
            System.out.println("4. German");
    }
    //Function to evaluate the user input for the prefered language.
    public static String selectLanguage(int language, String name){
        String lang = "";
        switch(language){
            case 1:
                lang += "Bon día, " + name;
                break;
            case 2:
                lang += "Buenos días, " + name;
                break;
            case 3:
                lang += "Good morning, " + name;
                break;
            case 4:
                lang += "Guten morgen," + name;
                break;   
        }
        return lang;
    }
  
}
