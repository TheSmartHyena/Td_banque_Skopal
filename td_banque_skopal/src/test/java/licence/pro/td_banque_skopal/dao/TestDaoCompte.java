package licence.pro.td_banque_skopal.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import licence.pro.td_banque_skopal.factories.FactoryCompte;
import licence.pro.td_banque_skopal.factories.FactoryDao;
import licence.pro.td_banque_skopal.models.Compte;

public class TestDaoCompte {
	
	private static DaoCompte instance = null;
	private Compte compteTest = null;
	
	@BeforeClass
	public static void setupClass() {
		instance = FactoryDao.getDaoCompte();
	}
	
	@Before
	public void setUp() {
				
		// create user with unique id for test purpose
		compteTest = FactoryCompte.getCompteVide();
		compteTest.setIdClient(3630);
		compteTest.setBalance(89.8);
		compteTest.setNegativeBalanceAllowed(false);
		
		instance.createWithId(compteTest);		
	}
	
	@After
	public void finalize() {
		instance.delete(compteTest);		
	}
	
	@Test
	public void TestDaoCompte_notNull() {
		assertNotNull(instance);
	}
	
	@Test
	public void TestDaoCompte_isInstanceOfDaoCLient() {
		assertTrue(instance instanceof DaoCompte);
	}
	
	@Test
	public void TestDaoClient_getById() {
		Compte result = instance.getCompteById(compteTest.getId());
		assertNotNull(result);
	}
	
	@Test
	public void TestDaoCompte_create() {
		
		// instance.createWithId(clientTest);
		Compte result = instance.getCompteById(compteTest.getId());
		
		assertTrue(result.equals(compteTest));
	}
	
	@Test
	public void TestDaoCompte_update() {
		
		// instance.createWithId(clientTest);
		Compte resultA = instance.getCompteById(compteTest.getId());
		
		resultA.setIdClient(3730);
		resultA.setBalance(72.8);
		resultA.setNegativeBalanceAllowed(true);
		instance.update(resultA);
		
		Compte resultB = instance.getCompteById(resultA.getId());
		
		assertTrue(resultB.equals(resultA));
	}
		
	@Test
	public void TestDaoCompte_delete() {
		instance.delete(compteTest);
		assertNull(instance.getCompteById(compteTest.getId()));
	}
	
	@Test
	public void TestDaoCompte_list() {
		assertNotNull(instance.getList());
		assertTrue(instance.getList() instanceof ArrayList<?>);
	}
}
