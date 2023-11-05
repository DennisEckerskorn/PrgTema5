public class Ejercicio18 {
    public static final int MIN_DNI = 0;
    public static final int MAX_DNI = 99999999;
    public static void main(String[] args) {
        int dni;

        dni = LibDos.solicitarDNI("Introduzca su DNI:", MIN_DNI, MAX_DNI);
        System.out.println(LibDos.calcularNIF(dni));
    }
    //***ESTOS MÉTODOS ESTÁN EN LibDos.java Y SE LLAMAN DESDE AHI***
    /*Función para solicitar un entero, especificamente para un DNI.
	public static int solicitarDNI(String mensaje, int valorMin, int valorMax){
		boolean valido;
		int resultado;
		do{
			System.out.println(mensaje);
			resultado = Integer.parseInt(lector.nextLine());
			valido = (resultado >= valorMin && resultado <= valorMax);
			if (!valido){
				System.out.printf("Error => Valor mínimo: %d, Valor máximo: %d\n", valorMin, valorMax);
			}
		}while (!valido);
		lector.close();
		return resultado;
	}
	Función para devolver el DNI con su caracter correspondiente.
	public static String calcularNIF(int dni){
        String resultado = "";
        String caracteresNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        char letra = caracteresNIF.charAt(modulo);
        resultado += String.format("%d-%c", dni, letra);
        return resultado;
    }
     */
}
