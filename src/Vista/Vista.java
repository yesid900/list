package Vista;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Vista.Vista;



public class Vista extends JFrame{
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	public Vista() {
		setSize(800,600);
		setTitle("Inicio");
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel1= new Listas();
		panel1.setBounds(05, 10, 480, 100);
		panel1.setBackground(java.awt.Color.white);
		add(panel1);
		
		panel2= new Fichero();
		panel2.setBounds(05, 90, 480, 120);
		panel2.setBackground(java.awt.Color.gray);
		add(panel2);
		
		panel3= new Detodo();
		panel3.setBounds(05, 230, 480, 580);
		panel3.setBackground(java.awt.Color.gray);
		add(panel3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vista objetoVista = new Vista();
		objetoVista.setVisible(true);
	}

}
