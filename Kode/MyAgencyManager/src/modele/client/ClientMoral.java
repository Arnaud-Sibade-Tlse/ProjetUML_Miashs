package modele.client;

public class ClientMoral extends Client {
	private String formeJuridique;
	private String nSIREN;
	
	public ClientMoral(String nom, String adrs, String num, String mail) {
		super(nom, adrs, num, mail);
	}
	public ClientMoral(String nom, String adrs, String num, String mail, String juri, String no) {
		super(nom, adrs, num, mail);
		this.formeJuridique = juri;
		this.nSIREN = no;
	}
	
	public String getFormeJuridique() {
		return formeJuridique;
	}
	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}
	public String getnSIREN() {
		return nSIREN;
	}
	public void setnSIREN(String nSIREN) {
		this.nSIREN = nSIREN;
	}

}
