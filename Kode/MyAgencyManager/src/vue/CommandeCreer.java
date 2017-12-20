package vue;

import controleur.ControleurClient;

public class CommandeCreer extends Commande {

	private String type;
	
	public CommandeCreer(String command,String typObj) {
		super(command);
		this.type=typObj;
	}

	@Override
	public void execute() {
		switch(this.type){
			case "c":
				ControleurClient cc = new ControleurClient();
				cc.creerClient();
				Timmo.accueil.exec();
				break;
			case "b":
				System.out.println("Créer-Bien");
				Timmo.accueil.exec();
				break;
			case "r":
				System.out.println("Créer-RDV");
				Timmo.accueil.exec();
				break;
			case "m":
				System.out.println("Créer-Mandat");
				Timmo.accueil.exec();
				break;
			case "p":
				System.out.println("Créer-Pub");
				Timmo.accueil.exec();
				break;
		}
	}
}
