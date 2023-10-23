package prueba.ahorcado;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra = "perro";
		String solucion = "";
		short intentos = 6;

		// Inicializar string solucion a un a array con "_" igual al numero de
		// caracteres
		for (int i = 0; i < palabra.length(); i++) {
			solucion += "_";
		}

		// La array soluccion empieza siendo "_______" cuando la palabra es "perro" y
		// cuando aciertas una letra, cambia el "_" que corresponde por la letra que
		// acertastes
		// El juego termina cuando solucion no tiene "_" porque significa que has
		// acertado la palabra o cuando te quedas sin intentos
		char eleccion;
		while (solucion.contains("_") && intentos > 0) {

			System.out.println(solucion + "\nNúmero de intentos: " + intentos + "\nDime una letra: ");
			eleccion = sc.next().charAt(0);

			if (palabra.contains(String.valueOf(eleccion))
					|| palabra.toLowerCase().contains(String.valueOf(eleccion))) {
				solucion = actualizarSolucion(eleccion, solucion, palabra);
			} else {
				intentos -= 1;
			}
		}
		System.out.println("\nNúmero de intentos: " + intentos +".\nTe has quedado sin intentos. Ha terminado la partida. La palabra a adivinar era "+palabra.toUpperCase()+".");
	}
	 public static String actualizarSolucion( char letra, String soluccion, String palabra){
	        char[] aux = soluccion.toCharArray();

	        for (int i = 0; i < aux.length; i++) {
	            if (palabra.charAt(i) == letra || palabra.toLowerCase().charAt(i) == letra){
	                aux[i] = letra;
	            }
	        }
	        String aux2=new String(aux);
			return aux2;
	 }
}
