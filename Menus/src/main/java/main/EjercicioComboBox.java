package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjercicioComboBox extends JFrame {
	private JComboBox<String> comboBox;
	
	public EjercicioComboBox() {
		setTitle("Ejemplo JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(300,100);
		
		
		JLabel label=new JLabel("Selecciona un idioma");
		label.setBounds(10,10,150,20);
		add(label);
		
		String[]opciones= {"","Java","Kotlin","PHP","JavaScript"};
		comboBox=new JComboBox<>(opciones);
		comboBox.setBounds(160,10,120,20);
		add(comboBox);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex=comboBox.getSelectedIndex();
				comboBox.setSelectedIndex(0);
				String seleccion=opciones[selectedIndex];
				mostrarMensaje("Indica el codigo","Has elegido: "+seleccion);
			}
		});
		
		setLocationRelativeTo(null);
	}
	
	private void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, titulo,JOptionPane.INFORMATION_MESSAGE);
	}
	
}
