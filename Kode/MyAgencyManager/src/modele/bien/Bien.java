package modele.bien;

public abstract class Bien {
	private int id;
	private String nom;
	private String adresse;
	private Orientation orient;
	private long prix;
	
	public Bien(int id,String nom, String Addresse, Orientation o, long prix){
		this.adresse = Addresse;
		this.nom = nom;
		this.id=id;
		this.orient = o;
		this.setPrix(prix);
	}
	
	public int getId() {
		return id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Orientation getOriente() {
		return orient;
	}
	public void setOriente(Orientation orient) {
		this.orient = orient;
	}

	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
