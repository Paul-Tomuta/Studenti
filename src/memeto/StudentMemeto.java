package memeto;

import java.util.ArrayList;

import data.Nota;


public class StudentMemeto {
	
	private String nume;
	private ArrayList<Nota> listaNote = new ArrayList<Nota>();
	private State state;
	
	public StudentMemeto(String nume, ArrayList<Nota> listaNote, State st) {
		
		this.nume = nume;
		this.listaNote = listaNote;
		this.state=st;
	}
	public State getState() {
		return state;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public ArrayList<Nota> getListaNote() {
		return listaNote;
	}
	public void setListaNote(ArrayList<Nota> listaNote) {
		this.listaNote = listaNote;
	}
	
	
	
	

}
