package modele.RDV.test;

import org.junit.Before;

import modele.RDV.RDV;
import modele.RDV.RdvRecherche;
import modele.client.ClientPhysique;

public class RdvRechercheTest extends RDVTest{

	@Before
	public void setUp() throws Exception {
		unRdv = creerRDV();
	}

	@Override
	protected RDV creerRDV() {
		return new RdvRecherche("", new ClientPhysique("Robert", "", "", ""));
	}


}
