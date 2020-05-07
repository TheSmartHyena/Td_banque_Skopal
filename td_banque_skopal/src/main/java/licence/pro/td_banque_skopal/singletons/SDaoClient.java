package licence.pro.td_banque_skopal.singletons;

import licence.pro.td_banque_skopal.dao.DaoClient;
import licence.pro.td_banque_skopal.factories.FactoryDao;

public class SDaoClient {
	
	private SDaoClient() {}
	private static DaoClient instance = null;
	
	public static DaoClient getInstance() {
		if (instance == null) {
			instance = FactoryDao.getDaoClient();
		}
		return instance;
	}
	
}
