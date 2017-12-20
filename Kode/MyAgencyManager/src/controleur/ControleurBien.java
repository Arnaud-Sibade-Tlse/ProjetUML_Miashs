package controleur;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ControleurBien {
	
	Scanner sc = new Scanner(System.in);

	public void verifBien(){
		//TODO
	}
	
	public void creerBien(){
		System.out.println("__Creation d'un Bien");
		System.out.print("Bien Maison, Appartement ou Terrain ? (M/A/T) ? ");
		
		String type = "";
		do{
			try{
				type = sc.next();
			}catch(Exception e){
				type = "";
			}
		}while(type.equals("A") || type.equals("M") || type.equals("T"));
		
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
				nom = sc.next();
			}catch(Exception e){
				nom = "";
			}
		}while(!Pattern.matches("^[a-zA-Z ]+$", nom));
		
		System.out.println("ok");
		String adresse;
		String numTel;
		String mail;
	}
}
