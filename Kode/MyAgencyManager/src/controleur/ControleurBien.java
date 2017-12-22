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
		
		String nom = saisirNom();
		
		String finalAdress = saisirAdresse();

		Orientation or = saisirOrient();
		
		long prix = saisirPrix();
		
		
		if(type.equals("M")){
			int nbPiece = saisirNbPiece();
			
			int nbEtage = saisirnbEtage();
			
			double surfaceH = saisirSurface();
			
			String chauff = saisirChauff();

		
			Terrain t = saisirTerrain();
			
			System.out.println("\nMaison cree !");
			MyAgencyManager.getListeBiens().add(new Maison(idBien,nom,or,prix,nbPiece,nbEtage,surfaceH,t,chauff));
		}
		else if(type.equals("A")){
			
			int nbPiece = saisirNbPiece();
			
			int etage = saisirEtage();
			
			double charges = saisirCharges();
			
			double surfaceH = saisirSurfaceH();
			
			System.out.println("\nAppartement cree !");
			MyAgencyManager.getListeBiens().add(new Appartement(idBien,nom,finalAdress,or,prix,nbPiece,etage,charges,surfaceH));
		} 
		else {

			double lgFacade = saisirLongueurFacade();
		
			double surfaceT = saisirSurfaceTot();

			System.out.println("\nTerrain cree !");
			MyAgencyManager.getListeBiens().add(new Terrain(idBien,nom,finalAdress,or,prix,lgFacade,surfaceT));
		}
	}

	public void modifBien(int idBlient){
		Bien bienAmodif = MyAgencyManager.getListeBiens().get(idBlient);
		
		int appart ;
		int nbMax;
		System.out.println("Quoi changer ?");
			System.out.println(" {1} Nom");
			System.out.println(" {2} Adresse");
			System.out.println(" {3} Orientation");
			System.out.println(" {4} Prix");
			nbMax = 5;
		if(bienAmodif instanceof Terrain){
			System.out.println(" {5} Longueur Facade");
			System.out.println(" {6} Surface Totale");
			appart = 1;
			nbMax = 7;
		}
		else if(bienAmodif instanceof Maison){
			System.out.println(" {5} Nombre Piece");
			System.out.println(" {6} Nombre Etage");
			System.out.println(" {7} Surface Habitable");
			System.out.println(" {8} Moyen de Chauffage");
			appart = 2;
			nbMax = 9;
		}
		else{//Appartement
			System.out.println(" {5} Nombre Piece");
			System.out.println(" {6} Etage de l'Immeuble");
			System.out.println(" {7} Surface Habitable");
			System.out.println(" {8} Charges Mensuelles");
			appart = 3;
			nbMax = 9;
		}
		
		int saisieM = 0;
		do{
			try{
				saisieM = sc.nextInt();
			}catch(Exception e){
				saisieM = 0;
				System.out.println("Mauvaise saisie");
				sc.next();
			}
		}while(saisieM <= 0 ||saisieM > nbMax );
		
		switch(saisieM){
		case 1:
			bienAmodif.setNom(saisirNom());
			break;
		case 2:
			bienAmodif.setAdresse(saisirAdresse());
			break;
		case 3 :
			bienAmodif.setOriente(saisirOrient());
			break;
		case 4:
			bienAmodif.setPrix(saisirPrix());
			break;
		case 5:
			switch(appart){
				case 1:
					bienAmodif.setLongueurFacade(saisirLongueurFacade());
					break;
				case 2:
					bienAmodif.setNbPiece(saisirNbPiece());
					break;
				case 3:
					bienAmodif.setNbPiece(saisirNbPiece());
					break;
			}
		case 6:
			switch(appart){
				case 1:
					bienAmodif.setSurfaceTotale(saisirSurfaceTot());
					break;
				case 2:
					bienAmodif.setNbEtage(saisirnbEtage());
					break;
				case 3:
					bienAmodif.setEtage(saisirEtage());
					break;
			}
			break;
		case 7:
			bienAmodif.setSurfaceHabitable(saisirSurfaceH());
			break;
		case 8:
			switch(appart){
				case 2:
					bienAmodif.setMoyenChauff(saisirChauff());
					break;
				case 3:
					bienAmodif.setChargeMensuelles(saisirCharges());
					break;
			}
			break;
		}
	}
	
	public String saisirNom(){
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
		
		return nom;
	}
	

	private String saisirAdresse() {
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
		
		return finalAdress;
	}
	
	public long saisirPrix(){
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
		
		return prix;
	}
	
	private Orientation saisirOrient() {
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
		return or;
	}
	
	private int saisirNbPiece() {
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
		return nbPiece;
	}
	


	private int saisirnbEtage() {
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
		return nbEtage;
	}
	

	private double saisirSurface() {
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
		return surfaceH;
	}
	


	private String saisirChauff() {
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
		return chauff;
	}
	

	private int saisirEtage() {
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
		return etage;
	}

	private double saisirCharges() {
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
		return charges;
	}
	
	private double saisirSurfaceH() {
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
		return surfaceH;
	}
	
	private double saisirLongueurFacade() {
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
		return lgFacade;
	}
	

	private double saisirSurfaceTot() {
		double surfaceT;
		
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
		return surfaceT;
	}
	
	private Terrain saisirTerrain() {
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
		
		boolean bonTerrain = false;
		System.out.print("ID Terrain :");
		do{
			try{
				idTerrain = sc.nextInt();
			}catch(Exception e){
				idTerrain = -1;
				System.out.println("Mauvaise saisie");
				sc.next();
			}

			for(int currentI : listeID){
				System.out.println(currentI+" vs "+idTerrain);
				if(currentI == idTerrain){
					bonTerrain = true;
				}
			}
		}while(idTerrain <= 0 || !bonTerrain);
		

		Terrain t = (Terrain)MyAgencyManager.getListeBiens().get(idTerrain-1);
		return t;
	}
}
