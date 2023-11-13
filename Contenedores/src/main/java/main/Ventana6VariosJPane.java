package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana6VariosJPane extends JFrame {
	private JLabel etiquetaMensaje;
	private JLabel etiquetaBienvenida;

	public Ventana6VariosJPane() {
		setTitle("Ejemplo con dos contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creamos los conntenedores
		JPanel panelBienvenido=new JPanel();
		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();

		// Creamos las etiquetas

		etiquetaMensaje = new JLabel("Mesaje: ");
		etiquetaBienvenida=new JLabel ("Bienvenido: ");
		// Creamos un bucle para los botones y el actionListener, asi como que al pulsar cambie el mensaje del boton
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);

			// Añadimos el Listener para cada botón

			boton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText(); // Con esto extraemos el nombre del boton

					etiquetaMensaje.setText("Mensaje: " + textoBoton);
					etiquetaBienvenida.setText("Bienvenido "+textoBoton+" otra vez.");
					if(textoBoton.equals("Boton 1")) {
						setLocation(650,300);
					}
					// definimos el contenido de la etiqueta label cuando pulsemos e cada boton
				}

			});
			
			panelBotones.add(boton);
		}
		//Añadimos el layout, en este caso borderLayout en east, west, north, south y center y añadimos tanto los botones como el panel mensaje, así como el mensaje del botón pulsado (1, 2 o 3)
		setLayout(new BorderLayout());
		add (panelBienvenido, BorderLayout.NORTH);
		add(panelBotones,BorderLayout.SOUTH);
		add(panelMensaje,BorderLayout.CENTER);
		panelMensaje.add(etiquetaMensaje);
		panelBienvenido.add(etiquetaBienvenida);
		
		pack(); //Con esto ajusta el tamaño de los elementos del jFrame
		setVisible(true);
	}
}
