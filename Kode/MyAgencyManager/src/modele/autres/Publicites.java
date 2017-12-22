package modele.autres;

import modele.bien.Bien;

public class Publicites {
	private String typePube;
	private Bien bienConcerner;
	private String lien;
	
	public Publicites(String tP, Bien b, String l){
		this.setTypePube(tP);
		this.setBienConcerner(b);
		this.setLien(l);
	}

	public String getTypePube() {
		return typePube;
	}

	public void setTypePube(String typePube) {
		this.typePube = typePube;
	}

	public Bien getBienConcerner() {
		return bienConcerner;
	}

	public void setBienConcerner(Bien bienConcerner) {
		this.bienConcerner = bienConcerner;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}
	
	public String toString(){
		return "Bien : " + this.getBienConcerner().getId() +
				"Nom Bien : " + this.getBienConcerner().getNom() +  
				"Type Publicite : " + this.getTypePube() +
				"\nLien : " + this.getLien() ;
	}
}
