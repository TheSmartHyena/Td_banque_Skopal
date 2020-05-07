package licence.pro.td_banque_skopal.models;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import licence.pro.td_banque_skopal.factories.FactoryCompte;

public class TestCompteTools {
	
private Compte instance;
	
	@Before
	public void setUp() {
		instance = FactoryCompte.getCompte(345678, 42, 100.0, true);
	}
	
	@Test
	public void TestCompteTools_notNull() {
		assertNotNull(instance);
	}
	
	@Test
	public void TestCompteTools_isInstanceCompte() {
		assertTrue(instance instanceof Compte);
	}
	
}
