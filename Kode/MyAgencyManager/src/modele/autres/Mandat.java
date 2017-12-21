package modele.autres;

import modele.bien.Bien;
import modele.client.Client;

public class Mandat {
	private Bien propriete;
	private Client vendeur;
	private String dateButoir;
	private Client acheteur;
	private boolean sommeTotalVerse;

	public Mandat(Bien b, Client vendeur, String finMandat) {
		this.setAcheteur(null);
		this.setSommeTotalVerse(false);
		this.setPropriete(b);
		this.setVendeur(vendeur);
		this.setDateButoir(finMandat);
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

	public String getDateButoir() {
		return dateButoir;
	}

	public void setDateButoir(String dateButoir) {
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
		String acheteur;
		if(this.getAcheteur() == null){
			acheteur = "null";
		}else{
			acheteur = this.getAcheteur().getNom();
		}
		return "Bien : " + this.getPropriete().getId() + 
				"Nom Bien : " + this.getPropriete().getNom() + 
				"\nPropietaire : " + this.getVendeur().getNom() + 
				"\nDate fin Mandat : " + this.getDateButoir().toString() +
				"\nAcheteur potentiel : "+ acheteur +
				"\nSomme totale versee : " +this.getTotalVersee();
	}
}
