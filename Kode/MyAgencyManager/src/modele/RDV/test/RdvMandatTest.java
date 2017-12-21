package modele.RDV.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import modele.MyAgencyManager;
import modele.RDV.RDV;
import modele.RDV.RdvMandat;
import modele.client.ClientPhysique;

public class RdvMandatTest extends RDVTest{

	@Before
	public void setUp() throws Exception {
		unRdv = creerRDV();
	}

	@Override
	protected RDV creerRDV() {
		return new RdvMandat(new Date(2000, 12, 12), new ClientPhysique("Robert", "", "", ""));
	}
	
	@Test
	public void testCreationMandat(){
		int nbMandat = MyAgencyManager.getListeMandats().size() + 1;
		((RdvMandat) unRdv).creerMandat();
		assertTrue("mandat ajouter",MyAgencyManager.getListeMandats().size()==nbMandat );
	}

}
