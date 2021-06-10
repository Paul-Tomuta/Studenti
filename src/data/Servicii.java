package data;

import data.Student;
import data.Nota;

import java.util.function.Function;

public class Servicii {

	public final static Function<Student, Double> calculMedie = (Student s) -> {

		double ss = 0;

		for (Nota n : s.getListaNote())
			ss = ss + n.getNota();

		double m = ss / s.getListaNote().size();

		return m;

	};

	public final static Function<Student, Double> calculMediePonderta = (Student s) -> {

		double calcul = 0;

		for (Nota n : s.getListaNote())
			calcul = calcul + n.getNrCredite() * n.getNota();

		calcul = calcul / 30;

		return calcul;

	};

}
