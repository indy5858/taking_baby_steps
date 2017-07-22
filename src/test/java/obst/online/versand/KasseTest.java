package obst.online.versand;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import obst.online.versand.Apfel;
import obst.online.versand.Kasse;
import obst.online.versand.Warenkorb;

public class KasseTest {

	private Kasse kasse;

	@Before
	public void setUp() {
		kasse = new Kasse();
	}

	@Test
	public void getPreisVonZweiAepfeln() {
		Warenkorb warenkorb = new Warenkorb();
		warenkorb.add(2, new Apfel());

		int gesamtPreis = kasse.getGesamtPreis(warenkorb);

		assertEquals(100, gesamtPreis);
	}
}
