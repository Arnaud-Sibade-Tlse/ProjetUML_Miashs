package vue;

public class CommandeCreer extends Commande {

	public CommandeCreer(String command,String typObj) {
		super(command);
	}

	// switch sur typObj puis lancer bonne classe de créateur
}
