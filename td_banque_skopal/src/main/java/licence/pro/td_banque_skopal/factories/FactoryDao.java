package licence.pro.td_banque_skopal.factories;

import licence.pro.td_banque_skopal.dao.DaoClient;
import licence.pro.td_banque_skopal.dao.DaoCompte;

public class FactoryDao {
	
	public static DaoClient getDaoClient() {
		return new DaoClient();
	}
	
	public static DaoCompte getDaoCompte() {
		return new DaoCompte();
	}
	
}
