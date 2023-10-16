package ejerciciosJOptionPane;

import javax.swing.JOptionPane;

public class Main3 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido!","Ventana de inicio",JOptionPane.INFORMATION_MESSAGE);
		String nombre=JOptionPane.showInputDialog(null,"Introduce tu nombre","Info personal",JOptionPane.INFORMATION_MESSAGE);
		
		if(nombre!=null&&nombre.equals("")){
			System.out.println("Has pulsado OK sin introducir tu nombre.");
		}if (nombre!=null&&!nombre.equals("")) {
			System.out.println("Te doy la bienvenida, "+nombre);
		}else {
			System.out.println("Has pulsado cancelar");
		}

	}

}
