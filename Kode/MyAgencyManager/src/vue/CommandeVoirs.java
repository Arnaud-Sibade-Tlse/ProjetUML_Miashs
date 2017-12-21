package vue;

import java.util.Scanner;

import controleur.ControleurBien;
import controleur.ControleurClient;
import controleur.ControleurPublicites;
import controleur.ControleurRDV;
import modele.MyAgencyManager;

public class CommandeVoirs extends Commande {

	private String type;
	Scanner sc = new Scanner(System.in);
	
	public CommandeVoirs(String command,String typObj) {
		super(command);
		this.type=typObj;
	}

	@Override
	public void execute() {
		switch(this.type){
		//Client
			case "c":
				System.out.println("--Choisir un Client dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListeClients().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListeClients().get(i).getNom());
				}
				System.out.println("{" + (MyAgencyManager.getListeClients().size() + 1) + "} Retour Menu Principal");
				System.out.print("\n:");
				
				
				int idClient = 0;
				do{
					try{
						idClient = sc.nextInt();
					}catch(Exception e){
						idClient = 0;
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(idClient <= 0 ||idClient > MyAgencyManager.getListeClients().size() + 1 );

				if(idClient == MyAgencyManager.getListeClients().size() +1 ){
					Timmo.accueil.exec();
				}
				
				System.out.println("o= Que faire sur ce Client ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler");
				System.out.print("\n:");
				
				int operationC = 0;
				do{
					try{
						operationC = sc.nextInt();
					}catch(Exception e){
						operationC = 0;
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(operationC <= 0 ||operationC >= 4 );
				
				switch(operationC){
					case 1:
						System.out.println("\n" + MyAgencyManager.getListeClients().get(idClient-1).toString());
						System.out.println("____\n");
						this.execute();
						break;
					case 2:
						ControleurClient cc = new ControleurClient();
						cc.modifClient(idClient-1);
						this.execute();
						break;
					case 3:
						this.execute();
						break;
				}
				break;
				
		//Bien
			case "b":
				System.out.println("--Choisir un Bien dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListeBiens().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListeBiens().get(i).getClass().getSimpleName() +" "+ MyAgencyManager.getListeBiens().get(i).getNom());
				}
				System.out.println("{" + (MyAgencyManager.getListeBiens().size() + 1) + "} Retour Menu Principal");
				System.out.print("\n:");
				
				
				int idBien = 0;
				do{
					try{
						idBien = sc.nextInt();
					}catch(Exception e){
						idBien = 0;
					}
				}while(idBien <= 0 ||idBien > MyAgencyManager.getListeBiens().size() + 1 );

				if(idBien == MyAgencyManager.getListeBiens().size() +1 ){
					Timmo.accueil.exec();
				}
				
				System.out.println("o= Que faire sur ce Bien ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler");
				System.out.print("\n:");
				
				int operationB = 0;
				do{
					try{
						operationB = sc.nextInt();
					}catch(Exception e){
						operationB = 0;
					}
				}while(operationB <= 0 ||operationB >= 4 );
				
				switch(operationB){
					case 1:
						System.out.println("\n" + MyAgencyManager.getListeBiens().get(idBien-1).toString());
						System.out.println("____\n");
						this.execute();
						break;
					case 2:
						ControleurBien cb = new ControleurBien();
						cb.modifBien(idBien-1);
						this.execute();
						break;
					case 3:
						this.execute();
						break;
				}
				break;
				
		//RDV
			case "r":
				System.out.println("--Choisir un RDV dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListeRDVs().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListeRDVs().get(i));
				}
				System.out.println("{" + (MyAgencyManager.getListeRDVs().size() + 1) + "} Retour Menu Principal");
				System.out.print("\n:");
				
				
				int idRDV = 0;
				do{
					try{
						idRDV = sc.nextInt();
					}catch(Exception e){
						idRDV = 0;
					}
				}while(idRDV <= 0 ||idRDV > MyAgencyManager.getListeRDVs().size() + 1 );

				if(idRDV == MyAgencyManager.getListeRDVs().size() +1 ){
					Timmo.accueil.exec();
				}
				
				System.out.println("o= Que faire sur ce RDV ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler");
				System.out.print("\n:");
				
				int operationRDV = 0;
				do{
					try{
						operationRDV = sc.nextInt();
					}catch(Exception e){
						operationRDV = 0;
					}
				}while(operationRDV <= 0 ||operationRDV >= 4 );
				
				switch(operationRDV){
					case 1:
						System.out.println("\n" + MyAgencyManager.getListeRDVs().get(idRDV-1).toString());
						System.out.println("____\n");
						this.execute();
						break;
					case 2:
						ControleurRDV cc = new ControleurRDV();
						cc.modifClient(idRDV-1);
						this.execute();
						break;
					case 3:
						this.execute();
						break;
				}
				break;
				
		//Mandat
			case "m":
				System.out.println("--Choisir un Mandat dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListeMandats().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListeMandats().get(i));
				}
				System.out.println("{" + (MyAgencyManager.getListeMandats().size() + 1) + "} Retour Menu Principal");
				System.out.print("\n:");
				
				
				int idMandat = 0;
				do{
					try{
						idMandat = sc.nextInt();
					}catch(Exception e){
						idMandat = 0;
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(idMandat <= 0 ||idMandat > MyAgencyManager.getListeMandats().size() + 1 );

				if(idMandat == MyAgencyManager.getListeMandats().size() +1 ){
					Timmo.accueil.exec();
				}
				
				System.out.println("o= Que faire sur ce Mandat ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Annuler");
				System.out.print("\n:");
				
				int operationM = 0;
				do{
					try{
						operationM = sc.nextInt();
					}catch(Exception e){
						operationM = 0;
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(operationM <= 0 ||operationM >= 4 );
				
				switch(operationM){
					case 1:
						System.out.println("\n" + MyAgencyManager.getListeMandats().get(idMandat-1).toString());
						System.out.println("____\n");
						this.execute();
						break;
					case 2:
						this.execute();
						break;
				}
				break;
				
		//Publicitées
			case "p":
				System.out.println("--Choisir une Publicité dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListePubs().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListePubs().get(i));
				}
				System.out.println("{" + (MyAgencyManager.getListePubs().size() + 1) + "} Retour Menu Principal");
				System.out.print("\n:");
				
				
				int idPub = 0;
				do{
					try{
						idPub = sc.nextInt();
					}catch(Exception e){
						idPub = 0;
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(idPub <= 0 ||idPub > MyAgencyManager.getListePubs().size() + 1 );

				if(idPub == MyAgencyManager.getListePubs().size() +1 ){
					Timmo.accueil.exec();
				}
				
				System.out.println("o= Que faire sur cette Publicitée ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler");
				System.out.print("\n:");
				
				int operationP = 0;
				do{
					try{
						operationP = sc.nextInt();
					}catch(Exception e){
						operationP = 0;
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(operationP <= 0 ||operationP >= 5 );
				
				switch(operationP){
					case 1:
						System.out.println("\n" + MyAgencyManager.getListePubs().get(idPub-1).toString());
						System.out.println("____\n");
						this.execute();
						break;
					case 2:
						ControleurPublicites cc = new ControleurPublicites();
						cc.modifPub(idPub-1);
						this.execute();
						break;
					case 3:
						this.execute();
						break;
				}
				break;
		}
	}

}
