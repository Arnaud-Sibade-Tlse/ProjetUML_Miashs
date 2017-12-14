package modele.client;

public abstract class Client {
	private String nom;
	private String adresse;
	private String numTel;
	private String mail;
	public Client(String nom, String adrs, String num, String mail){
		this.nom = nom;
		this.adresse = adrs;
		this.numTel = num;
		this.mail = mail;
		
	}
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
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
	
	
}
