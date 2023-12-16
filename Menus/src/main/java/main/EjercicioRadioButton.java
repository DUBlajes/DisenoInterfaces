package main;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjercicioRadioButton extends JFrame {
	public EjercicioRadioButton() {
		setTitle("Ejemplo JRadioButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JRadioButton radioButton1 = new JRadioButton("Opción 1");
		JRadioButton radioButton2 = new JRadioButton("Opción 2");
		JRadioButton radioButton3 = new JRadioButton("Opción 3");

		// hay que meterlo en un grupo, para que al pulsar una opcion no puedas pulsar
		// la otra opcion
		// si desactivamos esta opcion, podremos usar ambos botones.
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		
		

		JPanel panel = new JPanel();
		panel.add(radioButton1);
		panel.add(radioButton2);
		panel.add(radioButton3);

		getContentPane().add(panel);

		pack();
		setLocationRelativeTo(null);
	}

}
