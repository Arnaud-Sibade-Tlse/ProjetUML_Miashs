package vue;

import modele.MyAgencyManager;
import modele.autres.Mandat;

public class CommandeStats extends Commande {

	public CommandeStats(String command) {
		super(command);
	}

	@Override
	public void execute() {
		System.out.println("Nombre de Clients : " + MyAgencyManager.getListeClients().size());
		System.out.println("____");
		System.out.println("Nombre de Biens affilie a l'Agence: " + MyAgencyManager.getListeBiens().size());

		int nbMandatPotentiellementVendu = 0;
		int nbMandatAchete = 0;
		for (Mandat b : MyAgencyManager.getListeMandats()) {
			if (b.getTotalVersee().equals("OUI")) {
				nbMandatAchete++;
			}
			if (b.getAcheteur() != null) {
				nbMandatPotentiellementVendu++;
			}
		}
		System.out.println("____");
		System.out.println("Nombre de Mandat ouvert : " + MyAgencyManager.getListeMandats().size());
		System.out.println("Nombre de Mandat clos : " + nbMandatAchete);
		System.out.println("Nombre de Mandat potentiellement vendu : " + nbMandatPotentiellementVendu);
		System.out.println("____");
		System.out.println("Nombre de Publicites : "+MyAgencyManager.getListePubs().size());
	}
}
