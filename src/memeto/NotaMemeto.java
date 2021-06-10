package memeto;

public class NotaMemeto {
	
	private int nota;
	private int nrCredite;
	private State state;
	public NotaMemeto(int nota, int nrCredite, State state) {
		
		this.nota = nota;
		this.nrCredite = nrCredite;
		this.state = state;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public int getNrCredite() {
		return nrCredite;
	}
	public void setNrCredite(int nrCredite) {
		this.nrCredite = nrCredite;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
	

}
