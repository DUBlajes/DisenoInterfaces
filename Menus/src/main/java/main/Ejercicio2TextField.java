package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2TextField extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public Ejercicio2TextField() {
		setTitle("Ejemplo JTextField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(618,349);
		
		JLabel labelNombre=new JLabel("Indica tu nombre");
		labelNombre.setBounds(10,10,150,20);
		getContentPane().add(labelNombre);
		
		textField=new JTextField();
		textField.setBounds(160,10,120,20);
		getContentPane().add(textField);
		
		JLabel labelEdad = new JLabel("Indica tu edad");
		labelEdad.setBounds(10, 41, 150, 20);
		getContentPane().add(labelEdad);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 41, 44, 20);
		getContentPane().add(textField_1);
		
		JLabel labelCodigo = new JLabel("Código postal");
		labelCodigo.setBounds(10, 78, 150, 20);
		getContentPane().add(labelCodigo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 78, 120, 20);
		getContentPane().add(textField_2);
		
		JLabel labelProvincia = new JLabel("Provincia");
		labelProvincia.setBounds(10, 119, 150, 20);
		getContentPane().add(labelProvincia);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 119, 120, 20);
		getContentPane().add(textField_3);
		
		JLabel labelPais = new JLabel("País");
		labelPais.setBounds(10, 162, 150, 20);
		getContentPane().add(labelPais);
		
		textField_4 = new JTextField();
		textField_4.setBounds(160, 162, 120, 20);
		getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Enviar información");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarInfo();
			}
		});
		btnNewButton.setBounds(69, 241, 168, 45);
		getContentPane().add(btnNewButton);
		
		setLocationRelativeTo(null);
		
		
		
	}
	
	private void mostrarInfo() {
		String mensaje="Datos introducidos:"
				+ "\n\tNombre: "+textField.getText()
				+ "\n\tEdad: "+textField_1.getText()
				+ "\n\tCódigo postal: "+textField_2.getText()
				+ "\n\tProvincia: "+textField_3.getText()
				+ "\n\tPaís: "+textField_4.getText();
		
		JOptionPane.showMessageDialog(this, mensaje,"Datos Introducidos", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
