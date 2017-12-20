package modele.bien;

public abstract class Bien {
	private int id;
	private String Adresse;
	private Orientation orient;
	private long prix;
	
	public Bien(int id, String Addresse, Orientation o, long prix){
		this.Adresse = Addresse;
		this.id=id;
		this.orient = o;
		this.setPrix(prix);
	}
	
	public int getId() {
		return id;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
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
	
}
