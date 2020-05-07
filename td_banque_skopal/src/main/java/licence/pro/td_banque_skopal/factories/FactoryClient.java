package licence.pro.td_banque_skopal.factories;

import licence.pro.td_banque_skopal.models.Client;

public class FactoryClient {
	
	public static Client getClient(int id, String name, String lastName) {
		return new Client(id, name, lastName);
	}
	
	public static Client getClientVide() {
		return new Client();
	}
	
}
