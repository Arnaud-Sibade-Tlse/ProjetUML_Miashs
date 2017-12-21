package modele.RDV;

import modele.MyAgencyManager;
import modele.autres.Mandat;
import modele.bien.Bien;
import modele.client.Client;

public class RdvMandat extends RDV{
	
	Bien bienConcerne;
	
	public RdvMandat(String d, Client c,Bien b,String finM) {
		super(d, c);
		this.bienConcerne = b;
		creerMandat(finM);
	}
	
	public void creerMandat(String finMandat){
		System.out.println("Mandat cree !");
		MyAgencyManager.getListeMandats().add(new Mandat(this.bienConcerne,this.getClient(),finMandat));
		System.out.println();
	}
	
	public String toString(){
		return "RDV Mandat \n ID Client Vendeur : " + this.getClient().getNom() +
				"\nDate RDV : " + this.getDateRDV();
	}
}
