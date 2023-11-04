import java.util.Random;

//Custom library of Methods:
public class Lib {
	public static Random rnd = new Random();

	//Random which generates INTEGER numbers:
	public static int random(int min, int max){
		return rnd.nextInt(max - min + 1) + min;
	}

	//Random which generates DOUBLE numbers:
	public static double random(double min, double max){
		return rnd.nextDouble() * (max - min) + min;
	}
}