package modele.RDV;

import java.util.Date;

import modele.autres.Mandat;
import modele.client.Client;

public class RdvFinalisation extends RDV{
	private Mandat mandat;
	public RdvFinalisation(Date d, Client c) {
		super(d, c);
	}
	
	public void valideVente(){
		mandat.setSommeTotalVerse(true);
	}
	public Mandat getMandat() {
		return mandat;
	}
	public void setMandat(Mandat mandat) {
		this.mandat = mandat;
	}
	
	public String toString(){
		return "RDV Finalisation de Vente \n ID Vendeur : " + this.getClient().getNom() +
				"\nDate RDV : " + this.getDateRDV().toString() +
				"\nID Acheteur : " + this.mandat.getAcheteur().getNom() +
				"\nID Bien Concernee : " + this.mandat.getPropriete().getId() +
				"Nom : " + this.mandat.getPropriete().getNom();
	}
}
