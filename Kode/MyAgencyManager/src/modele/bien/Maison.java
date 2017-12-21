package modele.bien;

public class Maison extends Bien {
	
	public Maison(int id,String nom, String Addresse, Orientation o,long prix,int nP, int nE, double sH, Terrain t, String mC) {
		super(id,nom , Addresse, o, prix,nP,nE,sH,t,mC);
	}

	
	public String toString(){
		return "ID Bien (Maison) : " + this.getId() + 
				"\nNom : " + this.getNom() + 
				"\nAdresse : " + this.getAdresse() +
				"\nOrientation : " + this.getOriente()+
				"\nPrix : " + this.getPrix() + "€" +
				"\nEtage(s) : " + this.getNbEtage() +
				"\nNombre de Pièce : " + this.getNbPiece() +
				"\nSurface: " + this.getSurfaceHabitable() +
				"\nMoyen de chauffage: " + this.getMoyenChauff() +
				"\nID Terrain : " + this.getTerrain().getId();	
	}
}
