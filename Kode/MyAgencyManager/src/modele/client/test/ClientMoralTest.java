package modele.client.test;

import org.junit.Before;

import modele.client.Client;
import modele.client.ClientMoral;

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
