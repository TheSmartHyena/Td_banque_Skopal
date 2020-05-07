package licence.pro.td_banque_skopal.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import licence.pro.td_banque_skopal.dao.DaoCompte;
import licence.pro.td_banque_skopal.factories.FactoryCompte;
import licence.pro.td_banque_skopal.singletons.SCompteTools;

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
	
	@Test 
	public void testCompteTools_retraitNegativeTrueShouldSuccess() {
		
		CompteTools compteTools = SCompteTools.getInstance();
		
		//  create mock
        DaoCompte daoCompte = mock(DaoCompte.class);
        
        // define behavior 
        when(daoCompte.getCompteById(42)).thenReturn( FactoryCompte.getCompte(42, 3630, 100.0, true) );
                
        Compte compte = daoCompte.getCompteById(42);
        compteTools.retrait(compte, 60);

        // assertEquals(60.0, compte.getBalance());		
        boolean result = false;
		if (40.0 == compte.getBalance()) {
			result = true;
		}
		assertTrue(result);
				
	}
	
}
