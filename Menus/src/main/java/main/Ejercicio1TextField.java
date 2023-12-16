package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio1TextField extends JFrame {
	public Ejercicio1TextField() {
		setTitle("Ejemplo JTextField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(300,100);
		
		JLabel label=new JLabel("Indica tu nombre");
		label.setBounds(10,10,150,20);
		add(label);
		
		JTextField textField=new JTextField();
		textField.setBounds(160,10,120,20);
		add(textField);
		
		setLocationRelativeTo(null);
		
	}
}
