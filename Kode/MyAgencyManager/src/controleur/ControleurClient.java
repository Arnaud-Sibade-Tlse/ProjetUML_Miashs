package controleur;

import java.util.Scanner;
import java.util.regex.Pattern;

import modele.MyAgencyManager;
import modele.client.Client;
import modele.client.ClientMoral;
import modele.client.ClientPhysique;

public class ControleurClient {
	
	Scanner sc = new Scanner(System.in);

	public void creerClient(){
		
		System.out.println("\n__Création d'un Client");
		System.out.print("Client Physique ou Moral ? (P/M) ? ");
		
		String type = "";
		do{
			try{
				type = sc.next();
			}catch(Exception e){
				type = "";
				System.out.println("Mauvaise saisie");
				sc.next();
			}
		}while(!Pattern.matches("^[PM]$", type));
		
		System.out.println();
		
		if(type.equals("P")){
			System.out.println("____Creation d'un Client Physique");
		}
		else{
			System.out.println("____Creation d'un Client Moral");
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
		
		
		System.out.println();
		String numTel;
		
		System.out.print("Numero de Telephone :");
		do{
			try{
				numTel = sc.next();
			}catch(Exception e){
				numTel = "";
				System.out.println("Mauvaise saisie");
				sc.next();
			}
		}while(!Pattern.matches("^0[1-68]([-. ]?[0-9]{2}){4}$", numTel));

		System.out.println();
		
		String mail;
		
		System.out.print("Mail :");
		do{
			try{
				mail = sc.next();
			}catch(Exception e){
				mail = "";
				System.out.println("Mauvaise saisie");
				sc.next();
			}
		}while(!Pattern.matches("^[a-z0-9._-]+@[a-z0-9._-]{2,}.[a-z]{2,4}$", mail));
		
		if(type.equals("P")){
			MyAgencyManager.getListeClients().add(new ClientPhysique(nom,finalAdress,numTel,mail));
		}
		else{
			System.out.println();
			
			String formeJuri;
			
			System.out.print("Forme Juridique :");
			do{
				try{
					formeJuri = sc.next();
				}catch(Exception e){
					formeJuri = "";
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(!Pattern.matches("^[a-zA-Z ]+$", formeJuri));
			
			System.out.println();
			
			String nSIREN;
			
			System.out.print("N° SIREN :");
			do{
				try{
					nSIREN = sc.next();
				}catch(Exception e){
					nSIREN = "";
					System.out.println("Mauvaise saisie");
					sc.next();
				}
			}while(!Pattern.matches("^[0-9]{9}$", nSIREN));
			
			MyAgencyManager.getListeClients().add(new ClientMoral(nom,finalAdress,numTel,mail,formeJuri,nSIREN));
		}
	}
	
	public void modifClient(int idClient){
		Client clientAmodif = MyAgencyManager.getListeClients().get(idClient);
		
		int nbMax;
		System.out.println("Quoi changer ?");
		if(clientAmodif instanceof ClientPhysique){
			System.out.println(" {1} Nom");
			System.out.println(" {2} Adresse");
			System.out.println(" {3} Numero de Telehpone");
			System.out.println(" {4} Adresse Mail");
			nbMax = 5;
		}
		else{
			System.out.println(" {5} Forme Juridique");
			System.out.println(" {6} N° Siren");
			nbMax = 7;
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
				clientAmodif.setNom(nom);
				break;
			case 2:
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
				
				System.out.println();
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

				System.out.println();
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
				
				clientAmodif.setAdresse(finalAdress);
				break;
			case 3:
				String numTel;
				
				System.out.print("Numero de Telephone :");
				do{
					try{
						numTel = sc.next();
					}catch(Exception e){
						numTel = "";
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(!Pattern.matches("^0[1-68]([-. ]?[0-9]{2}){4}$", numTel));
				
				clientAmodif.setNumTel(numTel);
				break;
			case 4:
				String mail;
				
				System.out.print("Mail :");
				do{
					try{
						mail = sc.next();
					}catch(Exception e){
						mail = "";
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(!Pattern.matches("^[a-z0-9._-]+@[a-z0-9._-]{2,}.[a-z]{2,4}$", mail));

				clientAmodif.setMail(mail);
				break;
			case 5:
				String formeJuri;
				
				System.out.print("Forme Juridique :");
				do{
					try{
						formeJuri = sc.next();
					}catch(Exception e){
						formeJuri = "";
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(!Pattern.matches("^[a-zA-Z ]+$", formeJuri));

				clientAmodif.setFormeJuridique(formeJuri);
				
				break;
			case 6:
				
				String nSIREN;
				
				System.out.print("N° SIREN :");
				do{
					try{
						nSIREN = sc.next();
					}catch(Exception e){
						nSIREN = "";
						System.out.println("Mauvaise saisie");
						sc.next();
					}
				}while(!Pattern.matches("^[0-9]{9}$", nSIREN));

				clientAmodif.setnSIREN(nSIREN);
				break;
		}
	}
	
}
