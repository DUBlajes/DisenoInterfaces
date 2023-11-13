package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana6VariosJPane2 extends JFrame {
	private JLabel etiquetaMensaje;
	private JLabel etiquetaBienvenida;

	public Ventana6VariosJPane2() {
		setTitle("Ejemplo con dos contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(600,200);
		setSize(800,600);

		// Creamos los conntenedores
		JPanel panelBienvenido=new JPanel();
		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();
		JPanel panelVentana=new JPanel();

		// Creamos las etiquetas

		etiquetaMensaje = new JLabel("Mesaje: ");
		etiquetaBienvenida=new JLabel ("Bienvenido: ");
		// Creamos un bucle para los botones y el actionListener, asi como que al pulsar cambie el mensaje del boton
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			JButton botonVentana=new JButton("Ventana "+i);
			botonVentana.setBackground(Color.black);
			botonVentana.setForeground(Color.WHITE);

			// Añadimos el Listener para cada botón
			
			botonVentana.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					JFrame nuevaVentana = new JFrame("Ventana nueva");
					nuevaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					nuevaVentana.setSize(300, 150);
					nuevaVentana.setLocationRelativeTo(null);

					JPanel panel = new JPanel();
					String textoVentana=((JButton)e.getSource()).getText();
					JLabel label = new JLabel("Has abierto la ventana "+textoVentana);
					panel.add(label);

					nuevaVentana.add(panel);
					nuevaVentana.setVisible(true);
					
				}
			});
			panelVentana.add(botonVentana);

			boton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText(); // Con esto extraemos el nombre del boton

					etiquetaMensaje.setText("Mensaje: " + textoBoton);
					etiquetaBienvenida.setText("Bienvenido "+textoBoton+" otra vez.");
					// definimos el contenido de la etiqueta label cuando pulsemos e cada boton
				}

			});
			
			panelBotones.add(boton);
		
		//Añadimos el layout, en este caso borderLayout en east, west, north, south y center y añadimos tanto los botones como el panel mensaje, así como el mensaje del botón pulsado (1, 2 o 3)


		setLayout(new BorderLayout());
		add(panelBienvenido, BorderLayout.NORTH);
		add(panelBotones,BorderLayout.SOUTH);
		add(panelMensaje,BorderLayout.CENTER);
		add(panelVentana,BorderLayout.WEST);
		panelMensaje.add(etiquetaMensaje);
		panelBienvenido.add(etiquetaBienvenida);
		
		//pack(); //Con esto ajusta el tamaño de los elementos del jFrame
		setVisible(true);
	}
}
}
