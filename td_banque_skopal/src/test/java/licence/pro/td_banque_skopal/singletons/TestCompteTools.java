package licence.pro.td_banque_skopal.singletons;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import licence.pro.td_banque_skopal.dao.DaoClient;
import licence.pro.td_banque_skopal.models.CompteTools;

public class TestCompteTools {
	
	private CompteTools instance;
	
	@Before
	public void setUp() {
		instance = SCompteTools.getInstance();
	}
	
	@Test
	public void TestSCompteTools_notNull() {
		assertNotNull(instance);
	}
	
	@Test
	public void TestSCompteTools_isInstanceCompteTools() {
		assertTrue(instance instanceof CompteTools);
	}
	
	@Test
	public void TestSDaoClient_shouldBeSame() {
		CompteTools result = SCompteTools.getInstance();
		assertTrue(result == instance);
	}
	
}
