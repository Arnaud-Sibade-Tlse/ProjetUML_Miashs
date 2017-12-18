package modele.RDV;

import java.util.Date;

import modele.autres.Mandat;
import modele.client.Client;

public class RdvPromesseVente extends RDV {
	private Client acheteurPotentiel;
	private Mandat mandat;
	
	public RdvPromesseVente(Date d, Client c, Client aP) {
		super(d, c);
		this.setAcheteurPotentiel(aP);
	}
	
	public void setAcheteur(){
		mandat.setAcheteur(acheteurPotentiel);
	}

	public Client getAcheteurPotentiel() {
		return acheteurPotentiel;
	}

	public void setAcheteurPotentiel(Client acheteurPotentiel) {
		this.acheteurPotentiel = acheteurPotentiel;
	}
}
