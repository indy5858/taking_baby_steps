package obstOnlineVersand;

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
		Warenkorp warenkorp = new Warenkorp();
		warenkorp.add(2, new Apfel());

		int gesamtPreis = kasse.getGesamtPreis(warenkorp);

		assertEquals(100, gesamtPreis);
	}
}
