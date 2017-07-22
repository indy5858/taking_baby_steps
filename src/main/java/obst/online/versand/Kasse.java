package obst.online.versand;

import java.util.HashMap;
import java.util.Map;

public class Kasse {

	Map<ObstTyp, Integer> preise = new HashMap<>();

	public Kasse() {
		preise.put(ObstTyp.APFEL, 50);
	}

	public int getGesamtPreis(Warenkorb warenkorb) {
		int gesamtPreis = 0;
		for (Ware ware : warenkorb.inhalt) {
			gesamtPreis += preise.get(ware.getTyp()) * ware.getMenge();
		}

		return gesamtPreis;
	}
}
