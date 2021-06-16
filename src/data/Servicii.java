package data;

import data.Student;
import data.Nota;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

	public final static Predicate<Nota> getCredite = (n) -> {

		return n.getNota() >= 5 ? true : false;

	};

	public final static Predicate<Nota> getCredite2 = (n) -> n.getNota() >= 5;

	public final static Function<Nota, Integer> getCredite3 = n -> n.getNota() >= 5 ? n.getNrCredite() : 0;

	public final static Function<ArrayList<Nota>, Integer> totalCredite = l -> {

		return l.stream().mapToInt(n -> n.getNota() >= 5 ? n.getNrCredite() : 0).sum();

	};

	public final static Predicate<Student> promovat = s -> totalCredite.apply(s.getListaNote()) >= 20;

	public final static Consumer<ArrayList<Student>> afisareStudentiPromovati = l -> {

		l.stream().filter(promovat).forEach(System.out::println);

	};

//	public final static Predicate<Student> eFemeie = l-> l.getNume().trim().lastIndexOf(l.toString().charAt(l.toString().length()-1))   ; 

	public final static Predicate<Student> fomeie = l -> l.getNume().trim()
			.charAt(l.getNume().trim().length() - 1) == 'a';

	public final static Consumer<ArrayList<Student>> afisareFemei = l -> l.stream().filter(fomeie)
			.forEach(System.out::println);

	public final static BiFunction<String, ArrayList<Student>, Optional<Student>> searchStudent = (name, lista) -> { // clonare
																														// /prototipe
		Student obj = null;
		for (Student student : lista) {
			if (student.getNume().trim().equalsIgnoreCase(name.trim())) {
				obj = (Student) student.clone();
				System.out.println(obj);
				Optional<Student> cutieDeReturnat = Optional.of(obj);
				return cutieDeReturnat;
			}

		}
		return Optional.empty();

	};

	public final static Function<Student, Integer> celMaiMare = (Student s) -> {

		int count = 0;

		for (Nota n : s.getListaNote()) {
			if (n.getNota() > count)
				count = n.getNota();

		}
		return count;

	};

}
