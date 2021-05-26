package ui.buttons;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import repo.Repository;
import ui.Command;

public class StergeNotaButton extends JButton implements Command {

	JTextField numeTxt;
	JComboBox<String> notaCombo;
	JComboBox<String> creditCombo;

	public StergeNotaButton(JTextField j, JComboBox<String> nc, JComboBox<String> cc) {
		super("Sterge Nota");
		this.numeTxt = j;
		this.notaCombo = nc;
		this.creditCombo = cc;

	}

	public void execute() {

		String numeStudent = numeTxt.getText().trim();

		int n = Integer.parseInt(notaCombo.getSelectedItem().toString());
		int c = Integer.parseInt(creditCombo.getSelectedItem().toString());


		Repository.getInstance().stergeNota(numeStudent, n, c);

	}

}
