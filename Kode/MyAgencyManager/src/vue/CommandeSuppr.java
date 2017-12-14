package vue;

public class CommandeSuppr extends Commande {

	private String type;
	
	public CommandeSuppr(String command,String typObj) {
		super(command);
		this.type=typObj;
	}

	@Override
	public void execute() {
		switch(this.type){
			case "c":
				System.out.println("Supprimer-Client");
				Interface.accueil.exec();
				break;
			case "b":
				System.out.println("Supprimer-Bien");
				Interface.accueil.exec();
				break;
			case "r":
				System.out.println("Supprimer-RDV");
				Interface.accueil.exec();
				break;
			case "m":
				System.out.println("Supprimer-Mandat");
				Interface.accueil.exec();
				break;
			case "p":
				System.out.println("Supprimer-Pub");
				Interface.accueil.exec();
				break;
		}
	}
}
