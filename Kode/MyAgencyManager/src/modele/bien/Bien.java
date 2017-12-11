package modele.bien;

public abstract class Bien {
	private int id;
	private String Adresse;
	private Orientation oriente;
	
	private Bien(int id, String Addresse, Orientation o){
		this.Adresse = Addresse;
		this.id=id;
		this.oriente = o;
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
		return oriente;
	}
	public void setOriente(Orientation oriente) {
		this.oriente = oriente;
	}
	
}
