package ui.buttons;
import javax.swing.JButton;
import javax.swing.JTextField;

import data.ComboStudenti;
import repo.Repository;
import ui.Command;


public class StergeStudentButton extends JButton implements Command {
	
	JTextField numeText;
	
	
	
	public StergeStudentButton(JTextField studentTxtPrincipal) {
		super("Sterge Student");
		
		this.numeText=studentTxtPrincipal;
		

	}

	
	public void execute() {
	
		String numeStudent = numeText.getSelectedText().toString().trim();
		
		Repository.getInstance().stergeStudent(numeStudent);
		
	}

	

}
