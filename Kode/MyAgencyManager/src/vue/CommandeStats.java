package vue;

public class CommandeStats extends Commande {

	public CommandeStats(String command) {
		super(command);
	}
	
	@Override
	public void execute() {
		System.out.println("blabla stats");
	}
}
