package vue;

public class Interface {

	public static void main(String[] args) {
		
		GroupeCommande accueil = new GroupeCommande();
		
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
			
		Commande gererBien = new Commande("Gérer un Bien");
		Commande gererRDV = new Commande("Gérer un RDV");
		Commande gererMandant = new Commande("Gérer un Mandat");
		Commande gererPub = new Commande("Gérer une Publicité");
		Commande faireStat= new Commande("Faire des Statistiques");
		
		accueil.add(gererClient);
		accueil.add(gererBien);
		accueil.add(gererRDV);
		accueil.add(gererMandant);
		accueil.add(gererPub);
		accueil.add(faireStat);
		
		accueil.exec();
	}

}
