package ui;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;

import data.Main;
import data.Student;
import repo.Repository;

public class StudentsTable extends JTable {

	static String[] columns;
	static Object[][] data;

	private static ArrayList<Student> listaStudenti;

	static {

		listaStudenti = Repository.getInstance().getStudenti();

		int max = 0;
		for (Student v : listaStudenti) {

			if (v.getListaNote().size() > max) {

				max = v.getListaNote().size();
			}

		}
		
		int dimenStudent = listaStudenti.size();
		data = new Object[dimenStudent][max + 2];

		for (int i = 0; i < dimenStudent; i++) {
			for (int j = 0; j < max + 1; j++) {
				data[i][j] = "";
			}
		}

		columns = new String[max +2];
		Main.logger.info("MAXIM" + max);
		columns[0] = "Nume";
		
		for (int i = 0; i < max; i++) {
			
			columns[ i + 1] = "Nota";
			columns[ i + 2] = "Credit";
			i++;

		}

		int i = 0;
		for (Student student : listaStudenti) {
			data[i][0] = student.getNume();
			for (int j = 0; j < student.getListaNote().size(); j++) {
				data[i][j + 1] = student.getListaNote().get(j).getNota();
				data[i][j + 2] = student.getListaNote().get(j).getNrCredite();

			}
			i++;
		}

	}

	public StudentsTable() {
		super(data, columns);

	}

}
