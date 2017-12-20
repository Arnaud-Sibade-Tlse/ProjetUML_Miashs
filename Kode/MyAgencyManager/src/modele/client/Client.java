package modele.client;

public abstract class Client {
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

	private String nom;
	private String adresse;
	private String numTel;
	private String mail;
	private String formeJuridique;
	private String nSIREN;
	
	public Client(String nom, String adrs, String num, String mail){
		this.nom = nom;
		this.adresse = adrs;
		this.numTel = num;
		this.mail = mail;
		
	}
	
}
