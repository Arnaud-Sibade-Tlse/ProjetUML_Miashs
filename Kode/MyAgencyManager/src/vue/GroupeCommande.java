package vue;

import java.util.ArrayList;
import java.util.Scanner;

public class GroupeCommande {

	private ArrayList<Commande> sousCommande;
	Scanner sc = new Scanner(System.in);
	
	public GroupeCommande() {
		this.sousCommande = new ArrayList<Commande>();
	}

	public void add(Commande newComm) {
		sousCommande.add(newComm);
	}

	public void exec() {
		System.out.println("*---- Choisir un élément du menu ----*\n");
		for (int i = 0; i < sousCommande.size(); i++) {
			System.out.println("{" + (i + 1) + "} " + sousCommande.get(i).getCommande());
		}
		System.out.println("{" + (sousCommande.size() + 1) + "} Menu Principal");
		System.out.print("\n:");
		
		int saisie = 0;
		do{
			try{
				saisie = sc.nextInt();
			}catch(Exception e){
				saisie = 0;
				System.out.println("Mauvaise saisie");
				sc.next();
			}
		}while(saisie <= 0 ||saisie > sousCommande.size() + 1 );
		
		if(saisie == sousCommande.size() + 1){
			Interface.accueil.exec();
		}
		else{
			sousCommande.get(saisie-1).execute();
		}
	}

}