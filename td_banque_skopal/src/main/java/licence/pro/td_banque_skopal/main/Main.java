package licence.pro.td_banque_skopal.main;

import licence.pro.td_banque_skopal.dao.DaoClient;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test de la conneion
		// Connection instance = ConnexionMysql.getInstance();
		
		DaoClient instance = new DaoClient();
		instance.getClientById(42);
		
	}

}
