package modele.RDV.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import modele.RDV.RDV;
import modele.RDV.RdvMandat;
import modele.RDV.RdvPromesseVente;
import modele.autres.Mandat;
import modele.client.ClientPhysique;

public class RdvPromesseVenteTest extends RDVTest{

	@Before
	public void setUp() throws Exception {
		unRdv = creerRDV();
	}

	@Override
	protected RDV creerRDV() {
		return new RdvPromesseVente("", new ClientPhysique("Robert", "", "", ""),new ClientPhysique("Jean", "", "", ""),new Mandat(null,null,""));
	}

}
