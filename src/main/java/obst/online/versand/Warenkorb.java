package obst.online.versand;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

	private List<Produkt> inhalt;

	public Warenkorb() {
		inhalt = new ArrayList<>();
	}

	public void add(Produkt produktType) {
		inhalt.add(produktType);
	}

	public void add(int anzahl, Produkt produktType) {
		for (int i = 0; i < anzahl; i++) {
			inhalt.add(produktType);
		}
	}

	public int getPreis() {

		int gesamtPreis = 0;
		for (Produkt produkt : inhalt) {
			gesamtPreis += produkt.getPreis();
		}

		return gesamtPreis;
	}

}
