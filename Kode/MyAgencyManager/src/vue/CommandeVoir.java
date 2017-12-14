package vue;

public class CommandeVoir extends Commande {

	private String type;
	
	public CommandeVoir(String command,String typObj) {
		super(command);
		this.type=typObj;
	}

	@Override
	public void execute() {
		switch(this.type){
			case "c":
				System.out.println("Voir-Client");
				Interface.accueil.exec();
				break;
			case "b":
				System.out.println("Voir-Bien");
				Interface.accueil.exec();
				break;
			case "r":
				System.out.println("Voir-RDV");
				Interface.accueil.exec();
				break;
			case "m":
				System.out.println("Voir-Mandat");
				Interface.accueil.exec();
				break;
			case "p":
				System.out.println("Voir-Pub");
				Interface.accueil.exec();
				break;
		}
	}
}
