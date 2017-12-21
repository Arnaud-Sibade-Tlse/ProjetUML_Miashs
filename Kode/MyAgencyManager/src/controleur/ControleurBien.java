package controleur;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import modele.MyAgencyManager;
import modele.bien.Orientation;
import modele.bien.Terrain;
import vue.Timmo;
import modele.bien.Maison;
import modele.bien.Appartement;
import modele.bien.Bien;

public class ControleurBien {
	
	Scanner sc = new Scanner(System.in);
	
	public void creerBien(int idBien){
		System.out.println("__Creation d'un Bien");
		System.out.print("Bien Maison, Appartement ou Terrain ? (M/A/T) ? ");
		
		String type = "";
		do{
			try{
				type = sc.next();
			}catch(Exception e){
				type = "";
			}
		}while(!Pattern.matches("^[MAT]$", type));
		
		System.out.println();
		
		if(type.equals("M")){
			System.out.println("____Creation d'une Maison");
		}
		else if(type.equals("A")){
			System.out.println("____Creation d'un Appartement");
		} else {
			System.out.println("____Creation d'un Terrain");
		}
		
		String nom;
		System.out.print("Nom :");
		do{
			try{
				nom = sc.nextLine();
			}catch(Exception e){
				nom = "";
				System.out.println("Mauvaise saisie");
				sc.nextLine();
			}
		}while(!Pattern.matches("^[a-zA-Z ]+$", nom));
		
		String adresse;

		System.out.print("Adresse (n°,adresse) :");
		do{
			try{
				adresse = sc.nextLine();
			}catch(Exception e){
				adresse = "";
				System.out.println("Mauvaise saisie");
				sc.nextLine();
			}
		}while(!Pattern.matches("^[0-9]*,[a-zA-Z0-9 ]+$", adresse));
		
		String codeP;
		
		System.out.print("Code Postal :");
		do{
			try{
				codeP = sc.next();
			}catch(Exception e){
				codeP = "";
				System.out.println("Mauvaise saisie");
				sc.next();
			}
		}while(!Pattern.matches("^[0-9]{5}+$", codeP));

		String ville;
		
		System.out.print("Ville :");
		do{
			try{
				ville = sc.nextLine();
			}catch(Exception e){
				ville = "";
				System.out.println("Mauvaise saisie");
				sc.nextLine();
			}
		}while(!Pattern.matches("^[a-zA-Z-' ]+$", ville));
		
		String finalAdress = adresse +" "+codeP + " "+ville;
		
		String orient;
		Orientation or = null;
		System.out.print("Orientation (N/S/E/O) :");
		do{
			try{
				orient = sc.nextLine();
			}catch(Exception e){
				orient = "";
				System.out.println("Mauvaise saisie");
				sc.nextLine();
			}
		}while(!Pattern.matches("^[NSEO]$", orient));

		switch(orient){
			case "N":
				or = Orientation.NORD;
				break;
			case "S":
				or = Orientation.SUD;
				break;
			case "E":
				or = Orientation.EST;
				break;
			case "O":
				or = Orientation.OUEST;
				break;
		}
		
		long prix;
		
		System.out.print("Prix :");
		do{
			try{
				prix = sc.nextLong();
			}catch(Exception e){
				prix = 0;
				System.out.println("Mauvaise saisie");
				sc.next();
			}
		}while(prix <= 0.0);
		
		
		if(type.equals("M")){
			int nbPiece;
			
			System.out.print("Nombre de Piece :");
			do{
				try{
					nbPiece = sc.nextInt();
				}catch(Exception e){
					nbPiece = 0;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(nbPiece <= 0);
			
			int nbEtage;
			
			System.out.print("Nombre d'Etage :");
			do{
				try{
					nbEtage = sc.nextInt();
				}catch(Exception e){
					nbEtage = 0;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(nbEtage <= 0);
			
			double surfaceH;
			
			System.out.print("Surface Habitable :");
			do{
				try{
					surfaceH = sc.nextDouble();
				}catch(Exception e){
					surfaceH = 0;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(surfaceH <= 0.0);
			
			String chauff;
			
			System.out.print("Moyen de chauffage :");
			do{
				try{
					chauff = sc.nextLine();
				}catch(Exception e){
					chauff = "";
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(!Pattern.matches("^[a-zA-Z-[0-9] ]+$", chauff));
			

			int idTerrain = -1;
			ArrayList<Integer> listeID = new ArrayList<Integer>();
			
			System.out.println("Emplacement :");
			for(Bien currentT : MyAgencyManager.getListeBiens()){
				if(currentT instanceof Terrain){
					System.out.println("-"+currentT.getId()+"- "+currentT.getNom());
					listeID.add(currentT.getId());
				}
			}

			if(listeID.size()==0){
				try {
					throw new Exception("Aucun Terrain disponible");
				} catch (Exception e) {
					System.out.println("Aucun Terrain disponible, creez-en un pour pouvoir creer une Maison\n");
					Timmo.accueil.exec();
				}
			}
			
			System.out.print("ID Terrain :");
			do{
				try{
					idTerrain = sc.nextInt();
				}catch(Exception e){
					idTerrain = -1;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(idTerrain <= 0 || MyAgencyManager.getListeBiens().contains(idTerrain));
			

			Terrain t = (Terrain)MyAgencyManager.getListeBiens().get(idTerrain-1);
			
			System.out.println("\nMaison cree !");
			MyAgencyManager.getListeBiens().add(new Maison(idBien,nom,finalAdress,or,prix,nbPiece,nbEtage,surfaceH,t,chauff));
		}
		else if(type.equals("A")){
			
			int nbPiece;
			
			System.out.print("Nombre de Piece :");
			do{
				try{
					nbPiece = sc.nextInt();
				}catch(Exception e){
					nbPiece = 0;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(nbPiece <= 0);
			
			int etage;
			
			System.out.print("Etage de l'Immeuble :");
			do{
				try{
					etage = sc.nextInt();
				}catch(Exception e){
					etage = -1;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(etage < 0);
			
			double charges;
			
			System.out.print("Charges Mensuelles:");
			do{
				try{
					charges = sc.nextDouble();
				}catch(Exception e){
					charges = 0;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(charges <= 0.0);
			
			double surfaceH;
			
			System.out.print("Surface Habitable :");
			do{
				try{
					surfaceH = sc.nextDouble();
				}catch(Exception e){
					surfaceH = 0;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(surfaceH <= 0.0);
			

			System.out.println("\nAppartement cree !");
			MyAgencyManager.getListeBiens().add(new Appartement(idBien,nom,finalAdress,or,prix,nbPiece,etage,charges,surfaceH));
		} 
		else {

			double lgFacade;
			
			System.out.print("Longueur facade :");
			do{
				try{
					lgFacade = sc.nextDouble();
				}catch(Exception e){
					lgFacade = 0;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(lgFacade <= 0.0);
			
			double surfaceT;;
			
			System.out.print("Surface Terrain :");
			do{
				try{
					surfaceT = sc.nextDouble();
				}catch(Exception e){
					surfaceT = 0;
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(surfaceT <= 0.0);

			System.out.println("\nTerrain cree !");
			MyAgencyManager.getListeBiens().add(new Terrain(idBien,nom,finalAdress,or,prix,lgFacade,surfaceT));
		}
	}
}
