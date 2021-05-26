package data;

import java.util.ArrayList;
import java.util.Scanner;

import data.Nota;
import ui.Command;
import repo.Repository;
import ui.frames.AdaugaNotaFrame;
import ui.frames.AllInclusiveFrame;
import ui.frames.ModificaNumeFrame;
import ui.frames.StergeNotaFrame;
//import ui.frames.StergeStudentFrame;


public class Student {

	private String nume;
	private ArrayList<Nota> listaNote = new ArrayList<Nota>();

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

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaNote == null) ? 0 : listaNote.hashCode());
		result = prime * result + ((nume == null) ? 0 : nume.hashCode());
		return result;
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

	public void adaugaNota(int not , int nrcredit) {


		Nota n1 =  new Nota(not, nrcredit);
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

	public static void main(String[] args) {

		Repository r = Repository.getInstance();
		// System.out.println(r);

		// Repository.getInstance().adaugaStudent(s1);
		// Repository.getInstance().stergeStudent(s1);
		Nota n1 = new Nota(8, 6);
		Student s1 = new Student("MARIAN SAHLEAN", n1);
		// Repository.getInstance().modificaNume("TOMUTA PAUL", "DARIUS POPESCU");
		// Nota n = new Nota(6, 4);
		// Repository.getInstance().adaugaNota(s1, n1);
		// Repository.getInstance().stergeNota(s1, n1);

		// Repository.getInstance().stergeStudent(s1);

		// StergeStudentFrame s2 = new StergeStudentFrame();
		// ModificaNumeFrame m1 = new ModificaNumeFrame();
		// AdaugaNotaFrame n1 = new AdaugaNotaFrame();
		// StergeNotaFrame sn1 = new StergeNotaFrame();
		AllInclusiveFrame alli = new AllInclusiveFrame();

	//	 Repository.getInstance().stergeNota(s1, n1);

	}

}
