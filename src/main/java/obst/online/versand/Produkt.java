package obst.online.versand;

public class Produkt {

	private int menge;
	private ProduktTyp typ;

	public Produkt(int menge, ProduktTyp typ) {
		this.menge = menge;
		this.typ = typ;
	}

	public int getPreis() {
		return typ.getPreisProEinheit() * menge;
	}
}
