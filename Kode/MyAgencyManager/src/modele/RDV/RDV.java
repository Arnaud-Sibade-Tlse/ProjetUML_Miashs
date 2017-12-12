package modele.RDV;

import java.util.Date;

import modele.client.Client;

public abstract class RDV {
	private Date dateRDV;
	private Client client;
	//private Mandat mandat;
	
	protected RDV(Date d, Client c){
		this.setClient(c);
		this.setDateRDV(d);
	}

	public Date getDateRDV() {
		return dateRDV;
	}

	public void setDateRDV(Date dateRDV) {
		this.dateRDV = dateRDV;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
