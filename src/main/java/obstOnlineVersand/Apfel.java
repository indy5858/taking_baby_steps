package obstOnlineVersand;
public class Apfel implements Produkt {

	private final int preisInCt = 50;
	private final int gewichtInG = 50;

	@Override
	public int getGewichtInG() {
		return gewichtInG;
	}

	@Override
	public int getPreisInCt() {
		return preisInCt;
	}
}
