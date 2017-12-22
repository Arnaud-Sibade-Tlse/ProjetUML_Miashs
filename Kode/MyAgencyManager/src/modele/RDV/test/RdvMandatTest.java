package modele.RDV.test;

import org.junit.Before;

import modele.RDV.RDV;
import modele.RDV.RdvMandat;
import modele.bien.Terrain;
import modele.client.ClientPhysique;

public class RdvMandatTest extends RDVTest{

	@Before
	public void setUp() throws Exception {
		unRdv = creerRDV();
	}

	@Override
	protected RDV creerRDV() {
		return new RdvMandat("", new ClientPhysique("Robert", "", "", ""),new Terrain(1,"","",null,1,1.1,1.1),"");
	}

	

}
