/*
package ui.frames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import data.ComboStudenti;
import ui.Command;
import ui.buttons.StergeStudentButton;

public class StergeStudentFrame extends JFrame implements ActionListener{

	JPanel mainPannel;
	JPanel firstPannel;

	ComboStudenti numeText;

	JLabel numeLabel;
	
	JLabel studenti;
	
	StergeStudentButton butonStergere;

	public StergeStudentFrame() {

		this.mainPannel = new JPanel();
		this.firstPannel = new JPanel();
		BoxLayout layout = new BoxLayout(mainPannel, BoxLayout.Y_AXIS);
		this.mainPannel.setLayout(layout);

		this.numeLabel = new JLabel("Nume");
		this.firstPannel.add(numeLabel);

		this.studenti = new JLabel();
		this.numeText = new ComboStudenti(studenti);
		this.numeText.addActionListener(this);
		
		this.firstPannel.add(numeText);
		this.firstPannel.add(studenti);
	
		
		
		this.butonStergere = new StergeStudentButton(this.numeText);
		this.butonStergere.addActionListener(this);
		this.firstPannel.add(butonStergere);
		
		this.mainPannel.add(firstPannel);
			
		this.add(mainPannel);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		((Command) e.getSource()).execute();
	}

}
*/