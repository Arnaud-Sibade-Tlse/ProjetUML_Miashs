package modele.RDV.test;

import org.junit.Before;

import modele.RDV.RDV;
import modele.RDV.RdvFinalisation;
import modele.autres.Mandat;
import modele.client.ClientPhysique;

public class RdvFinalisationTest extends RDVTest{

	
		
	@Before
	public void setUp() throws Exception {
		unRdv = creerRDV();
	}

	@Override
	protected RDV creerRDV() {
		return new RdvFinalisation("", new ClientPhysique("Robert", "", "", ""),new Mandat(null,null,""));
	}

}
