package licence.pro.td_banque_skopal.singletons;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import licence.pro.td_banque_skopal.dao.DaoCompte;

public class TestSDaoCompte {
	
	private DaoCompte instance;
	
	@Before
	public void setUp() {
		instance = SDaoCompte.getInstance();
	}
	
	@Test
	public void TestTestSDaoCompte_notNull() {
		assertNotNull(instance);
	}
	
	@Test
	public void TestTestSDaoCompte_isInstanceDaoClient() {
		assertTrue(instance instanceof DaoCompte);
	}
	
	@Test
	public void TestTestSDaoCompte_shouldBeSame() {
		DaoCompte result = SDaoCompte.getInstance();
		assertTrue(result == instance);
	}
}
