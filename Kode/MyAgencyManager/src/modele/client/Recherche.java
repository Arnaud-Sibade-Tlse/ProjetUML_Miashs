package modele.client;

import modele.bien.Orientation;

public class Recherche {
	private Orientation orient;
	private double surfaceTotal;
	private double longueurFacade;
	private double surfaceHabitable;
	private int nbEtage;
	private String moyenChauff;
	private int nbPiece;
	private int etage;
	private double chargeMensuelles;
	
	public Recherche(){
		this.setOrient(null);
		this.setSurfaceHabitable(0);
		this.setSurfaceTotal(0);
		this.setLongueurFacade(0);
		this.setNbEtage(0);
		this.setNbPiece(0);
		this.setMoyenChauff(null);
		this.setChargeMensuelles(0);
		this.setEtage(0);
		
	}

	public Orientation getOrient() {
		return orient;
	}

	public void setOrient(Orientation orient) {
		this.orient = orient;
	}

	public double getSurfaceTotal() {
		return surfaceTotal;
	}

	public void setSurfaceTotal(double surfaceTotal) {
		this.surfaceTotal = surfaceTotal;
	}

	public double getLongueurFacade() {
		return longueurFacade;
	}

	public void setLongueurFacade(double longueurFacade) {
		this.longueurFacade = longueurFacade;
	}

	public double getSurfaceHabitable() {
		return surfaceHabitable;
	}

	public void setSurfaceHabitable(double surfaceHabitable) {
		this.surfaceHabitable = surfaceHabitable;
	}

	public int getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}

	public String getMoyenChauff() {
		return moyenChauff;
	}

	public void setMoyenChauff(String moyenChauff) {
		this.moyenChauff = moyenChauff;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public double getChargeMensuelles() {
		return chargeMensuelles;
	}

	public void setChargeMensuelles(double chargeMensuelles) {
		this.chargeMensuelles = chargeMensuelles;
	}
}
