package licence.pro.td_banque_skopal.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import licence.pro.td_banque_skopal.factories.FactoryClient;
import licence.pro.td_banque_skopal.factories.FactoryCompte;

public class TestCompte {
	
	private Compte instance;
	
	@Before
	public void setUp() {
		instance = FactoryCompte.getCompte(345678, 42, 100.0, true);
	}
	
	@Test
	public void TestCompte_notNull() {
		assertNotNull(instance);
	}
	
	@Test
	public void TestCompte_isInstanceCompte() {
		assertTrue(instance instanceof Compte);
	}
	
	@Test
	public void TestCompte_idShouldBe345678() {
		assertEquals(345678, instance.getId());
	}
	
	@Test
	public void TestCompte_idClientShouldBe42() {
		assertEquals(42, instance.getIdClient());
	}
	
	@Test
	public void TestCompte_balanceShouldBe100() {
		
		// ==> deprecated: assertEquals(100.0, instance.getBalance());		
		// Comparing like this because comparing two ouble with assert is deprectaed
		boolean result = false;
		if (100.0 == instance.getBalance()) {
			result = true;
		}
		assertTrue(result);
	}
	
	public void TestCompte_negativeBalanceAllowedShouldBeTrue() {
		assertTrue(instance.getNegativeBalanceAllowed());
	}
	
	@Test
	public void TestCompte_testEqualsMethod() {
		Compte compteA = FactoryCompte.getCompte(123456, 3630, 100.0, true);
		Compte compteB = FactoryCompte.getCompte(123456, 3630, 100.0, true);
		
		assertTrue(compteA.equals(compteB));
	}
	
}
