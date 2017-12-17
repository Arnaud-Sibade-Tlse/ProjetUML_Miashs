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
		this.orient=null;
		this.surfaceHabitable=0;
		this.surfaceTotal=0;
		this.longueurFacade=0;
		this.nbEtage=0;
		this.nbPiece=0;
		this.moyenChauff=null;
		this.chargeMensuelles=0;
		this.etage=0;
		
	}
}
