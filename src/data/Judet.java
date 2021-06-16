package data;

enum Judet {

	Alba("Alba", 1), Arad("Arad", 2), Arges("Arges", 3), Bacau("Bacau", 4), Bihor("Bihor", 5),
	BistritaNasaud("Bistrita-Nasaud", 6), Botosani("Botosani", 7), Brasov("Brasov", 8), Braila("Braila", 9),
	Buzau("Buzau", 10), CarasSeverin("Caras-Severin", 11), Cluj("Cluj", 12), Constanta("Constanta", 13),
	Covasna("Covasna", 14), Dambovita("Dambovita", 15), Dolj("Dolj", 16), Galati("Galati", 17), Gorj("Gorj", 18),
	Harghita("Harghita", 19), Hunedoara("Hunedoara", 20), Ialomita("Ialomita", 21), Iasi("Iasi", 22),
	Ilfov("Ilfov", 23), Maramures("Maramures", 24), Mehedinti("Mehedinti", 25), Mures("Mures", 26), Neamt("Neamt", 27),
	Olt("Olt", 28), Prahova("Prahova", 29), SatuMare("Satu Mare", 30), Salaj("Salaj", 31), Sibiu("Sibiu", 32),
	Suceava("Suceava", 33), Teleorman("Teleorman", 34), Timis("Timis", 35), Tulcea("Tulcea", 36), Vaslui("Vaslui", 37),
	Valcea("Valcea", 38), Vrancea("Vrancea", 39), Bucuresti("Bucuresti", 40),
	BucurestiSector1("Bucuresti - Sector 1", 41), BucurestiSector2("Bucuresti - Sector 2", 42),
	BucurestiSector3("Bucuresti - Sector 3", 43), BucurestiSector4("Bucuresti - Sector 4", 44),
	BucurestiSector5("Bucuresti - Sector 5", 45), BucurestiSector6("Bucuresti - Sector 6", 46),
	Calarasi("Calarasi", 51), Giurgiu("Giurgiu", 52);

	public static Judet getJudet(int index) {
		switch (index) {

		case 1:
			return Alba;
		case 2:
			return Arad;
		case 3:
			return Arges;
		case 4:
			return Bacau;
		case 5:
			return Bihor;
		case 6:
			return BistritaNasaud;
		case 7:
			return Botosani;
		case 8:
			return Brasov;
		case 9:
			return Braila;
		case 10:
			return Buzau;
		case 11:
			return CarasSeverin;
		case 12:
			return Cluj;
		case 13:
			return Constanta;
		case 14:
			return Covasna;
		case 15:
			return Dambovita;
		case 16:
			return Dolj;
		case 17:
			return Galati;
		case 18:
			return Gorj;
		case 19:
			return Harghita;
		case 20:
			return Hunedoara;
		case 21:
			return Ialomita;
		case 22:
			return Iasi;
		case 23:
			return Ilfov;
		case 24:
			return Maramures;
		case 25:
			return Mehedinti;
		case 26:
			return Mures;
		case 27:
			return Neamt;
		case 28:
			return Olt;
		case 29:
			return Prahova;
		case 30:
			return SatuMare;
		case 31:
			return Salaj;
		case 32:
			return Sibiu;
		case 33:
			return Suceava;
		case 34:
			return Teleorman;
		case 35:
			return Timis;
		case 36:
			return Tulcea;
		case 37:
			return Vaslui;
		case 38:
			return Valcea;
		case 39:
			return Vrancea;
		case 40:
			return Bucuresti;
		case 41:
			return BucurestiSector1;
		case 42:
			return BucurestiSector2;
		case 43:
			return BucurestiSector3;
		case 44:
			return BucurestiSector4;
		case 45:
			return BucurestiSector5;
		case 46:
			return BucurestiSector6;
		case 47:
			return Calarasi;
		case 48:
			return Giurgiu;
		default:
			return Giurgiu;

		}

	}

	public String getNume() {
		return nume;
	}

	public int getCod() {
		return cod;
	}

	protected String nume;
	protected int cod;

	private Judet(String n, int c) {
		this.nume = n;
		this.cod = c;

	}
}
