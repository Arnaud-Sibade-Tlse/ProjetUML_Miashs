package modele.bien;

public abstract class Bien {
	private int id;
	private String Adresse;
	private Orientation orient;
	
	protected Bien(int id, String Addresse, Orientation o){
		this.Adresse = Addresse;
		this.id=id;
		this.orient = o;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
