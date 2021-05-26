 package ui.frames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ui.Command;
import ui.buttons.AdaugaNotaButton;
import ui.buttons.AdaugaStudentButton;
import ui.buttons.ModificaNumeButton;
import ui.buttons.StergeNotaButton;
import ui.buttons.StergeStudentButton;

import repo.Repository;
import data.ComboStudenti;
import data.Nota;
import data.Student;


public class AllInclusiveFrame extends JFrame implements ActionListener {

	JPanel mainPannel;
	JPanel firstPannel;
	JPanel secondPannel;
	JPanel lastPannel;
	
	JTextField studentTxtPrincipal;
	JTextField studentModifica;
	
	JLabel studentTxtPrincipalLabel;
	JLabel studentMofificaLabel;
	
	JComboBox adaugaNotaCombo;
	JComboBox adaugaCreditCombo;
	
	
	JLabel adaugaNotaLabel;
	JLabel adaugaCreditLabel;
	
	AdaugaNotaButton adaugaNotaButton;
	AdaugaStudentButton adaugaStudentButton;
	ModificaNumeButton modificaNumeButton;
	StergeNotaButton stergeNotaButton;
	StergeStudentButton stergeStudentButton;
	JLabel studenti;
	ComboStudenti numeText;
	
	
	public AllInclusiveFrame() {
		
		this.mainPannel = new JPanel();
		BoxLayout layout = new BoxLayout(mainPannel,BoxLayout.Y_AXIS);
		this.firstPannel = new JPanel();
		this.secondPannel = new JPanel();
		this.lastPannel = new JPanel();
		
		this.studentTxtPrincipalLabel = new JLabel("Add Student");
		this.firstPannel.add(studentTxtPrincipalLabel);
		
		this.studentTxtPrincipal = new JTextField(15);
		this.firstPannel.add(studentTxtPrincipal);
		
		this.studentMofificaLabel = new JLabel("Add second");
		this.firstPannel.add(studentMofificaLabel);
		
		this.studentModifica = new JTextField(15);
		this.firstPannel.add(studentModifica);
		
		
		this.adaugaNotaLabel = new JLabel("Select Nota");
		this.secondPannel.add(adaugaNotaLabel);
		
		String[] v = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		this.adaugaNotaCombo = new JComboBox<String>(v);
		this.secondPannel.add(adaugaNotaCombo);
		
		this.adaugaCreditLabel = new JLabel("Select Credit");
		this.secondPannel.add(adaugaCreditLabel);
		
		String[] c = {"2","4","6"};
		this.adaugaCreditCombo = new JComboBox<String>(c);
		this.secondPannel.add(adaugaCreditCombo);
		
		
		
		this.adaugaNotaButton = new AdaugaNotaButton(this.studentTxtPrincipal,this.adaugaNotaCombo , this.adaugaCreditCombo);
		this.adaugaNotaButton.addActionListener(this);
		this.lastPannel.add(adaugaNotaButton);
		
		this.adaugaStudentButton = new AdaugaStudentButton(this.studentTxtPrincipal, this.adaugaNotaCombo, this.adaugaCreditCombo);
		this.adaugaStudentButton.addActionListener(this);
		this.lastPannel.add(adaugaStudentButton);
		
		this.modificaNumeButton = new ModificaNumeButton(this.studentTxtPrincipal, this.studentModifica);
		this.modificaNumeButton.addActionListener(this);
		this.lastPannel.add(modificaNumeButton);
		
		this.stergeNotaButton = new StergeNotaButton(this.studentTxtPrincipal, this.adaugaNotaCombo, this.adaugaCreditCombo);
		this.stergeNotaButton.addActionListener(this);
		this.lastPannel.add(stergeNotaButton);
		
		this.stergeStudentButton = new StergeStudentButton(this.studentTxtPrincipal);
		this.stergeStudentButton.addActionListener(this);
		this.lastPannel.add(stergeStudentButton);
		
		this.studenti = new JLabel();
		this.numeText = new ComboStudenti(studenti);
		this.numeText.addActionListener(this);
		
		this.mainPannel.add(firstPannel);
		this.mainPannel.add(secondPannel);
		this.mainPannel.add(lastPannel);
		
		this.add(mainPannel);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		((Command) e.getSource()).execute();
	}

}
