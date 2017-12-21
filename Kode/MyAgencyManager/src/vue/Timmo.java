package vue;

import modele.MyAgencyManager;
import modele.client.*;

public class Timmo {

	public static GroupeCommande accueil = new GroupeCommande();
	
	public static void main(String[] args) {
		
		Client c1 = new ClientPhysique("testee","1 rue labas","0123456789","jsp@gmail.fr");
		
		MyAgencyManager.getListeClients().add(c1);
		
		/*
		 * Gérer Client
		 */
		Commande gererClient = new Commande("Gérer un Client");
			Commande creerClient = new CommandeCreer("Créer un Client","c");
			Commande voirClients = new CommandeVoirs("Voir la liste des Clients","c");

		GroupeCommande SousGererC = new GroupeCommande();
			SousGererC.add(creerClient);
			SousGererC.add(voirClients);
		gererClient.setGroupeCommande(SousGererC);
		
		
		/*
		 * Gérer Bien
		 */
		Commande gererBien = new Commande("Gérer un Bien");
			Commande creerBien = new CommandeCreerBien("Créer un Bien");
			Commande voirBiens = new CommandeVoirs("Voir la liste des Biens","b");
	
		GroupeCommande SousGererB = new GroupeCommande();
			SousGererB.add(creerBien);
			SousGererB.add(voirBiens);
		gererBien.setGroupeCommande(SousGererB);
		
		/*
		 * Gérer RDV
		 */
		Commande gererRDV = new Commande("Gérer un RDV");
			Commande creerRDV = new CommandeCreer("Créer un RDV","r");
			Commande voirRDVs = new CommandeVoirs("Voir la liste des RDVs","r");
	
		GroupeCommande SousGererRDV = new GroupeCommande();
			SousGererRDV.add(creerRDV);
			SousGererRDV.add(voirRDVs);
		gererRDV.setGroupeCommande(SousGererRDV);

			
		/*
		 * Gérer Mandats
		 */
		Commande gererMandant = new Commande("Gérer un Mandat");
			Commande voirMandants = new CommandeVoirs("Voir la liste des Mandats","m");
	
		GroupeCommande SousGererM = new GroupeCommande();
			SousGererM.add(voirMandants);
		gererMandant.setGroupeCommande(SousGererM);
			
		/*
		 * Gérer Publicités
		 */
		Commande gererPub = new Commande("Gérer une Publicité");
			Commande creerPub = new CommandeCreer("Créer une Publicité","p");
			Commande voirPubs = new CommandeVoirs("Voir la liste des Publicitées","p");
	
		GroupeCommande SousGererP = new GroupeCommande();
			SousGererP.add(creerPub);
			SousGererP.add(voirPubs);
		gererPub.setGroupeCommande(SousGererP);
		
			
		/*
		 * Faire stats
		 */
		Commande faireStat= new CommandeStats("Faire des Statistiques");
		
		/*
		 * Quitter l'application
		 */
		Commande sauvQuit= new CommandeQuit("Quitter (!!! ne sauvegarde pas)");
		
		accueil.add(gererClient);
		accueil.add(gererBien);
		accueil.add(gererRDV);
		accueil.add(gererMandant);
		accueil.add(gererPub);
		accueil.add(faireStat);
		accueil.add(sauvQuit);
		
		accueil.exec();
	}

}
