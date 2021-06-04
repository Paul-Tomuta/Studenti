package combo;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import data.Student;
import repo.Repository;
import ui.Command;
import ui.Observer;

public class ComboStudentiModifica extends JComboBox implements Observer, Command {

	private static ArrayList<Student> listaStudent;
	private static Vector<String> v = new Vector<String>();

	JTextField studenti;

	static {
		listaStudent = Repository.getInstance().getStudenti();
		for (Student student : listaStudent) {
			v.add(student.getNume());

		}

	}

	public ComboStudentiModifica(JTextField s) {
		super(v);

		this.studenti = s;
		Repository.getInstance().addObserver(this);

	}

	public void update() {
		this.removeAllItems();
		ArrayList<Student> lista = Repository.getInstance().getStudenti();
		for (Student student : lista) {
			this.addItem(student.getNume());

		}

	}

	public void execute() {

		String studentSelectat = this.getSelectedItem().toString().trim();

		studenti.setText(studentSelectat);

	}

	public Object getSelectedText() {
		// TODO Auto-generated method stub
		return null;
	}

}
