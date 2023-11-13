package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaMenu1 extends JFrame implements ActionListener{
	private JMenuBar menuBar;
	private JMenu menu1;
	private JMenuItem item1, item2, item3;
	
	public VentanaMenu1() {
		setTitle("Menu de ejemplo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		menu1=new JMenu("Clientes");
		menuBar.add(menu1);
		
		item1=new JMenuItem("Add");
		item1.addActionListener(this);
		menu1.add(item1);
	}
	
	public void actionPerformed(ActionEvent e) {
		Container contentPane=getContentPane();
		if(e.getSource()==item1) {
			contentPane.setBackground(new Color(255,0,0));
		}
	}
}
