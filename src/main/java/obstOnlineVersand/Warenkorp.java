package obstOnlineVersand;
import java.util.ArrayList;
import java.util.List;

public class Warenkorp {

	private List<Produkt> inhalt;

	public Warenkorp() {
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
			gesamtPreis += produkt.getPreisInCt();
		}

		return gesamtPreis;
	}

}
