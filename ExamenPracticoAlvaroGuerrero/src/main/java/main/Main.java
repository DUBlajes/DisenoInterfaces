package main;

import javax.swing.SwingUtilities;

import formulario.Formulario;

public class Main {

	public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
				Formulario ventana = new Formulario();
				ventana.setVisible(true);
			});
		}

	}
