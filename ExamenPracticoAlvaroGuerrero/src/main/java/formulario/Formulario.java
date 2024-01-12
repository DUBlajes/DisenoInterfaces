package formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Formulario extends JFrame {

	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldEdad;
	private JTextArea textAreaComentarios;
	private JCheckBox checkBoxJava;
	private JCheckBox checkBoxPython;
	private JRadioButton radioButtonBachillerato;
	private JRadioButton radioButtonCicloMedio;
	private JRadioButton radioButtonCicloSuperior;
	private JButton botonCargarCurriculum;
	private JLabel labelOcupacion;
	private JComboBox cBOcupacion;

	
	public Formulario() {
		
		// Configuración del título y operación de cierre de la ventana para que acabe con la ejecución del programa
		setTitle("Formulario examen práctico Álvaro Guerrero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Configuración del diseño del contenedor principal
		getContentPane().setLayout(new BorderLayout());

		
		// Creación y configuración del panel de formulario
		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(new GridLayout(9, 1, 8, 5));

		
		// Creación de etiquetas, campos de texto, área de texto, etc. que se repite para otros componentes
		JLabel labelNombre = new JLabel("Nombre:");
		textFieldNombre = new JTextField();
		JLabel labelApellidos = new JLabel("Apellidos:");
		textFieldApellidos = new JTextField();
		JLabel labelEdad = new JLabel("Edad:");
		textFieldEdad = new JTextField();
		JLabel labelComentarios = new JLabel("Comentarios:");
		textAreaComentarios = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textAreaComentarios);
		checkBoxJava = new JCheckBox("Java");
		checkBoxPython = new JCheckBox("Python");
		radioButtonBachillerato = new JRadioButton("Bachillerato");
		radioButtonCicloMedio = new JRadioButton("Ciclo Medio");
		radioButtonCicloSuperior = new JRadioButton("Ciclo Superior");
		
		// Creamos eel grupo de radio buttons
		ButtonGroup groupNivelEstudios = new ButtonGroup();
		groupNivelEstudios.add(radioButtonBachillerato);
		groupNivelEstudios.add(radioButtonCicloMedio);
		groupNivelEstudios.add(radioButtonCicloSuperior);
		botonCargarCurriculum = new JButton("Cargar CV");

		
		// Añadimos componentes al panel de formulario
		panelFormulario.add(labelNombre);
		panelFormulario.add(textFieldNombre);
		panelFormulario.add(labelApellidos);
		panelFormulario.add(textFieldApellidos);
		panelFormulario.add(labelEdad);
		panelFormulario.add(textFieldEdad);
		panelFormulario.add(labelComentarios);
		panelFormulario.add(scrollPane);

		labelOcupacion = new JLabel("Ocupación");
		panelFormulario.add(labelOcupacion);

		// Configuramos el JComboBox de la ocupación
		cBOcupacion = new JComboBox();
		cBOcupacion.setModel(
				new DefaultComboBoxModel(new String[] { "Desempleado/a", "Estudiante", "Trabajador/a por cuenta propia",
						"Trabajador/a por cuenta ajena", "Trabajador/a y estudiante", "Jubilado/a" }));
		
		// Añadimos componentes al panel de formulario
		panelFormulario.add(cBOcupacion);
		panelFormulario.add(checkBoxJava);
		panelFormulario.add(checkBoxPython);
		panelFormulario.add(radioButtonBachillerato);
		panelFormulario.add(radioButtonCicloMedio);
		panelFormulario.add(radioButtonCicloSuperior);
		panelFormulario.add(botonCargarCurriculum);

		// Añadir el panel de formulario al contenedor principal
		getContentPane().add(panelFormulario, BorderLayout.CENTER);

		
		// Configuracimos el panel de botones y los añadimos
		JPanel panelBotones = new JPanel();
		JButton botonAceptar = new JButton("Aceptar");
		panelBotones.add(botonAceptar);
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		JButton botonCerrar = new JButton("Cerrar");
		panelBotones.add(botonCerrar);
		
		
		//Configuramos el ActionListener para el botón Cerrar y Aceptar
		botonCerrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Abrir ventana de agradecimiento
				ventanaCancelar();
			}
		});

		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Con estas líneas recopilamos toda la información del formulario
				String nombre = textFieldNombre.getText();
				String apellidos = textFieldApellidos.getText();
				String edad = textFieldEdad.getText();
				String comentarios = textAreaComentarios.getText();
				String ocupacion = cBOcupacion.getSelectedItem().toString();
				boolean javaChecked = checkBoxJava.isSelected();
				boolean pythonChecked = checkBoxPython.isSelected();

				String nivelEstudios = "";
				if (radioButtonBachillerato.isSelected()) {
					nivelEstudios = "Bachillerato";
				} else if (radioButtonCicloMedio.isSelected()) {
					nivelEstudios = "Ciclo Medio";
				} else if (radioButtonCicloSuperior.isSelected()) {
					nivelEstudios = "Ciclo Superior";
				}

				// Aquí mostramos la información en un JOptionPane
				String mensaje = "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Edad: " + edad + "\n"
						+ "Comentarios: " + comentarios + "\n" + "Ocupación: " + ocupacion + "\n" + "Java: "
						+ javaChecked + "\n" + "Python: " + pythonChecked + "\n" + "Nivel de Estudios: "
						+ nivelEstudios;

				JOptionPane.showMessageDialog(Formulario.this, mensaje, "Información del Formulario",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		//Configuramos el ActionListener para el botón de Cargar Currículum
		botonCargarCurriculum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lógica para cargar el currículum
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(Formulario.this);

				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File archivoSubido = fileChooser.getSelectedFile();
					JOptionPane.showMessageDialog(Formulario.this,
							"Curriculum cargado: " + archivoSubido.getName(), "CV Cargado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		//Con esto configuramos el tamaño y posición de la ventana
		pack();
		setLocationRelativeTo(null);
	}

	// Con esta función creamos un cuadro de diálogo modal para cancelar el formulario
	private void ventanaCancelar() {
	    // Crear instancia de JDialog con referencia al formulario principal
	    JDialog dialogoCancelar = new JDialog(Formulario.this, "Alberto, esto es un 10, ¿no?", true);
	    dialogoCancelar.getContentPane().setLayout(new BorderLayout());

	    // Configuración de la etiqueta que aparecerá en la ventana
	    JLabel labelCancelar = new JLabel("Gracias por usar este formulario. Profesor, póngame un dies ;)");
	    labelCancelar.setHorizontalAlignment(SwingConstants.CENTER);

	    // Crear botón "Aceptar" y definir su acción
	    JButton botonAceptar = new JButton("Aceptar");
	    botonAceptar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // Cerrar la ventana de agradecimiento
	            dialogoCancelar.dispose();

	            // Cerrar la aplicación
	            System.exit(0);
	        }
	    });

	    // Crear paneles para la etiqueta y el botón
	    JPanel panelCancelar = new JPanel();
	    panelCancelar.add(labelCancelar);

	    JPanel panelBoton = new JPanel();
	    panelBoton.add(botonAceptar);

	    // Agregar componentes al contenedor del cuadro de diálogo
	    dialogoCancelar.getContentPane().add(panelCancelar, BorderLayout.CENTER);
	    dialogoCancelar.getContentPane().add(panelBoton, BorderLayout.SOUTH);

	    // Configuración del tamaño, posición y visibilidad del cuadro de diálogo
	    dialogoCancelar.setSize(400, 150);
	    dialogoCancelar.setLocationRelativeTo(Formulario.this);
	    dialogoCancelar.setVisible(true);
	}
}
