package vue;

public class Interface {

	public static GroupeCommande accueil = new GroupeCommande();
	
	public static void main(String[] args) {
		
		/*
		 * Gérer Client
		 */
		Commande gererClient = new Commande("Gérer un Client");
			Commande creerClient = new CommandeCreer("Créer un Client","c");
			Commande voirClients = new Commande("Voir la liste des Clients");
				Commande voirClient = new CommandeVoir("Voir un Client","c");
				Commande modifClient = new CommandeModif("Modifier un Client","c");
				Commande supprClient = new CommandeSuppr("Supprimer un Client","c");

		GroupeCommande SousGererC = new GroupeCommande();
			SousGererC.add(creerClient);
			SousGererC.add(voirClients);
		gererClient.setGroupeCommande(SousGererC);
		
			GroupeCommande SousGererVoirC = new GroupeCommande();
				SousGererVoirC.add(voirClient);
				SousGererVoirC.add(modifClient);
				SousGererVoirC.add(supprClient);
			voirClients.setGroupeCommande(SousGererVoirC);
		
		/*
		 * Gérer Bien
		 */
		Commande gererBien = new Commande("Gérer un Bien");
			Commande creerBien = new CommandeCreer("Créer un Bien","b");
			Commande voirBiens = new Commande("Voir la liste des Biens");
				Commande voirBien = new CommandeVoir("Voir un Bien","b");
				Commande modifBien = new CommandeModif("Modifier un Bien","b");
				Commande supprBien = new CommandeSuppr("Supprimer un Bien","b");
	
		GroupeCommande SousGererB = new GroupeCommande();
			SousGererB.add(creerBien);
			SousGererB.add(voirBiens);
		gererBien.setGroupeCommande(SousGererB);
		
			GroupeCommande SousGererVoirB = new GroupeCommande();
				SousGererVoirB.add(voirBien);
				SousGererVoirB.add(modifBien);
				SousGererVoirB.add(supprBien);
			voirBiens.setGroupeCommande(SousGererVoirB);
			
		/*
		 * Gérer RDV
		 */
		Commande gererRDV = new Commande("Gérer un RDV");
			Commande creerRDV = new CommandeCreer("Créer un RDV","r");
			Commande voirRDVs = new Commande("Voir la liste des RDVs");
				Commande voirRDV = new CommandeVoir("Voir un RDV","r");
				Commande modifRDV = new CommandeModif("Modifier un RDV","r");
				Commande supprRDV = new CommandeSuppr("Supprimer un RDV","r");
	
		GroupeCommande SousGererRDV = new GroupeCommande();
			SousGererRDV.add(creerRDV);
			SousGererRDV.add(voirRDVs);
		gererRDV.setGroupeCommande(SousGererRDV);
		
			GroupeCommande SousGererVoirRDV = new GroupeCommande();
				SousGererVoirRDV.add(voirRDV);
				SousGererVoirRDV.add(modifRDV);
				SousGererVoirRDV.add(supprRDV);
			voirRDVs.setGroupeCommande(SousGererVoirRDV);
			
		/*
		 * Gérer Mandats
		 */
		Commande gererMandant = new Commande("Gérer un Mandat");
			Commande creerMandant = new CommandeCreer("Créer un Mandat","m");
			Commande voirMandants = new Commande("Voir la liste des Mandats");
				Commande voirMandant = new CommandeVoir("Voir un Mandat","m");
				Commande modifMandant = new CommandeModif("Modifier un Mandat","m");
				Commande supprMandant = new CommandeSuppr("Supprimer un Mandat","m");
	
		GroupeCommande SousGererM = new GroupeCommande();
			SousGererM.add(creerMandant);
			SousGererM.add(voirMandants);
		gererMandant.setGroupeCommande(SousGererM);
		
			GroupeCommande SousGererVoirM = new GroupeCommande();
				SousGererVoirM.add(voirMandant);
				SousGererVoirM.add(modifMandant);
				SousGererVoirM.add(supprMandant);
			voirMandants.setGroupeCommande(SousGererVoirM);
			
		/*
		 * Gérer Publicités
		 */
		Commande gererPub = new Commande("Gérer une Publicité");
			Commande creerPub = new CommandeCreer("Créer une Publicité","p");
			Commande voirPubs = new Commande("Voir la liste des Publicitées");
				Commande voirPub = new CommandeVoir("Voir une Publicité","p");
				Commande modifPub = new CommandeModif("Modifier une Publicité","p");
				Commande supprPub = new CommandeSuppr("Supprimer une Publicité","p");
	
		GroupeCommande SousGererP = new GroupeCommande();
			SousGererP.add(creerPub);
			SousGererP.add(voirPubs);
		gererPub.setGroupeCommande(SousGererP);
		
			GroupeCommande SousGererVoirP = new GroupeCommande();
				SousGererVoirP.add(voirPub);
				SousGererVoirP.add(modifPub);
				SousGererVoirP.add(supprPub);
			voirPubs.setGroupeCommande(SousGererVoirP);
			
		/*
		 * Faire stats
		 */
		Commande faireStat= new CommandeStats("Faire des Statistiques");
		
		/*
		 * Quitter l'application
		 */
		Commande sauvQuit= new CommandeQuit("Sauvegarder et Quitter");
		
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
