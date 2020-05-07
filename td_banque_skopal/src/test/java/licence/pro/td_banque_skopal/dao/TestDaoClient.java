package licence.pro.td_banque_skopal.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import licence.pro.td_banque_skopal.factories.FactoryClient;
import licence.pro.td_banque_skopal.factories.FactoryDao;
import licence.pro.td_banque_skopal.models.Client;

public class TestDaoClient {
	
	private static DaoClient instance = null;
	private Client clientTest = null;
	
	@BeforeClass
	public static void setupClass() {
		instance = FactoryDao.getDaoClient();		
	}
	
	@Before
	public void setUp() {
				
		// create user with unique id for test purpose
		clientTest = FactoryClient.getClientVide();
		clientTest.setName("testName");
		clientTest.setLastName("testLastName");
		instance.createWithId(clientTest);		
	}
	
	@After
	public void finalize() {
		instance.delete(clientTest);		
	}
	
	@Test
	public void TestDaoClient_notNull() {
		assertNotNull(instance);
	}
	
	@Test
	public void TestDaoClient_isInstanceOfDaoCLient() {
		assertTrue(instance instanceof DaoClient);
	}
	
	@Test
	public void TestDaoClient_getById() {
		Client result = instance.getClientById(clientTest.getId());
		assertNotNull(result);
	}
	
	@Test
	public void TestDaoClient_create() {
		
		// instance.createWithId(clientTest);
		Client result = instance.getClientById(clientTest.getId());
		
		assertTrue(result.equals(clientTest));
	}
	
	@Test
	public void TestDaoClient_update() {
		
		// instance.createWithId(clientTest);
		Client resultA = instance.getClientById(clientTest.getId());
		
		resultA.setLastName("nameTest");
		resultA.setName("lastNameTest");
		instance.update(resultA);
		
		Client resultB = instance.getClientById(resultA.getId());
		
		assertTrue(resultB.equals(resultA));
	}
		
	@Test
	public void TestDaoClient_delete() {
		instance.delete(clientTest);
		assertNull(instance.getClientById(clientTest.getId()));
	}
	
	@Test
	public void TestDaoClient_list() {
		assertNotNull(instance.getList());
		assertTrue(instance.getList() instanceof ArrayList<?>);
	}
	
}
