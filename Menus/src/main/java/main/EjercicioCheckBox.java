package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EjercicioCheckBox extends JFrame {
	public EjercicioCheckBox() {
		setTitle("Ejemplo JCheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCheckBox chckbxDeseaRecibirPublicidad = new JCheckBox("Recibir publicidad y promociones");
		getContentPane().add(chckbxDeseaRecibirPublicidad, BorderLayout.EAST);

		JCheckBox checkBox_1 = new JCheckBox("Aceptar términos y condiciones");
		getContentPane().add(checkBox_1, BorderLayout.WEST);
		setSize(445, 213);
		setLocationRelativeTo(null);

		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_1.isSelected()) {
					mostrarMensaje("Aceptar términos y condiciones", "Usted acepta los términos y condiciones.");
				} else {
					mostrarMensaje("Aceptar términos y condiciones", "Usted no acepta los términos y condiciones.");
				}
			}
		});

		// realiza lo mismo para desea recibir publicidad
		chckbxDeseaRecibirPublicidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxDeseaRecibirPublicidad.isSelected()) {
					mostrarMensaje("¿Desea recibir publicicad?", "Ha indicado que desea recibir publicidad y promociones.");
				} else {
					mostrarMensaje("¿Desea recibir publicicad?", "Ha indicado que no desea recibir publicidad y promociones.");
				}
			}
		});

	}

	private void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
}
