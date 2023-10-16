package ejerciciosJOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main4 {

	public static void main(String[] args) {
		
		UIManager.put("OptionPane.yesButtonText", "Claro, hermano");
		UIManager.put("OptionPane.noButtonText", "Claro que no");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		
		int codigo=JOptionPane.showConfirmDialog(null, "¿Quieres un euro para drogas?","Pregunta importante",JOptionPane.YES_NO_CANCEL_OPTION);
		if (codigo==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Bien ahí. Las drogas son buenas para tu cuerpo");
		}else if(codigo==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "El que le tenga miedo a morir, que no nazca, cobarde");
		}else if(codigo==JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "La pregunta se responde con sí o no. Cancelar no tiene sentido");			
		}
	}

}
