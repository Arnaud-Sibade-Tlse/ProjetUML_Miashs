package modele.bien;

public class Terrain extends Bien{
	private double surfaceTotale;
	private double longueurFacade;
	
	public Terrain(int id, String nom, String Addresse, Orientation o,long prix, double lF, double sT) {
		super(id, nom, Addresse, o, prix);
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
		return "ID Bien (Terrain) : " + this.getId() + 
				"\nNom : " + this.getNom() + 
				"\nAdresse : " + this.getAdresse() +
				"\nOrientation : " + this.getOriente()+
				"\nPrix : " + this.getPrix() + "€" +
				"\nLongueur Facade : " + this.getLongueurFacade() +
				"\nSurface Totale : " + this.getSurfaceTotale();
	}
}
