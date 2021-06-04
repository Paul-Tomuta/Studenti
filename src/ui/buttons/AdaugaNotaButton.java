package ui.buttons;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import combo.ComboStudenti;
import data.Nota;
import data.Student;
import repo.Repository;
import ui.Command;

public class AdaugaNotaButton extends JButton implements Command {

	ComboStudenti numeTxt;
	JComboBox<String> notaCombo;
	JComboBox<String> creditCombo;

	public AdaugaNotaButton(ComboStudenti j, JComboBox<String> nc, JComboBox<String> cc) {
		super("Adauga nota");
		this.numeTxt = j;
		this.notaCombo = nc;
		this.creditCombo = cc;

	}

	public void execute() {

		String numeStudent = numeTxt.getSelectedItem().toString().trim();

		int n = Integer.parseInt(notaCombo.getSelectedItem().toString());
		int c = Integer.parseInt(creditCombo.getSelectedItem().toString());

		Repository.getInstance().adaugaNota(numeStudent, n, c);

	}

}
