package controleur;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ControleurClient {
	
	Scanner sc = new Scanner(System.in);

	public void afficherClient(){
		//TODO
	}
	
	public void creerClient(){
		
		System.out.println("__Création d'un Client");
		System.out.print("Client Physique ou Moral ? (P/M) ? ");
		
		String type = "";
		do{
			try{
				type = sc.next();
			}catch(Exception e){
				type = "";
			}
		}while(type.equals("P") || type.equals("M"));
		
		System.out.println();
		
		if(type.equals("P")){
			System.out.println("____Création d'un Client Physique");
		}
		else{
			System.out.println("____Création d'un Client Moral");
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
	
	public void verifClient(){
		//TODO
	}
	
}
