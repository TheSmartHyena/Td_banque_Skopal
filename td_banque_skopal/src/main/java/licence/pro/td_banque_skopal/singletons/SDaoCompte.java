package licence.pro.td_banque_skopal.singletons;

import licence.pro.td_banque_skopal.dao.DaoCompte;
import licence.pro.td_banque_skopal.factories.FactoryDao;

public class SDaoCompte {
	
	private SDaoCompte() {}
	private static DaoCompte instance = null;
	
	public static DaoCompte getInstance() {
		if (instance == null) {
			instance = FactoryDao.getDaoCompte();
		}
		return instance;
	}		
}
