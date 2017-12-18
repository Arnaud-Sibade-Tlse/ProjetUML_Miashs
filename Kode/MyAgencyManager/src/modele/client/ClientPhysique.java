package modele.client;

public class ClientPhysique extends Client{

	public ClientPhysique(String nom, String adrs, String num, String mail) {
		super(nom, adrs, num, mail);
	}
	
	public String toString(){
		return "Nom : " + this.getNom() +
				"\nAdresse : " + this.getAdresse() +
				"\nNumero de Telephone : " + this.getNumTel() +
				"\nAdresse Mail : " +this.getMail();
	}
}
