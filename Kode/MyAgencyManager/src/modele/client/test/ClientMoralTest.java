package modele.client.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modele.client.Client;
import modele.client.ClientMoral;
import modele.client.ClientPhysique;

public class ClientMoralTest extends ClientTest{

	@Before
	public void setUp() throws Exception {
		unClient = creerClient();
	}


	@Override
	public Client creerClient() {
		return new ClientMoral("Bob", "Bob", "0600000000", "Bob@bob.fr","Bob","Bob");
	}

}
