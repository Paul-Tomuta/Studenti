package data;

import java.util.logging.Logger;

import repo.Repository;
import ui.frames.AdaugareStudentFrame;
import ui.frames.ModificaNumeFrame;
import ui.frames.TabelFrame;

public class Main {
	
	public static Logger logger = Logger.getAnonymousLogger();
	
	
	public static void main(String[] args) {

		Repository r = Repository.getInstance();
		// System.out.println(r);

		// Repository.getInstance().adaugaStudent(s1);
		// Repository.getInstance().stergeStudent(s1);
		//Nota n1 = new Nota(8, 6);
		// Student s1 = new Student("MARIAN SAHLEAN", n1);
		// Repository.getInstance().modificaNume("TOMUTA PAUL", "DARIUS POPESCU");
		// Nota n = new Nota(6, 4);
		// Repository.getInstance().adaugaNota(s1, n1);
		// Repository.getInstance().stergeNota(s1, n1);

		// Repository.getInstance().stergeStudent(s1);

		//AdaugareStudentFrame asf = new AdaugareStudentFrame();
		//StergeStudentFrame s2 = new StergeStudentFrame();
		 ModificaNumeFrame m1 = new ModificaNumeFrame();
		//	AdaugaNotaFrame nf = new AdaugaNotaFrame();
		// StergeNotaFrame sn1 = new StergeNotaFrame();
		// AllInclusiveFrame alli = new AllInclusiveFrame();

		// Repository.getInstance().stergeNota(s1, n1);
		
	//	TabelFrame tb = new TabelFrame();

	}

}
