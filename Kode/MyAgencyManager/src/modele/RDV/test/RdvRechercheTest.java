package modele.RDV.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

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
