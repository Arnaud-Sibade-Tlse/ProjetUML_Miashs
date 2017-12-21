package modele.RDV;

import modele.MyAgencyManager;
import modele.autres.Mandat;
import modele.client.Client;

public class RdvPromesseVente extends RDV {
	private Client acheteurPotentiel;
	private Mandat mandat;
	
	public RdvPromesseVente(String d, Client c, Client aP, Mandat m) {
		super(d, c);
		acheteurPotentiel =aP;
		this.mandat = m;
		majMandat();
	}
	
	private void majMandat() {
		System.out.println("Mandat mis à jour");
		MyAgencyManager.getListeMandats().get(MyAgencyManager.getListeMandats().indexOf(mandat)).setAcheteur(acheteurPotentiel);
		System.out.println();
	}

	public String toString(){
		return "RDV Promesse de Vente \n ID Vendeur : " + this.getClient().getNom() +
				"\nDate RDV : " + this.getDateRDV() +
				"\nID Acheteur : " + this.acheteurPotentiel.getNom() +
				"\nID Bien Concernee : " + this.mandat.getPropriete().getId() +
				"Nom Bien : " + this.mandat.getPropriete().getNom();  
	}
}
