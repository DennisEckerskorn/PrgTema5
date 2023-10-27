import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
       final int VECES = 50;

       System.out.println(calificacion(VECES));
        
    }
    // Función para generar un número aleatorio.
	public static int aleatorio(int min, int max){
		Random rnd = new Random();
		int numeroAleatorio = rnd.nextInt(max - min + 1) + min;
		return numeroAleatorio;
	}
	// Función para ejecutar un bucle for hasta un numero dado 
    // y usar el switch para condicionar los numeros aleatorios que genera el bucle.
	public static String calificacion(int veces){
		String resultado = "";
		for (int i = 1; i <= veces; i++){
			int alea = aleatorio(0, 10);
			//System.out.println(alea);
			switch(alea){
                case 0: case 1: case 2: case 3: case 4:
                    resultado += "INSUFICIENTE\n";
                    break;
				case 5:
					resultado += "SUFICIENTE\n";
					break;
				case 6:
					resultado += "BIEN\n";
					break;
				case 7:	case 8:
					resultado += "NOTABLE\n";
					break;
                case 9: case 10:
                    resultado += "EXCELENTE\n";
			}
			
		}
		return resultado;
	}
}
