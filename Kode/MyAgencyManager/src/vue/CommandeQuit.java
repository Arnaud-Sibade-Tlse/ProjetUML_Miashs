package vue;

public class CommandeQuit extends Commande {

	public CommandeQuit(String command) {
		super(command);
	}
	
	@Override
	public void execute() {
		//Serialisation ?
		System.out.println("Merci d'avoir utiliser MyAgencyManager !");
		System.out.println("Bye !");
		System.exit(0);
	}
}
