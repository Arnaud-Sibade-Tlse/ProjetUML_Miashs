package modele.RDV.test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.RDV.RDV;

public abstract class RDVTest {

	RDV unRdv;
	
	abstract protected RDV creerRDV();
	
	@Test
	public void testDate(){
		String uneDate = "";
		assertTrue("Bonne Date", uneDate.toString().equals(unRdv.getDateRDV().toString()));
	}
	
	@Test
	public void testClient(){
		assertTrue("Bon client",unRdv.getClient().getNom().equals("bob"));
	}
	

}
