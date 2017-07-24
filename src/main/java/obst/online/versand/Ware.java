package obst.online.versand;

public class Ware {

	private int menge;
	private ObstTyp typ;

	public Ware(int menge, ObstTyp typ) {
		this.menge = menge;
		this.typ = typ;
	}

	public int getMenge() {
		return menge;
	}

	public ObstTyp getTyp() {
		return typ;
	}

}
