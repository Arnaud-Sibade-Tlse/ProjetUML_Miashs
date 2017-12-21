package modele.RDV;

import modele.MyAgencyManager;
import modele.autres.Mandat;
import modele.client.Client;

public class RdvFinalisation extends RDV{
	
	private Mandat mandat;
	
	public RdvFinalisation(String d, Client c,Mandat m) {
		super(d, c);
		this.mandat = m;
		closeMandat();
	}
	
	private void closeMandat() {
		System.out.println("Mandat clos");
		MyAgencyManager.getListeMandats().get(MyAgencyManager.getListeMandats().indexOf(mandat)).setSommeTotalVerse(true);
		System.out.println();
	}

	
	public String toString(){
		return "RDV Finalisation de Vente \n ID Vendeur : " + this.getClient().getNom() +
				"\nDate RDV : " + this.getDateRDV() +
				"\nID Acheteur : " + this.mandat.getAcheteur().getNom() +
				"\nID Bien Concernee : " + this.mandat.getPropriete().getId() +
				"Nom : " + this.mandat.getPropriete().getNom();
	}
}
