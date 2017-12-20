package modele.bien;

public class Maison extends Bien {
	private int nbPiece;
	private int nbEtage;
	private double surfaceHabitable;
	private Terrain terrain;
	private String moyenChauff;
	
	public Maison(int id,String nom, String Addresse, Orientation o,long prix,int nP, int nE, double sH, Terrain t, String mC) {
		super(id,nom , Addresse, o, prix);
		this.nbPiece = nP;
		this.nbEtage = nE;
		this.surfaceHabitable = sH;
		this.terrain = t;
		this.moyenChauff = mC;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public int getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}

	public double getSurfaceHabitable() {
		return surfaceHabitable;
	}

	public void setSurfaceHabitable(double surfaceHabitable) {
		this.surfaceHabitable = surfaceHabitable;
	}

	public Terrain getTerrain() {
		return terrain;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public String getMoyenChauff() {
		return moyenChauff;
	}

	public void setMoyenChauff(String moyenChauff) {
		this.moyenChauff = moyenChauff;
	}
	
	public String toString(){
		return "ID Bien (Maison) : " + this.getId() + 
				"Nom : " + this.getNom() + 
				"\nAdresse : " + this.getAdresse() +
				"\nOrientation : " + this.getOriente()+
				"\nPrix : " + this.getPrix() + "�" +
				"\nEtage(s) : " + this.getNbEtage() +
				"\nNombre de Pi�ce : " + this.getNbPiece() +
				"\nSurface: " + this.getSurfaceHabitable() +
				"\nMoyen de chauffage: " + this.getMoyenChauff() +
				"\nID Terrain : " + this.getTerrain().getId();	
	}
}
