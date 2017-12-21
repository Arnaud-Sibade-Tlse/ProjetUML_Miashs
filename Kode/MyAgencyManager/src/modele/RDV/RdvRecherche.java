package modele.RDV;

import java.util.ArrayList;
import java.util.Date;

import modele.bien.Bien;
import modele.client.Client;

public class RdvRecherche extends RDV {

	public RdvRecherche(String d, Client c) {
		super(d, c);
	}
	
	public ArrayList<Bien> rechercher(){
		//TODO
		return null;
	}
	
	public String toString(){
		return "RDV Recherche \n ID Client : " + this.getClient().getNom() +
				"\nDate RDV : " + this.getDateRDV().toString();
	}
}
