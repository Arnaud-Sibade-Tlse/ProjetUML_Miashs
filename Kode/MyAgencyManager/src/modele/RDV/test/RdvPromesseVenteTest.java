package modele.RDV.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import modele.RDV.RDV;
import modele.RDV.RdvMandat;
import modele.RDV.RdvPromesseVente;
import modele.client.ClientPhysique;

public class RdvPromesseVenteTest extends RDVTest{

	@Before
	public void setUp() throws Exception {
		unRdv = creerRDV();
	}

	@Override
	protected RDV creerRDV() {
		return new RdvPromesseVente(new Date(2000, 12, 12), new ClientPhysique("Robert", "", "", ""),new ClientPhysique("Jean", "", "", ""));
	}

	@Test
	public void testSetAcheteur() {
		((RdvPromesseVente) unRdv).setAcheteur();
		assertTrue("Un acheteur est defini", ((RdvPromesseVente) unRdv).getMandat().getAcheteur()!=null);
	}

	@Test
	public void testGetAcheteurPotentiel() {
		assertTrue("Bon acheteur", ((RdvPromesseVente) unRdv).getAcheteurPotentiel().getNom().equals("Jean"));
	}

}
