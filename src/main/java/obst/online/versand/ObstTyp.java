package obst.online.versand;

public enum ObstTyp {

	APFEL(50);

	private int gewichtInG;

	private ObstTyp(int gewichtInG) {
		this.gewichtInG = gewichtInG;
	}

	public int getGewichtProEinheit() {
		return gewichtInG;
	}

}
