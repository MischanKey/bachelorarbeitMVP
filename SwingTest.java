package Swing3.gui;

import javax.swing.Action;

import Swing2.dbaccess.DBaccess;

public class SwingTest {
	
	JButton b_Suchen = new JButton("Suchen");
	
	b_Suchen.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
				int mnr = new Integer(tf_MNR.getText());
				Student student = DBaccess.getStudentByMNR(mnr);
				if (student!= null)
				{
					1_Nachmane.setText(student.getNachname());
					1_Name.setText(student.getName());
				}else
				{	
					1_Nachame.setText("Not found !");
					1_Name.setText("");
				}
				
	}	
		
	});
		
