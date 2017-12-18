package modele.RDV;

import java.util.Date;

import modele.autres.Mandat;
import modele.client.Client;

public class RdvMandat extends RDV{
	public RdvMandat(Date d, Client c) {
		super(d, c);
	}
	
	public Mandat creerMandat(){
		return null;
		//TODO
	}
	
	public String toString(){
		return "RDV Mandat \n ID Client Vendeur : " + this.getClient().getNom() +
				"\nDate RDV : " + this.getDateRDV().toString();
	}
}
