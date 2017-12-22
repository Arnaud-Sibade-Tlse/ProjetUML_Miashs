package controleur;

import java.util.Scanner;
import java.util.regex.Pattern;

import modele.MyAgencyManager;
import modele.autres.Publicites;
import modele.bien.Bien;
import modele.bien.Terrain;
import vue.Timmo;

public class ControleurPublicites {
	
	Scanner sc = new Scanner(System.in);

	public void creerPub() {
		System.out.println("__Creation d'une Publicitee");
		

		System.out.print("Type de Publicitee ? (Html H, Fichier Video V, Fichier Image I, Fichier Texte T) ? :");

		String type = "";
		do {
			try {
				type = sc.next();
			} catch (Exception e) {
				type = "";
			}
		} while (!Pattern.matches("^[HVIT]$", type));
		
		switch(type){
			case "H":
				type = "HTML";
				break;
			case "V":
				type = "Video";
				break;
			case "I":
				type = "Image";
				break;
			case "T":
				type = "Texte";
				break;
		}
		
		Bien concernee = saisirBien();
		
		String link = saisirLien();

		System.out.println("\nPublicitee cree !");
		MyAgencyManager.getListePubs().add(new Publicites(type,concernee,link));
	}

	public void modifPub(int idPub) {
		Publicites pubAmodif = MyAgencyManager.getListePubs().get(idPub);
		
		System.out.println("Quoi changer le lien ? (O/N)");
		
		String type;
		do{
			try{
				type = sc.nextLine();
			}catch(Exception e){
				type = "";
				System.out.println("Mauvaise saisie");
				sc.nextLine();
			}
		}while(!Pattern.matches("^[ON]$", type));
		
		if(type.equals("O")){
			pubAmodif.setLien(saisirLien());
			System.out.println("Publicitees modifiee !");
		}
	}
	
	private String saisirLien(){
		String nom;
		System.out.print("Lien :");
		do{
			try{
				nom = sc.nextLine();
			}catch(Exception e){
				nom = "";
				System.out.println("Mauvaise saisie");
				sc.nextLine();
			}
		}while(!Pattern.matches("^[a-zA-Z0-9-_=:/.\"]+$", nom));
		
		return nom;
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
}
