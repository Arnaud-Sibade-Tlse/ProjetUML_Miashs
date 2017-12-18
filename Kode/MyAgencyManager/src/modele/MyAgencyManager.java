package modele;

import java.util.ArrayList;
import java.util.List;

import modele.client.Client;
import modele.bien.Bien;
import modele.RDV.RDV;
import modele.autres.Mandat;
import modele.autres.Publicites;

public class MyAgencyManager {
	
	private static List<Client> listeClients;
	private static List<Bien> listeBiens;
	private static List<RDV> listeRDVs;
	private static List<Mandat> listeMandats;
	private static List<Publicites> listePubs;
	
	public MyAgencyManager(){
		MyAgencyManager.listeClients = new ArrayList<Client>();
		MyAgencyManager.listeBiens = new ArrayList<Bien>();
		MyAgencyManager.listeRDVs = new ArrayList<RDV>();
		MyAgencyManager.listeMandats = new ArrayList<Mandat>();
		MyAgencyManager.listePubs = new ArrayList<Publicites>();
	}
	
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
