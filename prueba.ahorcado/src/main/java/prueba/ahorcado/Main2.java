package prueba.ahorcado;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra = "ornitorrinco";
        String solucion = "";
        short intentos = 6;
        int fallos = 0; // Número de fallos

        // Inicializar string solucion a un array con "_" igual al numero de caracteres
        for (int i = 0; i < palabra.length(); i++) {
            solucion += "_";
        }

        char eleccion;
        while (solucion.contains("_") && intentos > 0) {

            String mensaje = solucion + "\nNúmero de intentos: " + intentos + "\nDime una letra: ";
            String letraIngresada = JOptionPane.showInputDialog(null, mensaje);
            
            if (letraIngresada == null || letraIngresada.isEmpty()) {
                continue;  // Salta el bucle si no se ingresó ninguna letra
            }
            
            eleccion = letraIngresada.charAt(0);

            if (palabra.contains(String.valueOf(eleccion))
                    || palabra.toLowerCase().contains(String.valueOf(eleccion))) {
                solucion = actualizarSolucion(eleccion, solucion, palabra);
                // Mostrar una ventana emergente para indicar que la letra es correcta
                JOptionPane.showMessageDialog(null, "Letra correcta: " + eleccion);
            } else {
                intentos -= 1;
                fallos++;
                // Mostrar una ventana emergente para indicar que la letra es incorrecta
                JOptionPane.showMessageDialog(null, "Letra incorrecta: " + eleccion);
            }

            // Dibuja el ahorcado
            dibujarAhorcado(fallos);
        }

        if (!solucion.contains("_")) {
            JOptionPane.showMessageDialog(null, "¡Has adivinado la palabra! La palabra es: " + palabra);
        } else {
            JOptionPane.showMessageDialog(null, "\nNúmero de intentos: " + intentos + ".\nTe has quedado sin intentos. Ha terminado la partida. La palabra a adivinar era " + palabra.toUpperCase() + ".");
        }
    }

    public static String actualizarSolucion(char letra, String solucion, String palabra) {
        char[] aux = solucion.toCharArray();

        for (int i = 0; i < aux.length; i++) {
            if (palabra.charAt(i) == letra || palabra.toLowerCase().charAt(i) == letra) {
                aux[i] = letra;
            }
        }
        String aux2 = new String(aux);
        return aux2;
    }

    public static void dibujarAhorcado(int fallos) {
        String[] ahorcado = {
            " ____\n|    |\n|\n|\n|\n|\n=========",
            " ____\n|    |\n|    O\n|\n|\n|\n=========",
            " ____\n|    |\n|    O\n|    |\n|\n|\n=========",
            " ____\n|    |\n|    O\n|   /|\\ \n|\n|\n=========",
            " ____\n|    |\n|    O\n|   /|\\ \n|   / \n|\n=========",
            " ____\n|    |\n|    X\n|   /|\\ \n|   / \\ \n|\n========="
        };

        JOptionPane.showMessageDialog(null, ahorcado[fallos]);
    }
}
