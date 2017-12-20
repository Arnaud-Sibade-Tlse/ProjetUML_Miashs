package modele;

import java.util.ArrayList;
import java.util.List;

import modele.client.Client;
import modele.bien.Bien;
import modele.RDV.RDV;
import modele.autres.Mandat;
import modele.autres.Publicites;

public class MyAgencyManager {
	
	private static List<Client> listeClients = new ArrayList<Client>();
	private static List<Bien> listeBiens = new ArrayList<Bien>();
	private static List<RDV> listeRDVs = new ArrayList<RDV>();
	private static List<Mandat> listeMandats = new ArrayList<Mandat>();
	private static List<Publicites> listePubs = new ArrayList<Publicites>();

	
	public static List<Client> getListeClients() {
		return listeClients;
	}
	public static List<Bien> getListeBiens() {
		return listeBiens;
	}
	public static List<RDV> getListeRDVs() {
		return listeRDVs;
	}
	public static List<Mandat> getListeMandats() {
		return listeMandats;
	}
	public static List<Publicites> getListePubs() {
		return listePubs;
	}
}
