package modele.bien;

public class Appartement extends Bien {
	private int nbPiece;
	private int etage;
	private double chargeMensuelles;
	private double surface;
	
	public Appartement( int id, String nom, String Addresse, Orientation o,long prix,int nP, int e,double cM, double s) {
		super(id, nom, Addresse, o, prix);
		this.chargeMensuelles = cM;
		this.etage = e;
		this.nbPiece = nP;
		this.surface = s;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public double getChargeMensuelles() {
		return chargeMensuelles;
	}

	public void setChargeMensuelles(double chargeMensuelles) {
		this.chargeMensuelles = chargeMensuelles;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}
	
	public String toString(){
		return "ID Bien (Appartement) : " + this.getId() +
				"Nom : " + this.getNom() +  
				"\nAdresse : " + this.getAdresse() +
				"\nOrientation : " + this.getOriente()+
				"\nPrix : " + this.getPrix() + "€" +
				"\nEtage : " + this.getEtage() +
				"\nNombre de Pièce : " + this.getNbPiece() +
				"\nSurface: " + this.getSurface() +
				"\nCharges mensuelles : " + this.getChargeMensuelles() + "€";	
	}
}
