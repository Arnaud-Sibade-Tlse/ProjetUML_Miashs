package vue;

import controleur.ControleurClient;
import controleur.ControleurPublicites;
import controleur.ControleurRDV;

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
				ControleurRDV cr = new ControleurRDV();
				cr.creerRDV();
				Timmo.accueil.exec();
				break;
			case "m":
				System.out.println("Créer-Mandat");
				Timmo.accueil.exec();
				break;
			case "p":
				ControleurPublicites cp = new ControleurPublicites();
				cp.creerPub();
				Timmo.accueil.exec();
				break;
		}
	}
}
