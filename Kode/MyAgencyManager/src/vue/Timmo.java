package vue;

import modele.MyAgencyManager;

import modele.bien.Terrain;
import modele.client.*;

public class Timmo {

	public static GroupeCommande accueil = new GroupeCommande();
	
	public static void main(String[] args) {
		
		/*
		 * Gerer Client
		 */
		Commande gererClient = new Commande("Gerer un Client");
			Commande creerClient = new CommandeCreer("Creer un Client","c");
			Commande voirClients = new CommandeVoirs("Voir la liste des Clients","c");

		GroupeCommande SousGererC = new GroupeCommande();
			SousGererC.add(creerClient);
			SousGererC.add(voirClients);
		gererClient.setGroupeCommande(SousGererC);
		
		
		/*
		 * Gerer Bien
		 */
		Commande gererBien = new Commande("Gerer un Bien");
			Commande creerBien = new CommandeCreerBien("Creer un Bien");
			Commande voirBiens = new CommandeVoirs("Voir la liste des Biens","b");
	
		GroupeCommande SousGererB = new GroupeCommande();
			SousGererB.add(creerBien);
			SousGererB.add(voirBiens);
		gererBien.setGroupeCommande(SousGererB);
		
		/*
		 * Gerer RDV
		 */
		Commande gererRDV = new Commande("Gerer un RDV");
			Commande creerRDV = new CommandeCreer("Creer un RDV","r");
			Commande voirRDVs = new CommandeVoirs("Voir la liste des RDVs","r");
	
		GroupeCommande SousGererRDV = new GroupeCommande();
			SousGererRDV.add(creerRDV);
			SousGererRDV.add(voirRDVs);
		gererRDV.setGroupeCommande(SousGererRDV);

			
		/*
		 * Gerer Mandats
		 */
		Commande gererMandant = new Commande("Gerer un Mandat");
			Commande voirMandants = new CommandeVoirs("Voir la liste des Mandats","m");
	
		GroupeCommande SousGererM = new GroupeCommande();
			SousGererM.add(voirMandants);
		gererMandant.setGroupeCommande(SousGererM);
			
		/*
		 * Gerer Publicites
		 */
		Commande gererPub = new Commande("Gerer une Publicite");
			Commande creerPub = new CommandeCreer("Creer une Publicite","p");
			Commande voirPubs = new CommandeVoirs("Voir la liste des Publicitees","p");
	
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
