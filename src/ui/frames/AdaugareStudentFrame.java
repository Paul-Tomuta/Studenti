package ui.frames;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ui.Command;
import ui.buttons.AdaugaStudentButton;

public class AdaugareStudentFrame extends JFrame implements ActionListener {

	JPanel mainPannel;
	JPanel bottomPanel;
	JPanel middlePanel;
	JPanel topPanel;

	JLabel numeLabel;
	JTextField numeTxt;

	JLabel notaLabel;
	JComboBox notaCombo;
	
	JComboBox creditCombo;
	JLabel nrCrediteLabel;

	AdaugaStudentButton adaugaStudentButton;

	public AdaugareStudentFrame() {

		this.mainPannel = new JPanel();
		BoxLayout layout = new BoxLayout(mainPannel, BoxLayout.Y_AXIS);
		this.mainPannel.setLayout(layout);
		
		this.bottomPanel = new JPanel();
		this.middlePanel = new JPanel();
		this.topPanel = new JPanel();

		this.numeLabel = new JLabel("Nume");
		this.topPanel.add(numeLabel);
		this.numeTxt = new JTextField(15);
		this.topPanel.add(numeTxt);

		this.notaLabel = new JLabel("Introduceti Nota");
		this.middlePanel.add(notaLabel);

		String[] v = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		this.notaCombo = new JComboBox<String>(v);

		String[] e = { "2", "4", "6" };
		this.creditCombo = new JComboBox<String>(e);

		this.nrCrediteLabel = new JLabel("Introduceti credite");
		this.middlePanel.add(nrCrediteLabel);
		this.middlePanel.add(notaCombo);
		this.middlePanel.add(creditCombo);

		this.adaugaStudentButton = new AdaugaStudentButton(this.numeTxt, this.notaCombo, this.creditCombo);
		this.adaugaStudentButton.addActionListener(this);
		this.bottomPanel.add(adaugaStudentButton);

		this.mainPannel.add(topPanel);
		this.mainPannel.add(middlePanel);
		this.mainPannel.add(bottomPanel);

		this.add(mainPannel);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		((Command)e.getSource()).execute();
	}

}
