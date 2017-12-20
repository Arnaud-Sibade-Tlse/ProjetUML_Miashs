package vue;

import controleur.ControleurBien;

public class CommandeCreerBien extends Commande {

	private int idBien;
	
	public CommandeCreerBien(String command) {
		super(command);
		this.idBien = 1;
	}

	@Override
	public void execute() {
		ControleurBien cb = new ControleurBien();
		cb.creerBien(idBien);
		this.idBien++;
		Timmo.accueil.exec();
	}
}
