package modele.bien;

public class Terrain extends Bien{
	private double surfaceTotale;
	private double longueurFacade;
	
	public Terrain(int id, String Addresse, Orientation o,long prix, double lF, double sT) {
		super(id, Addresse, o, prix);
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
	public String toString(){
		return "ID Bien (Maison) : " + this.getId() + 
				"\nAdresse : " + this.getAdresse() +
				"\nOrientation : " + this.getOriente()+
				"\nPrix : " + this.getPrix() + "€" +
				"\nLongueur Facade : " + this.getLongueurFacade() +
				"\nSurface Totale : " + this.getSurfaceTotale();
	}
}
