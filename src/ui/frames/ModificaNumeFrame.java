package ui.frames;
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
import ui.buttons.ModificaNumeButton;

public class ModificaNumeFrame extends JFrame implements ActionListener {

	JPanel mainPannel;
	JPanel firstPannel;
	JPanel secondPannel;

	JTextField numeTextNume;
	JTextField numeTextModifica;

	JLabel numeLabel;
	JLabel modificaLael;

	ModificaNumeButton buttonModifica;

	public ModificaNumeFrame() {

		this.mainPannel = new JPanel();
		this.firstPannel = new JPanel();

		
		BoxLayout layout = new BoxLayout(mainPannel, BoxLayout.Y_AXIS);
		this.mainPannel.setLayout(layout);

		this.numeLabel = new JLabel("Introduceti numele");
		this.firstPannel.add(numeLabel);
		this.numeTextNume = new JTextField(15);
		this.firstPannel.add(numeTextNume);

		this.modificaLael = new JLabel("Introduceti numele schimbat");
		this.firstPannel.add(modificaLael);
		this.numeTextModifica = new JTextField(15);
		this.firstPannel.add(numeTextModifica);
		
		this.buttonModifica = new ModificaNumeButton(this.numeTextNume, this.numeTextModifica);
		this.buttonModifica.addActionListener(this);
		
		this.firstPannel.add(buttonModifica);
		this.mainPannel.add(firstPannel);

		this.add(mainPannel);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		((Command)e.getSource()).execute();
	}

}
