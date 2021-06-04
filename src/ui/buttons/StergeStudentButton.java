package ui.buttons;

import javax.swing.JButton;
import javax.swing.JTextField;

import combo.ComboStudenti;
import repo.Repository;
import ui.Command;

public class StergeStudentButton extends JButton implements Command {

	ComboStudenti numeText;

	public StergeStudentButton(ComboStudenti numeText2) {
		super("Sterge Student");

		this.numeText = numeText2;

	}

	public void execute() {

		String numeStudent = numeText.getSelectedItem().toString().trim();

		Repository.getInstance().stergeStudent(numeStudent);

	}

}
