package ejerciciosJOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main5 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "¡Muy buenas!");
		String nombre;
			
		do {
		nombre=JOptionPane.showInputDialog(null,"Dime tu nombre","Información",JOptionPane.INFORMATION_MESSAGE);
		
		if(nombre!=null&&nombre.equals("")){
			JOptionPane.showMessageDialog(null, "Has pulsado OK sin introducir tu nombre.");
		}else if (nombre!=null&&(!nombre.equals(""))) {
			JOptionPane.showMessageDialog(null, "Te doy la bienvenida, "+nombre);
		}else {
			JOptionPane.showMessageDialog(null, "Has pulsado cancelar");
		}
		
		} while (nombre==null||nombre.equals(""));
		int eleccion;
		UIManager.put("OptionPane.yesButtonText", "Claro que sí, hermano");
		UIManager.put("OptionPane.noButtonText", "Ni de coña");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		do {
		eleccion=JOptionPane.showConfirmDialog(null, "¿Quieres un euro para porrillos?","Pregunta vital",JOptionPane.YES_NO_CANCEL_OPTION);
		if (eleccion==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Así me gusta, que te drogues.");
		}else if (eleccion==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Cobarde...");
		}else {
			JOptionPane.showMessageDialog(null, "¿Cómo que cancelar? ¡Tienes que responder sí o no!");
		}
		} while (eleccion!=JOptionPane.YES_OPTION);

	}
	
}
