package modele.client.test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.client.Client;

public abstract class ClientTest {
	
	Client unClient;
	
	abstract public Client creerClient();
	
	@Test
	public void testGetNom() {
		assertTrue("Bon nom", unClient.getNom().equals("Bob"));
	}

	@Test
	public void testGetAdresse() {
		assertTrue("Bon adresse", unClient.getAdresse().equals("Bob"));
	}

	@Test
	public void testGetNumTel() {
		assertTrue("Bon numTel", unClient.getNumTel().equals("0600000000"));
	}

	@Test
	public void testGetMail() {
		assertTrue("Bon mail", unClient.getMail().equals("Bob@bob.fr"));
	}

}
