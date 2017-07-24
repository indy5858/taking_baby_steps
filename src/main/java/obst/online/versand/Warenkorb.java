package obst.online.versand;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

	List<Ware> inhalt;

	public Warenkorb() {
		inhalt = new ArrayList<>();
	}

	public void add(Ware ware) {
		inhalt.add(ware);
	}

}
