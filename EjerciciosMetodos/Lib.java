import java.util.Random;

public class Lib {
	private static Random rnd = new Random();

	public static int random(int min, int max){
		return rnd.nextInt(max - min + 1) + min;
	}

	public static int random(double min, double max){
		return rnd.nextDouble() * (max - min) + min;
	}
}