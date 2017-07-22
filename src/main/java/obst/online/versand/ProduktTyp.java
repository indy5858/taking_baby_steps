package obst.online.versand;

public enum ProduktTyp {

	APFEL(50, 50);

	private int preisInCt;
	private int gewichtInG;

	private ProduktTyp(int preisInCt, int gewichtInG) {
		this.preisInCt = preisInCt;
		this.gewichtInG = gewichtInG;
	}

	public int getPreisProEinheit() {
		return preisInCt;
	}

	public int getGewichtProEinheit() {
		return gewichtInG;
	}

}
