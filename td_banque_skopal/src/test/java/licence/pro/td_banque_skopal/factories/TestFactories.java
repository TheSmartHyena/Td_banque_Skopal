package licence.pro.td_banque_skopal.factories;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import licence.pro.td_banque_skopal.models.Client;
import licence.pro.td_banque_skopal.models.CompteTools;

public class TestFactories {
	
	@Test
	public void TestFactories_FactoryClientNotNull() {
		assertNotNull(FactoryClient.getClientVide());
	}
	
	@Test
	public void TestFactories_FactoryClientInstanceOfClient() {
		assertTrue(FactoryClient.getClientVide() instanceof Client);
	}
	
	@Test
	public void TestFactories_FactoryCompteToolsNotNull() {
		assertNotNull(FactoryCompteTools.getCompteTools());
	}
	

	@Test
	public void TestFactories_FactoryCompteToolsInstanceOfCompteTools() {
		assertTrue(FactoryCompteTools.getCompteTools() instanceof CompteTools);
	}
	
}
