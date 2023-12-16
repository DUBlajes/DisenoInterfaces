package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjercicioTextArea extends JFrame{
	public EjercicioTextArea() {
		setTitle("Formulario Básico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2)); // 4 filas, 2 columnas

		JLabel labelComentario = new JLabel("Comentario:");
		JTextArea textAreaComentario = new JTextArea();
		textAreaComentario.setLineWrap(true);
		textAreaComentario.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(textAreaComentario);
		add(labelComentario);
		add(scrollPane);

		JButton botonEnviar = new JButton("Enviar");
		botonEnviar.addActionListener(e -> {
		// Puedes agregar aquí la lógica para procesar la información del formulario
		String comentario = textAreaComentario.getText();

		// Ejemplo de imprimir la información en consola

		System.out.println("Comentario: " + comentario);
		});
		add(botonEnviar);

		pack();
		setLocationRelativeTo(null);
		}
}
