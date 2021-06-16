package data;

public class JudetClass {
	
	private String nume;
	private int cod;
	private String[] serie;
	
	public JudetClass(Judet nume, Judet cod, String[] serie) {
		
		this.nume = nume.getNume();
		this.cod = cod.getCod();
		
		this.serie = serie;
	}
	

}
