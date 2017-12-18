package modele.autres;

import java.util.Date;

import modele.bien.Bien;
import modele.client.Client;

public class Mandat {
	private Bien propriete;
	private Client vendeur;
	private Date dateButoir;
	private Client acheteur;
	private boolean sommeTotalVerse;

	public Mandat(Bien b, Client vendeur, Date dB) {
		this.setAcheteur(null);
		this.setSommeTotalVerse(false);
		this.setPropriete(b);
		this.setVendeur(vendeur);
		this.setDateButoir(dB);
	}

	public Bien getPropriete() {
		return propriete;
	}

	public void setPropriete(Bien propriete) {
		this.propriete = propriete;
	}

	public Client getVendeur() {
		return vendeur;
	}

	public void setVendeur(Client vendeur) {
		this.vendeur = vendeur;
	}

	public Date getDateButoir() {
		return dateButoir;
	}

	public void setDateButoir(Date dateButoir) {
		this.dateButoir = dateButoir;
	}

	public Client getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Client acheteur) {
		this.acheteur = acheteur;
	}

	public boolean isSommeTotalVerse() {
		return sommeTotalVerse;
	}

	public void setSommeTotalVerse(boolean sommeTotalVerse) {
		this.sommeTotalVerse = sommeTotalVerse;
	}
	
	public String getTotalVersee(){
		if(sommeTotalVerse){return "OUI";}
		else{return "NON";}
	}
	
	public String toString() {
		return "Bien : " + this.getPropriete().getId() + 
				"\nPropietaire : " + this.getVendeur().getNom() + 
				"\nDate fin Mandat : " + this.getDateButoir().toString() +
				"\nAcheteur potentiel : "+ this.getAcheteur().getNom()
				+"\nSomme totale versee : " +this.getTotalVersee();
	}
}
