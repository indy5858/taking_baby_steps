package obst.online.versand;

import static obst.online.versand.ObstTyp.APFEL;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class KasseTest {

	private Kasse kasse;

	@Before
	public void setUp() {
		kasse = new Kasse();
	}

	@Test
	public void getPreisVonZweiAepfeln() {
		Warenkorb warenkorb = new Warenkorb();
		warenkorb.add(new Ware(2, APFEL));

		int gesamtPreis = kasse.getGesamtPreis(warenkorb);

		assertEquals(100, gesamtPreis);
	}
}
