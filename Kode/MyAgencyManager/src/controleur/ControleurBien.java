package controleur;

import java.util.Scanner;
import java.util.regex.Pattern;

import modele.MyAgencyManager;
import modele.bien.Orientation;
import modele.bien.Terrain;
import modele.bien.Maison;
import modele.bien.Appartement;

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
		
		MyAgencyManager.getListeBiens().add(new Terrain(idBien,"blabla",Orientation.NORD,100000,14.5,12.0));

	}
}
