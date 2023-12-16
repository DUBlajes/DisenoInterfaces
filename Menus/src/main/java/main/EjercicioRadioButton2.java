package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjercicioRadioButton2 extends JFrame {
	public EjercicioRadioButton2() {
		setTitle("Matrix");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JRadioButton radioButton1 = new JRadioButton("Pastilla Azul");
		JRadioButton radioButton2 = new JRadioButton("Pastilla roja");
		
		radioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMensaje("Tomas la pastilla azul", "La historia termina, te despiertas en tu cama y crees lo que quieras creer.");
			}
		});
		
		radioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMensaje("Tomas la pastilla roja","Te quedas en el País de las Maravillas, y te enseño lo profunda que es la madriguera del conejo.");
			}
		});


		// hay que meterlo en un grupo, para que al pulsar una opcion no puedas pulsar
		// la otra opcion
		// si desactivamos esta opcion, podremos usar ambos botones.
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);

		JPanel panel = new JPanel();
		panel.add(radioButton1);
		panel.add(radioButton2);
		getContentPane().add(panel);


		setLocationRelativeTo(null);
	}
	
	private void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje,titulo,JOptionPane.INFORMATION_MESSAGE);
	}
}
