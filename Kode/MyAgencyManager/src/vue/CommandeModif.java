package vue;

public class CommandeModif extends Commande {

	private String type;
	
	public CommandeModif(String command,String typObj) {
		super(command);
		this.type=typObj;
	}

	@Override
	public void execute() {
		switch(this.type){
			case "c":
				System.out.println("Modifier-Client");
				Interface.accueil.exec();
				break;
			case "b":
				System.out.println("Modifier-Bien");
				Interface.accueil.exec();
				break;
			case "r":
				System.out.println("Modifier-RDV");
				Interface.accueil.exec();
				break;
			case "m":
				System.out.println("Modifier-Mandat");
				Interface.accueil.exec();
				break;
			case "p":
				System.out.println("Modifier-Pub");
				Interface.accueil.exec();
				break;
		}
	}
}
