package Vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.security.cert.Extension;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Fichero extends JPanel implements ActionListener {
	private JLabel caja1, caja2;
	private JButton boton1;
	private JTextField texto;
	private JTextField texto2;
	private ImageIcon ima;

	private String ruta2;

	private JLabel etiqueta, etiqueta2;
	private Image imagen1;
	private JTextField ruta;
	private Icon icono;
	private ImageIcon imagen2;
	private Icon icono2;

	public Fichero() {
		setLayout(null);
		setBounds(10, 120, 100, 150);
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder("Agregar"));

		caja2 = new JLabel();
		caja1 = new JLabel("Seleccionar archivo");
		boton1 = new JButton("Seleccionar");
		texto = new JTextField();
		texto2 = new JTextField();
		ruta = new JTextField();

		setBorder(BorderFactory.createTitledBorder("imagen"));
		setLayout(null);

		caja2.setBounds(0, 0, 200, 250);
		caja1.setBounds(10, 10, 210, 40);
		boton1.setBounds(40, 80, 110, 40);
		ruta.setBounds(20, 50, 250, 20);

		add(ruta);
		add(boton1);
		add(caja2);
		add(caja1);

		boton1.setActionCommand("uno");
		boton1.addActionListener(this);

		ima = new ImageIcon("C:\\Users\\exito79\\Pictures\\skul.png");
		icono = new ImageIcon(
				ima.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_DEFAULT));

		boton1.setIcon(icono);
		boton1.setActionCommand("unoMas");
		boton1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// if (e.getActionCommand().equals(boton1.getActionCommand())) {
		seleccionar();
		// }
	}

	public void seleccionar() {
		// Se esta creando el buscador
		String mensaje;
		JFileChooser seleccionador = new JFileChooser();// crear un objeto del buscador
		seleccionador.setDialogTitle("Nuevo fichero");
		seleccionador.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "*.jpg", "*.mp3");
		seleccionador.setFileFilter(filtro);

		int opcion = seleccionador.showSaveDialog(this);

		if (opcion == JFileChooser.APPROVE_OPTION) {
			ruta.setText(seleccionador.getSelectedFile().getAbsolutePath());
		}

		mensaje = ruta.getText();
		imagen2 = new ImageIcon(mensaje);
		icono2 = new ImageIcon(
		imagen2.getImage().getScaledInstance(caja2.getWidth(), caja2.getHeight(), Image.SCALE_DEFAULT));
		caja2.setIcon(icono2);
	}

}
