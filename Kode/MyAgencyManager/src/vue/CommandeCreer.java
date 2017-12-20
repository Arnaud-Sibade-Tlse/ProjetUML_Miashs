package vue;

import controleur.ControleurBien;
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
			case "r":
				System.out.println("Cr�er-RDV");
				Timmo.accueil.exec();
				break;
			case "m":
				System.out.println("Cr�er-Mandat");
				Timmo.accueil.exec();
				break;
			case "p":
				System.out.println("Cr�er-Pub");
				Timmo.accueil.exec();
				break;
		}
	}
}
