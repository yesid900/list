package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTree;

public class Detodo extends JPanel implements ActionListener {
	private JRadioButton radio1, radio2;
	private JCheckBox check1, check2;
	private JSeparator separ1, separ2;
	private JLabel label1, label2, label3;
	private JSpinner spin;
	private JButton boton;
	private String Materia;
	private int numero1;
	private String Materia2;
	
	public Detodo() {
		
	setLayout(null);
	setBounds(10, 320, 700, 350);
	setBorder(BorderFactory.createTitledBorder("De todo"));
	
	radio1 = new JRadioButton("Fundamentos");
	radio2 = new JRadioButton("Programacion");
	check1 = new JCheckBox("Domir");
	check2 = new JCheckBox("Estudiar");
	separ1 = new JSeparator();
	separ2 = new JSeparator();
	label1 = new JLabel();
	label2 = new JLabel();
	label3 = new JLabel();
	spin = new JSpinner();
	boton = new JButton("Seleccionar");
	
	radio1.setBounds(20, 50, 250, 20);
	radio2.setBounds(20, 70, 250, 20);
	check1.setBounds(20, 130, 250, 20);
	check2.setBounds(20, 150, 250, 20);
	separ1.setBounds(20, 100, 250, 20);
	separ2.setBounds(20, 180, 250, 20);
	label1.setBounds(20, 20, 250, 20);
	label2.setBounds(20, 110, 250, 20);
	label3.setBounds(20, 190, 250, 20);
	spin.setBounds(20, 210, 250, 20);
	boton.setBounds(20, 250, 120, 20);
	
	boton.setActionCommand("uno");
	boton.addActionListener(this);
	
	label1.setText("Que nivel de progrmacion tiene");
	label2.setText("Que haces el fin de semana");
	label3.setText("Cuentas horas duermes en el dia");
	
	add(radio1);
	add(radio2);
	add(label2);
	add(label1);
	add(label3);
	add(separ1);
	add(separ2);
	add(check1);
	add(check2);
	add(spin);
	add(boton);
	
	

}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		radioButon ();
		CheckBox ();
		seleccionadoras();
		
	}
	public void radioButon (){
		
		JRadioButton [] arreglo ={radio1, radio2};
		
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo [i].isSelected()==true) {
			Materia=arreglo[i].getText();
				
			}
		}
	}
		public void CheckBox (){
			String Materia2;
			JCheckBox [] arreglo2 ={check1, check2};
			
			for (int i = 0; i < arreglo2.length; i++) {
				if(arreglo2 [i].isSelected()==true) {
				Materia=arreglo2[i].getText();
					
				}
			}
		
	}
		public void seleccionadoras(){
			numero1= (int) spin.getValue();
			
		}
		
		public void mensaje(){
			
			
		}
	}
 