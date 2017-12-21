package controleur;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import modele.MyAgencyManager;
import modele.RDV.RdvFinalisation;
import modele.RDV.RdvMandat;
import modele.RDV.RdvPromesseVente;
import modele.autres.Mandat;
import modele.bien.Bien;
import modele.bien.Terrain;
import modele.client.Client;
import vue.Timmo;

public class ControleurRDV {

	Scanner sc = new Scanner(System.in);

	public void creerRDV() {
		System.out.println("__Creation d'un RDV");
		System.out.print("Rendez-Vous Mandat, Promesse de Vente, Finalisation ? (M,P,F) ? :");

		String type = "";
		do {
			try {
				type = sc.next();
			} catch (Exception e) {
				type = "";
			}
		} while (!Pattern.matches("^[MPF]$", type));

		System.out.println();

		System.out.print("Date du rendez-vous (JJ/MM/AAAA,HH:MM) :");
		String date = saisirDate();

		
		
		if (type.equals("M")) {
			System.out.println("____Creation d'un Mandat");

			Client vendeur = saisirClient();
			
			Bien Bconcerne = saisirBien();

			System.out.print("Date fin Mandat (JJ/MM/AAAA,HH:MM) :");
			String dateFin = saisirDate();

			System.out.println("\nRdvMandat cree !");
			MyAgencyManager.getListeRDVs().add(new RdvMandat(date, vendeur, Bconcerne,dateFin));
			
		} else if (type.equals("P")) {
			System.out.println("____Creation d'une Promesse de Vente");

			Client acheteur = saisirClient();
			
			Mandat Mconcernee = saisirMandat();

			System.out.println("\nRdvPromesseVente cree !");
			MyAgencyManager.getListeRDVs().add(new RdvPromesseVente(date, Mconcernee.getVendeur(), acheteur,Mconcernee));
			
		} else {
			System.out.println("____Creation d'une Finalisation");
			
			Mandat Mconcernee = saisirMandat();
			
			System.out.println("\nRdvFinalisation cree !");
			MyAgencyManager.getListeRDVs().add(new RdvFinalisation(date,Mconcernee.getAcheteur(),Mconcernee));
		}

	}

	public void modifRDV(int i) {
		// TODO Auto-generated method stub

	}
	
	private String saisirDate() {
		String date;
		do {
			try {
				date = sc.nextLine();
			} catch (Exception e) {
				date = "";
				System.out.println("Mauvaise saisie");
				sc.nextLine();
			}
		} while (!Pattern.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4},[0-9]{2}:[0-9]{2}+$", date));

		return date;
	}

	private Client saisirClient() {

		int idClient = -1;

		System.out.println("Client(s) :");
		for (int i = 0; i < MyAgencyManager.getListeClients().size(); i++) {
			System.out.println("-" + (i + 1) + "- " + MyAgencyManager.getListeClients().get(i).getNom());
		}

		if (MyAgencyManager.getListeClients().size() == 0) {
			try {
				throw new Exception("Aucun Client disponible");
			} catch (Exception e) {
				System.out.println("Aucun Client disponible, creez-en un pour pouvoir creer un RDV\n");
				Timmo.accueil.exec();
			}
		}

		System.out.print("ID Client :");
		do {
			try {
				idClient = sc.nextInt();
			} catch (Exception e) {
				idClient = -1;
				System.out.println("Mauvaise saisie");
				sc.next();
			}

		} while (idClient <= 0 || idClient > MyAgencyManager.getListeClients().size());

		return MyAgencyManager.getListeClients().get(idClient-1);
	}
	
	private Bien saisirBien() {
		int idTerrain = -1;
		
		System.out.println("Bien concernee :");
		for(Bien currentT : MyAgencyManager.getListeBiens()){
			System.out.println("-"+currentT.getId()+"- "+currentT.getNom());
			
		}

		if(MyAgencyManager.getListeBiens().size()==0){
			try {
				throw new Exception("Aucun Bien disponible");
			} catch (Exception e) {
				System.out.println("Aucun Bien disponible, creez-en un pour pouvoir creer un RdvMandat\n");
				Timmo.accueil.exec();
			}
		}
		
		System.out.print("ID Bien :");
		do{
			try{
				idTerrain = sc.nextInt();
			}catch(Exception e){
				idTerrain = -1;
				System.out.println("Mauvaise saisie");
				sc.next();
			}
		}while(idTerrain <= 0 || idTerrain > MyAgencyManager.getListeBiens().size());
		
		Terrain t = (Terrain)MyAgencyManager.getListeBiens().get(idTerrain-1);
		
		return t;
	}
	
	private Mandat saisirMandat() {
		//TODO
		int idMandat = -1;
		ArrayList<Integer> listeID = new ArrayList<Integer>();
		
		System.out.println("Mandat(s) :");
		for(int i =0;i<MyAgencyManager.getListeMandats().size();i++){
				System.out.println("-"+(i+1)+"- "+MyAgencyManager.getListeMandats().get(i).getPropriete().getId() + " " + MyAgencyManager.getListeMandats().get(i).getPropriete().getNom());
				listeID.add(i);
		}

		if(listeID.size()==0){
			try {
				throw new Exception("Aucun Mandat disponible");
			} catch (Exception e) {
				System.out.println("Aucun Mandat disponible, creez-en un pour pouvoir creer un RdvPromesseVEnte ou RdvFinalisation\n");
				Timmo.accueil.exec();
			}
		}
		
		boolean bonMandat = false;
		System.out.print("ID Mandat :");
		do{
			try{
				idMandat = sc.nextInt();
			}catch(Exception e){
				idMandat = -1;
				System.out.println("Mauvaise saisie");
				sc.next();
			}

			for(int currentI : listeID){
				System.out.println(currentI+" vs "+idMandat);
				if(currentI == idMandat-1){
					bonMandat = true;
				}
			}
		}while(idMandat <= 0 || !bonMandat);
		

		Mandat m = (Mandat)MyAgencyManager.getListeMandats().get(idMandat-1);
		return m;
	}

}
