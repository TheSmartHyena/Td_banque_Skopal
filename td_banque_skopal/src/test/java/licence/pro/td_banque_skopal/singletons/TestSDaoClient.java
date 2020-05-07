package licence.pro.td_banque_skopal.singletons;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import licence.pro.td_banque_skopal.dao.DaoClient;

public class TestSDaoClient {
	
	private DaoClient instance;
	
	@Before
	public void setUp() {
		instance = SDaoClient.getInstance();
	}
	
	@Test
	public void TestSDaoClient_notNull() {
		assertNotNull(instance);
	}
	
	@Test
	public void TestSDaoClient_isInstanceDaoClient() {
		assertTrue(instance instanceof DaoClient);
	}
	
	@Test
	public void TestSDaoClient_shouldBeSame() {
		DaoClient result = SDaoClient.getInstance();
		assertTrue(result == instance);
	}
	
}
