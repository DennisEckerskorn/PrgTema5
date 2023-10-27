import java.util.Random;

public class Ejercicio11{
	public static void main(String[] args){
		//Variables como Constantes ya que los valores en principio no cambian.
		final int NUM_PARTIDOS = 15;

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
			int alea = aleatorio(1, 3);
			//System.out.println(alea);
			switch(alea){
				case 1:
					resultado += "Partido:\t" + alea + "\n";
					break;
				case 2:
					resultado += "Partido:\t" + alea + "\n";
					break;
				case 3:	
					resultado += "Partido:\t" + "x\n";
					break;
			}
			
		}
		return resultado;
	}
}