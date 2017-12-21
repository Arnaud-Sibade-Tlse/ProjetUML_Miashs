package modele.bien;

public class Terrain extends Bien{
	
	public Terrain(int id, String nom, String Addresse, Orientation o,long prix, double lF, double sT) {
		super(id, nom, Addresse, o, prix,lF,sT);
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
