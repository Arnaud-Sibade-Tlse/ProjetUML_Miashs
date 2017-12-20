package controleur;

import java.util.Scanner;

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
		}while(!type.equals("P") || !type.equals("M"));
		
		String nom;
		System.out.print("Nom :");
		do{
			try{
				type = sc.next();
			}catch(Exception e){
				type = "";
			}
		}while(!type.equals("P") || !type.equals("M"));
		
		String adresse;
		String numTel;
		String mail;
	}
	
	public void verifClient(){
		//TODO
	}
	
}
