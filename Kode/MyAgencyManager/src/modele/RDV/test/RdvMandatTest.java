package modele.RDV.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import modele.MyAgencyManager;
import modele.RDV.RDV;
import modele.RDV.RdvMandat;
import modele.autres.Mandat;
import modele.bien.Bien;
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
