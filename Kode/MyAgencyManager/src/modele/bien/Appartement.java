package modele.bien;

public class Appartement extends Bien {
	
	public Appartement( int id, String nom, String Addresse, Orientation o,long prix,int nP, int e,double cM, double s) {
		super(id, nom, Addresse, o, prix,e,nP,cM,s);
	}
	
	public String toString(){
		return "ID Bien (Appartement) : " + this.getId() +
				"\nNom : " + this.getNom() +  
				"\nAdresse : " + this.getAdresse() +
				"\nOrientation : " + this.getOriente()+
				"\nPrix : " + this.getPrix() + "€" +
				"\nEtage : " + this.getEtage() +
				"\nNombre de Pièce : " + this.getNbPiece() +
				"\nSurface: " + this.getSurface() +
				"\nCharges mensuelles : " + this.getChargeMensuelles() + "€";	
	}
}
