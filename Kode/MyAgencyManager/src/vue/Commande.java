package vue;

public class Commande implements CommandeConcrete{
	private String commande;
	private GroupeCommande sousCommandes;
	
	public Commande(String command){
		this.setCommande(command);
	}

	public String getCommande() {
		return commande;
	}

	public void setCommande(String commande) {
		this.commande = commande;
	}
	
	public void setGroupeCommande(GroupeCommande sousComm) {
		this.sousCommandes = new GroupeCommande();
		this.sousCommandes = sousComm;
	}

	@Override
	public void execute() {
		if(sousCommandes!=null){
			this.sousCommandes.exec();
		}
	}

}
