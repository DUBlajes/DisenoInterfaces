package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Menu2 extends JFrame implements ActionListener {
	private JMenuBar mb;
	private JMenu menuClientes, menuProveedores, menuFacturas;
	private JMenuItem miAltasClientes, miBajasClientes, miModificacionesClientes, miListadoClientes;
	private JMenuItem miAltasProveedores, miBajasProveedores, miModificacionesProveedores, miListadoProveedores;
	private JMenuItem miCrearFactura, miEliminarFactura, miModificarFactura, miListadoFacturas, miSalir;

	public Menu2() {
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);

		// Men "Clientes"
		menuClientes = new JMenu("Clientes");
		mb.add(menuClientes);

		miAltasClientes = new JMenuItem("Altas");
		miAltasClientes.addActionListener(this);
		menuClientes.add(miAltasClientes);
		miBajasClientes = new JMenuItem("Bajas");
		miBajasClientes.addActionListener(this);
		menuClientes.add(miBajasClientes);
		miModificacionesClientes = new JMenuItem("Modificaciones");
		miModificacionesClientes.addActionListener(this);
		menuClientes.add(miModificacionesClientes);
		miListadoClientes = new JMenuItem("Listado");
		miListadoClientes.addActionListener(this);
		menuClientes.add(miListadoClientes);

		// Men "Proveedores"
		menuProveedores = new JMenu("Proveedores");
		mb.add(menuProveedores);

		miAltasProveedores = new JMenuItem("Altas");
		miAltasProveedores.addActionListener(this);
		menuProveedores.add(miAltasProveedores);
		miBajasProveedores = new JMenuItem("Bajas");
		miBajasProveedores.addActionListener(this);
		menuProveedores.add(miBajasProveedores);
		miModificacionesProveedores = new JMenuItem("Modificaciones");
		miModificacionesProveedores.addActionListener(this);
		menuProveedores.add(miModificacionesProveedores);
		miListadoProveedores = new JMenuItem("Listado");
		miListadoProveedores.addActionListener(this);
		menuProveedores.add(miListadoProveedores);

		// Men "Facturas"
		menuFacturas = new JMenu("Facturas");
		mb.add(menuFacturas);
		miCrearFactura = new JMenuItem("Crear factura");
		miCrearFactura.addActionListener(this);
		menuFacturas.add(miCrearFactura);
		miEliminarFactura = new JMenuItem("Eliminar factura");
		miEliminarFactura.addActionListener(this);
		menuFacturas.add(miEliminarFactura);
		miModificarFactura = new JMenuItem("Modificar factura");
		miModificarFactura.addActionListener(this);
		menuFacturas.add(miModificarFactura);
		miListadoFacturas = new JMenuItem("Listado facturas");
		miListadoFacturas.addActionListener(this);
		menuFacturas.add(miListadoFacturas);
		miListadoFacturas = new JMenuItem("Configuracion");
		miListadoFacturas.addActionListener(this);
		menuFacturas.add(miListadoFacturas);

		// Opcin "Salir" en el men principal
		miSalir = new JMenuItem("Salir");
		miSalir.addActionListener(this);
		mb.add(miSalir);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == miAltasClientes) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Altas Clientes'.");
		} else if (e.getSource() == miBajasClientes) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Bajas Clientes'.");
		} else if (e.getSource() == miModificacionesClientes) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Modificaciones Clientes'.");
		} else if (e.getSource() == miListadoClientes) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Listado Clientes'.");
		} else if (e.getSource() == miAltasProveedores) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Altas Proveedores'.");
		} else if (e.getSource() == miBajasProveedores) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Bajas Proveedores'.");
		} else if (e.getSource() == miModificacionesProveedores) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Modificaciones Proveedores'.");
		} else if (e.getSource() == miListadoProveedores) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Listado Proveedores'.");
		} else if (e.getSource() == miCrearFactura) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Crear factura'.");
		} else if (e.getSource() == miEliminarFactura) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Eliminar factura'.");
		} else if (e.getSource() == miModificarFactura) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Modificar factura'.");
		} else if (e.getSource() == miListadoFacturas) {
			JOptionPane.showMessageDialog(this, "Seleccionaste 'Listado facturas'.");
		} else if (e.getSource() == miSalir) {
			System.exit(0);
		}
	}
}
