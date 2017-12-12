package modele.bien;

public class Terrain extends Bien{
	private double surfaceTotale;
	private double longueurFacade;
	
	public Terrain(int id, String Addresse, Orientation o, double lF, double sT) {
		super(id, Addresse, o);
		this.longueurFacade = lF;
		this.surfaceTotale = sT;
	}

	public double getSurfaceTotale() {
		return surfaceTotale;
	}

	public void setSurfaceTotale(double surfaceTotale) {
		this.surfaceTotale = surfaceTotale;
	}

	public double getLongueurFacade() {
		return longueurFacade;
	}

	public void setLongueurFacade(double longueurFacade) {
		this.longueurFacade = longueurFacade;
	}

}
