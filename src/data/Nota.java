package data;

public class Nota {

	private int nota;
	private int nrCredite;

	public Nota(int nota, int nrCredite) {

		this.nota = nota;
		this.nrCredite = nrCredite;
	}

	public String toString() {
		return nota+"("+nrCredite+")";
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


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		if (nota != other.nota)
			return false;
		if (nrCredite != other.nrCredite)
			return false;
		return true;
	}
	

	
}
