package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;

import org.w3c.dom.css.RGBColor;

public class VentanaPrincipal extends JFrame {

	private JMenuBar menuBar;
	private JMenu botones;
	private JMenuItem item1;
	private JFrame nuevaVentana;
	private JFrame ventanaMenu;
	private JMenuItem botonesMenu;

	public VentanaPrincipal() {
		
		//Empezamos el proyecto definiendo el JFrame Principal. Con estas propiedades determino el título de la ventana pricipal, así como su tamaño, localización preestablecida y acción que realiza al cerrarse
		setTitle("Examen Practico");
		setSize(400, 300);
		setLocation(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); // Aquí determinamos que el layout del JFrame va a ser Border Layout
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		

		// Creamos el menú para que aparezca e la parte superior de la ventana.
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		botones = new JMenu("Botones");
		menuBar.add(botones);
		// Con este bucle, creamos 6 botones que aparecerán al pulsar en el menú.
		for (int i = 1; i <= 6; i++) {
			botonesMenu = new JMenuItem("Boton " + i);
			botonesMenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Aqui ejecuto lo que quiero hacer cada vez que pulse un botón. Realmente es lo mismo que el método ProcesarBoton pero cambiando la 					parte del final y en vez de castear a JButton casteo a JMenuItem
					ventanaMenu = new JFrame("Ventana emergente del menú");
					ventanaMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaMenu.setSize(800, 500);
					ventanaMenu.setLocationRelativeTo(null);
					
					JPanel panelMenu=new JPanel();
					JButton botonCerrarMenu = new JButton("Cerrar Ventana");
					panelMenu.add(botonCerrarMenu);

					botonCerrarMenu.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ventanaMenu.dispose();
						}
					});
					
					String textoVentanaMenu = ((JMenuItem) e.getSource()).getText(); //Justo aqui es donde cambia con respecto al metodo.
					JLabel etiquetaMenu = new JLabel("Has abierto la ventana del menú al pulsar el " + textoVentanaMenu);
					panelMenu.setLayout(new BorderLayout());
					panelMenu.add(etiquetaMenu, BorderLayout.NORTH);
					panelMenu.add(botonCerrarMenu, BorderLayout.SOUTH);

					ventanaMenu.add(panelMenu);
					panelMenu.add(etiquetaMenu);
					ventanaMenu.setVisible(true);

				}

			});

			botones.add(botonesMenu);
		}
		

		// Creo los paneles a mostrar
		JPanel botonPanel = new JPanel();

		// Creamos los paneles norte y sur y les establezco los layout
		JPanel panelNorte = new JPanel();
		JPanel panelSur = new JPanel();
		panelNorte.setLayout(new FlowLayout());
		panelSur.setLayout(new FlowLayout());

		// Creo un bucles para crear botones del 1 al 6. Los 3 primeros se colocarán en
		// el panel norte y los 3 segundos en el panel sur
		for (int i = 1; i <= 6; i++) {

			JButton botones = new JButton("Boton " + i);
			configurarBoton(botones);

			if (i < 4) {
				panelNorte.add(botones);
			} else {
				panelSur.add(botones);
			}
			botones.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					procesarBoton(e);
				}
			});

			// Añadimos los dos paneles al norte y al sur del Layout
			add(panelNorte, BorderLayout.NORTH);
			add(panelSur, BorderLayout.SOUTH);

			// Sin esta última línea de código, ningua ventana se verá al ejecutarse el
			// programa.
			setVisible(true);
		}
	}

	// Con este metodo determino el fondo y letras de los botones
	public void configurarBoton(JButton boton) {
		boton.setBackground(Color.YELLOW);
		boton.setForeground(Color.black);
	}

	// Creamos el método que abre una nueva ventana al pulsar un boton.
	public void procesarBoton(ActionEvent e) {
		nuevaVentana = new JFrame("Ventana emergente");
		nuevaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		nuevaVentana.setSize(800, 500);
		nuevaVentana.setLocationRelativeTo(null);
		JButton botonCerrar = new JButton("Cerrar Ventana");

		botonCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevaVentana.dispose();
			}
		});

		// Añadimos los nuevos paneles, texto, etiquetas y botones (co su localización
		// en el panel) a la nueva ventana.
		JPanel panelEmergente = new JPanel();
		String textoVentana = ((JButton) e.getSource()).getText();
		JLabel etiqueta = new JLabel("Has abierto la ventana al pulsar el " + textoVentana);

		panelEmergente.setLayout(new BorderLayout());
		panelEmergente.add(etiqueta, BorderLayout.NORTH);
		panelEmergente.add(botonCerrar, BorderLayout.CENTER);

		nuevaVentana.add(panelEmergente);
		nuevaVentana.setVisible(true);

	}

}
