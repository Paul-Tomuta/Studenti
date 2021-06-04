package ui.frames;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import ui.Command;
import ui.StudentsTable;

public class TabelFrame extends JFrame {

	JPanel mainPanne;
	JPanel topPannel;
	JPanel secondPannel;

	JLabel textLabel;

	StudentsTable tabel;

	public TabelFrame() {

		this.topPannel = new JPanel();
		this.mainPanne = new JPanel();
		BoxLayout layout = new BoxLayout(mainPanne, BoxLayout.Y_AXIS);
		this.mainPanne.setLayout(layout);
		this.secondPannel = new JPanel();

		this.textLabel = new JLabel("Vizualizare Studenti");

		this.topPannel.add(textLabel);
/*
		String[] column = { "Nume si prenume", "Nota", "Credit", "Nota", "Credit", "Nota", "Credit" };
		Object[][] data = new Object[][] { { "Popescu Ionut", 5, 1, 4, 7, 8, 6 }, { "Darie Ana", 5, 7, 8, 9, 6, 2, },
				{ "Balint Adela", 7, 8, 9, 5, 2, 1, 4 } };
*/
		this.tabel = new StudentsTable();

		this.secondPannel.add(new JScrollPane(tabel));
		tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		this.mainPanne.add(topPannel);
		this.mainPanne.add(secondPannel);

		this.add(mainPanne);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}
