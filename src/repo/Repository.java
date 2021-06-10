package repo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

import data.Nota;
import data.Student;
import memeto.NotaMemeto;
import memeto.StudentMemeto;
import ui.Observer;

public class Repository {

	private ArrayList<Student> studenti = new ArrayList<Student>();
	private ArrayList<Observer> observatori = new ArrayList<Observer>();
	
	private StudentMemeto memetoStudent;
	private NotaMemeto memetoNota;

	private static Repository obiectCreeat = null;

	private Repository() {

		try {

			File f1 = new File("studenti.txt");
			Scanner sc = new Scanner(f1);

			while (sc.hasNextLine()) {

				String linie = sc.nextLine();

				Student s1 = new Student(linie);
				studenti.add(s1);

			}

		} catch (Exception e) {

		}

	}

	public static Repository getInstance() {
		if (obiectCreeat == null) {
			obiectCreeat = new Repository();
			return obiectCreeat;
		} else
			return obiectCreeat;

	}

	public String toString() {
		return "Repository [studenti=" + studenti + "]";
	}

	public void adaugaStudent(Student s) { // singleton
		data.Main.logger.info("Studentul: " + s.toString() + " a fost adaugat in repo");
		studenti.add(s);

		suprasciereDb();
		notifyAllObservers();

	}

	public void stergeStudent(String nume) {

		for (int i = 0; i < studenti.size(); i++) {
			if (studenti.get(i).getNume().toString().contains(nume)) {
				studenti.remove(i);
				break;
			}
		}

		suprasciereDb();
		notifyAllObservers();

	}


	public void modificaNume(String nv, String nn) {

		for (int i = 0; i < studenti.size(); i++) {

			if (studenti.get(i).getNume().equals(nv)) {

				studenti.get(i).setNume(nn);
				suprasciereDb();
				notifyAllObservers();

			}

		}

	}

	public void adaugaNota(String numeStudent, int nota, int nrCredite) {

		for (int i = 0; i < studenti.size(); i++) {

			if (studenti.get(i).toString().contains(numeStudent)) {

				studenti.get(i).adaugaNota(nota, nrCredite);

			}

		}

		suprasciereDb();
		notifyAllObservers();

	}

	public void stergeNota(String numeStudent, int nota, int nrCredite) {

		for (int i = 0; i < studenti.size(); i++) {
			if (studenti.get(i).getNume().equals(numeStudent)) {
				studenti.get(i).stergeNote(nota, nrCredite);
			}

		}
		suprasciereDb();
		notifyAllObservers();

	}

	public void addObserver(Observer o) {

		observatori.add(o);

	}

	public void reloveObservator(Observer o) {

		observatori.remove(o);
	}

	public ArrayList<Student> getStudenti() {
		return studenti;
	}

	public StudentMemeto getMemetoStudent() {
		return memetoStudent;
	}

	public void setMemetoStudent(StudentMemeto memetoStudent) {
		this.memetoStudent = memetoStudent;
	}

	public NotaMemeto getMemetoNota() {
		return memetoNota;
	}

	public void setMemetoNota(NotaMemeto memetoNota) {
		this.memetoNota = memetoNota;
	}

	public void notifyAllObservers() {

		for (Observer o : observatori)
			o.update();

	}

	private void suprasciereDb() {
		try {

			File filewriter = new File("studenti.txt");
			PrintWriter printwriter = new PrintWriter(filewriter);
			for (int a = 0; a < studenti.size(); a++) {

				printwriter.println(studenti.get(a).toString());
			}

			printwriter.close();

		} catch (Exception e) {
		}
	}

}
