package licence.pro.td_banque_skopal.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import licence.pro.td_banque_skopal.factories.FactoryClient;

public class TestClient {
	
	private Client instance;
	
	@Before
	public void setUp() {
		instance = FactoryClient.getClient(42, "Dylan", "Bob");
	}
	
	@Test
	public void TestClient_notNull() {
		assertNotNull(instance);
	}
	
	@Test
	public void TestClient_isInstanceClient() {
		assertTrue(instance instanceof Client);
	}
	
	@Test
	public void TestClient_idIs42() {
		assertEquals(42, instance.getId());
	}
	
	@Test
	public void TestClient_nameIsBob() {
		assertEquals("Dylan", instance.getName() );
	}
	
	@Test
	public void TestClient_lastNameIsDylan() {
		assertEquals("Bob", instance.getLastName() );
	}
	
	@Test
	public void TestClient_testClientVide() {
		Client instanceVide = FactoryClient.getClientVide();
		
		assertNotNull(instanceVide);
		assertNotNull(instanceVide.getId());
	}
	
	@Test
	public void TestClient_testEqualsMethod() {
		Client cliantA = FactoryClient.getClient(3630, "John", "Doe");
		Client cliantB = FactoryClient.getClient(3630, "John", "Doe");
		
		assertTrue(cliantA.equals(cliantB));
	}
	
}
