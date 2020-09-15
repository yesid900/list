package Vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;





public class Listas extends JPanel implements ActionListener{
	private JButton imagenes;
	private ImageIcon imagen;
	private Icon icono;
	private JTextField caja1;
	private JComboBox tabla;
	private JButton boton1;

	public Listas() {setLayout(null);
	setBounds(10, 320, 700, 350);
	setBorder(BorderFactory.createTitledBorder("fichero"));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder("Agregar"));
		caja1= new JTextField();
		caja1.setBounds(20, 30, 150, 20);
		add(caja1);

		tabla=new JComboBox();
		tabla.setBounds(190, 30, 150, 20);
		add(tabla);
		
		boton1= new JButton("Agregar");
		boton1.setBounds(260, 60, 80, 20);
		boton1.setActionCommand("sumatoria");
		boton1.addActionListener(this);
		add(boton1);
		
		//setBorder(BorderFactory.createTitledBorder("imagen de Boton"));
		//setLayout(null);
		
		//imagenes = new JButton("Agregar");
		//imagenes.setBounds(10, 150, 200, 90);
		
		
		//imagen= new ImageIcon("C:\\Users\\exito79\\Pictures\\imagen.jpg");
		//icono = new ImageIcon(imagen.getImage().getScaledInstance(imagenes.getWidth(), imagenes.getHeight(), Image.SCALE_DEFAULT));
		
		//imagenes.setIcon(icono);
		//imagenes.setActionCommand("unoMas");
		//imagenes.addActionListener(this);
		//add(imagenes);
		

		
	}
	public void actionPerformed(ActionEvent e) {
//		if(e.getActionCommand().equals(boton1.getAction())){
			String producto=caja1.getText();
			tabla.addItem(producto);
			caja1.setText(" ");
//			}
	}

}
