import java.util.Random;

public class Ejercicio11{
	//Constantes.
	public static final int UNO = 0;
	public static final int X = 1;
	public static final int DOS = 2;
	public static final int NUM_PARTIDOS = 15;

	public static void main(String[] args){
		
		//Se imprime el resultado llamando al la llamada del metodo.
		System.out.println(quiniela(NUM_PARTIDOS));
	}
	//Función para generar un número aleatorio.
	public static int aleatorio(int min, int max){
		Random rnd = new Random();
		int numeroAleatorio = rnd.nextInt(max - min + 1) + min;
		return numeroAleatorio;
	}
	//Función para ejecutar un bucle for hasta un numero dado y usar el metodo aleatorio para realizar la quiniela.
	public static String quiniela(int numPartidos){
		String resultado = "";
		for (int i = 1; i <= numPartidos; i++){
			resultado += String.format("%10s", "Partido " + i + " ");
			int alea = aleatorio(UNO, DOS);
			//System.out.println(alea);
			switch(alea){
				case UNO:
					resultado += String.format("%5s", "1");
					break;
				case X:
					resultado += String.format("%5s", "X");
					break;
				case DOS:	
					resultado += String.format("%5s", "2");
					break;
			}
			resultado += "\n";
			
		}
		return resultado;
	}
}