package data;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
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
		 
		 Nota n1 = new Nota(10, 3);
		 Student s1 = new Student("POPESCU ANDREEA", n1);
		// Repository.getInstance().modificaNume("TOMUTA PAUL", "DARIUS POPESCU");
		 s1.adaugaNota(10, 2);
		 s1.adaugaNota(10, 1);
		 s1.adaugaNota(6, 4);
		 s1.adaugaNota(7, 5);
		 s1.adaugaNota(5,5);
		 s1.adaugaNota(10, 4);
		 s1.adaugaNota(10, 2);
		 s1.adaugaNota(5, 4);
		 
		// Repository.getInstance().adaugaNota(s1, n1);
		// Repository.getInstance().stergeNota(s1, n1);

		// Repository.getInstance().stergeStudent(s1);

		// AdaugareStudentFrame asf = new AdaugareStudentFrame();
		// StergeStudentFrame s2 = new StergeStudentFrame();
		// ModificaNumeFrame m1 = new ModificaNumeFrame();
		// AdaugaNotaFrame nf = new AdaugaNotaFrame();
		// StergeNotaFrame sn1 = new StergeNotaFrame();
		// AllInclusiveFrame alli = new AllInclusiveFrame();

		// Repository.getInstance().stergeNota(s1, n1);

		// TabelFrame tb = new TabelFrame();
//	double m =	 Servicii.calculMedie.apply(s1);
//	System.out.println(m);
	
//	double s = Servicii.calculMediePonderta.apply(s1);
//	System.out.println(s);
	
//	Servicii.afisareStudentiPromovati.accept(Repository.getInstance().getStudenti());
	
/*	Optional<Student> studentGasit = Servicii.searchStudent.apply("TANASA RALUCA", Repository.getInstance().getStudenti());
	if(studentGasit.isEmpty())
		System.out.println("Nu am gasit studentu");
	else
		System.out.println("Student gasit"+studentGasit.get().toString());
	
	}
*/
		 
		System.out.println( Servicii.celMaiMare.apply(s1));
		 
}
}
	
