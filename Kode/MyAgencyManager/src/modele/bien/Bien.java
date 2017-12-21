package modele.bien;

public abstract class Bien {
	private int id;
	private String nom;
	private String adresse;
	private Orientation orient;
	private long prix;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public double getChargeMensuelles() {
		return chargeMensuelles;
	}

	public void setChargeMensuelles(double chargeMensuelles) {
		this.chargeMensuelles = chargeMensuelles;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public double getLongueurFacade() {
		return longueurFacade;
	}

	public void setLongueurFacade(double longueurFacade) {
		this.longueurFacade = longueurFacade;
	}

	public double getSurfaceTotale() {
		return surfaceTotale;
	}

	public void setSurfaceTotale(double surfaceTotale) {
		this.surfaceTotale = surfaceTotale;
	}

	public int getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}

	public double getSurfaceHabitable() {
		return surfaceHabitable;
	}

	public void setSurfaceHabitable(double surfaceHabitable) {
		this.surfaceHabitable = surfaceHabitable;
	}

	public String getMoyenChauff() {
		return moyenChauff;
	}

	public void setMoyenChauff(String moyenChauff) {
		this.moyenChauff = moyenChauff;
	}

	public Terrain getTerrain() {
		return terrain;
	}

	//appart
	private int nbPiece;
	private int etage;
	private double chargeMensuelles;
	private double surface;
	//terrain
	private double longueurFacade;
	private double surfaceTotale;
	//maison
	private int nbEtage;
	private double surfaceHabitable;
	private Terrain terrain;
	private String moyenChauff;
	
	public Bien(int id, String nom, String Addresse, Orientation o,long prix, double lF, double sT) {
		//Terrain
		this.adresse = Addresse;
		this.nom = nom;
		this.id=id;
		this.orient = o;
		this.setPrix(prix);
		this.longueurFacade = lF;
		this.surfaceTotale = sT;
	}
	
	public Bien(int id,String nom, String Addresse, Orientation o,long prix,int nP, int nE, double sH, Terrain t, String mC) {
		//Maison
		this.adresse = Addresse;
		this.nom = nom;
		this.id=id;
		this.orient = o;
		this.setPrix(prix);
		this.nbPiece = nP;
		this.nbEtage = nE;
		this.surfaceHabitable = sH;
		this.terrain = t;
		this.moyenChauff = mC;
	}
	
	public Bien( int id, String nom, String Addresse, Orientation o,long prix,int nP, int e,double cM, double s) {
		//Appart
		this.adresse = Addresse;
		this.nom = nom;
		this.id=id;
		this.orient = o;
		this.setPrix(prix);
		this.chargeMensuelles = cM;
		this.etage = e;
		this.nbPiece = nP;
		this.surface = s;
	}
}
