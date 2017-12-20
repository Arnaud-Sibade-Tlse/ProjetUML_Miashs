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
		Orientation or;
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
			System.out.println("____Creation d'une Maison");
		}
		else if(type.equals("A")){
			System.out.println("____Creation d'un Appartement");
		} 
		else {
			System.out.println("____Creation d'un Terrain");
		}
	}
}
