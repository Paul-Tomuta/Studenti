package data;

import java.util.ArrayList;
import java.util.Scanner;

import data.Nota;
import memeto.State;
import memeto.StudentMemeto;
import ui.Command;
import repo.Repository;
import ui.frames.AdaugaNotaFrame;
//import ui.frames.AllInclusiveFrame;
import ui.frames.ModificaNumeFrame;
import ui.frames.StergeNotaFrame;
import ui.frames.StergeStudentFrame;
import ui.frames.TabelFrame;



public class Student {

	private String nume;
	private ArrayList<Nota> listaNote = new ArrayList<Nota>();
	private State stare = State.NEW;

	public Student(String linie) {

		int nr = linie.indexOf(":");
		String num = linie.substring(0, nr);
		this.nume = num;
		String note = linie.substring(nr + 1);

		Scanner sc = new Scanner(note);
		sc.useDelimiter(",");

		String nota;

		while (sc.hasNext()) {

			nota = sc.next();

			int nr1 = nota.indexOf("(");
			int nr2 = nota.indexOf(")");

			String notaS = nota.substring(0, nr1);
			notaS = notaS.trim();
			String creditS = nota.substring(nr1 + 1, nr2);
			creditS = creditS.trim();

			int nota1 = Integer.parseInt(notaS);
			int credit = Integer.parseInt(creditS);

			Nota n1 = new Nota(nota1, credit);
			listaNote.add(n1);

		}

	}

	public Student(String nu, Nota n) {

		this.nume = nu;
		this.listaNote.add(n);
	}
	
	public Student(String nu, ArrayList nt) {
		
		this.nume=nu;
		this.listaNote=nt;
		
	}
	
	public Object clone() {
		Main.logger.info("Clonare");
		
		return new Student(this.nume, this.listaNote);
		
	}

	public ArrayList<Nota> getListaNote() {
		return listaNote;
	}

	public void setListaNote(ArrayList<Nota> listaNote) {
		this.listaNote = listaNote;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String toString() {
		return nume + ":" + listaNote.toString().substring(1, listaNote.toString().length() - 1);
	}


	
	public StudentMemeto memeto() {
		
		return new StudentMemeto(nume, listaNote,stare);
	}
	
	
	public void restoreMemeto(StudentMemeto std) {
		
		this.nume=std.getNume();
		this.listaNote=std.getListaNote();
		this.stare=std.getState();
		
		
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (listaNote == null) {
			if (other.listaNote != null)
				return false;
		} else if (!listaNote.equals(other.listaNote))
			return false;
		if (nume == null) {
			if (other.nume != null)
				return false;
		} else if (!nume.equals(other.nume))
			return false;
		return true;
	}

	public void adaugaNota(int not, int nrcredit) {

		Nota n1 = new Nota(not, nrcredit);
		listaNote.add(n1);

	}

	public void stergeNote(int not, int nrcredit) {

		// listaNote.remove(n);

		for (int i = 0; i < listaNote.size(); i++) {
			if (listaNote.get(i).getNota() == not && listaNote.get(i).getNrCredite() == nrcredit) {
				listaNote.remove(i);
				break;
			}
		}
	}

	

}
