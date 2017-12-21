package modele.RDV;

import modele.client.Client;

public abstract class RDV {
	private String dateRDV;
	private Client client;
	//private Mandat mandat;
	
	protected RDV(String d, Client c){
		this.setClient(c);
		this.setDateRDV(d);
	}

	public String getDateRDV() {
		return dateRDV;
	}

	public void setDateRDV(String dateRDV) {
		this.dateRDV = dateRDV;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
