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
}
