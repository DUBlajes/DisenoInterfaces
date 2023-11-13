package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Ventana6VariosJPane2();
			}
		});*/
		
		SwingUtilities.invokeLater(()-> {
			VentanaMenu1 formulario1=new VentanaMenu1();
			formulario1.setBounds(10,20,300,200);
			formulario1.setVisible(true);
		});
	}

}
