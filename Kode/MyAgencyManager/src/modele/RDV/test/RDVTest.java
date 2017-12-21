package modele.RDV.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import modele.RDV.RDV;

public abstract class RDVTest {

	RDV unRdv;
	
	abstract protected RDV creerRDV();
	
	@Test
	public void testDate(){
		Date uneDate = new Date(2000, 12, 12);
		assertTrue("Bonne Date", uneDate.toString().equals(unRdv.getDateRDV().toString()));
	}
	
	@Test
	public void testClient(){
		assertTrue("Bon client",unRdv.getClient().getNom().equals("bob"));
	}
	

}
