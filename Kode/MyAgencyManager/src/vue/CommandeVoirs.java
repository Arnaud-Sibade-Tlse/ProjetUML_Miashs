package vue;

import java.io.IOException;
import java.util.Scanner;

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
				System.out.println("{" + (MyAgencyManager.getListeClients().size() + 1) + "} Retour Menu Principal\n:");
				System.out.println();
				
				
				int idClient = 0;
				do{
					try{
						idClient = sc.nextInt();
					}catch(Exception e){
						idClient = 0;
					}
				}while(idClient <= 0 ||idClient > MyAgencyManager.getListeClients().size() + 1 );

				if(idClient == MyAgencyManager.getListeClients().size() +1 ){
					Interface.accueil.exec();
				}
				
				System.out.println("o= Que faire sur ce Client ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler\n:");
				
				int operationC = 0;
				do{
					try{
						operationC = sc.nextInt();
					}catch(Exception e){
						operationC = 0;
					}
				}while(operationC <= 0 ||operationC >= 4 );
				
				System.out.println("Operation "+operationC+" sur Client "+idClient);
				
				break;
				
		//Bien
			case "b":
				System.out.println("--Choisir un Bien dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListeBiens().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListeBiens().get(i));
				}
				System.out.println("{" + (MyAgencyManager.getListeBiens().size() + 1) + "} Retour Menu Principal\n:");
				System.out.println();
				
				
				int idBien = 0;
				do{
					try{
						idBien = sc.nextInt();
					}catch(Exception e){
						idBien = 0;
					}
				}while(idBien <= 0 ||idBien > MyAgencyManager.getListeBiens().size() + 1 );

				if(idBien == MyAgencyManager.getListeBiens().size() +1 ){
					Interface.accueil.exec();
				}
				
				System.out.println("o= Que faire sur ce Bien ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler\n:");
				
				int operationB = 0;
				do{
					try{
						operationB = sc.nextInt();
					}catch(Exception e){
						operationB = 0;
					}
				}while(operationB <= 0 ||operationB >= 4 );
				
				System.out.println("Operation "+operationB+" sur Bien "+idBien);
				
				break;
				
		//RDV
			case "r":
				System.out.println("--Choisir un RDV dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListeRDVs().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListeRDVs().get(i));
				}
				System.out.println("{" + (MyAgencyManager.getListeRDVs().size() + 1) + "} Retour Menu Principal\n:");
				System.out.println();
				
				
				int idRDV = 0;
				do{
					try{
						idRDV = sc.nextInt();
					}catch(Exception e){
						idRDV = 0;
					}
				}while(idRDV <= 0 ||idRDV > MyAgencyManager.getListeRDVs().size() + 1 );

				if(idRDV == MyAgencyManager.getListeRDVs().size() +1 ){
					Interface.accueil.exec();
				}
				
				System.out.println("o= Que faire sur ce RDV ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler\n:");
				
				int operationRDV = 0;
				do{
					try{
						operationRDV = sc.nextInt();
					}catch(Exception e){
						operationRDV = 0;
					}
				}while(operationRDV <= 0 ||operationRDV >= 4 );
				
				System.out.println("Operation "+operationRDV+" sur Client "+idRDV);
				
				break;
				
		//Mandat
			case "m":
				System.out.println("--Choisir un Mandat dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListeMandats().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListeMandats().get(i));
				}
				System.out.println("{" + (MyAgencyManager.getListeMandats().size() + 1) + "} Retour Menu Principal\n:");
				System.out.println();
				
				
				int idMandat = 0;
				do{
					try{
						idMandat = sc.nextInt();
					}catch(Exception e){
						idMandat = 0;
					}
				}while(idMandat <= 0 ||idMandat > MyAgencyManager.getListeMandats().size() + 1 );

				if(idMandat == MyAgencyManager.getListeMandats().size() +1 ){
					Interface.accueil.exec();
				}
				
				System.out.println("o= Que faire sur ce Mandat ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler\n:");
				
				int operationM = 0;
				do{
					try{
						operationM = sc.nextInt();
					}catch(Exception e){
						operationM = 0;
					}
				}while(operationM <= 0 ||operationM >= 4 );
				
				System.out.println("Operation "+operationM+" sur Client "+idMandat);
				
				break;
				
		//Publicitées
			case "p":
				System.out.println("--Choisir une Publicité dans la liste\n");
				
				for (int i = 0; i < MyAgencyManager.getListePubs().size(); i++) {
					System.out.println("	[" + (i + 1) + "] " + MyAgencyManager.getListePubs().get(i));
				}
				System.out.println("{" + (MyAgencyManager.getListePubs().size() + 1) + "} Retour Menu Principal\n:");
				System.out.println();
				
				
				int idPub = 0;
				do{
					try{
						idPub = sc.nextInt();
					}catch(Exception e){
						idPub = 0;
					}
				}while(idPub <= 0 ||idPub > MyAgencyManager.getListePubs().size() + 1 );

				if(idPub == MyAgencyManager.getListePubs().size() +1 ){
					Interface.accueil.exec();
				}
				
				System.out.println("o= Que faire sur cette Publicitée ? =o");
				System.out.println("{1} Voir");
				System.out.println("{2} Modifier");
				System.out.println("{3} Annuler\n:");
				
				int operationP = 0;
				do{
					try{
						operationP = sc.nextInt();
					}catch(Exception e){
						operationP = 0;
					}
				}while(operationP <= 0 ||operationP >= 5 );
				
				System.out.println("Operation "+operationP+" sur Client "+idPub);
				
				break;
		}
	}

}
