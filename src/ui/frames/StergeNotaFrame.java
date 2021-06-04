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
import ui.buttons.StergeNotaButton;

public class StergeNotaFrame extends JFrame implements ActionListener {

	JPanel mainPannel;
	JPanel firstPannel;
	JPanel secondPannel;
	
	JTextField numeField;
	JLabel numeTextLabel;

	JLabel notaLabel;
	JComboBox notaCombo;
	
	JComboBox creditCombo;
	JLabel nrCrediteLabel;

	StergeNotaButton stergeNotaButton;

	public StergeNotaFrame() {

		this.mainPannel = new JPanel();
		BoxLayout layout = new BoxLayout(mainPannel, BoxLayout.Y_AXIS);
		this.mainPannel.setLayout(layout);

		this.firstPannel = new JPanel();
		this.secondPannel = new JPanel();

		this.numeTextLabel = new JLabel("Introduceti studentu");
		this.firstPannel.add(numeTextLabel);
		this.numeField = new JTextField(15);
		this.firstPannel.add(numeField);

		this.notaLabel = new JLabel("Selectati nota");
		this.secondPannel.add(notaLabel);
		String[] v = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		this.notaCombo = new JComboBox<String>(v);
		this.secondPannel.add(notaCombo);
		
		this.nrCrediteLabel = new JLabel("Selectati creditu");
		this.secondPannel.add(nrCrediteLabel);
		String[] x = { "2", "4", "6" };
		this.creditCombo = new JComboBox<String>(x);
		this.secondPannel.add(creditCombo);

		this.stergeNotaButton = new StergeNotaButton(this.numeField, this.notaCombo, this.creditCombo);
		this.stergeNotaButton.addActionListener(this);
		this.secondPannel.add(stergeNotaButton);

		this.mainPannel.add(firstPannel);
		this.mainPannel.add(secondPannel);
		this.add(mainPannel);
		
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		((Command) e.getSource()).execute();
	}

}
