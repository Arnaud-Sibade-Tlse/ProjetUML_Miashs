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

}
