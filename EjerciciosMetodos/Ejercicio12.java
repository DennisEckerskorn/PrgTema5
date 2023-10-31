public class Ejercicio12 {
	public static enum Calificacion {
		INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE, ERROR
	}

	public static final int NUM_VECES = 50;

	public static void main(String[] args) {
      		for (int i = 1; i <= NUM_VECES; i++){
			double nota = Lib.random(0.0, 15.0);
			System.out.println(obtenerCalificacion(nota));
		}	
		//System.out.println(obtenerCalificacion(NUM_VECES));
        
    	}
    
	
	//Correcion clase
	public static Calificacion obtenerCalificacion(double nota){
		int notaEntera = (int) nota;
		switch(notaEntera) {
			case 0: case 1: case 2: case 3: case 4:
				return Calificacion.INSUFICIENTE;
				break;
			case 5:
				return Calificacion.SUFICIENTE;
				break;
			case 6:
				return Calificacion.BIEN;
				break;
			case 7: case 8:
				return Calificacion.NOTABLE;
				break;
			case 9: case 10:
				return Calificacion.EXCELENTE;
				break;
			default:
				return Calificacion.ERROR;
				break;
		}
	}
}
