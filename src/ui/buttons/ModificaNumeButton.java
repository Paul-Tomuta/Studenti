package ui.buttons;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import repo.Repository;
import ui.Command;

public class ModificaNumeButton extends JButton implements Command {

	JTextField numeTxtNume;
	JTextField numeTxtModifica;

	public ModificaNumeButton(JTextField ntn, JTextField ntm) {
		super("Modifica");

		this.numeTxtNume = ntn;
		this.numeTxtModifica = ntm;

	}

	public void execute() {

		String numeStdudent = numeTxtNume.getText();
		String numeStdeuntMofigica = numeTxtModifica.getText();

	//	Student s1 = new Student(numeStdudent);

		Repository.getInstance().modificaNume(numeStdudent, numeStdeuntMofigica);

	}

}
